
package org.graylog2.indexer.indexset.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.hibernate.validator.constraints.NotBlank;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexSetDeletedEvent extends IndexSetDeletedEvent {

  private final String id;

  $AutoValue_IndexSetDeletedEvent(
      String id) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
  }

  @JsonProperty(value = "id")
  @NotBlank
  @Override
  public String id() {
    return id;
  }

  @Override
  public String toString() {
    return "IndexSetDeletedEvent{"
        + "id=" + id
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexSetDeletedEvent) {
      IndexSetDeletedEvent that = (IndexSetDeletedEvent) o;
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
