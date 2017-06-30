package org.graylog2.rest.resources.search.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Set;

final class AutoValue_SearchDecorationStats extends $AutoValue_SearchDecorationStats {
  AutoValue_SearchDecorationStats(Set<String> addedFields, Set<String> changedFields,
      Set<String> removedFields) {
    super(addedFields, changedFields, removedFields);
  }

  @JsonIgnore
  @SuppressWarnings("unused")
  public final Set<String> getAddedFields() {
    return addedFields();
  }

  @JsonIgnore
  @SuppressWarnings("unused")
  public final Set<String> getChangedFields() {
    return changedFields();
  }

  @JsonIgnore
  @SuppressWarnings("unused")
  public final Set<String> getRemovedFields() {
    return removedFields();
  }
}
