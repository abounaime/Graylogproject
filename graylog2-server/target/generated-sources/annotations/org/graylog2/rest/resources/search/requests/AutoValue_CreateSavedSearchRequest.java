package org.graylog2.rest.resources.search.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;

final class AutoValue_CreateSavedSearchRequest extends $AutoValue_CreateSavedSearchRequest {
  AutoValue_CreateSavedSearchRequest(String title, Map<String, Object> query) {
    super(title, query);
  }

  @JsonIgnore
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  public final Map<String, Object> getQuery() {
    return query();
  }
}
