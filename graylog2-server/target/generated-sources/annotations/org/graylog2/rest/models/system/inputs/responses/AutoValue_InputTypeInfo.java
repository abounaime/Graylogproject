package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;

final class AutoValue_InputTypeInfo extends $AutoValue_InputTypeInfo {
  AutoValue_InputTypeInfo(String type, String name, boolean isExclusive,
      Map<String, Map<String, Object>> requestedConfiguration, String linkToDocs) {
    super(type, name, isExclusive, requestedConfiguration, linkToDocs);
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
  public final boolean isIsExclusive() {
    return isExclusive();
  }

  @JsonIgnore
  public final Map<String, Map<String, Object>> getRequestedConfiguration() {
    return requestedConfiguration();
  }

  @JsonIgnore
  public final String getLinkToDocs() {
    return linkToDocs();
  }
}
