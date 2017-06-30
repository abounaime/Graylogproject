package org.graylog2.rest.models.streams.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_UpdateStreamRequest extends $AutoValue_UpdateStreamRequest {
  AutoValue_UpdateStreamRequest(String title, String description, String matchingType,
      Boolean removeMatchesFromDefaultStream, String indexSetId, Boolean favoriteStream) {
    super(title, description, matchingType, removeMatchesFromDefaultStream, indexSetId, favoriteStream);
  }

  @JsonIgnore
  @Nullable
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  @Nullable
  public final String getDescription() {
    return description();
  }

  @JsonIgnore
  @Nullable
  public final String getMatchingType() {
    return matchingType();
  }

  @JsonIgnore
  @Nullable
  public final Boolean isRemoveMatchesFromDefaultStream() {
    return removeMatchesFromDefaultStream();
  }

  @JsonIgnore
  @Nullable
  public final String getIndexSetId() {
    return indexSetId();
  }

  @JsonIgnore
  public final Boolean isFavoriteStream() {
    return favoriteStream();
  }
}
