
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AllIndices extends AllIndices {

  private final ClosedIndices closed;
  private final ClosedIndices reopened;
  private final OpenIndicesInfo all;

  $AutoValue_AllIndices(
      ClosedIndices closed,
      ClosedIndices reopened,
      OpenIndicesInfo all) {
    if (closed == null) {
      throw new NullPointerException("Null closed");
    }
    this.closed = closed;
    if (reopened == null) {
      throw new NullPointerException("Null reopened");
    }
    this.reopened = reopened;
    if (all == null) {
      throw new NullPointerException("Null all");
    }
    this.all = all;
  }

  @JsonProperty(value = "closed")
  @Override
  public ClosedIndices closed() {
    return closed;
  }

  @JsonProperty(value = "reopened")
  @Override
  public ClosedIndices reopened() {
    return reopened;
  }

  @JsonProperty(value = "all")
  @Override
  public OpenIndicesInfo all() {
    return all;
  }

  @Override
  public String toString() {
    return "AllIndices{"
        + "closed=" + closed + ", "
        + "reopened=" + reopened + ", "
        + "all=" + all
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AllIndices) {
      AllIndices that = (AllIndices) o;
      return (this.closed.equals(that.closed()))
           && (this.reopened.equals(that.reopened()))
           && (this.all.equals(that.all()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.closed.hashCode();
    h *= 1000003;
    h ^= this.reopened.hashCode();
    h *= 1000003;
    h ^= this.all.hashCode();
    return h;
  }

}
