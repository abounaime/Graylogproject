package org.graylog2.rest.models.system.inputs.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_CreateStaticFieldRequest extends $AutoValue_CreateStaticFieldRequest {
  AutoValue_CreateStaticFieldRequest(String key, String value) {
    super(key, value);
  }

  @JsonIgnore
  public final String getKey() {
    return key();
  }

  @JsonIgnore
  public final String getValue() {
    return value();
  }
}
