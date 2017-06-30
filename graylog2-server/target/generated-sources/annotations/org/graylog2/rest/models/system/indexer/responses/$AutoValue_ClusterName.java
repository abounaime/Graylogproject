
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ClusterName extends ClusterName {

  private final String name;

  $AutoValue_ClusterName(
      String name) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
  }

  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  @Override
  public String toString() {
    return "ClusterName{"
        + "name=" + name
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClusterName) {
      ClusterName that = (ClusterName) o;
      return (this.name.equals(that.name()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.name.hashCode();
    return h;
  }

}
