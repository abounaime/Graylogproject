package org.graylog2.rest.models.system.codecs.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;

final class AutoValue_CodecTypeInfo extends $AutoValue_CodecTypeInfo {
  AutoValue_CodecTypeInfo(String type, String name,
      Map<String, Map<String, Object>> requestedConfiguration) {
    super(type, name, requestedConfiguration);
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
  public final Map<String, Map<String, Object>> getRequestedConfiguration() {
    return requestedConfiguration();
  }
}
