
package org.graylog2.indexer.indexset.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.graylog2.indexer.indexset.IndexSetConfig;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexSetCreatedEvent extends IndexSetCreatedEvent {

  private final IndexSetConfig indexSet;

  $AutoValue_IndexSetCreatedEvent(
      IndexSetConfig indexSet) {
    if (indexSet == null) {
      throw new NullPointerException("Null indexSet");
    }
    this.indexSet = indexSet;
  }

  @JsonProperty(value = "index_set")
  @Override
  public IndexSetConfig indexSet() {
    return indexSet;
  }

  @Override
  public String toString() {
    return "IndexSetCreatedEvent{"
        + "indexSet=" + indexSet
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexSetCreatedEvent) {
      IndexSetCreatedEvent that = (IndexSetCreatedEvent) o;
      return (this.indexSet.equals(that.indexSet()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.indexSet.hashCode();
    return h;
  }

}
