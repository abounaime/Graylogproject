
package org.graylog2.rest.resources.search.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CreateSavedSearchRequest extends CreateSavedSearchRequest {

  private final String title;
  private final Map<String, Object> query;

  $AutoValue_CreateSavedSearchRequest(
      String title,
      Map<String, Object> query) {
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    if (query == null) {
      throw new NullPointerException("Null query");
    }
    this.query = query;
  }

  @JsonProperty
  @Override
  public String title() {
    return title;
  }

  @JsonProperty
  @Override
  public Map<String, Object> query() {
    return query;
  }

  @Override
  public String toString() {
    return "CreateSavedSearchRequest{"
        + "title=" + title + ", "
        + "query=" + query
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateSavedSearchRequest) {
      CreateSavedSearchRequest that = (CreateSavedSearchRequest) o;
      return (this.title.equals(that.title()))
           && (this.query.equals(that.query()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= this.query.hashCode();
    return h;
  }

}
