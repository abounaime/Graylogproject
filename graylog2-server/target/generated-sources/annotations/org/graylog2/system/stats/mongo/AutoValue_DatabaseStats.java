package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_DatabaseStats extends $AutoValue_DatabaseStats {
  AutoValue_DatabaseStats(String db, long collections, long objects, double avgObjSize,
      long dataSize, long storageSize, long numExtents, long indexes, long indexSize, Long fileSize,
      Long nsSizeMB, DatabaseStats.ExtentFreeList extentFreeList,
      DatabaseStats.DataFileVersion dataFileVersion) {
    super(db, collections, objects, avgObjSize, dataSize, storageSize, numExtents, indexes, indexSize, fileSize, nsSizeMB, extentFreeList, dataFileVersion);
  }

  @JsonIgnore
  public final String getDb() {
    return db();
  }

  @JsonIgnore
  public final long getCollections() {
    return collections();
  }

  @JsonIgnore
  public final long getObjects() {
    return objects();
  }

  @JsonIgnore
  public final double getAvgObjSize() {
    return avgObjSize();
  }

  @JsonIgnore
  public final long getDataSize() {
    return dataSize();
  }

  @JsonIgnore
  public final long getStorageSize() {
    return storageSize();
  }

  @JsonIgnore
  public final long getNumExtents() {
    return numExtents();
  }

  @JsonIgnore
  public final long getIndexes() {
    return indexes();
  }

  @JsonIgnore
  public final long getIndexSize() {
    return indexSize();
  }

  @JsonIgnore
  @Nullable
  public final Long getFileSize() {
    return fileSize();
  }

  @JsonIgnore
  @Nullable
  public final Long getNsSizeMB() {
    return nsSizeMB();
  }

  @JsonIgnore
  @Nullable
  public final DatabaseStats.ExtentFreeList getExtentFreeList() {
    return extentFreeList();
  }

  @JsonIgnore
  @Nullable
  public final DatabaseStats.DataFileVersion getDataFileVersion() {
    return dataFileVersion();
  }
}
