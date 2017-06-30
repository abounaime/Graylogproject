package org.graylog2.shared.system.stats.fs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;

final class AutoValue_FsStats extends $AutoValue_FsStats {
  AutoValue_FsStats(Map<String, FsStats.Filesystem> filesystems) {
    super(filesystems);
  }

  @JsonIgnore
  public final Map<String, FsStats.Filesystem> getFilesystems() {
    return filesystems();
  }
}
