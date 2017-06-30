package org.graylog2.system.stats.elasticsearch;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_IndicesStats extends $AutoValue_IndicesStats {
  AutoValue_IndicesStats(int indexCount, long storeSize, long fieldDataSize, long idCacheSize) {
    super(indexCount, storeSize, fieldDataSize, idCacheSize);
  }

  @JsonIgnore
  public final int getIndexCount() {
    return indexCount();
  }

  @JsonIgnore
  public final long getStoreSize() {
    return storeSize();
  }

  @JsonIgnore
  public final long getFieldDataSize() {
    return fieldDataSize();
  }

  @JsonIgnore
  public final long getIdCacheSize() {
    return idCacheSize();
  }
}
