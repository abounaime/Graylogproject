
package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ServerStatus_Network extends ServerStatus.Network {

  private final int bytesIn;
  private final int bytesOut;
  private final int numRequests;

  $AutoValue_ServerStatus_Network(
      int bytesIn,
      int bytesOut,
      int numRequests) {
    this.bytesIn = bytesIn;
    this.bytesOut = bytesOut;
    this.numRequests = numRequests;
  }

  @JsonProperty
  @Override
  public int bytesIn() {
    return bytesIn;
  }

  @JsonProperty
  @Override
  public int bytesOut() {
    return bytesOut;
  }

  @JsonProperty
  @Override
  public int numRequests() {
    return numRequests;
  }

  @Override
  public String toString() {
    return "Network{"
        + "bytesIn=" + bytesIn + ", "
        + "bytesOut=" + bytesOut + ", "
        + "numRequests=" + numRequests
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ServerStatus.Network) {
      ServerStatus.Network that = (ServerStatus.Network) o;
      return (this.bytesIn == that.bytesIn())
           && (this.bytesOut == that.bytesOut())
           && (this.numRequests == that.numRequests());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.bytesIn;
    h *= 1000003;
    h ^= this.bytesOut;
    h *= 1000003;
    h ^= this.numRequests;
    return h;
  }

}
