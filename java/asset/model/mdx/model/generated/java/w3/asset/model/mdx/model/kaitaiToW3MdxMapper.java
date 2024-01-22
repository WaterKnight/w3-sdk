package w3.asset.model.mdx.model;

import java.util.stream.Collectors;

public class kaitaiToW3MdxMapper {
  public static W3Mdx map(w3.asset.model.mdx.model.kaitai.W3Mdx data) {
    if (data == null) {
      return null;
    }
    final W3Mdx newData = new W3Mdx();
    newData.setMagic(kaitaiToW3idMapper.map(data.magic()));
    newData.setChunk(data.chunk().stream().map(kaitaiToChunkRouterMapper::map).collect(Collectors.toList()));
    return newData;
  }

  public static class kaitaiToTrackChunkMapper {
    public static W3Mdx.TrackChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.TrackChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.TrackChunk newData = new W3Mdx.TrackChunk();
      newData.setMagic(kaitaiToW3idMapper.map(data.magic()));
      newData.setInterpolationType(data.interpolationType());
      newData.setGlobalSequenceId(data.globalSequenceId());
      newData.setTrack(data.track().stream().map(kaitaiToTrackMapper::map).collect(Collectors.toList()));
      newData.setValueType(data.valueType());
      return newData;
    }
  }

  public static class kaitaiToAttachmentPayloadMapper {
    public static W3Mdx.AttachmentPayload map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.AttachmentPayload data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.AttachmentPayload newData = new W3Mdx.AttachmentPayload();
      newData.setNode(kaitaiToNodeMapper.map(data.node()));
      newData.setPath(data.path());
      newData.setAttachmentId(data.attachmentId());
      newData.setTrackChunk(data.trackChunk().stream().map(kaitaiToAttachmentTrackRouterMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToNodePayloadMapper {
    public static W3Mdx.NodePayload map(w3.asset.model.mdx.model.kaitai.W3Mdx.NodePayload data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.NodePayload newData = new W3Mdx.NodePayload();
      newData.setName(data.name());
      newData.setObjectId(data.objectId());
      newData.setParentId(data.parentId());
      newData.setFlags(data.flags());
      newData.setTrackChunk(data.trackChunk().stream().map(kaitaiToNodeTrackRouterMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToChunkRouterMapper {
    public static W3Mdx.ChunkRouter map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkRouter data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkRouter newData = new W3Mdx.ChunkRouter();
      newData.setVersion(data.version());
      newData.setMagic(kaitaiToW3idMapper.map(data.magic()));
      newData.setSize(data.size());
      try {
        newData.setChunkData(Class.forName(kaitaiToW3MdxMapper.class.getTypeName() + "$kaitaiTo" + data.chunkData().getClass().getSimpleName() + "Mapper").getMethod("map", data.chunkData().getClass()).invoke(null, data.chunkData()));
      } catch (Exception e) {
        throw new AssertionError(e);
      }
      return newData;
    }
  }

  public static class kaitaiToKralChunkMapper {
    public static W3Mdx.KralChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KralChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KralChunk newData = new W3Mdx.KralChunk();
      newData.setAlpha(data.alpha());
      return newData;
    }
  }

  public static class kaitaiToChunkBoneMapper {
    public static W3Mdx.ChunkBone map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkBone data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkBone newData = new W3Mdx.ChunkBone();
      newData.setBone(data.bone().stream().map(kaitaiToBoneMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToLightMapper {
    public static W3Mdx.Light map(w3.asset.model.mdx.model.kaitai.W3Mdx.Light data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Light newData = new W3Mdx.Light();
      newData.setInclusiveSize(data.inclusiveSize());
      newData.setLightPayload(kaitaiToLightPayloadMapper.map(data.lightPayload()));
      return newData;
    }
  }

  public static class kaitaiToCollisionShapeMapper {
    public static W3Mdx.CollisionShape map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.CollisionShape data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.CollisionShape newData = new W3Mdx.CollisionShape();
      newData.setNode(kaitaiToNodeMapper.map(data.node()));
      newData.setType(data.type());
      newData.setVertex(data.vertex());
      newData.setRadius(data.radius());
      return newData;
    }
  }

  public static class kaitaiToKctrChunkMapper {
    public static W3Mdx.KctrChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KctrChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KctrChunk newData = new W3Mdx.KctrChunk();
      newData.setTranslation(data.translation());
      return newData;
    }
  }

  public static class kaitaiToChunkModlMapper {
    public static W3Mdx.ChunkModl map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkModl data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkModl newData = new W3Mdx.ChunkModl();
      newData.setName(data.name());
      newData.setAnimFileName(data.animFileName());
      newData.setExtent(kaitaiToExtentMapper.map(data.extent()));
      newData.setBlendTime(data.blendTime());
      return newData;
    }
  }

  public static class kaitaiToKp2rChunkMapper {
    public static W3Mdx.Kp2rChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.Kp2rChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Kp2rChunk newData = new W3Mdx.Kp2rChunk();
      newData.setVariation(data.variation());
      return newData;
    }
  }

  public static class kaitaiToKlaiChunkMapper {
    public static W3Mdx.KlaiChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KlaiChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KlaiChunk newData = new W3Mdx.KlaiChunk();
      newData.setIntensity(data.intensity());
      return newData;
    }
  }

  public static class kaitaiToChunkGeosMapper {
    public static W3Mdx.ChunkGeos map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkGeos data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkGeos newData = new W3Mdx.ChunkGeos();
      newData.setGeoset(data.geoset().stream().map(kaitaiToGeosetMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToKp2lChunkMapper {
    public static W3Mdx.Kp2lChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.Kp2lChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Kp2lChunk newData = new W3Mdx.Kp2lChunk();
      newData.setLatitude(data.latitude());
      return newData;
    }
  }

  public static class kaitaiToKrhbChunkMapper {
    public static W3Mdx.KrhbChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KrhbChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KrhbChunk newData = new W3Mdx.KrhbChunk();
      newData.setHeightBelow(data.heightBelow());
      return newData;
    }
  }

  public static class kaitaiToParticleEmitter2PayloadMapper {
    public static W3Mdx.ParticleEmitter2Payload map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.ParticleEmitter2Payload data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ParticleEmitter2Payload newData = new W3Mdx.ParticleEmitter2Payload();
      newData.setNode(kaitaiToNodeMapper.map(data.node()));
      newData.setSpeed(data.speed());
      newData.setVariation(data.variation());
      newData.setLatitude(data.latitude());
      newData.setGravity(data.gravity());
      newData.setLifespan(data.lifespan());
      newData.setEmissionRate(data.emissionRate());
      newData.setLength(data.length());
      newData.setWidth(data.width());
      newData.setFilterMode(data.filterMode());
      newData.setHeadOrTail(data.headOrTail());
      newData.setTailLength(data.tailLength());
      newData.setTime(data.time());
      newData.setSegmentColor(data.segmentColor().stream().map(kaitaiToSegmentColorMapper::map).collect(Collectors.toList()));
      newData.setSegment1Alpha(data.segment1Alpha());
      newData.setSegment2Alpha(data.segment2Alpha());
      newData.setSegmen3tAlpha(data.segmen3tAlpha());
      newData.setSegment1Scale(data.segment1Scale());
      newData.setSegment2Scale(data.segment2Scale());
      newData.setSegment3Scale(data.segment3Scale());
      newData.setSegment1HeadInterval(data.segment1HeadInterval());
      newData.setSegment2HeadInterval(data.segment2HeadInterval());
      newData.setSegment3HeadInterval(data.segment3HeadInterval());
      newData.setSegment1HeadDecayInterval(data.segment1HeadDecayInterval());
      newData.setSegment2HeadDecayInterval(data.segment2HeadDecayInterval());
      newData.setSegment3HeadDecayInterval(data.segment3HeadDecayInterval());
      newData.setSegment1TailInterval(data.segment1TailInterval());
      newData.setSegment2TailInterval(data.segment2TailInterval());
      newData.setSegment3TailInterval(data.segment3TailInterval());
      newData.setSegment1TailDecayInterval(data.segment1TailDecayInterval());
      newData.setSegment2TailDecayInterval(data.segment2TailDecayInterval());
      newData.setSegment3TailDecayInterval(data.segment3TailDecayInterval());
      newData.setTextureId(data.textureId());
      newData.setSquirt(data.squirt());
      newData.setPriorityPlane(data.priorityPlane());
      newData.setReplaceableId(data.replaceableId());
      newData.setParticleEmitter2TrackChunkRouter(data.particleEmitter2TrackChunkRouter().stream().map(kaitaiToParticleEmitter2TrackChunkRouterMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToParticleEmitter2TrackChunkRouterMapper {
    public static W3Mdx.ParticleEmitter2TrackChunkRouter map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.ParticleEmitter2TrackChunkRouter data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ParticleEmitter2TrackChunkRouter newData = new W3Mdx.ParticleEmitter2TrackChunkRouter();
      newData.setMagic(kaitaiToW3idMapper.map(data.magic()));
      try {
        newData.setChunk(Class.forName(kaitaiToW3MdxMapper.class.getTypeName() + "$kaitaiTo" + data.chunk().getClass().getSimpleName() + "Mapper").getMethod("map", data.chunk().getClass()).invoke(null, data.chunk()));
      } catch (Exception e) {
        throw new AssertionError(e);
      }
      return newData;
    }
  }

  public static class kaitaiToKppaChunkMapper {
    public static W3Mdx.KppaChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KppaChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KppaChunk newData = new W3Mdx.KppaChunk();
      newData.setAlpha(data.alpha());
      return newData;
    }
  }

  public static class kaitaiToKp2sChunkMapper {
    public static W3Mdx.Kp2sChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.Kp2sChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Kp2sChunk newData = new W3Mdx.Kp2sChunk();
      newData.setSpeed(data.speed());
      return newData;
    }
  }

  public static class kaitaiToChunkHelpMapper {
    public static W3Mdx.ChunkHelp map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkHelp data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkHelp newData = new W3Mdx.ChunkHelp();
      newData.setHelper(data.helper().stream().map(kaitaiToHelperMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToGeosetPayloadMapper {
    public static W3Mdx.GeosetPayload map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.GeosetPayload data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.GeosetPayload newData = new W3Mdx.GeosetPayload();
      newData.setVrtxMagic(kaitaiToW3idMapper.map(data.vrtxMagic()));
      newData.setVertexPosition(data.vertexPosition().stream().map(kaitaiToVertexPositionMapper::map).collect(Collectors.toList()));
      newData.setNrmsMagic(kaitaiToW3idMapper.map(data.nrmsMagic()));
      newData.setVertexNormal(data.vertexNormal().stream().map(kaitaiToVertexNormalMapper::map).collect(Collectors.toList()));
      newData.setPtypMagic(kaitaiToW3idMapper.map(data.ptypMagic()));
      newData.setFaceTypeGroup(data.faceTypeGroup());
      newData.setPcntMagic(kaitaiToW3idMapper.map(data.pcntMagic()));
      newData.setFaceGroup(data.faceGroup());
      newData.setPvtxMagic(kaitaiToW3idMapper.map(data.pvtxMagic()));
      newData.setFace(data.face());
      newData.setGndxMagic(kaitaiToW3idMapper.map(data.gndxMagic()));
      newData.setVertexGroup(data.vertexGroup());
      newData.setMtgcMagic(kaitaiToW3idMapper.map(data.mtgcMagic()));
      newData.setMatrixGroup(data.matrixGroup());
      newData.setMatsMagic(kaitaiToW3idMapper.map(data.matsMagic()));
      newData.setMatrixIndex(data.matrixIndex());
      newData.setMaterialId(kaitaiToW3idMapper.map(data.materialId()));
      newData.setSelectionGroup(data.selectionGroup());
      newData.setSelectionFlags(data.selectionFlags());
      newData.setLod(data.lod());
      newData.setLodName(data.lodName());
      newData.setExtent(kaitaiToExtentMapper.map(data.extent()));
      newData.setSequenceExtent(data.sequenceExtent().stream().map(kaitaiToExtentMapper::map).collect(Collectors.toList()));
      newData.setTangentChunk(kaitaiToTangentChunkMapper.map(data.tangentChunk()));
      newData.setSkinChunk(kaitaiToSkinChunkMapper.map(data.skinChunk()));
      return newData;
    }
  }

  public static class kaitaiToFaceEffectMapper {
    public static W3Mdx.FaceEffect map(w3.asset.model.mdx.model.kaitai.W3Mdx.FaceEffect data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.FaceEffect newData = new W3Mdx.FaceEffect();
      newData.setTarget(data.target());
      newData.setPath(data.path());
      return newData;
    }
  }

  public static class kaitaiToChunkGeoaMapper {
    public static W3Mdx.ChunkGeoa map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkGeoa data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkGeoa newData = new W3Mdx.ChunkGeoa();
      newData.setGeosetAnim(data.geosetAnim().stream().map(kaitaiToGeosetAnimMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToKpplChunkMapper {
    public static W3Mdx.KpplChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KpplChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KpplChunk newData = new W3Mdx.KpplChunk();
      newData.setLifespan(data.lifespan());
      return newData;
    }
  }

  public static class kaitaiToHelperMapper {
    public static W3Mdx.Helper map(w3.asset.model.mdx.model.kaitai.W3Mdx.Helper data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Helper newData = new W3Mdx.Helper();
      newData.setNode(kaitaiToNodeMapper.map(data.node()));
      return newData;
    }
  }

  public static class kaitaiToVertexNormalMapper {
    public static W3Mdx.VertexNormal map(w3.asset.model.mdx.model.kaitai.W3Mdx.VertexNormal data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.VertexNormal newData = new W3Mdx.VertexNormal();
      newData.setValue(data.value());
      return newData;
    }
  }

  public static class kaitaiToKmteChunkMapper {
    public static W3Mdx.KmteChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KmteChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KmteChunk newData = new W3Mdx.KmteChunk();
      newData.setValue(kaitaiToTrackChunkMapper.map(data.value()));
      return newData;
    }
  }

  public static class kaitaiToSkinChunkMapper {
    public static W3Mdx.SkinChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.SkinChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.SkinChunk newData = new W3Mdx.SkinChunk();
      newData.setMagic(kaitaiToW3idMapper.map(data.magic()));
      newData.setSkin(data.skin());
      return newData;
    }
  }

  public static class kaitaiToKpltChunkMapper {
    public static W3Mdx.KpltChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KpltChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KpltChunk newData = new W3Mdx.KpltChunk();
      newData.setLatitude(data.latitude());
      return newData;
    }
  }

  public static class kaitaiToKlacChunkMapper {
    public static W3Mdx.KlacChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KlacChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KlacChunk newData = new W3Mdx.KlacChunk();
      newData.setColor(data.color());
      return newData;
    }
  }

  public static class kaitaiToChunkAtchMapper {
    public static W3Mdx.ChunkAtch map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkAtch data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkAtch newData = new W3Mdx.ChunkAtch();
      newData.setAttachment(data.attachment().stream().map(kaitaiToAttachmentMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToF43Mapper {
    public static W3Mdx.F43 map(w3.asset.model.mdx.model.kaitai.W3Mdx.F43 data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.F43 newData = new W3Mdx.F43();
      newData.setValue(data.value());
      return newData;
    }
  }

  public static class kaitaiToChunkCamsMapper {
    public static W3Mdx.ChunkCams map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkCams data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkCams newData = new W3Mdx.ChunkCams();
      newData.setCamera(data.camera().stream().map(kaitaiToCameraMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToKlaeChunkMapper {
    public static W3Mdx.KlaeChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KlaeChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KlaeChunk newData = new W3Mdx.KlaeChunk();
      newData.setAttenuationEnd(data.attenuationEnd());
      return newData;
    }
  }

  public static class kaitaiToChunkMtlsMapper {
    public static W3Mdx.ChunkMtls map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkMtls data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkMtls newData = new W3Mdx.ChunkMtls();
      newData.setMaterial(data.material().stream().map(kaitaiToMaterialMapper::map).collect(Collectors.toList()));
      newData.setSize(data.size());
      return newData;
    }
  }

  public static class kaitaiToLightPayloadMapper {
    public static W3Mdx.LightPayload map(w3.asset.model.mdx.model.kaitai.W3Mdx.LightPayload data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.LightPayload newData = new W3Mdx.LightPayload();
      newData.setNode(kaitaiToNodeMapper.map(data.node()));
      newData.setType(data.type());
      newData.setAttenuationStart(data.attenuationStart());
      newData.setAttenuationEnd(data.attenuationEnd());
      newData.setColor1(data.color1());
      newData.setColor2(data.color2());
      newData.setColor3(data.color3());
      newData.setIntensity(data.intensity());
      newData.setAmbientColor1(data.ambientColor1());
      newData.setAmbientColor2(data.ambientColor2());
      newData.setAmbientColor3(data.ambientColor3());
      newData.setAmbientIntensity(data.ambientIntensity());
      newData.setLightTrackChunkRouter(data.lightTrackChunkRouter().stream().map(kaitaiToLightTrackChunkRouterMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToKfctChunkMapper {
    public static W3Mdx.KfctChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KfctChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KfctChunk newData = new W3Mdx.KfctChunk();
      newData.setFresnelTeamColor(data.fresnelTeamColor());
      return newData;
    }
  }

  public static class kaitaiToKrhaChunkMapper {
    public static W3Mdx.KrhaChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KrhaChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KrhaChunk newData = new W3Mdx.KrhaChunk();
      newData.setHeightAbove(data.heightAbove());
      return newData;
    }
  }

  public static class kaitaiToKlbiChunkMapper {
    public static W3Mdx.KlbiChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KlbiChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KlbiChunk newData = new W3Mdx.KlbiChunk();
      newData.setAmbientIntensity(data.ambientIntensity());
      return newData;
    }
  }

  public static class kaitaiToTrackMapper {
    public static W3Mdx.Track map(w3.asset.model.mdx.model.kaitai.W3Mdx.Track data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Track newData = new W3Mdx.Track();
      newData.setFrame(data.frame());
      try {
        newData.setValue(Class.forName(kaitaiToW3MdxMapper.class.getTypeName() + "$kaitaiTo" + data.value().getClass().getSimpleName() + "Mapper").getMethod("map", data.value().getClass()).invoke(null, data.value()));
      } catch (Exception e) {
        throw new AssertionError(e);
      }
      try {
        newData.setInTan(Class.forName(kaitaiToW3MdxMapper.class.getTypeName() + "$kaitaiTo" + data.inTan().getClass().getSimpleName() + "Mapper").getMethod("map", data.inTan().getClass()).invoke(null, data.inTan()));
      } catch (Exception e) {
        throw new AssertionError(e);
      }
      try {
        newData.setOutTan(Class.forName(kaitaiToW3MdxMapper.class.getTypeName() + "$kaitaiTo" + data.outTan().getClass().getSimpleName() + "Mapper").getMethod("map", data.outTan().getClass()).invoke(null, data.outTan()));
      } catch (Exception e) {
        throw new AssertionError(e);
      }
      newData.setValueType(data.valueType());
      newData.setInterpolationType(data.interpolationType());
      return newData;
    }
  }

  public static class kaitaiToCameraPayloadMapper {
    public static W3Mdx.CameraPayload map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.CameraPayload data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.CameraPayload newData = new W3Mdx.CameraPayload();
      newData.setName(data.name());
      newData.setPosition1(data.position1());
      newData.setPosition2(data.position2());
      newData.setPosition3(data.position3());
      newData.setFieldOfView(data.fieldOfView());
      newData.setFarClippingPlane(data.farClippingPlane());
      newData.setNearClippingPlane(data.nearClippingPlane());
      newData.setTargetPosition1(data.targetPosition1());
      newData.setTargetPosition2(data.targetPosition2());
      newData.setTargetPosition3(data.targetPosition3());
      newData.setCameraTrackChunkRouter(data.cameraTrackChunkRouter().stream().map(kaitaiToCameraTrackChunkRouterMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToExtentMapper {
    public static W3Mdx.Extent map(w3.asset.model.mdx.model.kaitai.W3Mdx.Extent data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Extent newData = new W3Mdx.Extent();
      newData.setBoundsRadius(data.boundsRadius());
      newData.setMinimum(data.minimum());
      newData.setMaximum(data.maximum());
      return newData;
    }
  }

  public static class kaitaiToChunkClidMapper {
    public static W3Mdx.ChunkClid map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkClid data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkClid newData = new W3Mdx.ChunkClid();
      newData.setCollisionShape(data.collisionShape().stream().map(kaitaiToCollisionShapeMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToKgtrChunkMapper {
    public static W3Mdx.KgtrChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KgtrChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KgtrChunk newData = new W3Mdx.KgtrChunk();
      newData.setValue(kaitaiToTrackChunkMapper.map(data.value()));
      return newData;
    }
  }

  public static class kaitaiToTextureAnimMapper {
    public static W3Mdx.TextureAnim map(w3.asset.model.mdx.model.kaitai.W3Mdx.TextureAnim data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.TextureAnim newData = new W3Mdx.TextureAnim();
      newData.setInclusiveSize(data.inclusiveSize());
      newData.setKtatChunk(kaitaiToKtatChunkMapper.map(data.ktatChunk()));
      newData.setKtarChunk(kaitaiToKtarChunkMapper.map(data.ktarChunk()));
      newData.setKtasChunk(kaitaiToKtasChunkMapper.map(data.ktasChunk()));
      return newData;
    }
  }

  public static class kaitaiToChunkTexsMapper {
    public static W3Mdx.ChunkTexs map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkTexs data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkTexs newData = new W3Mdx.ChunkTexs();
      newData.setTexsTex(data.texsTex().stream().map(kaitaiToTexsTexMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToKlasChunkMapper {
    public static W3Mdx.KlasChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KlasChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KlasChunk newData = new W3Mdx.KlasChunk();
      newData.setAttenuationStart(data.attenuationStart());
      return newData;
    }
  }

  public static class kaitaiToChunkSeqsMapper {
    public static W3Mdx.ChunkSeqs map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkSeqs data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkSeqs newData = new W3Mdx.ChunkSeqs();
      newData.setSequence(data.sequence().stream().map(kaitaiToSequenceMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToKpelChunkMapper {
    public static W3Mdx.KpelChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KpelChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KpelChunk newData = new W3Mdx.KpelChunk();
      newData.setLifespan(data.lifespan());
      return newData;
    }
  }

  public static class kaitaiToKp2eChunkMapper {
    public static W3Mdx.Kp2eChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.Kp2eChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Kp2eChunk newData = new W3Mdx.Kp2eChunk();
      newData.setEmissionRate(data.emissionRate());
      return newData;
    }
  }

  public static class kaitaiToAttachmentMapper {
    public static W3Mdx.Attachment map(w3.asset.model.mdx.model.kaitai.W3Mdx.Attachment data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Attachment newData = new W3Mdx.Attachment();
      newData.setInclusiveSize(data.inclusiveSize());
      newData.setAttachmentPayload(kaitaiToAttachmentPayloadMapper.map(data.attachmentPayload()));
      return newData;
    }
  }

  public static class kaitaiToKrtxChunkMapper {
    public static W3Mdx.KrtxChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KrtxChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KrtxChunk newData = new W3Mdx.KrtxChunk();
      newData.setTextureSlot(data.textureSlot());
      return newData;
    }
  }

  public static class kaitaiToKpesChunkMapper {
    public static W3Mdx.KpesChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KpesChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KpesChunk newData = new W3Mdx.KpesChunk();
      newData.setSpeed(data.speed());
      return newData;
    }
  }

  public static class kaitaiToChunkEvtsMapper {
    public static W3Mdx.ChunkEvts map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkEvts data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkEvts newData = new W3Mdx.ChunkEvts();
      newData.setEventObject(data.eventObject().stream().map(kaitaiToEventObjectMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToCameraTrackChunkRouterMapper {
    public static W3Mdx.CameraTrackChunkRouter map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.CameraTrackChunkRouter data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.CameraTrackChunkRouter newData = new W3Mdx.CameraTrackChunkRouter();
      newData.setMagic(kaitaiToW3idMapper.map(data.magic()));
      try {
        newData.setChunk(Class.forName(kaitaiToW3MdxMapper.class.getTypeName() + "$kaitaiTo" + data.chunk().getClass().getSimpleName() + "Mapper").getMethod("map", data.chunk().getClass()).invoke(null, data.chunk()));
      } catch (Exception e) {
        throw new AssertionError(e);
      }
      return newData;
    }
  }

  public static class kaitaiToSequenceMapper {
    public static W3Mdx.Sequence map(w3.asset.model.mdx.model.kaitai.W3Mdx.Sequence data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Sequence newData = new W3Mdx.Sequence();
      newData.setName(data.name());
      newData.setInterval(data.interval());
      newData.setMoveSpeed(data.moveSpeed());
      newData.setFlags(data.flags());
      newData.setRarity(data.rarity());
      newData.setSyncPoint(data.syncPoint());
      newData.setExtent(kaitaiToExtentMapper.map(data.extent()));
      return newData;
    }
  }

  public static class kaitaiToKlavChunkMapper {
    public static W3Mdx.KlavChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KlavChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KlavChunk newData = new W3Mdx.KlavChunk();
      newData.setVisibility(data.visibility());
      return newData;
    }
  }

  public static class kaitaiToChunkGlbsMapper {
    public static W3Mdx.ChunkGlbs map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkGlbs data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkGlbs newData = new W3Mdx.ChunkGlbs();
      newData.setGlobalSequence(data.globalSequence());
      return newData;
    }
  }

  public static class kaitaiToTexElementMapper {
    public static W3Mdx.TexElement map(w3.asset.model.mdx.model.kaitai.W3Mdx.TexElement data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.TexElement newData = new W3Mdx.TexElement();
      newData.setId(data.id());
      try {
        newData.setIndex(Class.forName(kaitaiToW3MdxMapper.class.getTypeName() + "$kaitaiTo" + data.index().getClass().getSimpleName() + "Mapper").getMethod("map", data.index().getClass()).invoke(null, data.index()));
      } catch (Exception e) {
        throw new AssertionError(e);
      }
      newData.setTrackMagic(data.trackMagic());
      newData.setDiscriminator(data.discriminator());
      try {
        newData.setPayload(Class.forName(kaitaiToW3MdxMapper.class.getTypeName() + "$kaitaiTo" + data.payload().getClass().getSimpleName() + "Mapper").getMethod("map", data.payload().getClass()).invoke(null, data.payload()));
      } catch (Exception e) {
        throw new AssertionError(e);
      }
      return newData;
    }
  }

  public static class kaitaiToKmtfChunkMapper {
    public static W3Mdx.KmtfChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KmtfChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KmtfChunk newData = new W3Mdx.KmtfChunk();
      newData.setValue(kaitaiToTrackChunkMapper.map(data.value()));
      return newData;
    }
  }

  public static class kaitaiToVertexPositionMapper {
    public static W3Mdx.VertexPosition map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.VertexPosition data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.VertexPosition newData = new W3Mdx.VertexPosition();
      newData.setx(data.x());
      newData.sety(data.y());
      newData.setz(data.z());
      return newData;
    }
  }

  public static class kaitaiToKtarChunkMapper {
    public static W3Mdx.KtarChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KtarChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KtarChunk newData = new W3Mdx.KtarChunk();
      newData.setRotation(data.rotation());
      return newData;
    }
  }

  public static class kaitaiToCameraMapper {
    public static W3Mdx.Camera map(w3.asset.model.mdx.model.kaitai.W3Mdx.Camera data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Camera newData = new W3Mdx.Camera();
      newData.setInclusiveSize(data.inclusiveSize());
      newData.setCameraPayload(kaitaiToCameraPayloadMapper.map(data.cameraPayload()));
      return newData;
    }
  }

  public static class kaitaiToKatvChunkMapper {
    public static W3Mdx.KatvChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KatvChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KatvChunk newData = new W3Mdx.KatvChunk();
      newData.setValue(kaitaiToTrackChunkMapper.map(data.value()));
      return newData;
    }
  }

  public static class kaitaiToKtatChunkMapper {
    public static W3Mdx.KtatChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KtatChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KtatChunk newData = new W3Mdx.KtatChunk();
      newData.setTranslation(data.translation());
      return newData;
    }
  }

  public static class kaitaiToKfcaChunkMapper {
    public static W3Mdx.KfcaChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KfcaChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KfcaChunk newData = new W3Mdx.KfcaChunk();
      newData.setFresnelAlpha(data.fresnelAlpha());
      return newData;
    }
  }

  public static class kaitaiToKpevChunkMapper {
    public static W3Mdx.KpevChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KpevChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KpevChunk newData = new W3Mdx.KpevChunk();
      newData.setVisibility(data.visibility());
      return newData;
    }
  }

  public static class kaitaiToKrvsChunkMapper {
    public static W3Mdx.KrvsChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KrvsChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KrvsChunk newData = new W3Mdx.KrvsChunk();
      newData.setVisibility(data.visibility());
      return newData;
    }
  }

  public static class kaitaiToKppcChunkMapper {
    public static W3Mdx.KppcChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KppcChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KppcChunk newData = new W3Mdx.KppcChunk();
      newData.setColor(data.color());
      return newData;
    }
  }

  public static class kaitaiToTextureCoordinateMapper {
    public static W3Mdx.TextureCoordinate map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.TextureCoordinate data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.TextureCoordinate newData = new W3Mdx.TextureCoordinate();
      newData.setx(data.x());
      newData.sety(data.y());
      return newData;
    }
  }

  public static class kaitaiToGeosetAnimTrackChunkRouterMapper {
    public static W3Mdx.GeosetAnimTrackChunkRouter map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.GeosetAnimTrackChunkRouter data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.GeosetAnimTrackChunkRouter newData = new W3Mdx.GeosetAnimTrackChunkRouter();
      newData.setMagic(kaitaiToW3idMapper.map(data.magic()));
      try {
        newData.setChunk(Class.forName(kaitaiToW3MdxMapper.class.getTypeName() + "$kaitaiTo" + data.chunk().getClass().getSimpleName() + "Mapper").getMethod("map", data.chunk().getClass()).invoke(null, data.chunk()));
      } catch (Exception e) {
        throw new AssertionError(e);
      }
      return newData;
    }
  }

  public static class kaitaiToKgscChunkMapper {
    public static W3Mdx.KgscChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KgscChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KgscChunk newData = new W3Mdx.KgscChunk();
      newData.setValue(kaitaiToTrackChunkMapper.map(data.value()));
      return newData;
    }
  }

  public static class kaitaiToNodeMapper {
    public static W3Mdx.Node map(w3.asset.model.mdx.model.kaitai.W3Mdx.Node data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Node newData = new W3Mdx.Node();
      newData.setInclusiveSize(data.inclusiveSize());
      newData.setNodePayload(kaitaiToNodePayloadMapper.map(data.nodePayload()));
      return newData;
    }
  }

  public static class kaitaiToParticleEmitter2Mapper {
    public static W3Mdx.ParticleEmitter2 map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.ParticleEmitter2 data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ParticleEmitter2 newData = new W3Mdx.ParticleEmitter2();
      newData.setInclusiveSize(data.inclusiveSize());
      newData.setParticleEmitter2Payload(kaitaiToParticleEmitter2PayloadMapper.map(data.particleEmitter2Payload()));
      return newData;
    }
  }

  public static class kaitaiToKpegChunkMapper {
    public static W3Mdx.KpegChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KpegChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KpegChunk newData = new W3Mdx.KpegChunk();
      newData.setGravity(data.gravity());
      return newData;
    }
  }

  public static class kaitaiToChunkVersMapper {
    public static W3Mdx.ChunkVers map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkVers data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkVers newData = new W3Mdx.ChunkVers();
      newData.setVersion(data.version());
      return newData;
    }
  }

  public static class kaitaiToRibbonEmitterMapper {
    public static W3Mdx.RibbonEmitter map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.RibbonEmitter data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.RibbonEmitter newData = new W3Mdx.RibbonEmitter();
      newData.setInclusiveSize(data.inclusiveSize());
      newData.setNode(kaitaiToNodeMapper.map(data.node()));
      newData.setHeightAbove(data.heightAbove());
      newData.setHeightBelow(data.heightBelow());
      newData.setAlpha(data.alpha());
      newData.setColor1(data.color1());
      newData.setColor2(data.color2());
      newData.setColor3(data.color3());
      newData.setLifespan(data.lifespan());
      newData.setTextureSlot(data.textureSlot());
      newData.setEmissionRate(data.emissionRate());
      newData.setMaterialId(data.materialId());
      newData.setGravity(data.gravity());
      newData.setKrhaChunk(kaitaiToKrhaChunkMapper.map(data.krhaChunk()));
      newData.setKrhbChunk(kaitaiToKrhbChunkMapper.map(data.krhbChunk()));
      newData.setKralChunk(kaitaiToKralChunkMapper.map(data.kralChunk()));
      newData.setKrcoChunk(kaitaiToKrcoChunkMapper.map(data.krcoChunk()));
      newData.setKrtxChunk(kaitaiToKrtxChunkMapper.map(data.krtxChunk()));
      newData.setKrvsChunk(kaitaiToKrvsChunkMapper.map(data.krvsChunk()));
      return newData;
    }
  }

  public static class kaitaiToMaterialPayloadMapper {
    public static W3Mdx.MaterialPayload map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.MaterialPayload data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.MaterialPayload newData = new W3Mdx.MaterialPayload();
      newData.setPriorityPlane(data.priorityPlane());
      newData.setFlags(data.flags());
      newData.setShader(data.shader());
      newData.setLaysMagic(kaitaiToW3idMapper.map(data.laysMagic()));
      newData.setLayer(data.layer().stream().map(kaitaiToLayerMapper::map).collect(Collectors.toList()));
      newData.setIndex(data.index());
      return newData;
    }
  }

  public static class kaitaiToAttachmentTrackRouterMapper {
    public static W3Mdx.AttachmentTrackRouter map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.AttachmentTrackRouter data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.AttachmentTrackRouter newData = new W3Mdx.AttachmentTrackRouter();
      newData.setMagic(kaitaiToW3idMapper.map(data.magic()));
      newData.setChunk(kaitaiToKatvChunkMapper.map(data.chunk()));
      return newData;
    }
  }

  public static class kaitaiToTangentChunkMapper {
    public static W3Mdx.TangentChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.TangentChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.TangentChunk newData = new W3Mdx.TangentChunk();
      newData.setMagic(kaitaiToW3idMapper.map(data.magic()));
      newData.setTangent(data.tangent().stream().map(kaitaiToTangentMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToKppvChunkMapper {
    public static W3Mdx.KppvChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KppvChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KppvChunk newData = new W3Mdx.KppvChunk();
      newData.setVisibility(data.visibility());
      return newData;
    }
  }

  public static class kaitaiToMaterialMapper {
    public static W3Mdx.Material map(w3.asset.model.mdx.model.kaitai.W3Mdx.Material data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Material newData = new W3Mdx.Material();
      newData.setInclusiveSize(data.inclusiveSize());
      newData.setPayload(kaitaiToMaterialPayloadMapper.map(data.payload()));
      newData.setIndex(data.index());
      return newData;
    }
  }

  public static class kaitaiToEventObjectMapper {
    public static W3Mdx.EventObject map(w3.asset.model.mdx.model.kaitai.W3Mdx.EventObject data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.EventObject newData = new W3Mdx.EventObject();
      newData.setNode(kaitaiToNodeMapper.map(data.node()));
      newData.setKevtMagic(kaitaiToW3idMapper.map(data.kevtMagic()));
      newData.setGlobalSequenceId(data.globalSequenceId());
      newData.setTrackChunk(data.trackChunk());
      return newData;
    }
  }

  public static class kaitaiToKp2vChunkMapper {
    public static W3Mdx.Kp2vChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.Kp2vChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Kp2vChunk newData = new W3Mdx.Kp2vChunk();
      newData.setVisibility(data.visibility());
      return newData;
    }
  }

  public static class kaitaiToKp2gChunkMapper {
    public static W3Mdx.Kp2gChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.Kp2gChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Kp2gChunk newData = new W3Mdx.Kp2gChunk();
      newData.setGravity(data.gravity());
      return newData;
    }
  }

  public static class kaitaiToKp2nChunkMapper {
    public static W3Mdx.Kp2nChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.Kp2nChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Kp2nChunk newData = new W3Mdx.Kp2nChunk();
      newData.setLength(data.length());
      return newData;
    }
  }

  public static class kaitaiToErrorMapper {
    public static W3Mdx.Error map(w3.asset.model.mdx.model.kaitai.W3Mdx.Error data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Error newData = new W3Mdx.Error();
      newData.setRest(data.rest());
      newData.setMore(data.more());
      return newData;
    }
  }

  public static class kaitaiToKttrChunkMapper {
    public static W3Mdx.KttrChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KttrChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KttrChunk newData = new W3Mdx.KttrChunk();
      newData.setTargetTranslation(data.targetTranslation());
      return newData;
    }
  }

  public static class kaitaiToChunkPivtMapper {
    public static W3Mdx.ChunkPivt map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkPivt data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkPivt newData = new W3Mdx.ChunkPivt();
      newData.setPoint(data.point().stream().map(kaitaiToF43Mapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToKppsChunkMapper {
    public static W3Mdx.KppsChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KppsChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KppsChunk newData = new W3Mdx.KppsChunk();
      newData.setSpeed(data.speed());
      return newData;
    }
  }

  public static class kaitaiToKrcoChunkMapper {
    public static W3Mdx.KrcoChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KrcoChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KrcoChunk newData = new W3Mdx.KrcoChunk();
      newData.setColor(data.color());
      return newData;
    }
  }

  public static class kaitaiToSegmentColorMapper {
    public static W3Mdx.SegmentColor map(w3.asset.model.mdx.model.kaitai.W3Mdx.SegmentColor data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.SegmentColor newData = new W3Mdx.SegmentColor();
      newData.setColor1(data.color1());
      newData.setColor2(data.color2());
      newData.setColor3(data.color3());
      return newData;
    }
  }

  public static class kaitaiToNodeTrackRouterMapper {
    public static W3Mdx.NodeTrackRouter map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.NodeTrackRouter data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.NodeTrackRouter newData = new W3Mdx.NodeTrackRouter();
      newData.setMagic(kaitaiToW3idMapper.map(data.magic()));
      try {
        newData.setChunk(Class.forName(kaitaiToW3MdxMapper.class.getTypeName() + "$kaitaiTo" + data.chunk().getClass().getSimpleName() + "Mapper").getMethod("map", data.chunk().getClass()).invoke(null, data.chunk()));
      } catch (Exception e) {
        throw new AssertionError(e);
      }
      return newData;
    }
  }

  public static class kaitaiToTextureCoordinateSetMapper {
    public static W3Mdx.TextureCoordinateSet map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.TextureCoordinateSet data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.TextureCoordinateSet newData = new W3Mdx.TextureCoordinateSet();
      newData.setMagic(kaitaiToW3idMapper.map(data.magic()));
      newData.setTextureCoordinate(data.textureCoordinate().stream().map(kaitaiToTextureCoordinateMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToKfc3ChunkMapper {
    public static W3Mdx.Kfc3Chunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.Kfc3Chunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Kfc3Chunk newData = new W3Mdx.Kfc3Chunk();
      newData.setFresnelColor(data.fresnelColor());
      return newData;
    }
  }

  public static class kaitaiToTangentMapper {
    public static W3Mdx.Tangent map(w3.asset.model.mdx.model.kaitai.W3Mdx.Tangent data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Tangent newData = new W3Mdx.Tangent();
      newData.setValue(data.value());
      return newData;
    }
  }

  public static class kaitaiToKgrtChunkMapper {
    public static W3Mdx.KgrtChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KgrtChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KgrtChunk newData = new W3Mdx.KgrtChunk();
      newData.setValue(kaitaiToTrackChunkMapper.map(data.value()));
      return newData;
    }
  }

  public static class kaitaiToLayerMapper {
    public static W3Mdx.Layer map(w3.asset.model.mdx.model.kaitai.W3Mdx.Layer data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Layer newData = new W3Mdx.Layer();
      newData.setInclusiveSize(data.inclusiveSize());
      newData.setLayerPayload(kaitaiToLayerPayloadMapper.map(data.layerPayload()));
      newData.setIndex(data.index());
      return newData;
    }
  }

  public static class kaitaiToLightTrackChunkRouterMapper {
    public static W3Mdx.LightTrackChunkRouter map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.LightTrackChunkRouter data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.LightTrackChunkRouter newData = new W3Mdx.LightTrackChunkRouter();
      newData.setMagic(kaitaiToW3idMapper.map(data.magic()));
      try {
        newData.setChunk(Class.forName(kaitaiToW3MdxMapper.class.getTypeName() + "$kaitaiTo" + data.chunk().getClass().getSimpleName() + "Mapper").getMethod("map", data.chunk().getClass()).invoke(null, data.chunk()));
      } catch (Exception e) {
        throw new AssertionError(e);
      }
      return newData;
    }
  }

  public static class kaitaiToParticleEmitterMapper {
    public static W3Mdx.ParticleEmitter map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.ParticleEmitter data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ParticleEmitter newData = new W3Mdx.ParticleEmitter();
      newData.setInclusiveSize(data.inclusiveSize());
      newData.setNode(kaitaiToNodeMapper.map(data.node()));
      newData.setEmissionRate(data.emissionRate());
      newData.setGravity(data.gravity());
      newData.setLongitude(data.longitude());
      newData.setLatitude(data.latitude());
      newData.setSpawnModelFileName(data.spawnModelFileName());
      newData.setLifespan(data.lifespan());
      newData.setInitialVelocity(data.initialVelocity());
      newData.setKpeeChunk(kaitaiToKpeeChunkMapper.map(data.kpeeChunk()));
      newData.setKpegChunk(kaitaiToKpegChunkMapper.map(data.kpegChunk()));
      newData.setKplnChunk(kaitaiToKplnChunkMapper.map(data.kplnChunk()));
      newData.setKpltChunk(kaitaiToKpltChunkMapper.map(data.kpltChunk()));
      newData.setKpelChunk(kaitaiToKpelChunkMapper.map(data.kpelChunk()));
      newData.setKpesChunk(kaitaiToKpesChunkMapper.map(data.kpesChunk()));
      newData.setKpevChunk(kaitaiToKpevChunkMapper.map(data.kpevChunk()));
      return newData;
    }
  }

  public static class kaitaiToF44Mapper {
    public static W3Mdx.F44 map(w3.asset.model.mdx.model.kaitai.W3Mdx.F44 data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.F44 newData = new W3Mdx.F44();
      newData.setValue(data.value());
      return newData;
    }
  }

  public static class kaitaiToGeosetMapper {
    public static W3Mdx.Geoset map(w3.asset.model.mdx.model.kaitai.W3Mdx.Geoset data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Geoset newData = new W3Mdx.Geoset();
      newData.setInclusiveSize(data.inclusiveSize());
      newData.setGeosetPayload(kaitaiToGeosetPayloadMapper.map(data.geosetPayload()));
      return newData;
    }
  }

  public static class kaitaiToTexsTexMapper {
    public static W3Mdx.TexsTex map(w3.asset.model.mdx.model.kaitai.W3Mdx.TexsTex data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.TexsTex newData = new W3Mdx.TexsTex();
      newData.setId(data.id());
      newData.setPath(data.path());
      newData.setFlags(data.flags());
      return newData;
    }
  }

  public static class kaitaiToKgaoChunkMapper {
    public static W3Mdx.KgaoChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KgaoChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KgaoChunk newData = new W3Mdx.KgaoChunk();
      newData.setValue(kaitaiToTrackChunkMapper.map(data.value()));
      return newData;
    }
  }

  public static class kaitaiToKppeChunkMapper {
    public static W3Mdx.KppeChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KppeChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KppeChunk newData = new W3Mdx.KppeChunk();
      newData.setEmissionRate(data.emissionRate());
      return newData;
    }
  }

  public static class kaitaiToCornEmitterMapper {
    public static W3Mdx.CornEmitter map(w3.asset.model.mdx.model.kaitai.W3Mdx.CornEmitter data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.CornEmitter newData = new W3Mdx.CornEmitter();
      newData.setInclusiveSize(data.inclusiveSize());
      newData.setNode(kaitaiToNodeMapper.map(data.node()));
      newData.setLifespan(data.lifespan());
      newData.setEmissionRate(data.emissionRate());
      newData.setSpeed(data.speed());
      newData.setColor1(data.color1());
      newData.setColor2(data.color2());
      newData.setColor3(data.color3());
      newData.setColor4(data.color4());
      newData.setReplaceableId(data.replaceableId());
      newData.setPath(data.path());
      newData.setFlags(data.flags());
      newData.setKppaChunk(kaitaiToKppaChunkMapper.map(data.kppaChunk()));
      newData.setKppcChunk(kaitaiToKppcChunkMapper.map(data.kppcChunk()));
      newData.setKppeChunk(kaitaiToKppeChunkMapper.map(data.kppeChunk()));
      newData.setKpplChunk(kaitaiToKpplChunkMapper.map(data.kpplChunk()));
      newData.setKppsChunk(kaitaiToKppsChunkMapper.map(data.kppsChunk()));
      newData.setKppvChunk(kaitaiToKppvChunkMapper.map(data.kppvChunk()));
      return newData;
    }
  }

  public static class kaitaiToKmtaChunkMapper {
    public static W3Mdx.KmtaChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KmtaChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KmtaChunk newData = new W3Mdx.KmtaChunk();
      newData.setValue(kaitaiToTrackChunkMapper.map(data.value()));
      return newData;
    }
  }

  public static class kaitaiToLayerPayloadMapper {
    public static W3Mdx.LayerPayload map(w3.asset.model.mdx.model.kaitai.W3Mdx.LayerPayload data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.LayerPayload newData = new W3Mdx.LayerPayload();
      newData.setFilterMode(data.filterMode());
      newData.setShadingFlags(data.shadingFlags());
      newData.setTextureId(data.textureId());
      newData.setTextureAnimId(data.textureAnimId());
      newData.setTextureCoordId(data.textureCoordId());
      newData.setAlpha(data.alpha());
      newData.setEmissiveGain(data.emissiveGain());
      newData.setFresnelColor(data.fresnelColor());
      newData.setFresnelOpacity(data.fresnelOpacity());
      newData.setFresnelTeamColor(data.fresnelTeamColor());
      newData.setHd(data.hd());
      newData.setTexElement(data.texElement().stream().map(kaitaiToTexElementMapper::map).collect(Collectors.toList()));
      newData.setIndex(data.index());
      return newData;
    }
  }

  public static class kaitaiToKtasChunkMapper {
    public static W3Mdx.KtasChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KtasChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KtasChunk newData = new W3Mdx.KtasChunk();
      newData.setScaling(data.scaling());
      return newData;
    }
  }

  public static class kaitaiToChunkPre2Mapper {
    public static W3Mdx.ChunkPre2 map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkPre2 data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkPre2 newData = new W3Mdx.ChunkPre2();
      newData.setParticleEmitter2(data.particleEmitter2().stream().map(kaitaiToParticleEmitter2Mapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToGeosetAnimMapper {
    public static W3Mdx.GeosetAnim map(w3.asset.model.mdx.model.kaitai.W3Mdx.GeosetAnim data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.GeosetAnim newData = new W3Mdx.GeosetAnim();
      newData.setInclusiveSize(data.inclusiveSize());
      newData.setGeosetAnimPayload(kaitaiToGeosetAnimPayloadMapper.map(data.geosetAnimPayload()));
      return newData;
    }
  }

  public static class kaitaiToChunkLiteMapper {
    public static W3Mdx.ChunkLite map(w3.asset.model.mdx.model.kaitai.W3Mdx.ChunkLite data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.ChunkLite newData = new W3Mdx.ChunkLite();
      newData.setLight(data.light().stream().map(kaitaiToLightMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToKpeeChunkMapper {
    public static W3Mdx.KpeeChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KpeeChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KpeeChunk newData = new W3Mdx.KpeeChunk();
      newData.setEmissionRate(data.emissionRate());
      return newData;
    }
  }

  public static class kaitaiToGeosetAnimPayloadMapper {
    public static W3Mdx.GeosetAnimPayload map(
        w3.asset.model.mdx.model.kaitai.W3Mdx.GeosetAnimPayload data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.GeosetAnimPayload newData = new W3Mdx.GeosetAnimPayload();
      newData.setAlpha(data.alpha());
      newData.setFlags(data.flags());
      newData.setColor1(data.color1());
      newData.setColor2(data.color2());
      newData.setColor3(data.color3());
      newData.setGeosetId(data.geosetId());
      newData.setTrackChunk(data.trackChunk().stream().map(kaitaiToGeosetAnimTrackChunkRouterMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToKplnChunkMapper {
    public static W3Mdx.KplnChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KplnChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KplnChunk newData = new W3Mdx.KplnChunk();
      newData.setLongitude(data.longitude());
      return newData;
    }
  }

  public static class kaitaiToKcrlChunkMapper {
    public static W3Mdx.KcrlChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KcrlChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KcrlChunk newData = new W3Mdx.KcrlChunk();
      newData.setRotation(data.rotation());
      return newData;
    }
  }

  public static class kaitaiToBoneMapper {
    public static W3Mdx.Bone map(w3.asset.model.mdx.model.kaitai.W3Mdx.Bone data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Bone newData = new W3Mdx.Bone();
      newData.setNode(kaitaiToNodeMapper.map(data.node()));
      newData.setGeosetId(data.geosetId());
      newData.setGeosetAnimId(data.geosetAnimId());
      return newData;
    }
  }

  public static class kaitaiToKlbcChunkMapper {
    public static W3Mdx.KlbcChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KlbcChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KlbcChunk newData = new W3Mdx.KlbcChunk();
      newData.setAmbientColor(data.ambientColor());
      return newData;
    }
  }

  public static class kaitaiToKp2wChunkMapper {
    public static W3Mdx.Kp2wChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.Kp2wChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.Kp2wChunk newData = new W3Mdx.Kp2wChunk();
      newData.setWidth(data.width());
      return newData;
    }
  }

  public static class kaitaiToKgacChunkMapper {
    public static W3Mdx.KgacChunk map(w3.asset.model.mdx.model.kaitai.W3Mdx.KgacChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mdx.KgacChunk newData = new W3Mdx.KgacChunk();
      newData.setValue(kaitaiToTrackChunkMapper.map(data.value()));
      return newData;
    }
  }
}
