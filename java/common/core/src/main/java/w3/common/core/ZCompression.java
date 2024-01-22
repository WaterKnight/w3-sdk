package w3.common.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class ZCompression {
	private static final Logger log = LoggerFactory.getLogger(ZCompression.class.getName());

	public static byte[] compress(byte[] inputBytes) throws BinStream.StreamException {
		try (final Wc3BinInputStream inputStream = new Wc3BinInputStream(new ByteArrayInputStream(inputBytes))) {
			return compress(inputStream);
		} catch (IOException e) {
			throw new AssertionError(e);
		}
	}

	public static byte[] compress(@Nonnull Wc3BinInputStream inStream) throws BinStream.StreamException {
		//deflate
		final List<byte[]> blocks = new ArrayList<>();
		final List<byte[]> uncompressedBlocks = new ArrayList<>();
		
		long compressedSize = 0;
		long uncompressedSize = 0;
		
		while (!inStream.eof()) {
			final Deflater deflater = new Deflater();

			//TODO: long?
			final byte[] uncompressedBlock = new byte[(int) java.lang.Math.min(1024, inStream.size() - inStream.getPos())];
			
			uncompressedBlocks.add(uncompressedBlock);
			uncompressedSize += uncompressedBlock.length;

			final byte[] uncompressedBytes = inStream.readBytes(uncompressedBlock.length);

			deflater.setInput(uncompressedBytes);

			deflater.finish();
			
			final int len = deflater.deflate(uncompressedBlock);
			
			final byte[] block = Arrays.copyOf(uncompressedBlock, len);
			
			blocks.add(block);
			compressedSize += block.length;
		}
		
		//write
		final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		final Wc3BinOutputStream outStream = new Wc3BinOutputStream(byteArrayOutputStream);
		
		final String startTokenS = "Warcraft III recorded game\u001A";
		
		outStream.writeBytes(Arrays.copyOfRange(startTokenS.getBytes(StandardCharsets.US_ASCII), 0, 28));
		
		outStream.writeUInt32(0x44);  //headerSize
		
		outStream.writeUInt32(compressedSize);  //compressedSize
		
		outStream.writeUInt32(0x01);  //headerVersion
		
		outStream.writeUInt32(uncompressedSize);  //uncompressedSize
		
		outStream.writeUInt32(blocks.size());
		
		outStream.writeId(Id.valueOf("W3XP"));
		
		outStream.writeUInt32(0);  //version
		
		outStream.writeUInt16(0);  //buildNum
		
		outStream.writeUInt16(0);  //flags
		
		outStream.writeUInt32(0);  //len in milliseconds
		
		final CRC32 crc = new CRC32();
		
		for (int i = 0; i < outStream.size(); i++) {
			crc.update(outStream.get(i));
		}
		
		outStream.writeUInt32(crc.getValue());  //crc32
		
		int c = 0;
		
		for (final byte[] block : blocks) {
			outStream.writeUInt32(block.length);
			outStream.writeUInt32(uncompressedBlocks.get(c).length);

			outStream.writeUInt32(0);  //hash
			
			outStream.writeBytes(block);
			
			c++;
		}

		try {
			outStream.close();

			return byteArrayOutputStream.toByteArray();
		} catch (IOException e) {
			throw new AssertionError(e);
		}
	}

	public static byte[] decompress(@Nonnull byte[] inputBytes) {
		try (final Wc3BinInputStream inputStream = new Wc3BinInputStream(new ByteArrayInputStream(inputBytes))) {
			return decompress(inputStream).writeToByteArray();
		} catch (IOException e) {
			throw new AssertionError(e);
		}
	}
	
	public static Wc3BinInputStream decompress(@Nonnull Wc3BinInputStream inStream) throws BinStream.StreamException {
		final byte[] startToken = inStream.readBytes(28);
		
		final long headerSize = inStream.readUInt32();
		/*
		 * 0x40 up to 1.06
		 * 0x44 else
		 */
		
		final long compressedFileSize = inStream.readUInt32();
		
		final long headerVersion = inStream.readUInt32();
		/*
		 * 0x00 up to 1.06
		 * 0x01 else
		 */
		
		final long uncompressedFileSize = inStream.readUInt32();
		
		final long blocksCount = inStream.readUInt32();
		
		final long version;
		
		switch ((int) headerVersion) {
		case 0x00: {
			final int unknown = inStream.readUInt16();
			version = inStream.readUInt32();
			
			break;
		}
		default: {
			final Id id = inStream.readId(); //WAR3 or W3XP
			version = inStream.readUInt32();
		}
		}
		
		final int buildNum = inStream.readUInt16();
		final int flags = inStream.readUInt16();
		/*
		 * 0x0000 - singleplayer
		 * 0x8000 - multiplayer
		 */
		
		final long len = inStream.readUInt32();
		/*
		 * milli seconds of replays, otherwise 0
		 */
		
		final long crc32 = inStream.readUInt32();

		final List<byte[]> blocks = new ArrayList<>();
		final List<byte[]> uncompressedBlocks = new ArrayList<>();
		
		for (int i = 0; i < blocksCount; i++) {
			final long compressedSize = inStream.readUInt32();
            final long uncompressedSize = inStream.readUInt32();
			/*
			 * multiple of 2048, rest padded with 0x00
			 */
			
			final long hash = inStream.readUInt32();

			blocks.add(inStream.readBytes((int) compressedSize));
			uncompressedBlocks.add(new byte[(int) uncompressedSize]);
		}
		
		int c = 0;
		
		//inflate
		for (final byte[] block : blocks) {
			final Inflater inflater = new Inflater();
			
			inflater.setInput(block);
			
			try {
				inflater.inflate(uncompressedBlocks.get(c));
			} catch (DataFormatException e) {
				log.error(e.getMessage(), e);
			}

			inflater.end();
			
			c++;
		}
		
		final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		
		try {
			for (final byte[] block : uncompressedBlocks) {
				outStream.write(block);
			}
			
			outStream.close();
			
			return new Wc3BinInputStream(new ByteArrayInputStream(outStream.toByteArray()));
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		}
		
		return null;
	}
}
