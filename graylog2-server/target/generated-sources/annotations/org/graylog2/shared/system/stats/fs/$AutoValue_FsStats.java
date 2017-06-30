
package org.graylog2.shared.system.stats.fs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_FsStats extends FsStats {

  private final Map<String, FsStats.Filesystem> filesystems;

  $AutoValue_FsStats(
      Map<String, FsStats.Filesystem> filesystems) {
    if (filesystems == null) {
      throw new NullPointerException("Null filesystems");
    }
    this.filesystems = filesystems;
  }

  @JsonProperty
  @Override
  public Map<String, FsStats.Filesystem> filesystems() {
    return filesystems;
  }

  @Override
  public String toString() {
    return "FsStats{"
        + "filesystems=" + filesystems
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FsStats) {
      FsStats that = (FsStats) o;
      return (this.filesystems.equals(that.filesystems()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.filesystems.hashCode();
    return h;
  }

}
