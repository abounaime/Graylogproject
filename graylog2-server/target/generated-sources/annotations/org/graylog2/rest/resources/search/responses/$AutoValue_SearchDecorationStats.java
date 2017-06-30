
package org.graylog2.rest.resources.search.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SearchDecorationStats extends SearchDecorationStats {

  private final Set<String> addedFields;
  private final Set<String> changedFields;
  private final Set<String> removedFields;

  $AutoValue_SearchDecorationStats(
      Set<String> addedFields,
      Set<String> changedFields,
      Set<String> removedFields) {
    if (addedFields == null) {
      throw new NullPointerException("Null addedFields");
    }
    this.addedFields = addedFields;
    if (changedFields == null) {
      throw new NullPointerException("Null changedFields");
    }
    this.changedFields = changedFields;
    if (removedFields == null) {
      throw new NullPointerException("Null removedFields");
    }
    this.removedFields = removedFields;
  }

  @SuppressWarnings(value = {"unused"})
  @JsonProperty(value = "added_fields")
  @Override
  public Set<String> addedFields() {
    return addedFields;
  }

  @SuppressWarnings(value = {"unused"})
  @JsonProperty(value = "changed_fields")
  @Override
  public Set<String> changedFields() {
    return changedFields;
  }

  @SuppressWarnings(value = {"unused"})
  @JsonProperty(value = "removed_fields")
  @Override
  public Set<String> removedFields() {
    return removedFields;
  }

  @Override
  public String toString() {
    return "SearchDecorationStats{"
        + "addedFields=" + addedFields + ", "
        + "changedFields=" + changedFields + ", "
        + "removedFields=" + removedFields
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SearchDecorationStats) {
      SearchDecorationStats that = (SearchDecorationStats) o;
      return (this.addedFields.equals(that.addedFields()))
           && (this.changedFields.equals(that.changedFields()))
           && (this.removedFields.equals(that.removedFields()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.addedFields.hashCode();
    h *= 1000003;
    h ^= this.changedFields.hashCode();
    h *= 1000003;
    h ^= this.removedFields.hashCode();
    return h;
  }

}
