
package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Throughput extends Throughput {

  private final long throughput;

  $AutoValue_Throughput(
      long throughput) {
    this.throughput = throughput;
  }

  @JsonProperty
  @Override
  public long throughput() {
    return throughput;
  }

  @Override
  public String toString() {
    return "Throughput{"
        + "throughput=" + throughput
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Throughput) {
      Throughput that = (Throughput) o;
      return (this.throughput == that.throughput());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.throughput >>> 32) ^ this.throughput;
    return h;
  }

}
