
package org.graylog2.rest.resources.streams.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CloneStreamRequest extends CloneStreamRequest {

  private final String title;
  private final String description;
  private final boolean removeMatchesFromDefaultStream;
  private final String indexSetId;

  $AutoValue_CloneStreamRequest(
      String title,
      String description,
      boolean removeMatchesFromDefaultStream,
      String indexSetId) {
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    if (description == null) {
      throw new NullPointerException("Null description");
    }
    this.description = description;
    this.removeMatchesFromDefaultStream = removeMatchesFromDefaultStream;
    if (indexSetId == null) {
      throw new NullPointerException("Null indexSetId");
    }
    this.indexSetId = indexSetId;
  }

  @JsonProperty
  @Override
  public String title() {
    return title;
  }

  @JsonProperty
  @Override
  public String description() {
    return description;
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

  @Override
  public String toString() {
    return "CloneStreamRequest{"
        + "title=" + title + ", "
        + "description=" + description + ", "
        + "removeMatchesFromDefaultStream=" + removeMatchesFromDefaultStream + ", "
        + "indexSetId=" + indexSetId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CloneStreamRequest) {
      CloneStreamRequest that = (CloneStreamRequest) o;
      return (this.title.equals(that.title()))
           && (this.description.equals(that.description()))
           && (this.removeMatchesFromDefaultStream == that.removeMatchesFromDefaultStream())
           && (this.indexSetId.equals(that.indexSetId()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= this.description.hashCode();
    h *= 1000003;
    h ^= this.removeMatchesFromDefaultStream ? 1231 : 1237;
    h *= 1000003;
    h ^= this.indexSetId.hashCode();
    return h;
  }

}
