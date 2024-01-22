package w3.asset.model.mdx.model;

import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class W3Mdx {
  private W3id magic;

  private List<ChunkRouter> chunk;

  public W3id getMagic() {
    return magic;
  }

  public List<ChunkRouter> getChunk() {
    return chunk;
  }

  public void setMagic(W3id value) {
    this.magic = value;
  }

  public void setChunk(List<ChunkRouter> value) {
    this.chunk = value;
  }

  public static class TrackChunk {
    private W3id magic;

    private long interpolationType;

    private long globalSequenceId;

    private List<Track> track;

    private String valueType;

    @Override
    public int hashCode() {
      return Objects.hash(getMagic(), getInterpolationType(), getGlobalSequenceId(), getTrack(), getValueType());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof TrackChunk)) {
        return false;
      }
      final TrackChunk thatTyped = (TrackChunk) that;
      if (!Objects.equals(getMagic(), thatTyped.getMagic())) {
        return false;
      }
      if (!Objects.equals(getInterpolationType(), thatTyped.getInterpolationType())) {
        return false;
      }
      if (!Objects.equals(getGlobalSequenceId(), thatTyped.getGlobalSequenceId())) {
        return false;
      }
      if (!Objects.equals(getTrack(), thatTyped.getTrack())) {
        return false;
      }
      if (!Objects.equals(getValueType(), thatTyped.getValueType())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getMagic:");
      stringBuilder.append(getMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getInterpolationType:");
      stringBuilder.append(getInterpolationType());
      stringBuilder.append(", \n");
      stringBuilder.append("getGlobalSequenceId:");
      stringBuilder.append(getGlobalSequenceId());
      stringBuilder.append(", \n");
      stringBuilder.append("getTrack:");
      stringBuilder.append(getTrack());
      stringBuilder.append(", \n");
      stringBuilder.append("getValueType:");
      stringBuilder.append(getValueType());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getMagic() {
      return magic;
    }

    public long getInterpolationType() {
      return interpolationType;
    }

    public long getGlobalSequenceId() {
      return globalSequenceId;
    }

    public List<Track> getTrack() {
      return track;
    }

    public String getValueType() {
      return valueType;
    }

    public void setMagic(W3id value) {
      this.magic = value;
    }

    public void setInterpolationType(long value) {
      this.interpolationType = value;
    }

    public void setGlobalSequenceId(long value) {
      this.globalSequenceId = value;
    }

    public void setTrack(List<Track> value) {
      this.track = value;
    }

    public void setValueType(String value) {
      this.valueType = value;
    }
  }

  public static class AttachmentPayload {
    private Node node;

    private String path;

    private long attachmentId;

    private List<AttachmentTrackRouter> trackChunk;

    @Override
    public int hashCode() {
      return Objects.hash(getNode(), getPath(), getAttachmentId(), getTrackChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof AttachmentPayload)) {
        return false;
      }
      final AttachmentPayload thatTyped = (AttachmentPayload) that;
      if (!Objects.equals(getNode(), thatTyped.getNode())) {
        return false;
      }
      if (!Objects.equals(getPath(), thatTyped.getPath())) {
        return false;
      }
      if (!Objects.equals(getAttachmentId(), thatTyped.getAttachmentId())) {
        return false;
      }
      if (!Objects.equals(getTrackChunk(), thatTyped.getTrackChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getNode:");
      stringBuilder.append(getNode());
      stringBuilder.append(", \n");
      stringBuilder.append("getPath:");
      stringBuilder.append(getPath());
      stringBuilder.append(", \n");
      stringBuilder.append("getAttachmentId:");
      stringBuilder.append(getAttachmentId());
      stringBuilder.append(", \n");
      stringBuilder.append("getTrackChunk:");
      stringBuilder.append(getTrackChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public Node getNode() {
      return node;
    }

    public String getPath() {
      return path;
    }

    public long getAttachmentId() {
      return attachmentId;
    }

    public List<AttachmentTrackRouter> getTrackChunk() {
      return trackChunk;
    }

    public void setNode(Node value) {
      this.node = value;
    }

    public void setPath(String value) {
      this.path = value;
    }

    public void setAttachmentId(long value) {
      this.attachmentId = value;
    }

    public void setTrackChunk(List<AttachmentTrackRouter> value) {
      this.trackChunk = value;
    }
  }

  public static class NodePayload {
    private String name;

    private long objectId;

    private long parentId;

    private long flags;

    private List<NodeTrackRouter> trackChunk;

    @Override
    public int hashCode() {
      return Objects.hash(getName(), getObjectId(), getParentId(), getFlags(), getTrackChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof NodePayload)) {
        return false;
      }
      final NodePayload thatTyped = (NodePayload) that;
      if (!Objects.equals(getName(), thatTyped.getName())) {
        return false;
      }
      if (!Objects.equals(getObjectId(), thatTyped.getObjectId())) {
        return false;
      }
      if (!Objects.equals(getParentId(), thatTyped.getParentId())) {
        return false;
      }
      if (!Objects.equals(getFlags(), thatTyped.getFlags())) {
        return false;
      }
      if (!Objects.equals(getTrackChunk(), thatTyped.getTrackChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getObjectId:");
      stringBuilder.append(getObjectId());
      stringBuilder.append(", \n");
      stringBuilder.append("getParentId:");
      stringBuilder.append(getParentId());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlags:");
      stringBuilder.append(getFlags());
      stringBuilder.append(", \n");
      stringBuilder.append("getTrackChunk:");
      stringBuilder.append(getTrackChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public String getName() {
      return name;
    }

    public long getObjectId() {
      return objectId;
    }

    public long getParentId() {
      return parentId;
    }

    public long getFlags() {
      return flags;
    }

    public List<NodeTrackRouter> getTrackChunk() {
      return trackChunk;
    }

    public void setName(String value) {
      this.name = value;
    }

    public void setObjectId(long value) {
      this.objectId = value;
    }

    public void setParentId(long value) {
      this.parentId = value;
    }

    public void setFlags(long value) {
      this.flags = value;
    }

    public void setTrackChunk(List<NodeTrackRouter> value) {
      this.trackChunk = value;
    }
  }

  public static class ChunkRouter {
    private Integer version;

    private W3id magic;

    private long size;

    private Object chunkData;

    @Override
    public int hashCode() {
      return Objects.hash(getVersion(), getMagic(), getSize(), getChunkData());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkRouter)) {
        return false;
      }
      final ChunkRouter thatTyped = (ChunkRouter) that;
      if (!Objects.equals(getVersion(), thatTyped.getVersion())) {
        return false;
      }
      if (!Objects.equals(getMagic(), thatTyped.getMagic())) {
        return false;
      }
      if (!Objects.equals(getSize(), thatTyped.getSize())) {
        return false;
      }
      if (!Objects.equals(getChunkData(), thatTyped.getChunkData())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getVersion:");
      stringBuilder.append(getVersion());
      stringBuilder.append(", \n");
      stringBuilder.append("getMagic:");
      stringBuilder.append(getMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getSize:");
      stringBuilder.append(getSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getChunkData:");
      stringBuilder.append(getChunkData());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public Integer getVersion() {
      return version;
    }

    public W3id getMagic() {
      return magic;
    }

    public long getSize() {
      return size;
    }

    public Object getChunkData() {
      return chunkData;
    }

    public void setVersion(Integer value) {
      this.version = value;
    }

    public void setMagic(W3id value) {
      this.magic = value;
    }

    public void setSize(long value) {
      this.size = value;
    }

    public void setChunkData(Object value) {
      this.chunkData = value;
    }
  }

  public static class KralChunk {
    private float alpha;

    @Override
    public int hashCode() {
      return Objects.hash(getAlpha());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KralChunk)) {
        return false;
      }
      final KralChunk thatTyped = (KralChunk) that;
      if (!Objects.equals(getAlpha(), thatTyped.getAlpha())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getAlpha:");
      stringBuilder.append(getAlpha());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getAlpha() {
      return alpha;
    }

    public void setAlpha(float value) {
      this.alpha = value;
    }
  }

  public static class ChunkBone {
    private List<Bone> bone;

    @Override
    public int hashCode() {
      return Objects.hash(getBone());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkBone)) {
        return false;
      }
      final ChunkBone thatTyped = (ChunkBone) that;
      if (!Objects.equals(getBone(), thatTyped.getBone())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getBone:");
      stringBuilder.append(getBone());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Bone> getBone() {
      return bone;
    }

    public void setBone(List<Bone> value) {
      this.bone = value;
    }
  }

  public static class Light {
    private long inclusiveSize;

    private LightPayload lightPayload;

    @Override
    public int hashCode() {
      return Objects.hash(getInclusiveSize(), getLightPayload());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Light)) {
        return false;
      }
      final Light thatTyped = (Light) that;
      if (!Objects.equals(getInclusiveSize(), thatTyped.getInclusiveSize())) {
        return false;
      }
      if (!Objects.equals(getLightPayload(), thatTyped.getLightPayload())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getInclusiveSize:");
      stringBuilder.append(getInclusiveSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getLightPayload:");
      stringBuilder.append(getLightPayload());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getInclusiveSize() {
      return inclusiveSize;
    }

    public LightPayload getLightPayload() {
      return lightPayload;
    }

    public void setInclusiveSize(long value) {
      this.inclusiveSize = value;
    }

    public void setLightPayload(LightPayload value) {
      this.lightPayload = value;
    }
  }

  public static class CollisionShape {
    private Node node;

    private long type;

    private List<Float> vertex;

    private Float radius;

    @Override
    public int hashCode() {
      return Objects.hash(getNode(), getType(), getVertex(), getRadius());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof CollisionShape)) {
        return false;
      }
      final CollisionShape thatTyped = (CollisionShape) that;
      if (!Objects.equals(getNode(), thatTyped.getNode())) {
        return false;
      }
      if (!Objects.equals(getType(), thatTyped.getType())) {
        return false;
      }
      if (!Objects.equals(getVertex(), thatTyped.getVertex())) {
        return false;
      }
      if (!Objects.equals(getRadius(), thatTyped.getRadius())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getNode:");
      stringBuilder.append(getNode());
      stringBuilder.append(", \n");
      stringBuilder.append("getType:");
      stringBuilder.append(getType());
      stringBuilder.append(", \n");
      stringBuilder.append("getVertex:");
      stringBuilder.append(getVertex());
      stringBuilder.append(", \n");
      stringBuilder.append("getRadius:");
      stringBuilder.append(getRadius());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public Node getNode() {
      return node;
    }

    public long getType() {
      return type;
    }

    public List<Float> getVertex() {
      return vertex;
    }

    public Float getRadius() {
      return radius;
    }

    public void setNode(Node value) {
      this.node = value;
    }

    public void setType(long value) {
      this.type = value;
    }

    public void setVertex(List<Float> value) {
      this.vertex = value;
    }

    public void setRadius(Float value) {
      this.radius = value;
    }
  }

  public static class KctrChunk {
    private List<Float> translation;

    @Override
    public int hashCode() {
      return Objects.hash(getTranslation());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KctrChunk)) {
        return false;
      }
      final KctrChunk thatTyped = (KctrChunk) that;
      if (!Objects.equals(getTranslation(), thatTyped.getTranslation())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getTranslation:");
      stringBuilder.append(getTranslation());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getTranslation() {
      return translation;
    }

    public void setTranslation(List<Float> value) {
      this.translation = value;
    }
  }

  public static class ChunkModl {
    private String name;

    private String animFileName;

    private Extent extent;

    private long blendTime;

    @Override
    public int hashCode() {
      return Objects.hash(getName(), getAnimFileName(), getExtent(), getBlendTime());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkModl)) {
        return false;
      }
      final ChunkModl thatTyped = (ChunkModl) that;
      if (!Objects.equals(getName(), thatTyped.getName())) {
        return false;
      }
      if (!Objects.equals(getAnimFileName(), thatTyped.getAnimFileName())) {
        return false;
      }
      if (!Objects.equals(getExtent(), thatTyped.getExtent())) {
        return false;
      }
      if (!Objects.equals(getBlendTime(), thatTyped.getBlendTime())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getAnimFileName:");
      stringBuilder.append(getAnimFileName());
      stringBuilder.append(", \n");
      stringBuilder.append("getExtent:");
      stringBuilder.append(getExtent());
      stringBuilder.append(", \n");
      stringBuilder.append("getBlendTime:");
      stringBuilder.append(getBlendTime());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public String getName() {
      return name;
    }

    public String getAnimFileName() {
      return animFileName;
    }

    public Extent getExtent() {
      return extent;
    }

    public long getBlendTime() {
      return blendTime;
    }

    public void setName(String value) {
      this.name = value;
    }

    public void setAnimFileName(String value) {
      this.animFileName = value;
    }

    public void setExtent(Extent value) {
      this.extent = value;
    }

    public void setBlendTime(long value) {
      this.blendTime = value;
    }
  }

  public static class Kp2rChunk {
    private float variation;

    @Override
    public int hashCode() {
      return Objects.hash(getVariation());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Kp2rChunk)) {
        return false;
      }
      final Kp2rChunk thatTyped = (Kp2rChunk) that;
      if (!Objects.equals(getVariation(), thatTyped.getVariation())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getVariation:");
      stringBuilder.append(getVariation());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getVariation() {
      return variation;
    }

    public void setVariation(float value) {
      this.variation = value;
    }
  }

  public static class KlaiChunk {
    private float intensity;

    @Override
    public int hashCode() {
      return Objects.hash(getIntensity());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KlaiChunk)) {
        return false;
      }
      final KlaiChunk thatTyped = (KlaiChunk) that;
      if (!Objects.equals(getIntensity(), thatTyped.getIntensity())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getIntensity:");
      stringBuilder.append(getIntensity());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getIntensity() {
      return intensity;
    }

    public void setIntensity(float value) {
      this.intensity = value;
    }
  }

  public static class ChunkGeos {
    private List<Geoset> geoset;

    @Override
    public int hashCode() {
      return Objects.hash(getGeoset());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkGeos)) {
        return false;
      }
      final ChunkGeos thatTyped = (ChunkGeos) that;
      if (!Objects.equals(getGeoset(), thatTyped.getGeoset())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getGeoset:");
      stringBuilder.append(getGeoset());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Geoset> getGeoset() {
      return geoset;
    }

    public void setGeoset(List<Geoset> value) {
      this.geoset = value;
    }
  }

  public static class Kp2lChunk {
    private float latitude;

    @Override
    public int hashCode() {
      return Objects.hash(getLatitude());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Kp2lChunk)) {
        return false;
      }
      final Kp2lChunk thatTyped = (Kp2lChunk) that;
      if (!Objects.equals(getLatitude(), thatTyped.getLatitude())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getLatitude:");
      stringBuilder.append(getLatitude());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getLatitude() {
      return latitude;
    }

    public void setLatitude(float value) {
      this.latitude = value;
    }
  }

  public static class KrhbChunk {
    private float heightBelow;

    @Override
    public int hashCode() {
      return Objects.hash(getHeightBelow());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KrhbChunk)) {
        return false;
      }
      final KrhbChunk thatTyped = (KrhbChunk) that;
      if (!Objects.equals(getHeightBelow(), thatTyped.getHeightBelow())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getHeightBelow:");
      stringBuilder.append(getHeightBelow());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getHeightBelow() {
      return heightBelow;
    }

    public void setHeightBelow(float value) {
      this.heightBelow = value;
    }
  }

  public static class ParticleEmitter2Payload {
    private Node node;

    private float speed;

    private float variation;

    private float latitude;

    private float gravity;

    private float lifespan;

    private float emissionRate;

    private float length;

    private float width;

    private long filterMode;

    private long headOrTail;

    private float tailLength;

    private float time;

    private List<SegmentColor> segmentColor;

    private int segment1Alpha;

    private int segment2Alpha;

    private int segmen3tAlpha;

    private float segment1Scale;

    private float segment2Scale;

    private float segment3Scale;

    private long segment1HeadInterval;

    private long segment2HeadInterval;

    private long segment3HeadInterval;

    private long segment1HeadDecayInterval;

    private long segment2HeadDecayInterval;

    private long segment3HeadDecayInterval;

    private long segment1TailInterval;

    private long segment2TailInterval;

    private long segment3TailInterval;

    private long segment1TailDecayInterval;

    private long segment2TailDecayInterval;

    private long segment3TailDecayInterval;

    private long textureId;

    private long squirt;

    private long priorityPlane;

    private long replaceableId;

    private List<ParticleEmitter2TrackChunkRouter> particleEmitter2TrackChunkRouter;

    @Override
    public int hashCode() {
      return Objects.hash(getNode(), getSpeed(), getVariation(), getLatitude(), getGravity(), getLifespan(), getEmissionRate(), getLength(), getWidth(), getFilterMode(), getHeadOrTail(), getTailLength(), getTime(), getSegmentColor(), getSegment1Alpha(), getSegment2Alpha(), getSegmen3tAlpha(), getSegment1Scale(), getSegment2Scale(), getSegment3Scale(), getSegment1HeadInterval(), getSegment2HeadInterval(), getSegment3HeadInterval(), getSegment1HeadDecayInterval(), getSegment2HeadDecayInterval(), getSegment3HeadDecayInterval(), getSegment1TailInterval(), getSegment2TailInterval(), getSegment3TailInterval(), getSegment1TailDecayInterval(), getSegment2TailDecayInterval(), getSegment3TailDecayInterval(), getTextureId(), getSquirt(), getPriorityPlane(), getReplaceableId(), getParticleEmitter2TrackChunkRouter());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ParticleEmitter2Payload)) {
        return false;
      }
      final ParticleEmitter2Payload thatTyped = (ParticleEmitter2Payload) that;
      if (!Objects.equals(getNode(), thatTyped.getNode())) {
        return false;
      }
      if (!Objects.equals(getSpeed(), thatTyped.getSpeed())) {
        return false;
      }
      if (!Objects.equals(getVariation(), thatTyped.getVariation())) {
        return false;
      }
      if (!Objects.equals(getLatitude(), thatTyped.getLatitude())) {
        return false;
      }
      if (!Objects.equals(getGravity(), thatTyped.getGravity())) {
        return false;
      }
      if (!Objects.equals(getLifespan(), thatTyped.getLifespan())) {
        return false;
      }
      if (!Objects.equals(getEmissionRate(), thatTyped.getEmissionRate())) {
        return false;
      }
      if (!Objects.equals(getLength(), thatTyped.getLength())) {
        return false;
      }
      if (!Objects.equals(getWidth(), thatTyped.getWidth())) {
        return false;
      }
      if (!Objects.equals(getFilterMode(), thatTyped.getFilterMode())) {
        return false;
      }
      if (!Objects.equals(getHeadOrTail(), thatTyped.getHeadOrTail())) {
        return false;
      }
      if (!Objects.equals(getTailLength(), thatTyped.getTailLength())) {
        return false;
      }
      if (!Objects.equals(getTime(), thatTyped.getTime())) {
        return false;
      }
      if (!Objects.equals(getSegmentColor(), thatTyped.getSegmentColor())) {
        return false;
      }
      if (!Objects.equals(getSegment1Alpha(), thatTyped.getSegment1Alpha())) {
        return false;
      }
      if (!Objects.equals(getSegment2Alpha(), thatTyped.getSegment2Alpha())) {
        return false;
      }
      if (!Objects.equals(getSegmen3tAlpha(), thatTyped.getSegmen3tAlpha())) {
        return false;
      }
      if (!Objects.equals(getSegment1Scale(), thatTyped.getSegment1Scale())) {
        return false;
      }
      if (!Objects.equals(getSegment2Scale(), thatTyped.getSegment2Scale())) {
        return false;
      }
      if (!Objects.equals(getSegment3Scale(), thatTyped.getSegment3Scale())) {
        return false;
      }
      if (!Objects.equals(getSegment1HeadInterval(), thatTyped.getSegment1HeadInterval())) {
        return false;
      }
      if (!Objects.equals(getSegment2HeadInterval(), thatTyped.getSegment2HeadInterval())) {
        return false;
      }
      if (!Objects.equals(getSegment3HeadInterval(), thatTyped.getSegment3HeadInterval())) {
        return false;
      }
      if (!Objects.equals(getSegment1HeadDecayInterval(), thatTyped.getSegment1HeadDecayInterval())) {
        return false;
      }
      if (!Objects.equals(getSegment2HeadDecayInterval(), thatTyped.getSegment2HeadDecayInterval())) {
        return false;
      }
      if (!Objects.equals(getSegment3HeadDecayInterval(), thatTyped.getSegment3HeadDecayInterval())) {
        return false;
      }
      if (!Objects.equals(getSegment1TailInterval(), thatTyped.getSegment1TailInterval())) {
        return false;
      }
      if (!Objects.equals(getSegment2TailInterval(), thatTyped.getSegment2TailInterval())) {
        return false;
      }
      if (!Objects.equals(getSegment3TailInterval(), thatTyped.getSegment3TailInterval())) {
        return false;
      }
      if (!Objects.equals(getSegment1TailDecayInterval(), thatTyped.getSegment1TailDecayInterval())) {
        return false;
      }
      if (!Objects.equals(getSegment2TailDecayInterval(), thatTyped.getSegment2TailDecayInterval())) {
        return false;
      }
      if (!Objects.equals(getSegment3TailDecayInterval(), thatTyped.getSegment3TailDecayInterval())) {
        return false;
      }
      if (!Objects.equals(getTextureId(), thatTyped.getTextureId())) {
        return false;
      }
      if (!Objects.equals(getSquirt(), thatTyped.getSquirt())) {
        return false;
      }
      if (!Objects.equals(getPriorityPlane(), thatTyped.getPriorityPlane())) {
        return false;
      }
      if (!Objects.equals(getReplaceableId(), thatTyped.getReplaceableId())) {
        return false;
      }
      if (!Objects.equals(getParticleEmitter2TrackChunkRouter(), thatTyped.getParticleEmitter2TrackChunkRouter())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getNode:");
      stringBuilder.append(getNode());
      stringBuilder.append(", \n");
      stringBuilder.append("getSpeed:");
      stringBuilder.append(getSpeed());
      stringBuilder.append(", \n");
      stringBuilder.append("getVariation:");
      stringBuilder.append(getVariation());
      stringBuilder.append(", \n");
      stringBuilder.append("getLatitude:");
      stringBuilder.append(getLatitude());
      stringBuilder.append(", \n");
      stringBuilder.append("getGravity:");
      stringBuilder.append(getGravity());
      stringBuilder.append(", \n");
      stringBuilder.append("getLifespan:");
      stringBuilder.append(getLifespan());
      stringBuilder.append(", \n");
      stringBuilder.append("getEmissionRate:");
      stringBuilder.append(getEmissionRate());
      stringBuilder.append(", \n");
      stringBuilder.append("getLength:");
      stringBuilder.append(getLength());
      stringBuilder.append(", \n");
      stringBuilder.append("getWidth:");
      stringBuilder.append(getWidth());
      stringBuilder.append(", \n");
      stringBuilder.append("getFilterMode:");
      stringBuilder.append(getFilterMode());
      stringBuilder.append(", \n");
      stringBuilder.append("getHeadOrTail:");
      stringBuilder.append(getHeadOrTail());
      stringBuilder.append(", \n");
      stringBuilder.append("getTailLength:");
      stringBuilder.append(getTailLength());
      stringBuilder.append(", \n");
      stringBuilder.append("getTime:");
      stringBuilder.append(getTime());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegmentColor:");
      stringBuilder.append(getSegmentColor());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment1Alpha:");
      stringBuilder.append(getSegment1Alpha());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment2Alpha:");
      stringBuilder.append(getSegment2Alpha());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegmen3tAlpha:");
      stringBuilder.append(getSegmen3tAlpha());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment1Scale:");
      stringBuilder.append(getSegment1Scale());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment2Scale:");
      stringBuilder.append(getSegment2Scale());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment3Scale:");
      stringBuilder.append(getSegment3Scale());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment1HeadInterval:");
      stringBuilder.append(getSegment1HeadInterval());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment2HeadInterval:");
      stringBuilder.append(getSegment2HeadInterval());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment3HeadInterval:");
      stringBuilder.append(getSegment3HeadInterval());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment1HeadDecayInterval:");
      stringBuilder.append(getSegment1HeadDecayInterval());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment2HeadDecayInterval:");
      stringBuilder.append(getSegment2HeadDecayInterval());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment3HeadDecayInterval:");
      stringBuilder.append(getSegment3HeadDecayInterval());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment1TailInterval:");
      stringBuilder.append(getSegment1TailInterval());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment2TailInterval:");
      stringBuilder.append(getSegment2TailInterval());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment3TailInterval:");
      stringBuilder.append(getSegment3TailInterval());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment1TailDecayInterval:");
      stringBuilder.append(getSegment1TailDecayInterval());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment2TailDecayInterval:");
      stringBuilder.append(getSegment2TailDecayInterval());
      stringBuilder.append(", \n");
      stringBuilder.append("getSegment3TailDecayInterval:");
      stringBuilder.append(getSegment3TailDecayInterval());
      stringBuilder.append(", \n");
      stringBuilder.append("getTextureId:");
      stringBuilder.append(getTextureId());
      stringBuilder.append(", \n");
      stringBuilder.append("getSquirt:");
      stringBuilder.append(getSquirt());
      stringBuilder.append(", \n");
      stringBuilder.append("getPriorityPlane:");
      stringBuilder.append(getPriorityPlane());
      stringBuilder.append(", \n");
      stringBuilder.append("getReplaceableId:");
      stringBuilder.append(getReplaceableId());
      stringBuilder.append(", \n");
      stringBuilder.append("getParticleEmitter2TrackChunkRouter:");
      stringBuilder.append(getParticleEmitter2TrackChunkRouter());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public Node getNode() {
      return node;
    }

    public float getSpeed() {
      return speed;
    }

    public float getVariation() {
      return variation;
    }

    public float getLatitude() {
      return latitude;
    }

    public float getGravity() {
      return gravity;
    }

    public float getLifespan() {
      return lifespan;
    }

    public float getEmissionRate() {
      return emissionRate;
    }

    public float getLength() {
      return length;
    }

    public float getWidth() {
      return width;
    }

    public long getFilterMode() {
      return filterMode;
    }

    public long getHeadOrTail() {
      return headOrTail;
    }

    public float getTailLength() {
      return tailLength;
    }

    public float getTime() {
      return time;
    }

    public List<SegmentColor> getSegmentColor() {
      return segmentColor;
    }

    public int getSegment1Alpha() {
      return segment1Alpha;
    }

    public int getSegment2Alpha() {
      return segment2Alpha;
    }

    public int getSegmen3tAlpha() {
      return segmen3tAlpha;
    }

    public float getSegment1Scale() {
      return segment1Scale;
    }

    public float getSegment2Scale() {
      return segment2Scale;
    }

    public float getSegment3Scale() {
      return segment3Scale;
    }

    public long getSegment1HeadInterval() {
      return segment1HeadInterval;
    }

    public long getSegment2HeadInterval() {
      return segment2HeadInterval;
    }

    public long getSegment3HeadInterval() {
      return segment3HeadInterval;
    }

    public long getSegment1HeadDecayInterval() {
      return segment1HeadDecayInterval;
    }

    public long getSegment2HeadDecayInterval() {
      return segment2HeadDecayInterval;
    }

    public long getSegment3HeadDecayInterval() {
      return segment3HeadDecayInterval;
    }

    public long getSegment1TailInterval() {
      return segment1TailInterval;
    }

    public long getSegment2TailInterval() {
      return segment2TailInterval;
    }

    public long getSegment3TailInterval() {
      return segment3TailInterval;
    }

    public long getSegment1TailDecayInterval() {
      return segment1TailDecayInterval;
    }

    public long getSegment2TailDecayInterval() {
      return segment2TailDecayInterval;
    }

    public long getSegment3TailDecayInterval() {
      return segment3TailDecayInterval;
    }

    public long getTextureId() {
      return textureId;
    }

    public long getSquirt() {
      return squirt;
    }

    public long getPriorityPlane() {
      return priorityPlane;
    }

    public long getReplaceableId() {
      return replaceableId;
    }

    public List<ParticleEmitter2TrackChunkRouter> getParticleEmitter2TrackChunkRouter() {
      return particleEmitter2TrackChunkRouter;
    }

    public void setNode(Node value) {
      this.node = value;
    }

    public void setSpeed(float value) {
      this.speed = value;
    }

    public void setVariation(float value) {
      this.variation = value;
    }

    public void setLatitude(float value) {
      this.latitude = value;
    }

    public void setGravity(float value) {
      this.gravity = value;
    }

    public void setLifespan(float value) {
      this.lifespan = value;
    }

    public void setEmissionRate(float value) {
      this.emissionRate = value;
    }

    public void setLength(float value) {
      this.length = value;
    }

    public void setWidth(float value) {
      this.width = value;
    }

    public void setFilterMode(long value) {
      this.filterMode = value;
    }

    public void setHeadOrTail(long value) {
      this.headOrTail = value;
    }

    public void setTailLength(float value) {
      this.tailLength = value;
    }

    public void setTime(float value) {
      this.time = value;
    }

    public void setSegmentColor(List<SegmentColor> value) {
      this.segmentColor = value;
    }

    public void setSegment1Alpha(int value) {
      this.segment1Alpha = value;
    }

    public void setSegment2Alpha(int value) {
      this.segment2Alpha = value;
    }

    public void setSegmen3tAlpha(int value) {
      this.segmen3tAlpha = value;
    }

    public void setSegment1Scale(float value) {
      this.segment1Scale = value;
    }

    public void setSegment2Scale(float value) {
      this.segment2Scale = value;
    }

    public void setSegment3Scale(float value) {
      this.segment3Scale = value;
    }

    public void setSegment1HeadInterval(long value) {
      this.segment1HeadInterval = value;
    }

    public void setSegment2HeadInterval(long value) {
      this.segment2HeadInterval = value;
    }

    public void setSegment3HeadInterval(long value) {
      this.segment3HeadInterval = value;
    }

    public void setSegment1HeadDecayInterval(long value) {
      this.segment1HeadDecayInterval = value;
    }

    public void setSegment2HeadDecayInterval(long value) {
      this.segment2HeadDecayInterval = value;
    }

    public void setSegment3HeadDecayInterval(long value) {
      this.segment3HeadDecayInterval = value;
    }

    public void setSegment1TailInterval(long value) {
      this.segment1TailInterval = value;
    }

    public void setSegment2TailInterval(long value) {
      this.segment2TailInterval = value;
    }

    public void setSegment3TailInterval(long value) {
      this.segment3TailInterval = value;
    }

    public void setSegment1TailDecayInterval(long value) {
      this.segment1TailDecayInterval = value;
    }

    public void setSegment2TailDecayInterval(long value) {
      this.segment2TailDecayInterval = value;
    }

    public void setSegment3TailDecayInterval(long value) {
      this.segment3TailDecayInterval = value;
    }

    public void setTextureId(long value) {
      this.textureId = value;
    }

    public void setSquirt(long value) {
      this.squirt = value;
    }

    public void setPriorityPlane(long value) {
      this.priorityPlane = value;
    }

    public void setReplaceableId(long value) {
      this.replaceableId = value;
    }

    public void setParticleEmitter2TrackChunkRouter(List<ParticleEmitter2TrackChunkRouter> value) {
      this.particleEmitter2TrackChunkRouter = value;
    }
  }

  public static class ParticleEmitter2TrackChunkRouter {
    private W3id magic;

    private Object chunk;

    @Override
    public int hashCode() {
      return Objects.hash(getMagic(), getChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ParticleEmitter2TrackChunkRouter)) {
        return false;
      }
      final ParticleEmitter2TrackChunkRouter thatTyped = (ParticleEmitter2TrackChunkRouter) that;
      if (!Objects.equals(getMagic(), thatTyped.getMagic())) {
        return false;
      }
      if (!Objects.equals(getChunk(), thatTyped.getChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getMagic:");
      stringBuilder.append(getMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getChunk:");
      stringBuilder.append(getChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getMagic() {
      return magic;
    }

    public Object getChunk() {
      return chunk;
    }

    public void setMagic(W3id value) {
      this.magic = value;
    }

    public void setChunk(Object value) {
      this.chunk = value;
    }
  }

  public static class KppaChunk {
    private float alpha;

    @Override
    public int hashCode() {
      return Objects.hash(getAlpha());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KppaChunk)) {
        return false;
      }
      final KppaChunk thatTyped = (KppaChunk) that;
      if (!Objects.equals(getAlpha(), thatTyped.getAlpha())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getAlpha:");
      stringBuilder.append(getAlpha());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getAlpha() {
      return alpha;
    }

    public void setAlpha(float value) {
      this.alpha = value;
    }
  }

  public static class Kp2sChunk {
    private float speed;

    @Override
    public int hashCode() {
      return Objects.hash(getSpeed());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Kp2sChunk)) {
        return false;
      }
      final Kp2sChunk thatTyped = (Kp2sChunk) that;
      if (!Objects.equals(getSpeed(), thatTyped.getSpeed())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getSpeed:");
      stringBuilder.append(getSpeed());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getSpeed() {
      return speed;
    }

    public void setSpeed(float value) {
      this.speed = value;
    }
  }

  public static class ChunkHelp {
    private List<Helper> helper;

    @Override
    public int hashCode() {
      return Objects.hash(getHelper());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkHelp)) {
        return false;
      }
      final ChunkHelp thatTyped = (ChunkHelp) that;
      if (!Objects.equals(getHelper(), thatTyped.getHelper())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getHelper:");
      stringBuilder.append(getHelper());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Helper> getHelper() {
      return helper;
    }

    public void setHelper(List<Helper> value) {
      this.helper = value;
    }
  }

  public static class GeosetPayload {
    private W3id vrtxMagic;

    private List<VertexPosition> vertexPosition;

    private W3id nrmsMagic;

    private List<VertexNormal> vertexNormal;

    private W3id ptypMagic;

    private List<Long> faceTypeGroup;

    private W3id pcntMagic;

    private List<Long> faceGroup;

    private W3id pvtxMagic;

    private List<Integer> face;

    private W3id gndxMagic;

    private List<Integer> vertexGroup;

    private W3id mtgcMagic;

    private List<Long> matrixGroup;

    private W3id matsMagic;

    private List<Long> matrixIndex;

    private W3id materialId;

    private long selectionGroup;

    private long selectionFlags;

    private Long lod;

    private String lodName;

    private Extent extent;

    private List<Extent> sequenceExtent;

    private TangentChunk tangentChunk;

    private SkinChunk skinChunk;

    @Override
    public int hashCode() {
      return Objects.hash(getVrtxMagic(), getVertexPosition(), getNrmsMagic(), getVertexNormal(), getPtypMagic(), getFaceTypeGroup(), getPcntMagic(), getFaceGroup(), getPvtxMagic(), getFace(), getGndxMagic(), getVertexGroup(), getMtgcMagic(), getMatrixGroup(), getMatsMagic(), getMatrixIndex(), getMaterialId(), getSelectionGroup(), getSelectionFlags(), getLod(), getLodName(), getExtent(), getSequenceExtent(), getTangentChunk(), getSkinChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof GeosetPayload)) {
        return false;
      }
      final GeosetPayload thatTyped = (GeosetPayload) that;
      if (!Objects.equals(getVrtxMagic(), thatTyped.getVrtxMagic())) {
        return false;
      }
      if (!Objects.equals(getVertexPosition(), thatTyped.getVertexPosition())) {
        return false;
      }
      if (!Objects.equals(getNrmsMagic(), thatTyped.getNrmsMagic())) {
        return false;
      }
      if (!Objects.equals(getVertexNormal(), thatTyped.getVertexNormal())) {
        return false;
      }
      if (!Objects.equals(getPtypMagic(), thatTyped.getPtypMagic())) {
        return false;
      }
      if (!Objects.equals(getFaceTypeGroup(), thatTyped.getFaceTypeGroup())) {
        return false;
      }
      if (!Objects.equals(getPcntMagic(), thatTyped.getPcntMagic())) {
        return false;
      }
      if (!Objects.equals(getFaceGroup(), thatTyped.getFaceGroup())) {
        return false;
      }
      if (!Objects.equals(getPvtxMagic(), thatTyped.getPvtxMagic())) {
        return false;
      }
      if (!Objects.equals(getFace(), thatTyped.getFace())) {
        return false;
      }
      if (!Objects.equals(getGndxMagic(), thatTyped.getGndxMagic())) {
        return false;
      }
      if (!Objects.equals(getVertexGroup(), thatTyped.getVertexGroup())) {
        return false;
      }
      if (!Objects.equals(getMtgcMagic(), thatTyped.getMtgcMagic())) {
        return false;
      }
      if (!Objects.equals(getMatrixGroup(), thatTyped.getMatrixGroup())) {
        return false;
      }
      if (!Objects.equals(getMatsMagic(), thatTyped.getMatsMagic())) {
        return false;
      }
      if (!Objects.equals(getMatrixIndex(), thatTyped.getMatrixIndex())) {
        return false;
      }
      if (!Objects.equals(getMaterialId(), thatTyped.getMaterialId())) {
        return false;
      }
      if (!Objects.equals(getSelectionGroup(), thatTyped.getSelectionGroup())) {
        return false;
      }
      if (!Objects.equals(getSelectionFlags(), thatTyped.getSelectionFlags())) {
        return false;
      }
      if (!Objects.equals(getLod(), thatTyped.getLod())) {
        return false;
      }
      if (!Objects.equals(getLodName(), thatTyped.getLodName())) {
        return false;
      }
      if (!Objects.equals(getExtent(), thatTyped.getExtent())) {
        return false;
      }
      if (!Objects.equals(getSequenceExtent(), thatTyped.getSequenceExtent())) {
        return false;
      }
      if (!Objects.equals(getTangentChunk(), thatTyped.getTangentChunk())) {
        return false;
      }
      if (!Objects.equals(getSkinChunk(), thatTyped.getSkinChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getVrtxMagic:");
      stringBuilder.append(getVrtxMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getVertexPosition:");
      stringBuilder.append(getVertexPosition());
      stringBuilder.append(", \n");
      stringBuilder.append("getNrmsMagic:");
      stringBuilder.append(getNrmsMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getVertexNormal:");
      stringBuilder.append(getVertexNormal());
      stringBuilder.append(", \n");
      stringBuilder.append("getPtypMagic:");
      stringBuilder.append(getPtypMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getFaceTypeGroup:");
      stringBuilder.append(getFaceTypeGroup());
      stringBuilder.append(", \n");
      stringBuilder.append("getPcntMagic:");
      stringBuilder.append(getPcntMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getFaceGroup:");
      stringBuilder.append(getFaceGroup());
      stringBuilder.append(", \n");
      stringBuilder.append("getPvtxMagic:");
      stringBuilder.append(getPvtxMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getFace:");
      stringBuilder.append(getFace());
      stringBuilder.append(", \n");
      stringBuilder.append("getGndxMagic:");
      stringBuilder.append(getGndxMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getVertexGroup:");
      stringBuilder.append(getVertexGroup());
      stringBuilder.append(", \n");
      stringBuilder.append("getMtgcMagic:");
      stringBuilder.append(getMtgcMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getMatrixGroup:");
      stringBuilder.append(getMatrixGroup());
      stringBuilder.append(", \n");
      stringBuilder.append("getMatsMagic:");
      stringBuilder.append(getMatsMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getMatrixIndex:");
      stringBuilder.append(getMatrixIndex());
      stringBuilder.append(", \n");
      stringBuilder.append("getMaterialId:");
      stringBuilder.append(getMaterialId());
      stringBuilder.append(", \n");
      stringBuilder.append("getSelectionGroup:");
      stringBuilder.append(getSelectionGroup());
      stringBuilder.append(", \n");
      stringBuilder.append("getSelectionFlags:");
      stringBuilder.append(getSelectionFlags());
      stringBuilder.append(", \n");
      stringBuilder.append("getLod:");
      stringBuilder.append(getLod());
      stringBuilder.append(", \n");
      stringBuilder.append("getLodName:");
      stringBuilder.append(getLodName());
      stringBuilder.append(", \n");
      stringBuilder.append("getExtent:");
      stringBuilder.append(getExtent());
      stringBuilder.append(", \n");
      stringBuilder.append("getSequenceExtent:");
      stringBuilder.append(getSequenceExtent());
      stringBuilder.append(", \n");
      stringBuilder.append("getTangentChunk:");
      stringBuilder.append(getTangentChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getSkinChunk:");
      stringBuilder.append(getSkinChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getVrtxMagic() {
      return vrtxMagic;
    }

    public List<VertexPosition> getVertexPosition() {
      return vertexPosition;
    }

    public W3id getNrmsMagic() {
      return nrmsMagic;
    }

    public List<VertexNormal> getVertexNormal() {
      return vertexNormal;
    }

    public W3id getPtypMagic() {
      return ptypMagic;
    }

    public List<Long> getFaceTypeGroup() {
      return faceTypeGroup;
    }

    public W3id getPcntMagic() {
      return pcntMagic;
    }

    public List<Long> getFaceGroup() {
      return faceGroup;
    }

    public W3id getPvtxMagic() {
      return pvtxMagic;
    }

    public List<Integer> getFace() {
      return face;
    }

    public W3id getGndxMagic() {
      return gndxMagic;
    }

    public List<Integer> getVertexGroup() {
      return vertexGroup;
    }

    public W3id getMtgcMagic() {
      return mtgcMagic;
    }

    public List<Long> getMatrixGroup() {
      return matrixGroup;
    }

    public W3id getMatsMagic() {
      return matsMagic;
    }

    public List<Long> getMatrixIndex() {
      return matrixIndex;
    }

    public W3id getMaterialId() {
      return materialId;
    }

    public long getSelectionGroup() {
      return selectionGroup;
    }

    public long getSelectionFlags() {
      return selectionFlags;
    }

    public Long getLod() {
      return lod;
    }

    public String getLodName() {
      return lodName;
    }

    public Extent getExtent() {
      return extent;
    }

    public List<Extent> getSequenceExtent() {
      return sequenceExtent;
    }

    public TangentChunk getTangentChunk() {
      return tangentChunk;
    }

    public SkinChunk getSkinChunk() {
      return skinChunk;
    }

    public void setVrtxMagic(W3id value) {
      this.vrtxMagic = value;
    }

    public void setVertexPosition(List<VertexPosition> value) {
      this.vertexPosition = value;
    }

    public void setNrmsMagic(W3id value) {
      this.nrmsMagic = value;
    }

    public void setVertexNormal(List<VertexNormal> value) {
      this.vertexNormal = value;
    }

    public void setPtypMagic(W3id value) {
      this.ptypMagic = value;
    }

    public void setFaceTypeGroup(List<Long> value) {
      this.faceTypeGroup = value;
    }

    public void setPcntMagic(W3id value) {
      this.pcntMagic = value;
    }

    public void setFaceGroup(List<Long> value) {
      this.faceGroup = value;
    }

    public void setPvtxMagic(W3id value) {
      this.pvtxMagic = value;
    }

    public void setFace(List<Integer> value) {
      this.face = value;
    }

    public void setGndxMagic(W3id value) {
      this.gndxMagic = value;
    }

    public void setVertexGroup(List<Integer> value) {
      this.vertexGroup = value;
    }

    public void setMtgcMagic(W3id value) {
      this.mtgcMagic = value;
    }

    public void setMatrixGroup(List<Long> value) {
      this.matrixGroup = value;
    }

    public void setMatsMagic(W3id value) {
      this.matsMagic = value;
    }

    public void setMatrixIndex(List<Long> value) {
      this.matrixIndex = value;
    }

    public void setMaterialId(W3id value) {
      this.materialId = value;
    }

    public void setSelectionGroup(long value) {
      this.selectionGroup = value;
    }

    public void setSelectionFlags(long value) {
      this.selectionFlags = value;
    }

    public void setLod(Long value) {
      this.lod = value;
    }

    public void setLodName(String value) {
      this.lodName = value;
    }

    public void setExtent(Extent value) {
      this.extent = value;
    }

    public void setSequenceExtent(List<Extent> value) {
      this.sequenceExtent = value;
    }

    public void setTangentChunk(TangentChunk value) {
      this.tangentChunk = value;
    }

    public void setSkinChunk(SkinChunk value) {
      this.skinChunk = value;
    }
  }

  public static class FaceEffect {
    private String target;

    private String path;

    @Override
    public int hashCode() {
      return Objects.hash(getTarget(), getPath());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof FaceEffect)) {
        return false;
      }
      final FaceEffect thatTyped = (FaceEffect) that;
      if (!Objects.equals(getTarget(), thatTyped.getTarget())) {
        return false;
      }
      if (!Objects.equals(getPath(), thatTyped.getPath())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getTarget:");
      stringBuilder.append(getTarget());
      stringBuilder.append(", \n");
      stringBuilder.append("getPath:");
      stringBuilder.append(getPath());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public String getTarget() {
      return target;
    }

    public String getPath() {
      return path;
    }

    public void setTarget(String value) {
      this.target = value;
    }

    public void setPath(String value) {
      this.path = value;
    }
  }

  public static class ChunkGeoa {
    private List<GeosetAnim> geosetAnim;

    @Override
    public int hashCode() {
      return Objects.hash(getGeosetAnim());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkGeoa)) {
        return false;
      }
      final ChunkGeoa thatTyped = (ChunkGeoa) that;
      if (!Objects.equals(getGeosetAnim(), thatTyped.getGeosetAnim())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getGeosetAnim:");
      stringBuilder.append(getGeosetAnim());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<GeosetAnim> getGeosetAnim() {
      return geosetAnim;
    }

    public void setGeosetAnim(List<GeosetAnim> value) {
      this.geosetAnim = value;
    }
  }

  public static class KpplChunk {
    private float lifespan;

    @Override
    public int hashCode() {
      return Objects.hash(getLifespan());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KpplChunk)) {
        return false;
      }
      final KpplChunk thatTyped = (KpplChunk) that;
      if (!Objects.equals(getLifespan(), thatTyped.getLifespan())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getLifespan:");
      stringBuilder.append(getLifespan());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getLifespan() {
      return lifespan;
    }

    public void setLifespan(float value) {
      this.lifespan = value;
    }
  }

  public static class Helper {
    private Node node;

    @Override
    public int hashCode() {
      return Objects.hash(getNode());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Helper)) {
        return false;
      }
      final Helper thatTyped = (Helper) that;
      if (!Objects.equals(getNode(), thatTyped.getNode())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getNode:");
      stringBuilder.append(getNode());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public Node getNode() {
      return node;
    }

    public void setNode(Node value) {
      this.node = value;
    }
  }

  public static class VertexNormal {
    private List<Float> value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof VertexNormal)) {
        return false;
      }
      final VertexNormal thatTyped = (VertexNormal) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getValue() {
      return value;
    }

    public void setValue(List<Float> value) {
      this.value = value;
    }
  }

  public static class KmteChunk {
    private TrackChunk value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KmteChunk)) {
        return false;
      }
      final KmteChunk thatTyped = (KmteChunk) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public TrackChunk getValue() {
      return value;
    }

    public void setValue(TrackChunk value) {
      this.value = value;
    }
  }

  public static class SkinChunk {
    private W3id magic;

    private List<Integer> skin;

    @Override
    public int hashCode() {
      return Objects.hash(getMagic(), getSkin());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof SkinChunk)) {
        return false;
      }
      final SkinChunk thatTyped = (SkinChunk) that;
      if (!Objects.equals(getMagic(), thatTyped.getMagic())) {
        return false;
      }
      if (!Objects.equals(getSkin(), thatTyped.getSkin())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getMagic:");
      stringBuilder.append(getMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getSkin:");
      stringBuilder.append(getSkin());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getMagic() {
      return magic;
    }

    public List<Integer> getSkin() {
      return skin;
    }

    public void setMagic(W3id value) {
      this.magic = value;
    }

    public void setSkin(List<Integer> value) {
      this.skin = value;
    }
  }

  public static class KpltChunk {
    private float latitude;

    @Override
    public int hashCode() {
      return Objects.hash(getLatitude());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KpltChunk)) {
        return false;
      }
      final KpltChunk thatTyped = (KpltChunk) that;
      if (!Objects.equals(getLatitude(), thatTyped.getLatitude())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getLatitude:");
      stringBuilder.append(getLatitude());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getLatitude() {
      return latitude;
    }

    public void setLatitude(float value) {
      this.latitude = value;
    }
  }

  public static class KlacChunk {
    private List<Float> color;

    @Override
    public int hashCode() {
      return Objects.hash(getColor());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KlacChunk)) {
        return false;
      }
      final KlacChunk thatTyped = (KlacChunk) that;
      if (!Objects.equals(getColor(), thatTyped.getColor())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getColor:");
      stringBuilder.append(getColor());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getColor() {
      return color;
    }

    public void setColor(List<Float> value) {
      this.color = value;
    }
  }

  public static class ChunkAtch {
    private List<Attachment> attachment;

    @Override
    public int hashCode() {
      return Objects.hash(getAttachment());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkAtch)) {
        return false;
      }
      final ChunkAtch thatTyped = (ChunkAtch) that;
      if (!Objects.equals(getAttachment(), thatTyped.getAttachment())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getAttachment:");
      stringBuilder.append(getAttachment());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Attachment> getAttachment() {
      return attachment;
    }

    public void setAttachment(List<Attachment> value) {
      this.attachment = value;
    }
  }

  public static class F43 {
    private List<Float> value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof F43)) {
        return false;
      }
      final F43 thatTyped = (F43) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getValue() {
      return value;
    }

    public void setValue(List<Float> value) {
      this.value = value;
    }
  }

  public static class ChunkCams {
    private List<Camera> camera;

    @Override
    public int hashCode() {
      return Objects.hash(getCamera());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkCams)) {
        return false;
      }
      final ChunkCams thatTyped = (ChunkCams) that;
      if (!Objects.equals(getCamera(), thatTyped.getCamera())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getCamera:");
      stringBuilder.append(getCamera());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Camera> getCamera() {
      return camera;
    }

    public void setCamera(List<Camera> value) {
      this.camera = value;
    }
  }

  public static class KlaeChunk {
    private float attenuationEnd;

    @Override
    public int hashCode() {
      return Objects.hash(getAttenuationEnd());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KlaeChunk)) {
        return false;
      }
      final KlaeChunk thatTyped = (KlaeChunk) that;
      if (!Objects.equals(getAttenuationEnd(), thatTyped.getAttenuationEnd())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getAttenuationEnd:");
      stringBuilder.append(getAttenuationEnd());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getAttenuationEnd() {
      return attenuationEnd;
    }

    public void setAttenuationEnd(float value) {
      this.attenuationEnd = value;
    }
  }

  public static class ChunkMtls {
    private List<Material> material;

    private long size;

    @Override
    public int hashCode() {
      return Objects.hash(getMaterial(), getSize());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkMtls)) {
        return false;
      }
      final ChunkMtls thatTyped = (ChunkMtls) that;
      if (!Objects.equals(getMaterial(), thatTyped.getMaterial())) {
        return false;
      }
      if (!Objects.equals(getSize(), thatTyped.getSize())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getMaterial:");
      stringBuilder.append(getMaterial());
      stringBuilder.append(", \n");
      stringBuilder.append("getSize:");
      stringBuilder.append(getSize());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Material> getMaterial() {
      return material;
    }

    public long getSize() {
      return size;
    }

    public void setMaterial(List<Material> value) {
      this.material = value;
    }

    public void setSize(long value) {
      this.size = value;
    }
  }

  public static class LightPayload {
    private Node node;

    private long type;

    private float attenuationStart;

    private float attenuationEnd;

    private float color1;

    private float color2;

    private float color3;

    private float intensity;

    private float ambientColor1;

    private float ambientColor2;

    private float ambientColor3;

    private float ambientIntensity;

    private List<LightTrackChunkRouter> lightTrackChunkRouter;

    @Override
    public int hashCode() {
      return Objects.hash(getNode(), getType(), getAttenuationStart(), getAttenuationEnd(), getColor1(), getColor2(), getColor3(), getIntensity(), getAmbientColor1(), getAmbientColor2(), getAmbientColor3(), getAmbientIntensity(), getLightTrackChunkRouter());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof LightPayload)) {
        return false;
      }
      final LightPayload thatTyped = (LightPayload) that;
      if (!Objects.equals(getNode(), thatTyped.getNode())) {
        return false;
      }
      if (!Objects.equals(getType(), thatTyped.getType())) {
        return false;
      }
      if (!Objects.equals(getAttenuationStart(), thatTyped.getAttenuationStart())) {
        return false;
      }
      if (!Objects.equals(getAttenuationEnd(), thatTyped.getAttenuationEnd())) {
        return false;
      }
      if (!Objects.equals(getColor1(), thatTyped.getColor1())) {
        return false;
      }
      if (!Objects.equals(getColor2(), thatTyped.getColor2())) {
        return false;
      }
      if (!Objects.equals(getColor3(), thatTyped.getColor3())) {
        return false;
      }
      if (!Objects.equals(getIntensity(), thatTyped.getIntensity())) {
        return false;
      }
      if (!Objects.equals(getAmbientColor1(), thatTyped.getAmbientColor1())) {
        return false;
      }
      if (!Objects.equals(getAmbientColor2(), thatTyped.getAmbientColor2())) {
        return false;
      }
      if (!Objects.equals(getAmbientColor3(), thatTyped.getAmbientColor3())) {
        return false;
      }
      if (!Objects.equals(getAmbientIntensity(), thatTyped.getAmbientIntensity())) {
        return false;
      }
      if (!Objects.equals(getLightTrackChunkRouter(), thatTyped.getLightTrackChunkRouter())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getNode:");
      stringBuilder.append(getNode());
      stringBuilder.append(", \n");
      stringBuilder.append("getType:");
      stringBuilder.append(getType());
      stringBuilder.append(", \n");
      stringBuilder.append("getAttenuationStart:");
      stringBuilder.append(getAttenuationStart());
      stringBuilder.append(", \n");
      stringBuilder.append("getAttenuationEnd:");
      stringBuilder.append(getAttenuationEnd());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor1:");
      stringBuilder.append(getColor1());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor2:");
      stringBuilder.append(getColor2());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor3:");
      stringBuilder.append(getColor3());
      stringBuilder.append(", \n");
      stringBuilder.append("getIntensity:");
      stringBuilder.append(getIntensity());
      stringBuilder.append(", \n");
      stringBuilder.append("getAmbientColor1:");
      stringBuilder.append(getAmbientColor1());
      stringBuilder.append(", \n");
      stringBuilder.append("getAmbientColor2:");
      stringBuilder.append(getAmbientColor2());
      stringBuilder.append(", \n");
      stringBuilder.append("getAmbientColor3:");
      stringBuilder.append(getAmbientColor3());
      stringBuilder.append(", \n");
      stringBuilder.append("getAmbientIntensity:");
      stringBuilder.append(getAmbientIntensity());
      stringBuilder.append(", \n");
      stringBuilder.append("getLightTrackChunkRouter:");
      stringBuilder.append(getLightTrackChunkRouter());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public Node getNode() {
      return node;
    }

    public long getType() {
      return type;
    }

    public float getAttenuationStart() {
      return attenuationStart;
    }

    public float getAttenuationEnd() {
      return attenuationEnd;
    }

    public float getColor1() {
      return color1;
    }

    public float getColor2() {
      return color2;
    }

    public float getColor3() {
      return color3;
    }

    public float getIntensity() {
      return intensity;
    }

    public float getAmbientColor1() {
      return ambientColor1;
    }

    public float getAmbientColor2() {
      return ambientColor2;
    }

    public float getAmbientColor3() {
      return ambientColor3;
    }

    public float getAmbientIntensity() {
      return ambientIntensity;
    }

    public List<LightTrackChunkRouter> getLightTrackChunkRouter() {
      return lightTrackChunkRouter;
    }

    public void setNode(Node value) {
      this.node = value;
    }

    public void setType(long value) {
      this.type = value;
    }

    public void setAttenuationStart(float value) {
      this.attenuationStart = value;
    }

    public void setAttenuationEnd(float value) {
      this.attenuationEnd = value;
    }

    public void setColor1(float value) {
      this.color1 = value;
    }

    public void setColor2(float value) {
      this.color2 = value;
    }

    public void setColor3(float value) {
      this.color3 = value;
    }

    public void setIntensity(float value) {
      this.intensity = value;
    }

    public void setAmbientColor1(float value) {
      this.ambientColor1 = value;
    }

    public void setAmbientColor2(float value) {
      this.ambientColor2 = value;
    }

    public void setAmbientColor3(float value) {
      this.ambientColor3 = value;
    }

    public void setAmbientIntensity(float value) {
      this.ambientIntensity = value;
    }

    public void setLightTrackChunkRouter(List<LightTrackChunkRouter> value) {
      this.lightTrackChunkRouter = value;
    }
  }

  public static class KfctChunk {
    private float fresnelTeamColor;

    @Override
    public int hashCode() {
      return Objects.hash(getFresnelTeamColor());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KfctChunk)) {
        return false;
      }
      final KfctChunk thatTyped = (KfctChunk) that;
      if (!Objects.equals(getFresnelTeamColor(), thatTyped.getFresnelTeamColor())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getFresnelTeamColor:");
      stringBuilder.append(getFresnelTeamColor());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getFresnelTeamColor() {
      return fresnelTeamColor;
    }

    public void setFresnelTeamColor(float value) {
      this.fresnelTeamColor = value;
    }
  }

  public static class KrhaChunk {
    private float heightAbove;

    @Override
    public int hashCode() {
      return Objects.hash(getHeightAbove());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KrhaChunk)) {
        return false;
      }
      final KrhaChunk thatTyped = (KrhaChunk) that;
      if (!Objects.equals(getHeightAbove(), thatTyped.getHeightAbove())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getHeightAbove:");
      stringBuilder.append(getHeightAbove());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getHeightAbove() {
      return heightAbove;
    }

    public void setHeightAbove(float value) {
      this.heightAbove = value;
    }
  }

  public static class KlbiChunk {
    private float ambientIntensity;

    @Override
    public int hashCode() {
      return Objects.hash(getAmbientIntensity());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KlbiChunk)) {
        return false;
      }
      final KlbiChunk thatTyped = (KlbiChunk) that;
      if (!Objects.equals(getAmbientIntensity(), thatTyped.getAmbientIntensity())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getAmbientIntensity:");
      stringBuilder.append(getAmbientIntensity());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getAmbientIntensity() {
      return ambientIntensity;
    }

    public void setAmbientIntensity(float value) {
      this.ambientIntensity = value;
    }
  }

  public static class Track {
    private int frame;

    private Object value;

    private Object inTan;

    private Object outTan;

    private String valueType;

    private long interpolationType;

    @Override
    public int hashCode() {
      return Objects.hash(getFrame(), getValue(), getInTan(), getOutTan(), getValueType(), getInterpolationType());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Track)) {
        return false;
      }
      final Track thatTyped = (Track) that;
      if (!Objects.equals(getFrame(), thatTyped.getFrame())) {
        return false;
      }
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      if (!Objects.equals(getInTan(), thatTyped.getInTan())) {
        return false;
      }
      if (!Objects.equals(getOutTan(), thatTyped.getOutTan())) {
        return false;
      }
      if (!Objects.equals(getValueType(), thatTyped.getValueType())) {
        return false;
      }
      if (!Objects.equals(getInterpolationType(), thatTyped.getInterpolationType())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getFrame:");
      stringBuilder.append(getFrame());
      stringBuilder.append(", \n");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append(", \n");
      stringBuilder.append("getInTan:");
      stringBuilder.append(getInTan());
      stringBuilder.append(", \n");
      stringBuilder.append("getOutTan:");
      stringBuilder.append(getOutTan());
      stringBuilder.append(", \n");
      stringBuilder.append("getValueType:");
      stringBuilder.append(getValueType());
      stringBuilder.append(", \n");
      stringBuilder.append("getInterpolationType:");
      stringBuilder.append(getInterpolationType());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public int getFrame() {
      return frame;
    }

    public Object getValue() {
      return value;
    }

    public Object getInTan() {
      return inTan;
    }

    public Object getOutTan() {
      return outTan;
    }

    public String getValueType() {
      return valueType;
    }

    public long getInterpolationType() {
      return interpolationType;
    }

    public void setFrame(int value) {
      this.frame = value;
    }

    public void setValue(Object value) {
      this.value = value;
    }

    public void setInTan(Object value) {
      this.inTan = value;
    }

    public void setOutTan(Object value) {
      this.outTan = value;
    }

    public void setValueType(String value) {
      this.valueType = value;
    }

    public void setInterpolationType(long value) {
      this.interpolationType = value;
    }
  }

  public static class CameraPayload {
    private String name;

    private float position1;

    private float position2;

    private float position3;

    private float fieldOfView;

    private float farClippingPlane;

    private float nearClippingPlane;

    private float targetPosition1;

    private float targetPosition2;

    private float targetPosition3;

    private List<CameraTrackChunkRouter> cameraTrackChunkRouter;

    @Override
    public int hashCode() {
      return Objects.hash(getName(), getPosition1(), getPosition2(), getPosition3(), getFieldOfView(), getFarClippingPlane(), getNearClippingPlane(), getTargetPosition1(), getTargetPosition2(), getTargetPosition3(), getCameraTrackChunkRouter());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof CameraPayload)) {
        return false;
      }
      final CameraPayload thatTyped = (CameraPayload) that;
      if (!Objects.equals(getName(), thatTyped.getName())) {
        return false;
      }
      if (!Objects.equals(getPosition1(), thatTyped.getPosition1())) {
        return false;
      }
      if (!Objects.equals(getPosition2(), thatTyped.getPosition2())) {
        return false;
      }
      if (!Objects.equals(getPosition3(), thatTyped.getPosition3())) {
        return false;
      }
      if (!Objects.equals(getFieldOfView(), thatTyped.getFieldOfView())) {
        return false;
      }
      if (!Objects.equals(getFarClippingPlane(), thatTyped.getFarClippingPlane())) {
        return false;
      }
      if (!Objects.equals(getNearClippingPlane(), thatTyped.getNearClippingPlane())) {
        return false;
      }
      if (!Objects.equals(getTargetPosition1(), thatTyped.getTargetPosition1())) {
        return false;
      }
      if (!Objects.equals(getTargetPosition2(), thatTyped.getTargetPosition2())) {
        return false;
      }
      if (!Objects.equals(getTargetPosition3(), thatTyped.getTargetPosition3())) {
        return false;
      }
      if (!Objects.equals(getCameraTrackChunkRouter(), thatTyped.getCameraTrackChunkRouter())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getPosition1:");
      stringBuilder.append(getPosition1());
      stringBuilder.append(", \n");
      stringBuilder.append("getPosition2:");
      stringBuilder.append(getPosition2());
      stringBuilder.append(", \n");
      stringBuilder.append("getPosition3:");
      stringBuilder.append(getPosition3());
      stringBuilder.append(", \n");
      stringBuilder.append("getFieldOfView:");
      stringBuilder.append(getFieldOfView());
      stringBuilder.append(", \n");
      stringBuilder.append("getFarClippingPlane:");
      stringBuilder.append(getFarClippingPlane());
      stringBuilder.append(", \n");
      stringBuilder.append("getNearClippingPlane:");
      stringBuilder.append(getNearClippingPlane());
      stringBuilder.append(", \n");
      stringBuilder.append("getTargetPosition1:");
      stringBuilder.append(getTargetPosition1());
      stringBuilder.append(", \n");
      stringBuilder.append("getTargetPosition2:");
      stringBuilder.append(getTargetPosition2());
      stringBuilder.append(", \n");
      stringBuilder.append("getTargetPosition3:");
      stringBuilder.append(getTargetPosition3());
      stringBuilder.append(", \n");
      stringBuilder.append("getCameraTrackChunkRouter:");
      stringBuilder.append(getCameraTrackChunkRouter());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public String getName() {
      return name;
    }

    public float getPosition1() {
      return position1;
    }

    public float getPosition2() {
      return position2;
    }

    public float getPosition3() {
      return position3;
    }

    public float getFieldOfView() {
      return fieldOfView;
    }

    public float getFarClippingPlane() {
      return farClippingPlane;
    }

    public float getNearClippingPlane() {
      return nearClippingPlane;
    }

    public float getTargetPosition1() {
      return targetPosition1;
    }

    public float getTargetPosition2() {
      return targetPosition2;
    }

    public float getTargetPosition3() {
      return targetPosition3;
    }

    public List<CameraTrackChunkRouter> getCameraTrackChunkRouter() {
      return cameraTrackChunkRouter;
    }

    public void setName(String value) {
      this.name = value;
    }

    public void setPosition1(float value) {
      this.position1 = value;
    }

    public void setPosition2(float value) {
      this.position2 = value;
    }

    public void setPosition3(float value) {
      this.position3 = value;
    }

    public void setFieldOfView(float value) {
      this.fieldOfView = value;
    }

    public void setFarClippingPlane(float value) {
      this.farClippingPlane = value;
    }

    public void setNearClippingPlane(float value) {
      this.nearClippingPlane = value;
    }

    public void setTargetPosition1(float value) {
      this.targetPosition1 = value;
    }

    public void setTargetPosition2(float value) {
      this.targetPosition2 = value;
    }

    public void setTargetPosition3(float value) {
      this.targetPosition3 = value;
    }

    public void setCameraTrackChunkRouter(List<CameraTrackChunkRouter> value) {
      this.cameraTrackChunkRouter = value;
    }
  }

  public static class Extent {
    private float boundsRadius;

    private List<Float> minimum;

    private List<Float> maximum;

    @Override
    public int hashCode() {
      return Objects.hash(getBoundsRadius(), getMinimum(), getMaximum());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Extent)) {
        return false;
      }
      final Extent thatTyped = (Extent) that;
      if (!Objects.equals(getBoundsRadius(), thatTyped.getBoundsRadius())) {
        return false;
      }
      if (!Objects.equals(getMinimum(), thatTyped.getMinimum())) {
        return false;
      }
      if (!Objects.equals(getMaximum(), thatTyped.getMaximum())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getBoundsRadius:");
      stringBuilder.append(getBoundsRadius());
      stringBuilder.append(", \n");
      stringBuilder.append("getMinimum:");
      stringBuilder.append(getMinimum());
      stringBuilder.append(", \n");
      stringBuilder.append("getMaximum:");
      stringBuilder.append(getMaximum());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getBoundsRadius() {
      return boundsRadius;
    }

    public List<Float> getMinimum() {
      return minimum;
    }

    public List<Float> getMaximum() {
      return maximum;
    }

    public void setBoundsRadius(float value) {
      this.boundsRadius = value;
    }

    public void setMinimum(List<Float> value) {
      this.minimum = value;
    }

    public void setMaximum(List<Float> value) {
      this.maximum = value;
    }
  }

  public static class ChunkClid {
    private List<CollisionShape> collisionShape;

    @Override
    public int hashCode() {
      return Objects.hash(getCollisionShape());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkClid)) {
        return false;
      }
      final ChunkClid thatTyped = (ChunkClid) that;
      if (!Objects.equals(getCollisionShape(), thatTyped.getCollisionShape())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getCollisionShape:");
      stringBuilder.append(getCollisionShape());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<CollisionShape> getCollisionShape() {
      return collisionShape;
    }

    public void setCollisionShape(List<CollisionShape> value) {
      this.collisionShape = value;
    }
  }

  public static class KgtrChunk {
    private TrackChunk value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KgtrChunk)) {
        return false;
      }
      final KgtrChunk thatTyped = (KgtrChunk) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public TrackChunk getValue() {
      return value;
    }

    public void setValue(TrackChunk value) {
      this.value = value;
    }
  }

  public static class TextureAnim {
    private long inclusiveSize;

    private KtatChunk ktatChunk;

    private KtarChunk ktarChunk;

    private KtasChunk ktasChunk;

    @Override
    public int hashCode() {
      return Objects.hash(getInclusiveSize(), getKtatChunk(), getKtarChunk(), getKtasChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof TextureAnim)) {
        return false;
      }
      final TextureAnim thatTyped = (TextureAnim) that;
      if (!Objects.equals(getInclusiveSize(), thatTyped.getInclusiveSize())) {
        return false;
      }
      if (!Objects.equals(getKtatChunk(), thatTyped.getKtatChunk())) {
        return false;
      }
      if (!Objects.equals(getKtarChunk(), thatTyped.getKtarChunk())) {
        return false;
      }
      if (!Objects.equals(getKtasChunk(), thatTyped.getKtasChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getInclusiveSize:");
      stringBuilder.append(getInclusiveSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getKtatChunk:");
      stringBuilder.append(getKtatChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKtarChunk:");
      stringBuilder.append(getKtarChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKtasChunk:");
      stringBuilder.append(getKtasChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getInclusiveSize() {
      return inclusiveSize;
    }

    public KtatChunk getKtatChunk() {
      return ktatChunk;
    }

    public KtarChunk getKtarChunk() {
      return ktarChunk;
    }

    public KtasChunk getKtasChunk() {
      return ktasChunk;
    }

    public void setInclusiveSize(long value) {
      this.inclusiveSize = value;
    }

    public void setKtatChunk(KtatChunk value) {
      this.ktatChunk = value;
    }

    public void setKtarChunk(KtarChunk value) {
      this.ktarChunk = value;
    }

    public void setKtasChunk(KtasChunk value) {
      this.ktasChunk = value;
    }
  }

  public static class ChunkTexs {
    private List<TexsTex> texsTex;

    @Override
    public int hashCode() {
      return Objects.hash(getTexsTex());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkTexs)) {
        return false;
      }
      final ChunkTexs thatTyped = (ChunkTexs) that;
      if (!Objects.equals(getTexsTex(), thatTyped.getTexsTex())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getTexsTex:");
      stringBuilder.append(getTexsTex());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<TexsTex> getTexsTex() {
      return texsTex;
    }

    public void setTexsTex(List<TexsTex> value) {
      this.texsTex = value;
    }
  }

  public static class KlasChunk {
    private float attenuationStart;

    @Override
    public int hashCode() {
      return Objects.hash(getAttenuationStart());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KlasChunk)) {
        return false;
      }
      final KlasChunk thatTyped = (KlasChunk) that;
      if (!Objects.equals(getAttenuationStart(), thatTyped.getAttenuationStart())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getAttenuationStart:");
      stringBuilder.append(getAttenuationStart());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getAttenuationStart() {
      return attenuationStart;
    }

    public void setAttenuationStart(float value) {
      this.attenuationStart = value;
    }
  }

  public static class ChunkSeqs {
    private List<Sequence> sequence;

    @Override
    public int hashCode() {
      return Objects.hash(getSequence());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkSeqs)) {
        return false;
      }
      final ChunkSeqs thatTyped = (ChunkSeqs) that;
      if (!Objects.equals(getSequence(), thatTyped.getSequence())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getSequence:");
      stringBuilder.append(getSequence());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Sequence> getSequence() {
      return sequence;
    }

    public void setSequence(List<Sequence> value) {
      this.sequence = value;
    }
  }

  public static class KpelChunk {
    private float lifespan;

    @Override
    public int hashCode() {
      return Objects.hash(getLifespan());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KpelChunk)) {
        return false;
      }
      final KpelChunk thatTyped = (KpelChunk) that;
      if (!Objects.equals(getLifespan(), thatTyped.getLifespan())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getLifespan:");
      stringBuilder.append(getLifespan());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getLifespan() {
      return lifespan;
    }

    public void setLifespan(float value) {
      this.lifespan = value;
    }
  }

  public static class Kp2eChunk {
    private float emissionRate;

    @Override
    public int hashCode() {
      return Objects.hash(getEmissionRate());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Kp2eChunk)) {
        return false;
      }
      final Kp2eChunk thatTyped = (Kp2eChunk) that;
      if (!Objects.equals(getEmissionRate(), thatTyped.getEmissionRate())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getEmissionRate:");
      stringBuilder.append(getEmissionRate());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getEmissionRate() {
      return emissionRate;
    }

    public void setEmissionRate(float value) {
      this.emissionRate = value;
    }
  }

  public static class Attachment {
    private long inclusiveSize;

    private AttachmentPayload attachmentPayload;

    @Override
    public int hashCode() {
      return Objects.hash(getInclusiveSize(), getAttachmentPayload());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Attachment)) {
        return false;
      }
      final Attachment thatTyped = (Attachment) that;
      if (!Objects.equals(getInclusiveSize(), thatTyped.getInclusiveSize())) {
        return false;
      }
      if (!Objects.equals(getAttachmentPayload(), thatTyped.getAttachmentPayload())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getInclusiveSize:");
      stringBuilder.append(getInclusiveSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getAttachmentPayload:");
      stringBuilder.append(getAttachmentPayload());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getInclusiveSize() {
      return inclusiveSize;
    }

    public AttachmentPayload getAttachmentPayload() {
      return attachmentPayload;
    }

    public void setInclusiveSize(long value) {
      this.inclusiveSize = value;
    }

    public void setAttachmentPayload(AttachmentPayload value) {
      this.attachmentPayload = value;
    }
  }

  public static class KrtxChunk {
    private long textureSlot;

    @Override
    public int hashCode() {
      return Objects.hash(getTextureSlot());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KrtxChunk)) {
        return false;
      }
      final KrtxChunk thatTyped = (KrtxChunk) that;
      if (!Objects.equals(getTextureSlot(), thatTyped.getTextureSlot())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getTextureSlot:");
      stringBuilder.append(getTextureSlot());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getTextureSlot() {
      return textureSlot;
    }

    public void setTextureSlot(long value) {
      this.textureSlot = value;
    }
  }

  public static class KpesChunk {
    private float speed;

    @Override
    public int hashCode() {
      return Objects.hash(getSpeed());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KpesChunk)) {
        return false;
      }
      final KpesChunk thatTyped = (KpesChunk) that;
      if (!Objects.equals(getSpeed(), thatTyped.getSpeed())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getSpeed:");
      stringBuilder.append(getSpeed());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getSpeed() {
      return speed;
    }

    public void setSpeed(float value) {
      this.speed = value;
    }
  }

  public static class ChunkEvts {
    private List<EventObject> eventObject;

    @Override
    public int hashCode() {
      return Objects.hash(getEventObject());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkEvts)) {
        return false;
      }
      final ChunkEvts thatTyped = (ChunkEvts) that;
      if (!Objects.equals(getEventObject(), thatTyped.getEventObject())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getEventObject:");
      stringBuilder.append(getEventObject());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<EventObject> getEventObject() {
      return eventObject;
    }

    public void setEventObject(List<EventObject> value) {
      this.eventObject = value;
    }
  }

  public static class CameraTrackChunkRouter {
    private W3id magic;

    private Object chunk;

    @Override
    public int hashCode() {
      return Objects.hash(getMagic(), getChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof CameraTrackChunkRouter)) {
        return false;
      }
      final CameraTrackChunkRouter thatTyped = (CameraTrackChunkRouter) that;
      if (!Objects.equals(getMagic(), thatTyped.getMagic())) {
        return false;
      }
      if (!Objects.equals(getChunk(), thatTyped.getChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getMagic:");
      stringBuilder.append(getMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getChunk:");
      stringBuilder.append(getChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getMagic() {
      return magic;
    }

    public Object getChunk() {
      return chunk;
    }

    public void setMagic(W3id value) {
      this.magic = value;
    }

    public void setChunk(Object value) {
      this.chunk = value;
    }
  }

  public static class Sequence {
    private String name;

    private List<Long> interval;

    private float moveSpeed;

    private long flags;

    private float rarity;

    private long syncPoint;

    private Extent extent;

    @Override
    public int hashCode() {
      return Objects.hash(getName(), getInterval(), getMoveSpeed(), getFlags(), getRarity(), getSyncPoint(), getExtent());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Sequence)) {
        return false;
      }
      final Sequence thatTyped = (Sequence) that;
      if (!Objects.equals(getName(), thatTyped.getName())) {
        return false;
      }
      if (!Objects.equals(getInterval(), thatTyped.getInterval())) {
        return false;
      }
      if (!Objects.equals(getMoveSpeed(), thatTyped.getMoveSpeed())) {
        return false;
      }
      if (!Objects.equals(getFlags(), thatTyped.getFlags())) {
        return false;
      }
      if (!Objects.equals(getRarity(), thatTyped.getRarity())) {
        return false;
      }
      if (!Objects.equals(getSyncPoint(), thatTyped.getSyncPoint())) {
        return false;
      }
      if (!Objects.equals(getExtent(), thatTyped.getExtent())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getInterval:");
      stringBuilder.append(getInterval());
      stringBuilder.append(", \n");
      stringBuilder.append("getMoveSpeed:");
      stringBuilder.append(getMoveSpeed());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlags:");
      stringBuilder.append(getFlags());
      stringBuilder.append(", \n");
      stringBuilder.append("getRarity:");
      stringBuilder.append(getRarity());
      stringBuilder.append(", \n");
      stringBuilder.append("getSyncPoint:");
      stringBuilder.append(getSyncPoint());
      stringBuilder.append(", \n");
      stringBuilder.append("getExtent:");
      stringBuilder.append(getExtent());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public String getName() {
      return name;
    }

    public List<Long> getInterval() {
      return interval;
    }

    public float getMoveSpeed() {
      return moveSpeed;
    }

    public long getFlags() {
      return flags;
    }

    public float getRarity() {
      return rarity;
    }

    public long getSyncPoint() {
      return syncPoint;
    }

    public Extent getExtent() {
      return extent;
    }

    public void setName(String value) {
      this.name = value;
    }

    public void setInterval(List<Long> value) {
      this.interval = value;
    }

    public void setMoveSpeed(float value) {
      this.moveSpeed = value;
    }

    public void setFlags(long value) {
      this.flags = value;
    }

    public void setRarity(float value) {
      this.rarity = value;
    }

    public void setSyncPoint(long value) {
      this.syncPoint = value;
    }

    public void setExtent(Extent value) {
      this.extent = value;
    }
  }

  public static class KlavChunk {
    private float visibility;

    @Override
    public int hashCode() {
      return Objects.hash(getVisibility());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KlavChunk)) {
        return false;
      }
      final KlavChunk thatTyped = (KlavChunk) that;
      if (!Objects.equals(getVisibility(), thatTyped.getVisibility())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getVisibility:");
      stringBuilder.append(getVisibility());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getVisibility() {
      return visibility;
    }

    public void setVisibility(float value) {
      this.visibility = value;
    }
  }

  public static class ChunkGlbs {
    private List<Long> globalSequence;

    @Override
    public int hashCode() {
      return Objects.hash(getGlobalSequence());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkGlbs)) {
        return false;
      }
      final ChunkGlbs thatTyped = (ChunkGlbs) that;
      if (!Objects.equals(getGlobalSequence(), thatTyped.getGlobalSequence())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getGlobalSequence:");
      stringBuilder.append(getGlobalSequence());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Long> getGlobalSequence() {
      return globalSequence;
    }

    public void setGlobalSequence(List<Long> value) {
      this.globalSequence = value;
    }
  }

  public static class TexElement {
    private Integer id;

    private Object index;

    private String trackMagic;

    private byte[] discriminator;

    private Object payload;

    @Override
    public int hashCode() {
      return Objects.hash(getId(), getIndex(), getTrackMagic(), getDiscriminator(), getPayload());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof TexElement)) {
        return false;
      }
      final TexElement thatTyped = (TexElement) that;
      if (!Objects.equals(getId(), thatTyped.getId())) {
        return false;
      }
      if (!Objects.equals(getIndex(), thatTyped.getIndex())) {
        return false;
      }
      if (!Objects.equals(getTrackMagic(), thatTyped.getTrackMagic())) {
        return false;
      }
      if (!Objects.equals(getDiscriminator(), thatTyped.getDiscriminator())) {
        return false;
      }
      if (!Objects.equals(getPayload(), thatTyped.getPayload())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getId:");
      stringBuilder.append(getId());
      stringBuilder.append(", \n");
      stringBuilder.append("getIndex:");
      stringBuilder.append(getIndex());
      stringBuilder.append(", \n");
      stringBuilder.append("getTrackMagic:");
      stringBuilder.append(getTrackMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getDiscriminator:");
      stringBuilder.append(getDiscriminator());
      stringBuilder.append(", \n");
      stringBuilder.append("getPayload:");
      stringBuilder.append(getPayload());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public Integer getId() {
      return id;
    }

    public Object getIndex() {
      return index;
    }

    public String getTrackMagic() {
      return trackMagic;
    }

    public byte[] getDiscriminator() {
      return discriminator;
    }

    public Object getPayload() {
      return payload;
    }

    public void setId(Integer value) {
      this.id = value;
    }

    public void setIndex(Object value) {
      this.index = value;
    }

    public void setTrackMagic(String value) {
      this.trackMagic = value;
    }

    public void setDiscriminator(byte[] value) {
      this.discriminator = value;
    }

    public void setPayload(Object value) {
      this.payload = value;
    }
  }

  public static class KmtfChunk {
    private TrackChunk value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KmtfChunk)) {
        return false;
      }
      final KmtfChunk thatTyped = (KmtfChunk) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public TrackChunk getValue() {
      return value;
    }

    public void setValue(TrackChunk value) {
      this.value = value;
    }
  }

  public static class VertexPosition {
    private float x;

    private float y;

    private float z;

    @Override
    public int hashCode() {
      return Objects.hash(getx(), gety(), getz());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof VertexPosition)) {
        return false;
      }
      final VertexPosition thatTyped = (VertexPosition) that;
      if (!Objects.equals(getx(), thatTyped.getx())) {
        return false;
      }
      if (!Objects.equals(gety(), thatTyped.gety())) {
        return false;
      }
      if (!Objects.equals(getz(), thatTyped.getz())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getx:");
      stringBuilder.append(getx());
      stringBuilder.append(", \n");
      stringBuilder.append("gety:");
      stringBuilder.append(gety());
      stringBuilder.append(", \n");
      stringBuilder.append("getz:");
      stringBuilder.append(getz());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getx() {
      return x;
    }

    public float gety() {
      return y;
    }

    public float getz() {
      return z;
    }

    public void setx(float value) {
      this.x = value;
    }

    public void sety(float value) {
      this.y = value;
    }

    public void setz(float value) {
      this.z = value;
    }
  }

  public static class KtarChunk {
    private List<Float> rotation;

    @Override
    public int hashCode() {
      return Objects.hash(getRotation());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KtarChunk)) {
        return false;
      }
      final KtarChunk thatTyped = (KtarChunk) that;
      if (!Objects.equals(getRotation(), thatTyped.getRotation())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getRotation:");
      stringBuilder.append(getRotation());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getRotation() {
      return rotation;
    }

    public void setRotation(List<Float> value) {
      this.rotation = value;
    }
  }

  public static class Camera {
    private long inclusiveSize;

    private CameraPayload cameraPayload;

    @Override
    public int hashCode() {
      return Objects.hash(getInclusiveSize(), getCameraPayload());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Camera)) {
        return false;
      }
      final Camera thatTyped = (Camera) that;
      if (!Objects.equals(getInclusiveSize(), thatTyped.getInclusiveSize())) {
        return false;
      }
      if (!Objects.equals(getCameraPayload(), thatTyped.getCameraPayload())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getInclusiveSize:");
      stringBuilder.append(getInclusiveSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getCameraPayload:");
      stringBuilder.append(getCameraPayload());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getInclusiveSize() {
      return inclusiveSize;
    }

    public CameraPayload getCameraPayload() {
      return cameraPayload;
    }

    public void setInclusiveSize(long value) {
      this.inclusiveSize = value;
    }

    public void setCameraPayload(CameraPayload value) {
      this.cameraPayload = value;
    }
  }

  public static class KatvChunk {
    private TrackChunk value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KatvChunk)) {
        return false;
      }
      final KatvChunk thatTyped = (KatvChunk) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public TrackChunk getValue() {
      return value;
    }

    public void setValue(TrackChunk value) {
      this.value = value;
    }
  }

  public static class KtatChunk {
    private List<Float> translation;

    @Override
    public int hashCode() {
      return Objects.hash(getTranslation());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KtatChunk)) {
        return false;
      }
      final KtatChunk thatTyped = (KtatChunk) that;
      if (!Objects.equals(getTranslation(), thatTyped.getTranslation())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getTranslation:");
      stringBuilder.append(getTranslation());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getTranslation() {
      return translation;
    }

    public void setTranslation(List<Float> value) {
      this.translation = value;
    }
  }

  public static class KfcaChunk {
    private float fresnelAlpha;

    @Override
    public int hashCode() {
      return Objects.hash(getFresnelAlpha());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KfcaChunk)) {
        return false;
      }
      final KfcaChunk thatTyped = (KfcaChunk) that;
      if (!Objects.equals(getFresnelAlpha(), thatTyped.getFresnelAlpha())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getFresnelAlpha:");
      stringBuilder.append(getFresnelAlpha());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getFresnelAlpha() {
      return fresnelAlpha;
    }

    public void setFresnelAlpha(float value) {
      this.fresnelAlpha = value;
    }
  }

  public static class KpevChunk {
    private float visibility;

    @Override
    public int hashCode() {
      return Objects.hash(getVisibility());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KpevChunk)) {
        return false;
      }
      final KpevChunk thatTyped = (KpevChunk) that;
      if (!Objects.equals(getVisibility(), thatTyped.getVisibility())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getVisibility:");
      stringBuilder.append(getVisibility());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getVisibility() {
      return visibility;
    }

    public void setVisibility(float value) {
      this.visibility = value;
    }
  }

  public static class KrvsChunk {
    private float visibility;

    @Override
    public int hashCode() {
      return Objects.hash(getVisibility());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KrvsChunk)) {
        return false;
      }
      final KrvsChunk thatTyped = (KrvsChunk) that;
      if (!Objects.equals(getVisibility(), thatTyped.getVisibility())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getVisibility:");
      stringBuilder.append(getVisibility());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getVisibility() {
      return visibility;
    }

    public void setVisibility(float value) {
      this.visibility = value;
    }
  }

  public static class KppcChunk {
    private List<Float> color;

    @Override
    public int hashCode() {
      return Objects.hash(getColor());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KppcChunk)) {
        return false;
      }
      final KppcChunk thatTyped = (KppcChunk) that;
      if (!Objects.equals(getColor(), thatTyped.getColor())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getColor:");
      stringBuilder.append(getColor());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getColor() {
      return color;
    }

    public void setColor(List<Float> value) {
      this.color = value;
    }
  }

  public static class TextureCoordinate {
    private float x;

    private float y;

    @Override
    public int hashCode() {
      return Objects.hash(getx(), gety());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof TextureCoordinate)) {
        return false;
      }
      final TextureCoordinate thatTyped = (TextureCoordinate) that;
      if (!Objects.equals(getx(), thatTyped.getx())) {
        return false;
      }
      if (!Objects.equals(gety(), thatTyped.gety())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getx:");
      stringBuilder.append(getx());
      stringBuilder.append(", \n");
      stringBuilder.append("gety:");
      stringBuilder.append(gety());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getx() {
      return x;
    }

    public float gety() {
      return y;
    }

    public void setx(float value) {
      this.x = value;
    }

    public void sety(float value) {
      this.y = value;
    }
  }

  public static class GeosetAnimTrackChunkRouter {
    private W3id magic;

    private Object chunk;

    @Override
    public int hashCode() {
      return Objects.hash(getMagic(), getChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof GeosetAnimTrackChunkRouter)) {
        return false;
      }
      final GeosetAnimTrackChunkRouter thatTyped = (GeosetAnimTrackChunkRouter) that;
      if (!Objects.equals(getMagic(), thatTyped.getMagic())) {
        return false;
      }
      if (!Objects.equals(getChunk(), thatTyped.getChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getMagic:");
      stringBuilder.append(getMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getChunk:");
      stringBuilder.append(getChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getMagic() {
      return magic;
    }

    public Object getChunk() {
      return chunk;
    }

    public void setMagic(W3id value) {
      this.magic = value;
    }

    public void setChunk(Object value) {
      this.chunk = value;
    }
  }

  public static class KgscChunk {
    private TrackChunk value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KgscChunk)) {
        return false;
      }
      final KgscChunk thatTyped = (KgscChunk) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public TrackChunk getValue() {
      return value;
    }

    public void setValue(TrackChunk value) {
      this.value = value;
    }
  }

  public static class Node {
    private long inclusiveSize;

    private NodePayload nodePayload;

    @Override
    public int hashCode() {
      return Objects.hash(getInclusiveSize(), getNodePayload());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Node)) {
        return false;
      }
      final Node thatTyped = (Node) that;
      if (!Objects.equals(getInclusiveSize(), thatTyped.getInclusiveSize())) {
        return false;
      }
      if (!Objects.equals(getNodePayload(), thatTyped.getNodePayload())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getInclusiveSize:");
      stringBuilder.append(getInclusiveSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getNodePayload:");
      stringBuilder.append(getNodePayload());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getInclusiveSize() {
      return inclusiveSize;
    }

    public NodePayload getNodePayload() {
      return nodePayload;
    }

    public void setInclusiveSize(long value) {
      this.inclusiveSize = value;
    }

    public void setNodePayload(NodePayload value) {
      this.nodePayload = value;
    }
  }

  public static class ParticleEmitter2 {
    private long inclusiveSize;

    private ParticleEmitter2Payload particleEmitter2Payload;

    @Override
    public int hashCode() {
      return Objects.hash(getInclusiveSize(), getParticleEmitter2Payload());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ParticleEmitter2)) {
        return false;
      }
      final ParticleEmitter2 thatTyped = (ParticleEmitter2) that;
      if (!Objects.equals(getInclusiveSize(), thatTyped.getInclusiveSize())) {
        return false;
      }
      if (!Objects.equals(getParticleEmitter2Payload(), thatTyped.getParticleEmitter2Payload())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getInclusiveSize:");
      stringBuilder.append(getInclusiveSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getParticleEmitter2Payload:");
      stringBuilder.append(getParticleEmitter2Payload());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getInclusiveSize() {
      return inclusiveSize;
    }

    public ParticleEmitter2Payload getParticleEmitter2Payload() {
      return particleEmitter2Payload;
    }

    public void setInclusiveSize(long value) {
      this.inclusiveSize = value;
    }

    public void setParticleEmitter2Payload(ParticleEmitter2Payload value) {
      this.particleEmitter2Payload = value;
    }
  }

  public static class KpegChunk {
    private float gravity;

    @Override
    public int hashCode() {
      return Objects.hash(getGravity());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KpegChunk)) {
        return false;
      }
      final KpegChunk thatTyped = (KpegChunk) that;
      if (!Objects.equals(getGravity(), thatTyped.getGravity())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getGravity:");
      stringBuilder.append(getGravity());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getGravity() {
      return gravity;
    }

    public void setGravity(float value) {
      this.gravity = value;
    }
  }

  public static class ChunkVers {
    private long version;

    @Override
    public int hashCode() {
      return Objects.hash(getVersion());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkVers)) {
        return false;
      }
      final ChunkVers thatTyped = (ChunkVers) that;
      if (!Objects.equals(getVersion(), thatTyped.getVersion())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getVersion:");
      stringBuilder.append(getVersion());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getVersion() {
      return version;
    }

    public void setVersion(long value) {
      this.version = value;
    }
  }

  public static class RibbonEmitter {
    private long inclusiveSize;

    private Node node;

    private float heightAbove;

    private float heightBelow;

    private float alpha;

    private float color1;

    private float color2;

    private float color3;

    private float lifespan;

    private long textureSlot;

    private long emissionRate;

    private long materialId;

    private float gravity;

    private KrhaChunk krhaChunk;

    private KrhbChunk krhbChunk;

    private KralChunk kralChunk;

    private KrcoChunk krcoChunk;

    private KrtxChunk krtxChunk;

    private KrvsChunk krvsChunk;

    @Override
    public int hashCode() {
      return Objects.hash(getInclusiveSize(), getNode(), getHeightAbove(), getHeightBelow(), getAlpha(), getColor1(), getColor2(), getColor3(), getLifespan(), getTextureSlot(), getEmissionRate(), getMaterialId(), getGravity(), getKrhaChunk(), getKrhbChunk(), getKralChunk(), getKrcoChunk(), getKrtxChunk(), getKrvsChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof RibbonEmitter)) {
        return false;
      }
      final RibbonEmitter thatTyped = (RibbonEmitter) that;
      if (!Objects.equals(getInclusiveSize(), thatTyped.getInclusiveSize())) {
        return false;
      }
      if (!Objects.equals(getNode(), thatTyped.getNode())) {
        return false;
      }
      if (!Objects.equals(getHeightAbove(), thatTyped.getHeightAbove())) {
        return false;
      }
      if (!Objects.equals(getHeightBelow(), thatTyped.getHeightBelow())) {
        return false;
      }
      if (!Objects.equals(getAlpha(), thatTyped.getAlpha())) {
        return false;
      }
      if (!Objects.equals(getColor1(), thatTyped.getColor1())) {
        return false;
      }
      if (!Objects.equals(getColor2(), thatTyped.getColor2())) {
        return false;
      }
      if (!Objects.equals(getColor3(), thatTyped.getColor3())) {
        return false;
      }
      if (!Objects.equals(getLifespan(), thatTyped.getLifespan())) {
        return false;
      }
      if (!Objects.equals(getTextureSlot(), thatTyped.getTextureSlot())) {
        return false;
      }
      if (!Objects.equals(getEmissionRate(), thatTyped.getEmissionRate())) {
        return false;
      }
      if (!Objects.equals(getMaterialId(), thatTyped.getMaterialId())) {
        return false;
      }
      if (!Objects.equals(getGravity(), thatTyped.getGravity())) {
        return false;
      }
      if (!Objects.equals(getKrhaChunk(), thatTyped.getKrhaChunk())) {
        return false;
      }
      if (!Objects.equals(getKrhbChunk(), thatTyped.getKrhbChunk())) {
        return false;
      }
      if (!Objects.equals(getKralChunk(), thatTyped.getKralChunk())) {
        return false;
      }
      if (!Objects.equals(getKrcoChunk(), thatTyped.getKrcoChunk())) {
        return false;
      }
      if (!Objects.equals(getKrtxChunk(), thatTyped.getKrtxChunk())) {
        return false;
      }
      if (!Objects.equals(getKrvsChunk(), thatTyped.getKrvsChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getInclusiveSize:");
      stringBuilder.append(getInclusiveSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getNode:");
      stringBuilder.append(getNode());
      stringBuilder.append(", \n");
      stringBuilder.append("getHeightAbove:");
      stringBuilder.append(getHeightAbove());
      stringBuilder.append(", \n");
      stringBuilder.append("getHeightBelow:");
      stringBuilder.append(getHeightBelow());
      stringBuilder.append(", \n");
      stringBuilder.append("getAlpha:");
      stringBuilder.append(getAlpha());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor1:");
      stringBuilder.append(getColor1());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor2:");
      stringBuilder.append(getColor2());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor3:");
      stringBuilder.append(getColor3());
      stringBuilder.append(", \n");
      stringBuilder.append("getLifespan:");
      stringBuilder.append(getLifespan());
      stringBuilder.append(", \n");
      stringBuilder.append("getTextureSlot:");
      stringBuilder.append(getTextureSlot());
      stringBuilder.append(", \n");
      stringBuilder.append("getEmissionRate:");
      stringBuilder.append(getEmissionRate());
      stringBuilder.append(", \n");
      stringBuilder.append("getMaterialId:");
      stringBuilder.append(getMaterialId());
      stringBuilder.append(", \n");
      stringBuilder.append("getGravity:");
      stringBuilder.append(getGravity());
      stringBuilder.append(", \n");
      stringBuilder.append("getKrhaChunk:");
      stringBuilder.append(getKrhaChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKrhbChunk:");
      stringBuilder.append(getKrhbChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKralChunk:");
      stringBuilder.append(getKralChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKrcoChunk:");
      stringBuilder.append(getKrcoChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKrtxChunk:");
      stringBuilder.append(getKrtxChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKrvsChunk:");
      stringBuilder.append(getKrvsChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getInclusiveSize() {
      return inclusiveSize;
    }

    public Node getNode() {
      return node;
    }

    public float getHeightAbove() {
      return heightAbove;
    }

    public float getHeightBelow() {
      return heightBelow;
    }

    public float getAlpha() {
      return alpha;
    }

    public float getColor1() {
      return color1;
    }

    public float getColor2() {
      return color2;
    }

    public float getColor3() {
      return color3;
    }

    public float getLifespan() {
      return lifespan;
    }

    public long getTextureSlot() {
      return textureSlot;
    }

    public long getEmissionRate() {
      return emissionRate;
    }

    public long getMaterialId() {
      return materialId;
    }

    public float getGravity() {
      return gravity;
    }

    public KrhaChunk getKrhaChunk() {
      return krhaChunk;
    }

    public KrhbChunk getKrhbChunk() {
      return krhbChunk;
    }

    public KralChunk getKralChunk() {
      return kralChunk;
    }

    public KrcoChunk getKrcoChunk() {
      return krcoChunk;
    }

    public KrtxChunk getKrtxChunk() {
      return krtxChunk;
    }

    public KrvsChunk getKrvsChunk() {
      return krvsChunk;
    }

    public void setInclusiveSize(long value) {
      this.inclusiveSize = value;
    }

    public void setNode(Node value) {
      this.node = value;
    }

    public void setHeightAbove(float value) {
      this.heightAbove = value;
    }

    public void setHeightBelow(float value) {
      this.heightBelow = value;
    }

    public void setAlpha(float value) {
      this.alpha = value;
    }

    public void setColor1(float value) {
      this.color1 = value;
    }

    public void setColor2(float value) {
      this.color2 = value;
    }

    public void setColor3(float value) {
      this.color3 = value;
    }

    public void setLifespan(float value) {
      this.lifespan = value;
    }

    public void setTextureSlot(long value) {
      this.textureSlot = value;
    }

    public void setEmissionRate(long value) {
      this.emissionRate = value;
    }

    public void setMaterialId(long value) {
      this.materialId = value;
    }

    public void setGravity(float value) {
      this.gravity = value;
    }

    public void setKrhaChunk(KrhaChunk value) {
      this.krhaChunk = value;
    }

    public void setKrhbChunk(KrhbChunk value) {
      this.krhbChunk = value;
    }

    public void setKralChunk(KralChunk value) {
      this.kralChunk = value;
    }

    public void setKrcoChunk(KrcoChunk value) {
      this.krcoChunk = value;
    }

    public void setKrtxChunk(KrtxChunk value) {
      this.krtxChunk = value;
    }

    public void setKrvsChunk(KrvsChunk value) {
      this.krvsChunk = value;
    }
  }

  public static class MaterialPayload {
    private long priorityPlane;

    private long flags;

    private String shader;

    private W3id laysMagic;

    private List<Layer> layer;

    private long index;

    @Override
    public int hashCode() {
      return Objects.hash(getPriorityPlane(), getFlags(), getShader(), getLaysMagic(), getLayer(), getIndex());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof MaterialPayload)) {
        return false;
      }
      final MaterialPayload thatTyped = (MaterialPayload) that;
      if (!Objects.equals(getPriorityPlane(), thatTyped.getPriorityPlane())) {
        return false;
      }
      if (!Objects.equals(getFlags(), thatTyped.getFlags())) {
        return false;
      }
      if (!Objects.equals(getShader(), thatTyped.getShader())) {
        return false;
      }
      if (!Objects.equals(getLaysMagic(), thatTyped.getLaysMagic())) {
        return false;
      }
      if (!Objects.equals(getLayer(), thatTyped.getLayer())) {
        return false;
      }
      if (!Objects.equals(getIndex(), thatTyped.getIndex())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getPriorityPlane:");
      stringBuilder.append(getPriorityPlane());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlags:");
      stringBuilder.append(getFlags());
      stringBuilder.append(", \n");
      stringBuilder.append("getShader:");
      stringBuilder.append(getShader());
      stringBuilder.append(", \n");
      stringBuilder.append("getLaysMagic:");
      stringBuilder.append(getLaysMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getLayer:");
      stringBuilder.append(getLayer());
      stringBuilder.append(", \n");
      stringBuilder.append("getIndex:");
      stringBuilder.append(getIndex());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getPriorityPlane() {
      return priorityPlane;
    }

    public long getFlags() {
      return flags;
    }

    public String getShader() {
      return shader;
    }

    public W3id getLaysMagic() {
      return laysMagic;
    }

    public List<Layer> getLayer() {
      return layer;
    }

    public long getIndex() {
      return index;
    }

    public void setPriorityPlane(long value) {
      this.priorityPlane = value;
    }

    public void setFlags(long value) {
      this.flags = value;
    }

    public void setShader(String value) {
      this.shader = value;
    }

    public void setLaysMagic(W3id value) {
      this.laysMagic = value;
    }

    public void setLayer(List<Layer> value) {
      this.layer = value;
    }

    public void setIndex(long value) {
      this.index = value;
    }
  }

  public static class AttachmentTrackRouter {
    private W3id magic;

    private KatvChunk chunk;

    @Override
    public int hashCode() {
      return Objects.hash(getMagic(), getChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof AttachmentTrackRouter)) {
        return false;
      }
      final AttachmentTrackRouter thatTyped = (AttachmentTrackRouter) that;
      if (!Objects.equals(getMagic(), thatTyped.getMagic())) {
        return false;
      }
      if (!Objects.equals(getChunk(), thatTyped.getChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getMagic:");
      stringBuilder.append(getMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getChunk:");
      stringBuilder.append(getChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getMagic() {
      return magic;
    }

    public KatvChunk getChunk() {
      return chunk;
    }

    public void setMagic(W3id value) {
      this.magic = value;
    }

    public void setChunk(KatvChunk value) {
      this.chunk = value;
    }
  }

  public static class TangentChunk {
    private W3id magic;

    private List<Tangent> tangent;

    @Override
    public int hashCode() {
      return Objects.hash(getMagic(), getTangent());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof TangentChunk)) {
        return false;
      }
      final TangentChunk thatTyped = (TangentChunk) that;
      if (!Objects.equals(getMagic(), thatTyped.getMagic())) {
        return false;
      }
      if (!Objects.equals(getTangent(), thatTyped.getTangent())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getMagic:");
      stringBuilder.append(getMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getTangent:");
      stringBuilder.append(getTangent());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getMagic() {
      return magic;
    }

    public List<Tangent> getTangent() {
      return tangent;
    }

    public void setMagic(W3id value) {
      this.magic = value;
    }

    public void setTangent(List<Tangent> value) {
      this.tangent = value;
    }
  }

  public static class KppvChunk {
    private float visibility;

    @Override
    public int hashCode() {
      return Objects.hash(getVisibility());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KppvChunk)) {
        return false;
      }
      final KppvChunk thatTyped = (KppvChunk) that;
      if (!Objects.equals(getVisibility(), thatTyped.getVisibility())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getVisibility:");
      stringBuilder.append(getVisibility());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getVisibility() {
      return visibility;
    }

    public void setVisibility(float value) {
      this.visibility = value;
    }
  }

  public static class Material {
    private long inclusiveSize;

    private MaterialPayload payload;

    private long index;

    @Override
    public int hashCode() {
      return Objects.hash(getInclusiveSize(), getPayload(), getIndex());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Material)) {
        return false;
      }
      final Material thatTyped = (Material) that;
      if (!Objects.equals(getInclusiveSize(), thatTyped.getInclusiveSize())) {
        return false;
      }
      if (!Objects.equals(getPayload(), thatTyped.getPayload())) {
        return false;
      }
      if (!Objects.equals(getIndex(), thatTyped.getIndex())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getInclusiveSize:");
      stringBuilder.append(getInclusiveSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getPayload:");
      stringBuilder.append(getPayload());
      stringBuilder.append(", \n");
      stringBuilder.append("getIndex:");
      stringBuilder.append(getIndex());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getInclusiveSize() {
      return inclusiveSize;
    }

    public MaterialPayload getPayload() {
      return payload;
    }

    public long getIndex() {
      return index;
    }

    public void setInclusiveSize(long value) {
      this.inclusiveSize = value;
    }

    public void setPayload(MaterialPayload value) {
      this.payload = value;
    }

    public void setIndex(long value) {
      this.index = value;
    }
  }

  public static class EventObject {
    private Node node;

    private W3id kevtMagic;

    private long globalSequenceId;

    private List<Long> trackChunk;

    @Override
    public int hashCode() {
      return Objects.hash(getNode(), getKevtMagic(), getGlobalSequenceId(), getTrackChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof EventObject)) {
        return false;
      }
      final EventObject thatTyped = (EventObject) that;
      if (!Objects.equals(getNode(), thatTyped.getNode())) {
        return false;
      }
      if (!Objects.equals(getKevtMagic(), thatTyped.getKevtMagic())) {
        return false;
      }
      if (!Objects.equals(getGlobalSequenceId(), thatTyped.getGlobalSequenceId())) {
        return false;
      }
      if (!Objects.equals(getTrackChunk(), thatTyped.getTrackChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getNode:");
      stringBuilder.append(getNode());
      stringBuilder.append(", \n");
      stringBuilder.append("getKevtMagic:");
      stringBuilder.append(getKevtMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getGlobalSequenceId:");
      stringBuilder.append(getGlobalSequenceId());
      stringBuilder.append(", \n");
      stringBuilder.append("getTrackChunk:");
      stringBuilder.append(getTrackChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public Node getNode() {
      return node;
    }

    public W3id getKevtMagic() {
      return kevtMagic;
    }

    public long getGlobalSequenceId() {
      return globalSequenceId;
    }

    public List<Long> getTrackChunk() {
      return trackChunk;
    }

    public void setNode(Node value) {
      this.node = value;
    }

    public void setKevtMagic(W3id value) {
      this.kevtMagic = value;
    }

    public void setGlobalSequenceId(long value) {
      this.globalSequenceId = value;
    }

    public void setTrackChunk(List<Long> value) {
      this.trackChunk = value;
    }
  }

  public static class Kp2vChunk {
    private float visibility;

    @Override
    public int hashCode() {
      return Objects.hash(getVisibility());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Kp2vChunk)) {
        return false;
      }
      final Kp2vChunk thatTyped = (Kp2vChunk) that;
      if (!Objects.equals(getVisibility(), thatTyped.getVisibility())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getVisibility:");
      stringBuilder.append(getVisibility());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getVisibility() {
      return visibility;
    }

    public void setVisibility(float value) {
      this.visibility = value;
    }
  }

  public static class Kp2gChunk {
    private float gravity;

    @Override
    public int hashCode() {
      return Objects.hash(getGravity());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Kp2gChunk)) {
        return false;
      }
      final Kp2gChunk thatTyped = (Kp2gChunk) that;
      if (!Objects.equals(getGravity(), thatTyped.getGravity())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getGravity:");
      stringBuilder.append(getGravity());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getGravity() {
      return gravity;
    }

    public void setGravity(float value) {
      this.gravity = value;
    }
  }

  public static class Kp2nChunk {
    private float length;

    @Override
    public int hashCode() {
      return Objects.hash(getLength());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Kp2nChunk)) {
        return false;
      }
      final Kp2nChunk thatTyped = (Kp2nChunk) that;
      if (!Objects.equals(getLength(), thatTyped.getLength())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getLength:");
      stringBuilder.append(getLength());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getLength() {
      return length;
    }

    public void setLength(float value) {
      this.length = value;
    }
  }

  public static class Error {
    private List<Integer> rest;

    private String more;

    @Override
    public int hashCode() {
      return Objects.hash(getRest(), getMore());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Error)) {
        return false;
      }
      final Error thatTyped = (Error) that;
      if (!Objects.equals(getRest(), thatTyped.getRest())) {
        return false;
      }
      if (!Objects.equals(getMore(), thatTyped.getMore())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getRest:");
      stringBuilder.append(getRest());
      stringBuilder.append(", \n");
      stringBuilder.append("getMore:");
      stringBuilder.append(getMore());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Integer> getRest() {
      return rest;
    }

    public String getMore() {
      return more;
    }

    public void setRest(List<Integer> value) {
      this.rest = value;
    }

    public void setMore(String value) {
      this.more = value;
    }
  }

  public static class KttrChunk {
    private List<Float> targetTranslation;

    @Override
    public int hashCode() {
      return Objects.hash(getTargetTranslation());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KttrChunk)) {
        return false;
      }
      final KttrChunk thatTyped = (KttrChunk) that;
      if (!Objects.equals(getTargetTranslation(), thatTyped.getTargetTranslation())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getTargetTranslation:");
      stringBuilder.append(getTargetTranslation());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getTargetTranslation() {
      return targetTranslation;
    }

    public void setTargetTranslation(List<Float> value) {
      this.targetTranslation = value;
    }
  }

  public static class ChunkPivt {
    private List<F43> point;

    @Override
    public int hashCode() {
      return Objects.hash(getPoint());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkPivt)) {
        return false;
      }
      final ChunkPivt thatTyped = (ChunkPivt) that;
      if (!Objects.equals(getPoint(), thatTyped.getPoint())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getPoint:");
      stringBuilder.append(getPoint());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<F43> getPoint() {
      return point;
    }

    public void setPoint(List<F43> value) {
      this.point = value;
    }
  }

  public static class KppsChunk {
    private float speed;

    @Override
    public int hashCode() {
      return Objects.hash(getSpeed());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KppsChunk)) {
        return false;
      }
      final KppsChunk thatTyped = (KppsChunk) that;
      if (!Objects.equals(getSpeed(), thatTyped.getSpeed())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getSpeed:");
      stringBuilder.append(getSpeed());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getSpeed() {
      return speed;
    }

    public void setSpeed(float value) {
      this.speed = value;
    }
  }

  public static class KrcoChunk {
    private List<Float> color;

    @Override
    public int hashCode() {
      return Objects.hash(getColor());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KrcoChunk)) {
        return false;
      }
      final KrcoChunk thatTyped = (KrcoChunk) that;
      if (!Objects.equals(getColor(), thatTyped.getColor())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getColor:");
      stringBuilder.append(getColor());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getColor() {
      return color;
    }

    public void setColor(List<Float> value) {
      this.color = value;
    }
  }

  public static class SegmentColor {
    private float color1;

    private float color2;

    private float color3;

    @Override
    public int hashCode() {
      return Objects.hash(getColor1(), getColor2(), getColor3());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof SegmentColor)) {
        return false;
      }
      final SegmentColor thatTyped = (SegmentColor) that;
      if (!Objects.equals(getColor1(), thatTyped.getColor1())) {
        return false;
      }
      if (!Objects.equals(getColor2(), thatTyped.getColor2())) {
        return false;
      }
      if (!Objects.equals(getColor3(), thatTyped.getColor3())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getColor1:");
      stringBuilder.append(getColor1());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor2:");
      stringBuilder.append(getColor2());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor3:");
      stringBuilder.append(getColor3());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getColor1() {
      return color1;
    }

    public float getColor2() {
      return color2;
    }

    public float getColor3() {
      return color3;
    }

    public void setColor1(float value) {
      this.color1 = value;
    }

    public void setColor2(float value) {
      this.color2 = value;
    }

    public void setColor3(float value) {
      this.color3 = value;
    }
  }

  public static class NodeTrackRouter {
    private W3id magic;

    private Object chunk;

    @Override
    public int hashCode() {
      return Objects.hash(getMagic(), getChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof NodeTrackRouter)) {
        return false;
      }
      final NodeTrackRouter thatTyped = (NodeTrackRouter) that;
      if (!Objects.equals(getMagic(), thatTyped.getMagic())) {
        return false;
      }
      if (!Objects.equals(getChunk(), thatTyped.getChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getMagic:");
      stringBuilder.append(getMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getChunk:");
      stringBuilder.append(getChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getMagic() {
      return magic;
    }

    public Object getChunk() {
      return chunk;
    }

    public void setMagic(W3id value) {
      this.magic = value;
    }

    public void setChunk(Object value) {
      this.chunk = value;
    }
  }

  public static class TextureCoordinateSet {
    private W3id magic;

    private List<TextureCoordinate> textureCoordinate;

    @Override
    public int hashCode() {
      return Objects.hash(getMagic(), getTextureCoordinate());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof TextureCoordinateSet)) {
        return false;
      }
      final TextureCoordinateSet thatTyped = (TextureCoordinateSet) that;
      if (!Objects.equals(getMagic(), thatTyped.getMagic())) {
        return false;
      }
      if (!Objects.equals(getTextureCoordinate(), thatTyped.getTextureCoordinate())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getMagic:");
      stringBuilder.append(getMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getTextureCoordinate:");
      stringBuilder.append(getTextureCoordinate());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getMagic() {
      return magic;
    }

    public List<TextureCoordinate> getTextureCoordinate() {
      return textureCoordinate;
    }

    public void setMagic(W3id value) {
      this.magic = value;
    }

    public void setTextureCoordinate(List<TextureCoordinate> value) {
      this.textureCoordinate = value;
    }
  }

  public static class Kfc3Chunk {
    private List<Float> fresnelColor;

    @Override
    public int hashCode() {
      return Objects.hash(getFresnelColor());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Kfc3Chunk)) {
        return false;
      }
      final Kfc3Chunk thatTyped = (Kfc3Chunk) that;
      if (!Objects.equals(getFresnelColor(), thatTyped.getFresnelColor())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getFresnelColor:");
      stringBuilder.append(getFresnelColor());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getFresnelColor() {
      return fresnelColor;
    }

    public void setFresnelColor(List<Float> value) {
      this.fresnelColor = value;
    }
  }

  public static class Tangent {
    private List<Float> value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Tangent)) {
        return false;
      }
      final Tangent thatTyped = (Tangent) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getValue() {
      return value;
    }

    public void setValue(List<Float> value) {
      this.value = value;
    }
  }

  public static class KgrtChunk {
    private TrackChunk value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KgrtChunk)) {
        return false;
      }
      final KgrtChunk thatTyped = (KgrtChunk) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public TrackChunk getValue() {
      return value;
    }

    public void setValue(TrackChunk value) {
      this.value = value;
    }
  }

  public static class Layer {
    private long inclusiveSize;

    private LayerPayload layerPayload;

    private long index;

    @Override
    public int hashCode() {
      return Objects.hash(getInclusiveSize(), getLayerPayload(), getIndex());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Layer)) {
        return false;
      }
      final Layer thatTyped = (Layer) that;
      if (!Objects.equals(getInclusiveSize(), thatTyped.getInclusiveSize())) {
        return false;
      }
      if (!Objects.equals(getLayerPayload(), thatTyped.getLayerPayload())) {
        return false;
      }
      if (!Objects.equals(getIndex(), thatTyped.getIndex())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getInclusiveSize:");
      stringBuilder.append(getInclusiveSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getLayerPayload:");
      stringBuilder.append(getLayerPayload());
      stringBuilder.append(", \n");
      stringBuilder.append("getIndex:");
      stringBuilder.append(getIndex());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getInclusiveSize() {
      return inclusiveSize;
    }

    public LayerPayload getLayerPayload() {
      return layerPayload;
    }

    public long getIndex() {
      return index;
    }

    public void setInclusiveSize(long value) {
      this.inclusiveSize = value;
    }

    public void setLayerPayload(LayerPayload value) {
      this.layerPayload = value;
    }

    public void setIndex(long value) {
      this.index = value;
    }
  }

  public static class LightTrackChunkRouter {
    private W3id magic;

    private Object chunk;

    @Override
    public int hashCode() {
      return Objects.hash(getMagic(), getChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof LightTrackChunkRouter)) {
        return false;
      }
      final LightTrackChunkRouter thatTyped = (LightTrackChunkRouter) that;
      if (!Objects.equals(getMagic(), thatTyped.getMagic())) {
        return false;
      }
      if (!Objects.equals(getChunk(), thatTyped.getChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getMagic:");
      stringBuilder.append(getMagic());
      stringBuilder.append(", \n");
      stringBuilder.append("getChunk:");
      stringBuilder.append(getChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getMagic() {
      return magic;
    }

    public Object getChunk() {
      return chunk;
    }

    public void setMagic(W3id value) {
      this.magic = value;
    }

    public void setChunk(Object value) {
      this.chunk = value;
    }
  }

  public static class ParticleEmitter {
    private long inclusiveSize;

    private Node node;

    private float emissionRate;

    private float gravity;

    private float longitude;

    private float latitude;

    private String spawnModelFileName;

    private float lifespan;

    private float initialVelocity;

    private KpeeChunk kpeeChunk;

    private KpegChunk kpegChunk;

    private KplnChunk kplnChunk;

    private KpltChunk kpltChunk;

    private KpelChunk kpelChunk;

    private KpesChunk kpesChunk;

    private KpevChunk kpevChunk;

    @Override
    public int hashCode() {
      return Objects.hash(getInclusiveSize(), getNode(), getEmissionRate(), getGravity(), getLongitude(), getLatitude(), getSpawnModelFileName(), getLifespan(), getInitialVelocity(), getKpeeChunk(), getKpegChunk(), getKplnChunk(), getKpltChunk(), getKpelChunk(), getKpesChunk(), getKpevChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ParticleEmitter)) {
        return false;
      }
      final ParticleEmitter thatTyped = (ParticleEmitter) that;
      if (!Objects.equals(getInclusiveSize(), thatTyped.getInclusiveSize())) {
        return false;
      }
      if (!Objects.equals(getNode(), thatTyped.getNode())) {
        return false;
      }
      if (!Objects.equals(getEmissionRate(), thatTyped.getEmissionRate())) {
        return false;
      }
      if (!Objects.equals(getGravity(), thatTyped.getGravity())) {
        return false;
      }
      if (!Objects.equals(getLongitude(), thatTyped.getLongitude())) {
        return false;
      }
      if (!Objects.equals(getLatitude(), thatTyped.getLatitude())) {
        return false;
      }
      if (!Objects.equals(getSpawnModelFileName(), thatTyped.getSpawnModelFileName())) {
        return false;
      }
      if (!Objects.equals(getLifespan(), thatTyped.getLifespan())) {
        return false;
      }
      if (!Objects.equals(getInitialVelocity(), thatTyped.getInitialVelocity())) {
        return false;
      }
      if (!Objects.equals(getKpeeChunk(), thatTyped.getKpeeChunk())) {
        return false;
      }
      if (!Objects.equals(getKpegChunk(), thatTyped.getKpegChunk())) {
        return false;
      }
      if (!Objects.equals(getKplnChunk(), thatTyped.getKplnChunk())) {
        return false;
      }
      if (!Objects.equals(getKpltChunk(), thatTyped.getKpltChunk())) {
        return false;
      }
      if (!Objects.equals(getKpelChunk(), thatTyped.getKpelChunk())) {
        return false;
      }
      if (!Objects.equals(getKpesChunk(), thatTyped.getKpesChunk())) {
        return false;
      }
      if (!Objects.equals(getKpevChunk(), thatTyped.getKpevChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getInclusiveSize:");
      stringBuilder.append(getInclusiveSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getNode:");
      stringBuilder.append(getNode());
      stringBuilder.append(", \n");
      stringBuilder.append("getEmissionRate:");
      stringBuilder.append(getEmissionRate());
      stringBuilder.append(", \n");
      stringBuilder.append("getGravity:");
      stringBuilder.append(getGravity());
      stringBuilder.append(", \n");
      stringBuilder.append("getLongitude:");
      stringBuilder.append(getLongitude());
      stringBuilder.append(", \n");
      stringBuilder.append("getLatitude:");
      stringBuilder.append(getLatitude());
      stringBuilder.append(", \n");
      stringBuilder.append("getSpawnModelFileName:");
      stringBuilder.append(getSpawnModelFileName());
      stringBuilder.append(", \n");
      stringBuilder.append("getLifespan:");
      stringBuilder.append(getLifespan());
      stringBuilder.append(", \n");
      stringBuilder.append("getInitialVelocity:");
      stringBuilder.append(getInitialVelocity());
      stringBuilder.append(", \n");
      stringBuilder.append("getKpeeChunk:");
      stringBuilder.append(getKpeeChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKpegChunk:");
      stringBuilder.append(getKpegChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKplnChunk:");
      stringBuilder.append(getKplnChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKpltChunk:");
      stringBuilder.append(getKpltChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKpelChunk:");
      stringBuilder.append(getKpelChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKpesChunk:");
      stringBuilder.append(getKpesChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKpevChunk:");
      stringBuilder.append(getKpevChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getInclusiveSize() {
      return inclusiveSize;
    }

    public Node getNode() {
      return node;
    }

    public float getEmissionRate() {
      return emissionRate;
    }

    public float getGravity() {
      return gravity;
    }

    public float getLongitude() {
      return longitude;
    }

    public float getLatitude() {
      return latitude;
    }

    public String getSpawnModelFileName() {
      return spawnModelFileName;
    }

    public float getLifespan() {
      return lifespan;
    }

    public float getInitialVelocity() {
      return initialVelocity;
    }

    public KpeeChunk getKpeeChunk() {
      return kpeeChunk;
    }

    public KpegChunk getKpegChunk() {
      return kpegChunk;
    }

    public KplnChunk getKplnChunk() {
      return kplnChunk;
    }

    public KpltChunk getKpltChunk() {
      return kpltChunk;
    }

    public KpelChunk getKpelChunk() {
      return kpelChunk;
    }

    public KpesChunk getKpesChunk() {
      return kpesChunk;
    }

    public KpevChunk getKpevChunk() {
      return kpevChunk;
    }

    public void setInclusiveSize(long value) {
      this.inclusiveSize = value;
    }

    public void setNode(Node value) {
      this.node = value;
    }

    public void setEmissionRate(float value) {
      this.emissionRate = value;
    }

    public void setGravity(float value) {
      this.gravity = value;
    }

    public void setLongitude(float value) {
      this.longitude = value;
    }

    public void setLatitude(float value) {
      this.latitude = value;
    }

    public void setSpawnModelFileName(String value) {
      this.spawnModelFileName = value;
    }

    public void setLifespan(float value) {
      this.lifespan = value;
    }

    public void setInitialVelocity(float value) {
      this.initialVelocity = value;
    }

    public void setKpeeChunk(KpeeChunk value) {
      this.kpeeChunk = value;
    }

    public void setKpegChunk(KpegChunk value) {
      this.kpegChunk = value;
    }

    public void setKplnChunk(KplnChunk value) {
      this.kplnChunk = value;
    }

    public void setKpltChunk(KpltChunk value) {
      this.kpltChunk = value;
    }

    public void setKpelChunk(KpelChunk value) {
      this.kpelChunk = value;
    }

    public void setKpesChunk(KpesChunk value) {
      this.kpesChunk = value;
    }

    public void setKpevChunk(KpevChunk value) {
      this.kpevChunk = value;
    }
  }

  public static class F44 {
    private List<Float> value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof F44)) {
        return false;
      }
      final F44 thatTyped = (F44) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getValue() {
      return value;
    }

    public void setValue(List<Float> value) {
      this.value = value;
    }
  }

  public static class Geoset {
    private long inclusiveSize;

    private GeosetPayload geosetPayload;

    @Override
    public int hashCode() {
      return Objects.hash(getInclusiveSize(), getGeosetPayload());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Geoset)) {
        return false;
      }
      final Geoset thatTyped = (Geoset) that;
      if (!Objects.equals(getInclusiveSize(), thatTyped.getInclusiveSize())) {
        return false;
      }
      if (!Objects.equals(getGeosetPayload(), thatTyped.getGeosetPayload())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getInclusiveSize:");
      stringBuilder.append(getInclusiveSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getGeosetPayload:");
      stringBuilder.append(getGeosetPayload());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getInclusiveSize() {
      return inclusiveSize;
    }

    public GeosetPayload getGeosetPayload() {
      return geosetPayload;
    }

    public void setInclusiveSize(long value) {
      this.inclusiveSize = value;
    }

    public void setGeosetPayload(GeosetPayload value) {
      this.geosetPayload = value;
    }
  }

  public static class TexsTex {
    private long id;

    private String path;

    private long flags;

    @Override
    public int hashCode() {
      return Objects.hash(getId(), getPath(), getFlags());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof TexsTex)) {
        return false;
      }
      final TexsTex thatTyped = (TexsTex) that;
      if (!Objects.equals(getId(), thatTyped.getId())) {
        return false;
      }
      if (!Objects.equals(getPath(), thatTyped.getPath())) {
        return false;
      }
      if (!Objects.equals(getFlags(), thatTyped.getFlags())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getId:");
      stringBuilder.append(getId());
      stringBuilder.append(", \n");
      stringBuilder.append("getPath:");
      stringBuilder.append(getPath());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlags:");
      stringBuilder.append(getFlags());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getId() {
      return id;
    }

    public String getPath() {
      return path;
    }

    public long getFlags() {
      return flags;
    }

    public void setId(long value) {
      this.id = value;
    }

    public void setPath(String value) {
      this.path = value;
    }

    public void setFlags(long value) {
      this.flags = value;
    }
  }

  public static class KgaoChunk {
    private TrackChunk value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KgaoChunk)) {
        return false;
      }
      final KgaoChunk thatTyped = (KgaoChunk) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public TrackChunk getValue() {
      return value;
    }

    public void setValue(TrackChunk value) {
      this.value = value;
    }
  }

  public static class KppeChunk {
    private float emissionRate;

    @Override
    public int hashCode() {
      return Objects.hash(getEmissionRate());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KppeChunk)) {
        return false;
      }
      final KppeChunk thatTyped = (KppeChunk) that;
      if (!Objects.equals(getEmissionRate(), thatTyped.getEmissionRate())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getEmissionRate:");
      stringBuilder.append(getEmissionRate());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getEmissionRate() {
      return emissionRate;
    }

    public void setEmissionRate(float value) {
      this.emissionRate = value;
    }
  }

  public static class CornEmitter {
    private long inclusiveSize;

    private Node node;

    private float lifespan;

    private float emissionRate;

    private float speed;

    private float color1;

    private float color2;

    private float color3;

    private float color4;

    private long replaceableId;

    private String path;

    private String flags;

    private KppaChunk kppaChunk;

    private KppcChunk kppcChunk;

    private KppeChunk kppeChunk;

    private KpplChunk kpplChunk;

    private KppsChunk kppsChunk;

    private KppvChunk kppvChunk;

    @Override
    public int hashCode() {
      return Objects.hash(getInclusiveSize(), getNode(), getLifespan(), getEmissionRate(), getSpeed(), getColor1(), getColor2(), getColor3(), getColor4(), getReplaceableId(), getPath(), getFlags(), getKppaChunk(), getKppcChunk(), getKppeChunk(), getKpplChunk(), getKppsChunk(), getKppvChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof CornEmitter)) {
        return false;
      }
      final CornEmitter thatTyped = (CornEmitter) that;
      if (!Objects.equals(getInclusiveSize(), thatTyped.getInclusiveSize())) {
        return false;
      }
      if (!Objects.equals(getNode(), thatTyped.getNode())) {
        return false;
      }
      if (!Objects.equals(getLifespan(), thatTyped.getLifespan())) {
        return false;
      }
      if (!Objects.equals(getEmissionRate(), thatTyped.getEmissionRate())) {
        return false;
      }
      if (!Objects.equals(getSpeed(), thatTyped.getSpeed())) {
        return false;
      }
      if (!Objects.equals(getColor1(), thatTyped.getColor1())) {
        return false;
      }
      if (!Objects.equals(getColor2(), thatTyped.getColor2())) {
        return false;
      }
      if (!Objects.equals(getColor3(), thatTyped.getColor3())) {
        return false;
      }
      if (!Objects.equals(getColor4(), thatTyped.getColor4())) {
        return false;
      }
      if (!Objects.equals(getReplaceableId(), thatTyped.getReplaceableId())) {
        return false;
      }
      if (!Objects.equals(getPath(), thatTyped.getPath())) {
        return false;
      }
      if (!Objects.equals(getFlags(), thatTyped.getFlags())) {
        return false;
      }
      if (!Objects.equals(getKppaChunk(), thatTyped.getKppaChunk())) {
        return false;
      }
      if (!Objects.equals(getKppcChunk(), thatTyped.getKppcChunk())) {
        return false;
      }
      if (!Objects.equals(getKppeChunk(), thatTyped.getKppeChunk())) {
        return false;
      }
      if (!Objects.equals(getKpplChunk(), thatTyped.getKpplChunk())) {
        return false;
      }
      if (!Objects.equals(getKppsChunk(), thatTyped.getKppsChunk())) {
        return false;
      }
      if (!Objects.equals(getKppvChunk(), thatTyped.getKppvChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getInclusiveSize:");
      stringBuilder.append(getInclusiveSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getNode:");
      stringBuilder.append(getNode());
      stringBuilder.append(", \n");
      stringBuilder.append("getLifespan:");
      stringBuilder.append(getLifespan());
      stringBuilder.append(", \n");
      stringBuilder.append("getEmissionRate:");
      stringBuilder.append(getEmissionRate());
      stringBuilder.append(", \n");
      stringBuilder.append("getSpeed:");
      stringBuilder.append(getSpeed());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor1:");
      stringBuilder.append(getColor1());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor2:");
      stringBuilder.append(getColor2());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor3:");
      stringBuilder.append(getColor3());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor4:");
      stringBuilder.append(getColor4());
      stringBuilder.append(", \n");
      stringBuilder.append("getReplaceableId:");
      stringBuilder.append(getReplaceableId());
      stringBuilder.append(", \n");
      stringBuilder.append("getPath:");
      stringBuilder.append(getPath());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlags:");
      stringBuilder.append(getFlags());
      stringBuilder.append(", \n");
      stringBuilder.append("getKppaChunk:");
      stringBuilder.append(getKppaChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKppcChunk:");
      stringBuilder.append(getKppcChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKppeChunk:");
      stringBuilder.append(getKppeChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKpplChunk:");
      stringBuilder.append(getKpplChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKppsChunk:");
      stringBuilder.append(getKppsChunk());
      stringBuilder.append(", \n");
      stringBuilder.append("getKppvChunk:");
      stringBuilder.append(getKppvChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getInclusiveSize() {
      return inclusiveSize;
    }

    public Node getNode() {
      return node;
    }

    public float getLifespan() {
      return lifespan;
    }

    public float getEmissionRate() {
      return emissionRate;
    }

    public float getSpeed() {
      return speed;
    }

    public float getColor1() {
      return color1;
    }

    public float getColor2() {
      return color2;
    }

    public float getColor3() {
      return color3;
    }

    public float getColor4() {
      return color4;
    }

    public long getReplaceableId() {
      return replaceableId;
    }

    public String getPath() {
      return path;
    }

    public String getFlags() {
      return flags;
    }

    public KppaChunk getKppaChunk() {
      return kppaChunk;
    }

    public KppcChunk getKppcChunk() {
      return kppcChunk;
    }

    public KppeChunk getKppeChunk() {
      return kppeChunk;
    }

    public KpplChunk getKpplChunk() {
      return kpplChunk;
    }

    public KppsChunk getKppsChunk() {
      return kppsChunk;
    }

    public KppvChunk getKppvChunk() {
      return kppvChunk;
    }

    public void setInclusiveSize(long value) {
      this.inclusiveSize = value;
    }

    public void setNode(Node value) {
      this.node = value;
    }

    public void setLifespan(float value) {
      this.lifespan = value;
    }

    public void setEmissionRate(float value) {
      this.emissionRate = value;
    }

    public void setSpeed(float value) {
      this.speed = value;
    }

    public void setColor1(float value) {
      this.color1 = value;
    }

    public void setColor2(float value) {
      this.color2 = value;
    }

    public void setColor3(float value) {
      this.color3 = value;
    }

    public void setColor4(float value) {
      this.color4 = value;
    }

    public void setReplaceableId(long value) {
      this.replaceableId = value;
    }

    public void setPath(String value) {
      this.path = value;
    }

    public void setFlags(String value) {
      this.flags = value;
    }

    public void setKppaChunk(KppaChunk value) {
      this.kppaChunk = value;
    }

    public void setKppcChunk(KppcChunk value) {
      this.kppcChunk = value;
    }

    public void setKppeChunk(KppeChunk value) {
      this.kppeChunk = value;
    }

    public void setKpplChunk(KpplChunk value) {
      this.kpplChunk = value;
    }

    public void setKppsChunk(KppsChunk value) {
      this.kppsChunk = value;
    }

    public void setKppvChunk(KppvChunk value) {
      this.kppvChunk = value;
    }
  }

  public static class KmtaChunk {
    private TrackChunk value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KmtaChunk)) {
        return false;
      }
      final KmtaChunk thatTyped = (KmtaChunk) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public TrackChunk getValue() {
      return value;
    }

    public void setValue(TrackChunk value) {
      this.value = value;
    }
  }

  public static class LayerPayload {
    private long filterMode;

    private long shadingFlags;

    private long textureId;

    private long textureAnimId;

    private long textureCoordId;

    private float alpha;

    private Float emissiveGain;

    private List<Float> fresnelColor;

    private Float fresnelOpacity;

    private Float fresnelTeamColor;

    private long hd;

    private List<TexElement> texElement;

    private long index;

    @Override
    public int hashCode() {
      return Objects.hash(getFilterMode(), getShadingFlags(), getTextureId(), getTextureAnimId(), getTextureCoordId(), getAlpha(), getEmissiveGain(), getFresnelColor(), getFresnelOpacity(), getFresnelTeamColor(), getHd(), getTexElement(), getIndex());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof LayerPayload)) {
        return false;
      }
      final LayerPayload thatTyped = (LayerPayload) that;
      if (!Objects.equals(getFilterMode(), thatTyped.getFilterMode())) {
        return false;
      }
      if (!Objects.equals(getShadingFlags(), thatTyped.getShadingFlags())) {
        return false;
      }
      if (!Objects.equals(getTextureId(), thatTyped.getTextureId())) {
        return false;
      }
      if (!Objects.equals(getTextureAnimId(), thatTyped.getTextureAnimId())) {
        return false;
      }
      if (!Objects.equals(getTextureCoordId(), thatTyped.getTextureCoordId())) {
        return false;
      }
      if (!Objects.equals(getAlpha(), thatTyped.getAlpha())) {
        return false;
      }
      if (!Objects.equals(getEmissiveGain(), thatTyped.getEmissiveGain())) {
        return false;
      }
      if (!Objects.equals(getFresnelColor(), thatTyped.getFresnelColor())) {
        return false;
      }
      if (!Objects.equals(getFresnelOpacity(), thatTyped.getFresnelOpacity())) {
        return false;
      }
      if (!Objects.equals(getFresnelTeamColor(), thatTyped.getFresnelTeamColor())) {
        return false;
      }
      if (!Objects.equals(getHd(), thatTyped.getHd())) {
        return false;
      }
      if (!Objects.equals(getTexElement(), thatTyped.getTexElement())) {
        return false;
      }
      if (!Objects.equals(getIndex(), thatTyped.getIndex())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getFilterMode:");
      stringBuilder.append(getFilterMode());
      stringBuilder.append(", \n");
      stringBuilder.append("getShadingFlags:");
      stringBuilder.append(getShadingFlags());
      stringBuilder.append(", \n");
      stringBuilder.append("getTextureId:");
      stringBuilder.append(getTextureId());
      stringBuilder.append(", \n");
      stringBuilder.append("getTextureAnimId:");
      stringBuilder.append(getTextureAnimId());
      stringBuilder.append(", \n");
      stringBuilder.append("getTextureCoordId:");
      stringBuilder.append(getTextureCoordId());
      stringBuilder.append(", \n");
      stringBuilder.append("getAlpha:");
      stringBuilder.append(getAlpha());
      stringBuilder.append(", \n");
      stringBuilder.append("getEmissiveGain:");
      stringBuilder.append(getEmissiveGain());
      stringBuilder.append(", \n");
      stringBuilder.append("getFresnelColor:");
      stringBuilder.append(getFresnelColor());
      stringBuilder.append(", \n");
      stringBuilder.append("getFresnelOpacity:");
      stringBuilder.append(getFresnelOpacity());
      stringBuilder.append(", \n");
      stringBuilder.append("getFresnelTeamColor:");
      stringBuilder.append(getFresnelTeamColor());
      stringBuilder.append(", \n");
      stringBuilder.append("getHd:");
      stringBuilder.append(getHd());
      stringBuilder.append(", \n");
      stringBuilder.append("getTexElement:");
      stringBuilder.append(getTexElement());
      stringBuilder.append(", \n");
      stringBuilder.append("getIndex:");
      stringBuilder.append(getIndex());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getFilterMode() {
      return filterMode;
    }

    public long getShadingFlags() {
      return shadingFlags;
    }

    public long getTextureId() {
      return textureId;
    }

    public long getTextureAnimId() {
      return textureAnimId;
    }

    public long getTextureCoordId() {
      return textureCoordId;
    }

    public float getAlpha() {
      return alpha;
    }

    public Float getEmissiveGain() {
      return emissiveGain;
    }

    public List<Float> getFresnelColor() {
      return fresnelColor;
    }

    public Float getFresnelOpacity() {
      return fresnelOpacity;
    }

    public Float getFresnelTeamColor() {
      return fresnelTeamColor;
    }

    public long getHd() {
      return hd;
    }

    public List<TexElement> getTexElement() {
      return texElement;
    }

    public long getIndex() {
      return index;
    }

    public void setFilterMode(long value) {
      this.filterMode = value;
    }

    public void setShadingFlags(long value) {
      this.shadingFlags = value;
    }

    public void setTextureId(long value) {
      this.textureId = value;
    }

    public void setTextureAnimId(long value) {
      this.textureAnimId = value;
    }

    public void setTextureCoordId(long value) {
      this.textureCoordId = value;
    }

    public void setAlpha(float value) {
      this.alpha = value;
    }

    public void setEmissiveGain(Float value) {
      this.emissiveGain = value;
    }

    public void setFresnelColor(List<Float> value) {
      this.fresnelColor = value;
    }

    public void setFresnelOpacity(Float value) {
      this.fresnelOpacity = value;
    }

    public void setFresnelTeamColor(Float value) {
      this.fresnelTeamColor = value;
    }

    public void setHd(long value) {
      this.hd = value;
    }

    public void setTexElement(List<TexElement> value) {
      this.texElement = value;
    }

    public void setIndex(long value) {
      this.index = value;
    }
  }

  public static class KtasChunk {
    private List<Float> scaling;

    @Override
    public int hashCode() {
      return Objects.hash(getScaling());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KtasChunk)) {
        return false;
      }
      final KtasChunk thatTyped = (KtasChunk) that;
      if (!Objects.equals(getScaling(), thatTyped.getScaling())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getScaling:");
      stringBuilder.append(getScaling());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getScaling() {
      return scaling;
    }

    public void setScaling(List<Float> value) {
      this.scaling = value;
    }
  }

  public static class ChunkPre2 {
    private List<ParticleEmitter2> particleEmitter2;

    @Override
    public int hashCode() {
      return Objects.hash(getParticleEmitter2());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkPre2)) {
        return false;
      }
      final ChunkPre2 thatTyped = (ChunkPre2) that;
      if (!Objects.equals(getParticleEmitter2(), thatTyped.getParticleEmitter2())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getParticleEmitter2:");
      stringBuilder.append(getParticleEmitter2());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<ParticleEmitter2> getParticleEmitter2() {
      return particleEmitter2;
    }

    public void setParticleEmitter2(List<ParticleEmitter2> value) {
      this.particleEmitter2 = value;
    }
  }

  public static class GeosetAnim {
    private long inclusiveSize;

    private GeosetAnimPayload geosetAnimPayload;

    @Override
    public int hashCode() {
      return Objects.hash(getInclusiveSize(), getGeosetAnimPayload());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof GeosetAnim)) {
        return false;
      }
      final GeosetAnim thatTyped = (GeosetAnim) that;
      if (!Objects.equals(getInclusiveSize(), thatTyped.getInclusiveSize())) {
        return false;
      }
      if (!Objects.equals(getGeosetAnimPayload(), thatTyped.getGeosetAnimPayload())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getInclusiveSize:");
      stringBuilder.append(getInclusiveSize());
      stringBuilder.append(", \n");
      stringBuilder.append("getGeosetAnimPayload:");
      stringBuilder.append(getGeosetAnimPayload());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getInclusiveSize() {
      return inclusiveSize;
    }

    public GeosetAnimPayload getGeosetAnimPayload() {
      return geosetAnimPayload;
    }

    public void setInclusiveSize(long value) {
      this.inclusiveSize = value;
    }

    public void setGeosetAnimPayload(GeosetAnimPayload value) {
      this.geosetAnimPayload = value;
    }
  }

  public static class ChunkLite {
    private List<Light> light;

    @Override
    public int hashCode() {
      return Objects.hash(getLight());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ChunkLite)) {
        return false;
      }
      final ChunkLite thatTyped = (ChunkLite) that;
      if (!Objects.equals(getLight(), thatTyped.getLight())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getLight:");
      stringBuilder.append(getLight());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Light> getLight() {
      return light;
    }

    public void setLight(List<Light> value) {
      this.light = value;
    }
  }

  public static class KpeeChunk {
    private float emissionRate;

    @Override
    public int hashCode() {
      return Objects.hash(getEmissionRate());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KpeeChunk)) {
        return false;
      }
      final KpeeChunk thatTyped = (KpeeChunk) that;
      if (!Objects.equals(getEmissionRate(), thatTyped.getEmissionRate())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getEmissionRate:");
      stringBuilder.append(getEmissionRate());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getEmissionRate() {
      return emissionRate;
    }

    public void setEmissionRate(float value) {
      this.emissionRate = value;
    }
  }

  public static class GeosetAnimPayload {
    private float alpha;

    private long flags;

    private float color1;

    private float color2;

    private float color3;

    private long geosetId;

    private List<GeosetAnimTrackChunkRouter> trackChunk;

    @Override
    public int hashCode() {
      return Objects.hash(getAlpha(), getFlags(), getColor1(), getColor2(), getColor3(), getGeosetId(), getTrackChunk());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof GeosetAnimPayload)) {
        return false;
      }
      final GeosetAnimPayload thatTyped = (GeosetAnimPayload) that;
      if (!Objects.equals(getAlpha(), thatTyped.getAlpha())) {
        return false;
      }
      if (!Objects.equals(getFlags(), thatTyped.getFlags())) {
        return false;
      }
      if (!Objects.equals(getColor1(), thatTyped.getColor1())) {
        return false;
      }
      if (!Objects.equals(getColor2(), thatTyped.getColor2())) {
        return false;
      }
      if (!Objects.equals(getColor3(), thatTyped.getColor3())) {
        return false;
      }
      if (!Objects.equals(getGeosetId(), thatTyped.getGeosetId())) {
        return false;
      }
      if (!Objects.equals(getTrackChunk(), thatTyped.getTrackChunk())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getAlpha:");
      stringBuilder.append(getAlpha());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlags:");
      stringBuilder.append(getFlags());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor1:");
      stringBuilder.append(getColor1());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor2:");
      stringBuilder.append(getColor2());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor3:");
      stringBuilder.append(getColor3());
      stringBuilder.append(", \n");
      stringBuilder.append("getGeosetId:");
      stringBuilder.append(getGeosetId());
      stringBuilder.append(", \n");
      stringBuilder.append("getTrackChunk:");
      stringBuilder.append(getTrackChunk());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getAlpha() {
      return alpha;
    }

    public long getFlags() {
      return flags;
    }

    public float getColor1() {
      return color1;
    }

    public float getColor2() {
      return color2;
    }

    public float getColor3() {
      return color3;
    }

    public long getGeosetId() {
      return geosetId;
    }

    public List<GeosetAnimTrackChunkRouter> getTrackChunk() {
      return trackChunk;
    }

    public void setAlpha(float value) {
      this.alpha = value;
    }

    public void setFlags(long value) {
      this.flags = value;
    }

    public void setColor1(float value) {
      this.color1 = value;
    }

    public void setColor2(float value) {
      this.color2 = value;
    }

    public void setColor3(float value) {
      this.color3 = value;
    }

    public void setGeosetId(long value) {
      this.geosetId = value;
    }

    public void setTrackChunk(List<GeosetAnimTrackChunkRouter> value) {
      this.trackChunk = value;
    }
  }

  public static class KplnChunk {
    private float longitude;

    @Override
    public int hashCode() {
      return Objects.hash(getLongitude());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KplnChunk)) {
        return false;
      }
      final KplnChunk thatTyped = (KplnChunk) that;
      if (!Objects.equals(getLongitude(), thatTyped.getLongitude())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getLongitude:");
      stringBuilder.append(getLongitude());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getLongitude() {
      return longitude;
    }

    public void setLongitude(float value) {
      this.longitude = value;
    }
  }

  public static class KcrlChunk {
    private float rotation;

    @Override
    public int hashCode() {
      return Objects.hash(getRotation());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KcrlChunk)) {
        return false;
      }
      final KcrlChunk thatTyped = (KcrlChunk) that;
      if (!Objects.equals(getRotation(), thatTyped.getRotation())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getRotation:");
      stringBuilder.append(getRotation());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getRotation() {
      return rotation;
    }

    public void setRotation(float value) {
      this.rotation = value;
    }
  }

  public static class Bone {
    private Node node;

    private long geosetId;

    private long geosetAnimId;

    @Override
    public int hashCode() {
      return Objects.hash(getNode(), getGeosetId(), getGeosetAnimId());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Bone)) {
        return false;
      }
      final Bone thatTyped = (Bone) that;
      if (!Objects.equals(getNode(), thatTyped.getNode())) {
        return false;
      }
      if (!Objects.equals(getGeosetId(), thatTyped.getGeosetId())) {
        return false;
      }
      if (!Objects.equals(getGeosetAnimId(), thatTyped.getGeosetAnimId())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getNode:");
      stringBuilder.append(getNode());
      stringBuilder.append(", \n");
      stringBuilder.append("getGeosetId:");
      stringBuilder.append(getGeosetId());
      stringBuilder.append(", \n");
      stringBuilder.append("getGeosetAnimId:");
      stringBuilder.append(getGeosetAnimId());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public Node getNode() {
      return node;
    }

    public long getGeosetId() {
      return geosetId;
    }

    public long getGeosetAnimId() {
      return geosetAnimId;
    }

    public void setNode(Node value) {
      this.node = value;
    }

    public void setGeosetId(long value) {
      this.geosetId = value;
    }

    public void setGeosetAnimId(long value) {
      this.geosetAnimId = value;
    }
  }

  public static class KlbcChunk {
    private List<Float> ambientColor;

    @Override
    public int hashCode() {
      return Objects.hash(getAmbientColor());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KlbcChunk)) {
        return false;
      }
      final KlbcChunk thatTyped = (KlbcChunk) that;
      if (!Objects.equals(getAmbientColor(), thatTyped.getAmbientColor())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getAmbientColor:");
      stringBuilder.append(getAmbientColor());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Float> getAmbientColor() {
      return ambientColor;
    }

    public void setAmbientColor(List<Float> value) {
      this.ambientColor = value;
    }
  }

  public static class Kp2wChunk {
    private float width;

    @Override
    public int hashCode() {
      return Objects.hash(getWidth());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Kp2wChunk)) {
        return false;
      }
      final Kp2wChunk thatTyped = (Kp2wChunk) that;
      if (!Objects.equals(getWidth(), thatTyped.getWidth())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getWidth:");
      stringBuilder.append(getWidth());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getWidth() {
      return width;
    }

    public void setWidth(float value) {
      this.width = value;
    }
  }

  public static class KgacChunk {
    private TrackChunk value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof KgacChunk)) {
        return false;
      }
      final KgacChunk thatTyped = (KgacChunk) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public TrackChunk getValue() {
      return value;
    }

    public void setValue(TrackChunk value) {
      this.value = value;
    }
  }
}
