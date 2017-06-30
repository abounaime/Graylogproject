
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_OpenIndicesInfo extends OpenIndicesInfo {

  private final Map<String, IndexInfo> indices;

  $AutoValue_OpenIndicesInfo(
      Map<String, IndexInfo> indices) {
    if (indices == null) {
      throw new NullPointerException("Null indices");
    }
    this.indices = indices;
  }

  @JsonProperty
  @Override
  public Map<String, IndexInfo> indices() {
    return indices;
  }

  @Override
  public String toString() {
    return "OpenIndicesInfo{"
        + "indices=" + indices
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OpenIndicesInfo) {
      OpenIndicesInfo that = (OpenIndicesInfo) o;
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
