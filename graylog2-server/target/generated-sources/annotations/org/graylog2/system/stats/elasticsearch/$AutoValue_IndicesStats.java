
package org.graylog2.system.stats.elasticsearch;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndicesStats extends IndicesStats {

  private final int indexCount;
  private final long storeSize;
  private final long fieldDataSize;
  private final long idCacheSize;

  $AutoValue_IndicesStats(
      int indexCount,
      long storeSize,
      long fieldDataSize,
      long idCacheSize) {
    this.indexCount = indexCount;
    this.storeSize = storeSize;
    this.fieldDataSize = fieldDataSize;
    this.idCacheSize = idCacheSize;
  }

  @JsonProperty
  @Override
  public int indexCount() {
    return indexCount;
  }

  @JsonProperty
  @Override
  public long storeSize() {
    return storeSize;
  }

  @JsonProperty
  @Override
  public long fieldDataSize() {
    return fieldDataSize;
  }

  @JsonProperty
  @Override
  public long idCacheSize() {
    return idCacheSize;
  }

  @Override
  public String toString() {
    return "IndicesStats{"
        + "indexCount=" + indexCount + ", "
        + "storeSize=" + storeSize + ", "
        + "fieldDataSize=" + fieldDataSize + ", "
        + "idCacheSize=" + idCacheSize
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndicesStats) {
      IndicesStats that = (IndicesStats) o;
      return (this.indexCount == that.indexCount())
           && (this.storeSize == that.storeSize())
           && (this.fieldDataSize == that.fieldDataSize())
           && (this.idCacheSize == that.idCacheSize());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.indexCount;
    h *= 1000003;
    h ^= (this.storeSize >>> 32) ^ this.storeSize;
    h *= 1000003;
    h ^= (this.fieldDataSize >>> 32) ^ this.fieldDataSize;
    h *= 1000003;
    h ^= (this.idCacheSize >>> 32) ^ this.idCacheSize;
    return h;
  }

}
