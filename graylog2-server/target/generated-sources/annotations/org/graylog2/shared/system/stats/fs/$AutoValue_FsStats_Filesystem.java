
package org.graylog2.shared.system.stats.fs;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_FsStats_Filesystem extends FsStats.Filesystem {

  private final String path;
  private final String mount;
  private final String dev;
  private final long total;
  private final long free;
  private final long available;
  private final long used;
  private final short usedPercent;
  private final long inodesTotal;
  private final long inodesFree;
  private final long inodesUsed;
  private final short inodesUsedPercent;
  private final long diskReads;
  private final long diskWrites;
  private final long diskReadBytes;
  private final long diskWriteBytes;
  private final double diskQueue;
  private final double diskServiceTime;

  $AutoValue_FsStats_Filesystem(
      String path,
      @Nullable String mount,
      @Nullable String dev,
      long total,
      long free,
      long available,
      long used,
      short usedPercent,
      long inodesTotal,
      long inodesFree,
      long inodesUsed,
      short inodesUsedPercent,
      long diskReads,
      long diskWrites,
      long diskReadBytes,
      long diskWriteBytes,
      double diskQueue,
      double diskServiceTime) {
    if (path == null) {
      throw new NullPointerException("Null path");
    }
    this.path = path;
    this.mount = mount;
    this.dev = dev;
    this.total = total;
    this.free = free;
    this.available = available;
    this.used = used;
    this.usedPercent = usedPercent;
    this.inodesTotal = inodesTotal;
    this.inodesFree = inodesFree;
    this.inodesUsed = inodesUsed;
    this.inodesUsedPercent = inodesUsedPercent;
    this.diskReads = diskReads;
    this.diskWrites = diskWrites;
    this.diskReadBytes = diskReadBytes;
    this.diskWriteBytes = diskWriteBytes;
    this.diskQueue = diskQueue;
    this.diskServiceTime = diskServiceTime;
  }

  @JsonProperty
  @Override
  public String path() {
    return path;
  }

  @JsonProperty
  @Nullable
  @Override
  public String mount() {
    return mount;
  }

  @JsonProperty
  @Nullable
  @Override
  public String dev() {
    return dev;
  }

  @JsonProperty
  @Override
  public long total() {
    return total;
  }

  @JsonProperty
  @Override
  public long free() {
    return free;
  }

  @JsonProperty
  @Override
  public long available() {
    return available;
  }

  @JsonProperty
  @Override
  public long used() {
    return used;
  }

  @JsonProperty
  @Override
  public short usedPercent() {
    return usedPercent;
  }

  @JsonProperty
  @Override
  public long inodesTotal() {
    return inodesTotal;
  }

  @JsonProperty
  @Override
  public long inodesFree() {
    return inodesFree;
  }

  @JsonProperty
  @Override
  public long inodesUsed() {
    return inodesUsed;
  }

  @JsonProperty
  @Override
  public short inodesUsedPercent() {
    return inodesUsedPercent;
  }

  @JsonProperty
  @Override
  public long diskReads() {
    return diskReads;
  }

  @JsonProperty
  @Override
  public long diskWrites() {
    return diskWrites;
  }

  @JsonProperty
  @Override
  public long diskReadBytes() {
    return diskReadBytes;
  }

  @JsonProperty
  @Override
  public long diskWriteBytes() {
    return diskWriteBytes;
  }

  @JsonProperty
  @Override
  public double diskQueue() {
    return diskQueue;
  }

  @JsonProperty
  @Override
  public double diskServiceTime() {
    return diskServiceTime;
  }

  @Override
  public String toString() {
    return "Filesystem{"
        + "path=" + path + ", "
        + "mount=" + mount + ", "
        + "dev=" + dev + ", "
        + "total=" + total + ", "
        + "free=" + free + ", "
        + "available=" + available + ", "
        + "used=" + used + ", "
        + "usedPercent=" + usedPercent + ", "
        + "inodesTotal=" + inodesTotal + ", "
        + "inodesFree=" + inodesFree + ", "
        + "inodesUsed=" + inodesUsed + ", "
        + "inodesUsedPercent=" + inodesUsedPercent + ", "
        + "diskReads=" + diskReads + ", "
        + "diskWrites=" + diskWrites + ", "
        + "diskReadBytes=" + diskReadBytes + ", "
        + "diskWriteBytes=" + diskWriteBytes + ", "
        + "diskQueue=" + diskQueue + ", "
        + "diskServiceTime=" + diskServiceTime
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FsStats.Filesystem) {
      FsStats.Filesystem that = (FsStats.Filesystem) o;
      return (this.path.equals(that.path()))
           && ((this.mount == null) ? (that.mount() == null) : this.mount.equals(that.mount()))
           && ((this.dev == null) ? (that.dev() == null) : this.dev.equals(that.dev()))
           && (this.total == that.total())
           && (this.free == that.free())
           && (this.available == that.available())
           && (this.used == that.used())
           && (this.usedPercent == that.usedPercent())
           && (this.inodesTotal == that.inodesTotal())
           && (this.inodesFree == that.inodesFree())
           && (this.inodesUsed == that.inodesUsed())
           && (this.inodesUsedPercent == that.inodesUsedPercent())
           && (this.diskReads == that.diskReads())
           && (this.diskWrites == that.diskWrites())
           && (this.diskReadBytes == that.diskReadBytes())
           && (this.diskWriteBytes == that.diskWriteBytes())
           && (Double.doubleToLongBits(this.diskQueue) == Double.doubleToLongBits(that.diskQueue()))
           && (Double.doubleToLongBits(this.diskServiceTime) == Double.doubleToLongBits(that.diskServiceTime()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.path.hashCode();
    h *= 1000003;
    h ^= (mount == null) ? 0 : this.mount.hashCode();
    h *= 1000003;
    h ^= (dev == null) ? 0 : this.dev.hashCode();
    h *= 1000003;
    h ^= (this.total >>> 32) ^ this.total;
    h *= 1000003;
    h ^= (this.free >>> 32) ^ this.free;
    h *= 1000003;
    h ^= (this.available >>> 32) ^ this.available;
    h *= 1000003;
    h ^= (this.used >>> 32) ^ this.used;
    h *= 1000003;
    h ^= this.usedPercent;
    h *= 1000003;
    h ^= (this.inodesTotal >>> 32) ^ this.inodesTotal;
    h *= 1000003;
    h ^= (this.inodesFree >>> 32) ^ this.inodesFree;
    h *= 1000003;
    h ^= (this.inodesUsed >>> 32) ^ this.inodesUsed;
    h *= 1000003;
    h ^= this.inodesUsedPercent;
    h *= 1000003;
    h ^= (this.diskReads >>> 32) ^ this.diskReads;
    h *= 1000003;
    h ^= (this.diskWrites >>> 32) ^ this.diskWrites;
    h *= 1000003;
    h ^= (this.diskReadBytes >>> 32) ^ this.diskReadBytes;
    h *= 1000003;
    h ^= (this.diskWriteBytes >>> 32) ^ this.diskWriteBytes;
    h *= 1000003;
    h ^= (Double.doubleToLongBits(this.diskQueue) >>> 32) ^ Double.doubleToLongBits(this.diskQueue);
    h *= 1000003;
    h ^= (Double.doubleToLongBits(this.diskServiceTime) >>> 32) ^ Double.doubleToLongBits(this.diskServiceTime);
    return h;
  }

}
