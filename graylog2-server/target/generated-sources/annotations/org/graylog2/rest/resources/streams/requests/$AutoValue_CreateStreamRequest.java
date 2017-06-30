
package org.graylog2.rest.resources.streams.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.graylog2.plugin.streams.Stream;
import org.graylog2.rest.resources.streams.rules.requests.CreateStreamRuleRequest;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CreateStreamRequest extends CreateStreamRequest {

  private final String title;
  private final String description;
  private final List<CreateStreamRuleRequest> rules;
  private final String contentPack;
  private final Stream.MatchingType matchingType;
  private final boolean removeMatchesFromDefaultStream;
  private final String indexSetId;
  private final boolean favoriteStream;

  $AutoValue_CreateStreamRequest(
      String title,
      @Nullable String description,
      @Nullable List<CreateStreamRuleRequest> rules,
      @Nullable String contentPack,
      Stream.MatchingType matchingType,
      boolean removeMatchesFromDefaultStream,
      String indexSetId,
      boolean favoriteStream) {
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    this.description = description;
    this.rules = rules;
    this.contentPack = contentPack;
    if (matchingType == null) {
      throw new NullPointerException("Null matchingType");
    }
    this.matchingType = matchingType;
    this.removeMatchesFromDefaultStream = removeMatchesFromDefaultStream;
    if (indexSetId == null) {
      throw new NullPointerException("Null indexSetId");
    }
    this.indexSetId = indexSetId;
    this.favoriteStream = favoriteStream;
  }

  @JsonProperty
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

  @JsonProperty
  @Nullable
  @Override
  public List<CreateStreamRuleRequest> rules() {
    return rules;
  }

  @JsonProperty
  @Nullable
  @Override
  public String contentPack() {
    return contentPack;
  }

  @JsonProperty
  @Override
  public Stream.MatchingType matchingType() {
    return matchingType;
  }

  @JsonProperty(value = "remove_matches_from_default_stream")
  @Override
  public boolean removeMatchesFromDefaultStream() {
    return removeMatchesFromDefaultStream;
  }

  @JsonProperty(value = "index_set_id")
  @Override
  public String indexSetId() {
    return indexSetId;
  }

  @JsonProperty(value = "favorite_stream")
  @Override
  public boolean favoriteStream() {
    return favoriteStream;
  }

  @Override
  public String toString() {
    return "CreateStreamRequest{"
        + "title=" + title + ", "
        + "description=" + description + ", "
        + "rules=" + rules + ", "
        + "contentPack=" + contentPack + ", "
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
    if (o instanceof CreateStreamRequest) {
      CreateStreamRequest that = (CreateStreamRequest) o;
      return (this.title.equals(that.title()))
           && ((this.description == null) ? (that.description() == null) : this.description.equals(that.description()))
           && ((this.rules == null) ? (that.rules() == null) : this.rules.equals(that.rules()))
           && ((this.contentPack == null) ? (that.contentPack() == null) : this.contentPack.equals(that.contentPack()))
           && (this.matchingType.equals(that.matchingType()))
           && (this.removeMatchesFromDefaultStream == that.removeMatchesFromDefaultStream())
           && (this.indexSetId.equals(that.indexSetId()))
           && (this.favoriteStream == that.favoriteStream());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= (description == null) ? 0 : this.description.hashCode();
    h *= 1000003;
    h ^= (rules == null) ? 0 : this.rules.hashCode();
    h *= 1000003;
    h ^= (contentPack == null) ? 0 : this.contentPack.hashCode();
    h *= 1000003;
    h ^= this.matchingType.hashCode();
    h *= 1000003;
    h ^= this.removeMatchesFromDefaultStream ? 1231 : 1237;
    h *= 1000003;
    h ^= this.indexSetId.hashCode();
    h *= 1000003;
    h ^= this.favoriteStream ? 1231 : 1237;
    return h;
  }

}
