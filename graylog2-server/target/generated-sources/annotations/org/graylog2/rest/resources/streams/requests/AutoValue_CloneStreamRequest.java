package org.graylog2.rest.resources.streams.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_CloneStreamRequest extends $AutoValue_CloneStreamRequest {
  AutoValue_CloneStreamRequest(String title, String description,
      boolean removeMatchesFromDefaultStream, String indexSetId) {
    super(title, description, removeMatchesFromDefaultStream, indexSetId);
  }

  @JsonIgnore
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  public final String getDescription() {
    return description();
  }

  @JsonIgnore
  public final boolean isRemoveMatchesFromDefaultStream() {
    return removeMatchesFromDefaultStream();
  }

  @JsonIgnore
  public final String getIndexSetId() {
    return indexSetId();
  }
}
