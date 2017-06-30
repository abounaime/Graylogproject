package org.graylog2.rest.models.streams.outputs.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

final class AutoValue_CreateOutputRequest extends $AutoValue_CreateOutputRequest {
  AutoValue_CreateOutputRequest(String title, String type, Map<String, Object> configuration,
      Set<String> streams, String contentPack) {
    super(title, type, configuration, streams, contentPack);
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
  public final Map<String, Object> getConfiguration() {
    return configuration();
  }

  @JsonIgnore
  @Nullable
  public final Set<String> getStreams() {
    return streams();
  }

  @JsonIgnore
  @Nullable
  public final String getContentPack() {
    return contentPack();
  }
}
