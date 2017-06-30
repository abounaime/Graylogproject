package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_DatabaseStats_DataFileVersion extends $AutoValue_DatabaseStats_DataFileVersion {
  AutoValue_DatabaseStats_DataFileVersion(int major, int minor) {
    super(major, minor);
  }

  @JsonIgnore
  public final int getMajor() {
    return major();
  }

  @JsonIgnore
  public final int getMinor() {
    return minor();
  }
}
