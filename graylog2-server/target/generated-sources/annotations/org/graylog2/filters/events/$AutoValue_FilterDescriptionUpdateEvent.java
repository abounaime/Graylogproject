
package org.graylog2.filters.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_FilterDescriptionUpdateEvent extends FilterDescriptionUpdateEvent {

  private final String id;

  $AutoValue_FilterDescriptionUpdateEvent(
      String id) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
  }

  @JsonProperty(value = "id")
  @Override
  public String id() {
    return id;
  }

  @Override
  public String toString() {
    return "FilterDescriptionUpdateEvent{"
        + "id=" + id
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FilterDescriptionUpdateEvent) {
      FilterDescriptionUpdateEvent that = (FilterDescriptionUpdateEvent) o;
      return (this.id.equals(that.id()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    return h;
  }

}
