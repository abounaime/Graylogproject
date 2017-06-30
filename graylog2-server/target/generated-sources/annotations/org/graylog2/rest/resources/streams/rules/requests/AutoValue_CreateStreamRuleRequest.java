package org.graylog2.rest.resources.streams.rules.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_CreateStreamRuleRequest extends $AutoValue_CreateStreamRuleRequest {
  AutoValue_CreateStreamRuleRequest(int type, String value, String field, boolean inverted,
      String description) {
    super(type, value, field, inverted, description);
  }

  @JsonIgnore
  public final int getType() {
    return type();
  }

  @JsonIgnore
  public final String getValue() {
    return value();
  }

  @JsonIgnore
  public final String getField() {
    return field();
  }

  @JsonIgnore
  public final boolean isInverted() {
    return inverted();
  }

  @JsonIgnore
  @Nullable
  public final String getDescription() {
    return description();
  }
}
