package org.graylog2.shared.system.stats.fs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_FsStats_Filesystem extends $AutoValue_FsStats_Filesystem {
  AutoValue_FsStats_Filesystem(String path, String mount, String dev, long total, long free,
      long available, long used, short usedPercent, long inodesTotal, long inodesFree,
      long inodesUsed, short inodesUsedPercent, long diskReads, long diskWrites, long diskReadBytes,
      long diskWriteBytes, double diskQueue, double diskServiceTime) {
    super(path, mount, dev, total, free, available, used, usedPercent, inodesTotal, inodesFree, inodesUsed, inodesUsedPercent, diskReads, diskWrites, diskReadBytes, diskWriteBytes, diskQueue, diskServiceTime);
  }

  @JsonIgnore
  public final String getPath() {
    return path();
  }

  @JsonIgnore
  @Nullable
  public final String getMount() {
    return mount();
  }

  @JsonIgnore
  @Nullable
  public final String getDev() {
    return dev();
  }

  @JsonIgnore
  public final long getTotal() {
    return total();
  }

  @JsonIgnore
  public final long getFree() {
    return free();
  }

  @JsonIgnore
  public final long getAvailable() {
    return available();
  }

  @JsonIgnore
  public final long getUsed() {
    return used();
  }

  @JsonIgnore
  public final short getUsedPercent() {
    return usedPercent();
  }

  @JsonIgnore
  public final long getInodesTotal() {
    return inodesTotal();
  }

  @JsonIgnore
  public final long getInodesFree() {
    return inodesFree();
  }

  @JsonIgnore
  public final long getInodesUsed() {
    return inodesUsed();
  }

  @JsonIgnore
  public final short getInodesUsedPercent() {
    return inodesUsedPercent();
  }

  @JsonIgnore
  public final long getDiskReads() {
    return diskReads();
  }

  @JsonIgnore
  public final long getDiskWrites() {
    return diskWrites();
  }

  @JsonIgnore
  public final long getDiskReadBytes() {
    return diskReadBytes();
  }

  @JsonIgnore
  public final long getDiskWriteBytes() {
    return diskWriteBytes();
  }

  @JsonIgnore
  public final double getDiskQueue() {
    return diskQueue();
  }

  @JsonIgnore
  public final double getDiskServiceTime() {
    return diskServiceTime();
  }
}
