package org.graylog2.rest.resources.streams.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_StreamRuleTypeResponse extends $AutoValue_StreamRuleTypeResponse {
  AutoValue_StreamRuleTypeResponse(int id, String name, String shortDesc, String longDesc) {
    super(id, name, shortDesc, longDesc);
  }

  @JsonIgnore
  public final int getId() {
    return id();
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final String getShortDesc() {
    return shortDesc();
  }

  @JsonIgnore
  public final String getLongDesc() {
    return longDesc();
  }
}
