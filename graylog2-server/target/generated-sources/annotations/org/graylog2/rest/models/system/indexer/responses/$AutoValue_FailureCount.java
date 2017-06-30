
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_FailureCount extends FailureCount {

  private final long count;

  $AutoValue_FailureCount(
      long count) {
    this.count = count;
  }

  @JsonProperty
  @Override
  public long count() {
    return count;
  }

  @Override
  public String toString() {
    return "FailureCount{"
        + "count=" + count
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FailureCount) {
      FailureCount that = (FailureCount) o;
      return (this.count == that.count());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.count >>> 32) ^ this.count;
    return h;
  }

}
