package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_HostInfo_Os extends $AutoValue_HostInfo_Os {
  AutoValue_HostInfo_Os(String type, String name, String version) {
    super(type, name, version);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final String getVersion() {
    return version();
  }
}
