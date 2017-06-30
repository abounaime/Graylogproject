
package org.graylog2.lookup.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_LookupTablesUpdated extends LookupTablesUpdated {

  private final Set<String> lookupTableIds;
  private final Set<String> lookupTableNames;

  AutoValue_LookupTablesUpdated(
      Set<String> lookupTableIds,
      Set<String> lookupTableNames) {
    if (lookupTableIds == null) {
      throw new NullPointerException("Null lookupTableIds");
    }
    this.lookupTableIds = lookupTableIds;
    if (lookupTableNames == null) {
      throw new NullPointerException("Null lookupTableNames");
    }
    this.lookupTableNames = lookupTableNames;
  }

  @JsonProperty(value = "lookup_table_ids")
  @Override
  public Set<String> lookupTableIds() {
    return lookupTableIds;
  }

  @JsonProperty(value = "lookup_table_names")
  @Override
  public Set<String> lookupTableNames() {
    return lookupTableNames;
  }

  @Override
  public String toString() {
    return "LookupTablesUpdated{"
        + "lookupTableIds=" + lookupTableIds + ", "
        + "lookupTableNames=" + lookupTableNames
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LookupTablesUpdated) {
      LookupTablesUpdated that = (LookupTablesUpdated) o;
      return (this.lookupTableIds.equals(that.lookupTableIds()))
           && (this.lookupTableNames.equals(that.lookupTableNames()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.lookupTableIds.hashCode();
    h *= 1000003;
    h ^= this.lookupTableNames.hashCode();
    return h;
  }

}
