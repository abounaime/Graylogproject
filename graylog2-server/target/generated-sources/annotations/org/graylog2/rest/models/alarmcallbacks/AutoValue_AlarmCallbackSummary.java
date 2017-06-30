package org.graylog2.rest.models.alarmcallbacks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Date;
import java.util.Map;
import javax.annotation.Nullable;

final class AutoValue_AlarmCallbackSummary extends $AutoValue_AlarmCallbackSummary {
  AutoValue_AlarmCallbackSummary(String id, String streamId, String type, String title,
      Map<String, Object> configuration, Date createdAt, String creatorUserId) {
    super(id, streamId, type, title, configuration, createdAt, creatorUserId);
  }

  @JsonIgnore
  public final String getId() {
    return id();
  }

  @JsonIgnore
  public final String getStreamId() {
    return streamId();
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  @Nullable
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  public final Map<String, Object> getConfiguration() {
    return configuration();
  }

  @JsonIgnore
  public final Date getCreatedAt() {
    return createdAt();
  }

  @JsonIgnore
  public final String getCreatorUserId() {
    return creatorUserId();
  }
}
