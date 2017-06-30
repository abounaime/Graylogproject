
package org.graylog2.rest.models.streams.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_UpdateStreamRequest extends UpdateStreamRequest {

  private final String title;
  private final String description;
  private final String matchingType;
  private final Boolean removeMatchesFromDefaultStream;
  private final String indexSetId;
  private final Boolean favoriteStream;

  $AutoValue_UpdateStreamRequest(
      @Nullable String title,
      @Nullable String description,
      @Nullable String matchingType,
      @Nullable Boolean removeMatchesFromDefaultStream,
      @Nullable String indexSetId,
      Boolean favoriteStream) {
    this.title = title;
    this.description = description;
    this.matchingType = matchingType;
    this.removeMatchesFromDefaultStream = removeMatchesFromDefaultStream;
    this.indexSetId = indexSetId;
    if (favoriteStream == null) {
      throw new NullPointerException("Null favoriteStream");
    }
    this.favoriteStream = favoriteStream;
  }

  @JsonProperty
  @Nullable
  @Override
  public String title() {
    return title;
  }

  @JsonProperty
  @Nullable
  @Override
  public String description() {
    return description;
  }

  @JsonProperty(value = "matching_type")
  @Nullable
  @Override
  public String matchingType() {
    return matchingType;
  }

  @JsonProperty(value = "remove_matches_from_default_stream")
  @Nullable
  @Override
  public Boolean removeMatchesFromDefaultStream() {
    return removeMatchesFromDefaultStream;
  }

  @JsonProperty(value = "index_set_id")
  @Nullable
  @Override
  public String indexSetId() {
    return indexSetId;
  }

  @JsonProperty(value = "isFavoriteStream")
  @Override
  public Boolean favoriteStream() {
    return favoriteStream;
  }

  @Override
  public String toString() {
    return "UpdateStreamRequest{"
        + "title=" + title + ", "
        + "description=" + description + ", "
        + "matchingType=" + matchingType + ", "
        + "removeMatchesFromDefaultStream=" + removeMatchesFromDefaultStream + ", "
        + "indexSetId=" + indexSetId + ", "
        + "favoriteStream=" + favoriteStream
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UpdateStreamRequest) {
      UpdateStreamRequest that = (UpdateStreamRequest) o;
      return ((this.title == null) ? (that.title() == null) : this.title.equals(that.title()))
           && ((this.description == null) ? (that.description() == null) : this.description.equals(that.description()))
           && ((this.matchingType == null) ? (that.matchingType() == null) : this.matchingType.equals(that.matchingType()))
           && ((this.removeMatchesFromDefaultStream == null) ? (that.removeMatchesFromDefaultStream() == null) : this.removeMatchesFromDefaultStream.equals(that.removeMatchesFromDefaultStream()))
           && ((this.indexSetId == null) ? (that.indexSetId() == null) : this.indexSetId.equals(that.indexSetId()))
           && (this.favoriteStream.equals(that.favoriteStream()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (title == null) ? 0 : this.title.hashCode();
    h *= 1000003;
    h ^= (description == null) ? 0 : this.description.hashCode();
    h *= 1000003;
    h ^= (matchingType == null) ? 0 : this.matchingType.hashCode();
    h *= 1000003;
    h ^= (removeMatchesFromDefaultStream == null) ? 0 : this.removeMatchesFromDefaultStream.hashCode();
    h *= 1000003;
    h ^= (indexSetId == null) ? 0 : this.indexSetId.hashCode();
    h *= 1000003;
    h ^= this.favoriteStream.hashCode();
    return h;
  }

}
