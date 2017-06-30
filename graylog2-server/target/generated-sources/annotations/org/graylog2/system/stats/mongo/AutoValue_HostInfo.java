package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_HostInfo extends $AutoValue_HostInfo {
  AutoValue_HostInfo(HostInfo.System system, HostInfo.Os os, HostInfo.Extra extra) {
    super(system, os, extra);
  }

  @JsonIgnore
  public final HostInfo.System getSystem() {
    return system();
  }

  @JsonIgnore
  public final HostInfo.Os getOs() {
    return os();
  }

  @JsonIgnore
  public final HostInfo.Extra getExtra() {
    return extra();
  }
}
