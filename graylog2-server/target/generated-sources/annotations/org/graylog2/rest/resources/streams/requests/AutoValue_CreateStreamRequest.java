package org.graylog2.rest.resources.streams.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;
import org.graylog2.plugin.streams.Stream;
import org.graylog2.rest.resources.streams.rules.requests.CreateStreamRuleRequest;

final class AutoValue_CreateStreamRequest extends $AutoValue_CreateStreamRequest {
  AutoValue_CreateStreamRequest(String title, String description,
      List<CreateStreamRuleRequest> rules, String contentPack, Stream.MatchingType matchingType,
      boolean removeMatchesFromDefaultStream, String indexSetId, boolean favoriteStream) {
    super(title, description, rules, contentPack, matchingType, removeMatchesFromDefaultStream, indexSetId, favoriteStream);
  }

  @JsonIgnore
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
  public final List<CreateStreamRuleRequest> getRules() {
    return rules();
  }

  @JsonIgnore
  @Nullable
  public final String getContentPack() {
    return contentPack();
  }

  @JsonIgnore
  public final Stream.MatchingType getMatchingType() {
    return matchingType();
  }

  @JsonIgnore
  public final boolean isRemoveMatchesFromDefaultStream() {
    return removeMatchesFromDefaultStream();
  }

  @JsonIgnore
  public final String getIndexSetId() {
    return indexSetId();
  }

  @JsonIgnore
  public final boolean isFavoriteStream() {
    return favoriteStream();
  }
}
