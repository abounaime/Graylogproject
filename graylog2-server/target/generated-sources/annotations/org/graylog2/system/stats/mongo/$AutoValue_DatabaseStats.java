
package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_DatabaseStats extends DatabaseStats {

  private final String db;
  private final long collections;
  private final long objects;
  private final double avgObjSize;
  private final long dataSize;
  private final long storageSize;
  private final long numExtents;
  private final long indexes;
  private final long indexSize;
  private final Long fileSize;
  private final Long nsSizeMB;
  private final DatabaseStats.ExtentFreeList extentFreeList;
  private final DatabaseStats.DataFileVersion dataFileVersion;

  $AutoValue_DatabaseStats(
      String db,
      long collections,
      long objects,
      double avgObjSize,
      long dataSize,
      long storageSize,
      long numExtents,
      long indexes,
      long indexSize,
      @Nullable Long fileSize,
      @Nullable Long nsSizeMB,
      @Nullable DatabaseStats.ExtentFreeList extentFreeList,
      @Nullable DatabaseStats.DataFileVersion dataFileVersion) {
    if (db == null) {
      throw new NullPointerException("Null db");
    }
    this.db = db;
    this.collections = collections;
    this.objects = objects;
    this.avgObjSize = avgObjSize;
    this.dataSize = dataSize;
    this.storageSize = storageSize;
    this.numExtents = numExtents;
    this.indexes = indexes;
    this.indexSize = indexSize;
    this.fileSize = fileSize;
    this.nsSizeMB = nsSizeMB;
    this.extentFreeList = extentFreeList;
    this.dataFileVersion = dataFileVersion;
  }

  @JsonProperty
  @Override
  public String db() {
    return db;
  }

  @JsonProperty
  @Override
  public long collections() {
    return collections;
  }

  @JsonProperty
  @Override
  public long objects() {
    return objects;
  }

  @JsonProperty
  @Override
  public double avgObjSize() {
    return avgObjSize;
  }

  @JsonProperty
  @Override
  public long dataSize() {
    return dataSize;
  }

  @JsonProperty
  @Override
  public long storageSize() {
    return storageSize;
  }

  @JsonProperty
  @Override
  public long numExtents() {
    return numExtents;
  }

  @JsonProperty
  @Override
  public long indexes() {
    return indexes;
  }

  @JsonProperty
  @Override
  public long indexSize() {
    return indexSize;
  }

  @JsonProperty
  @Nullable
  @Override
  public Long fileSize() {
    return fileSize;
  }

  @JsonProperty
  @Nullable
  @Override
  public Long nsSizeMB() {
    return nsSizeMB;
  }

  @JsonProperty
  @Nullable
  @Override
  public DatabaseStats.ExtentFreeList extentFreeList() {
    return extentFreeList;
  }

  @JsonProperty
  @Nullable
  @Override
  public DatabaseStats.DataFileVersion dataFileVersion() {
    return dataFileVersion;
  }

  @Override
  public String toString() {
    return "DatabaseStats{"
        + "db=" + db + ", "
        + "collections=" + collections + ", "
        + "objects=" + objects + ", "
        + "avgObjSize=" + avgObjSize + ", "
        + "dataSize=" + dataSize + ", "
        + "storageSize=" + storageSize + ", "
        + "numExtents=" + numExtents + ", "
        + "indexes=" + indexes + ", "
        + "indexSize=" + indexSize + ", "
        + "fileSize=" + fileSize + ", "
        + "nsSizeMB=" + nsSizeMB + ", "
        + "extentFreeList=" + extentFreeList + ", "
        + "dataFileVersion=" + dataFileVersion
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DatabaseStats) {
      DatabaseStats that = (DatabaseStats) o;
      return (this.db.equals(that.db()))
           && (this.collections == that.collections())
           && (this.objects == that.objects())
           && (Double.doubleToLongBits(this.avgObjSize) == Double.doubleToLongBits(that.avgObjSize()))
           && (this.dataSize == that.dataSize())
           && (this.storageSize == that.storageSize())
           && (this.numExtents == that.numExtents())
           && (this.indexes == that.indexes())
           && (this.indexSize == that.indexSize())
           && ((this.fileSize == null) ? (that.fileSize() == null) : this.fileSize.equals(that.fileSize()))
           && ((this.nsSizeMB == null) ? (that.nsSizeMB() == null) : this.nsSizeMB.equals(that.nsSizeMB()))
           && ((this.extentFreeList == null) ? (that.extentFreeList() == null) : this.extentFreeList.equals(that.extentFreeList()))
           && ((this.dataFileVersion == null) ? (that.dataFileVersion() == null) : this.dataFileVersion.equals(that.dataFileVersion()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.db.hashCode();
    h *= 1000003;
    h ^= (this.collections >>> 32) ^ this.collections;
    h *= 1000003;
    h ^= (this.objects >>> 32) ^ this.objects;
    h *= 1000003;
    h ^= (Double.doubleToLongBits(this.avgObjSize) >>> 32) ^ Double.doubleToLongBits(this.avgObjSize);
    h *= 1000003;
    h ^= (this.dataSize >>> 32) ^ this.dataSize;
    h *= 1000003;
    h ^= (this.storageSize >>> 32) ^ this.storageSize;
    h *= 1000003;
    h ^= (this.numExtents >>> 32) ^ this.numExtents;
    h *= 1000003;
    h ^= (this.indexes >>> 32) ^ this.indexes;
    h *= 1000003;
    h ^= (this.indexSize >>> 32) ^ this.indexSize;
    h *= 1000003;
    h ^= (fileSize == null) ? 0 : this.fileSize.hashCode();
    h *= 1000003;
    h ^= (nsSizeMB == null) ? 0 : this.nsSizeMB.hashCode();
    h *= 1000003;
    h ^= (extentFreeList == null) ? 0 : this.extentFreeList.hashCode();
    h *= 1000003;
    h ^= (dataFileVersion == null) ? 0 : this.dataFileVersion.hashCode();
    return h;
  }

}
