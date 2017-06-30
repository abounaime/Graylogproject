package org.graylog2.rest.models.system.outputs.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

final class AutoValue_OutputSummary extends $AutoValue_OutputSummary {
  AutoValue_OutputSummary(String id, String title, String type, String creatorUserId,
      DateTime createdAt, Map<String, Object> configuration, String contentPack) {
    super(id, title, type, creatorUserId, createdAt, configuration, contentPack);
  }

  @JsonIgnore
  public final String getId() {
    return id();
  }

  @JsonIgnore
  public final String getTitle() {
    return title();
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
  public final DateTime getCreatedAt() {
    return createdAt();
  }

  @JsonIgnore
  public final Map<String, Object> getConfiguration() {
    return configuration();
  }

  @JsonIgnore
  @Nullable
  public final String getContentPack() {
    return contentPack();
  }
}
