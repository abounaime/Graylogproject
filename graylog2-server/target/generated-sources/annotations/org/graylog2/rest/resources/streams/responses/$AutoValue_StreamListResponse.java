
package org.graylog2.rest.resources.streams.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_StreamListResponse extends StreamListResponse {

  private final long total;
  private final Collection<StreamResponse> streams;

  $AutoValue_StreamListResponse(
      long total,
      Collection<StreamResponse> streams) {
    this.total = total;
    if (streams == null) {
      throw new NullPointerException("Null streams");
    }
    this.streams = streams;
  }

  @JsonProperty
  @Override
  public long total() {
    return total;
  }

  @JsonProperty
  @Override
  public Collection<StreamResponse> streams() {
    return streams;
  }

  @Override
  public String toString() {
    return "StreamListResponse{"
        + "total=" + total + ", "
        + "streams=" + streams
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof StreamListResponse) {
      StreamListResponse that = (StreamListResponse) o;
      return (this.total == that.total())
           && (this.streams.equals(that.streams()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.total >>> 32) ^ this.total;
    h *= 1000003;
    h ^= this.streams.hashCode();
    return h;
  }

}
