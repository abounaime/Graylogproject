package org.graylog2.rest.models.streams.alerts;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Date;
import java.util.Map;
import javax.annotation.Nullable;

final class AutoValue_AlertConditionSummary extends $AutoValue_AlertConditionSummary {
  AutoValue_AlertConditionSummary(String id, String type, String creatorUserId, Date createdAt,
      Map<String, Object> parameters, Boolean inGrace, String title) {
    super(id, type, creatorUserId, createdAt, parameters, inGrace, title);
  }

  @JsonIgnore
  public final String getId() {
    return id();
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final String getCreatorUserId() {
    return creatorUserId();
  }

  @JsonIgnore
  public final Date getCreatedAt() {
    return createdAt();
  }

  @JsonIgnore
  public final Map<String, Object> getParameters() {
    return parameters();
  }

  @JsonIgnore
  @Nullable
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public final Boolean isInGrace() {
    return inGrace();
  }

  @JsonIgnore
  @Nullable
  public final String getTitle() {
    return title();
  }
}
