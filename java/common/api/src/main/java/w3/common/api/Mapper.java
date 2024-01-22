package w3.common.api;

public interface Mapper<SourceType, TargetType> {
    TargetType map(SourceType data);
}
