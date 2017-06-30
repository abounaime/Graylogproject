
package org.graylog2.rest.models.system.indexer.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndicesReadRequest extends IndicesReadRequest {

  private final List<String> indices;

  $AutoValue_IndicesReadRequest(
      List<String> indices) {
    if (indices == null) {
      throw new NullPointerException("Null indices");
    }
    this.indices = indices;
  }

  @JsonProperty(value = "indices")
  @Override
  public List<String> indices() {
    return indices;
  }

  @Override
  public String toString() {
    return "IndicesReadRequest{"
        + "indices=" + indices
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndicesReadRequest) {
      IndicesReadRequest that = (IndicesReadRequest) o;
      return (this.indices.equals(that.indices()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.indices.hashCode();
    return h;
  }

}
