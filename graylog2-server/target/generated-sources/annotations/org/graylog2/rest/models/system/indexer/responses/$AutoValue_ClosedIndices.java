
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ClosedIndices extends ClosedIndices {

  private final Set<String> indices;
  private final int total;

  $AutoValue_ClosedIndices(
      Set<String> indices,
      int total) {
    if (indices == null) {
      throw new NullPointerException("Null indices");
    }
    this.indices = indices;
    this.total = total;
  }

  @JsonProperty
  @Override
  public Set<String> indices() {
    return indices;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @Override
  public String toString() {
    return "ClosedIndices{"
        + "indices=" + indices + ", "
        + "total=" + total
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClosedIndices) {
      ClosedIndices that = (ClosedIndices) o;
      return (this.indices.equals(that.indices()))
           && (this.total == that.total());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.indices.hashCode();
    h *= 1000003;
    h ^= this.total;
    return h;
  }

}
