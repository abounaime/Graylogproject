
package org.graylog2.rest.models.system.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ClusterConfigList extends ClusterConfigList {

  private final int total;
  private final Set<String> classes;

  $AutoValue_ClusterConfigList(
      int total,
      Set<String> classes) {
    this.total = total;
    if (classes == null) {
      throw new NullPointerException("Null classes");
    }
    this.classes = classes;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @JsonProperty
  @Override
  public Set<String> classes() {
    return classes;
  }

  @Override
  public String toString() {
    return "ClusterConfigList{"
        + "total=" + total + ", "
        + "classes=" + classes
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClusterConfigList) {
      ClusterConfigList that = (ClusterConfigList) o;
      return (this.total == that.total())
           && (this.classes.equals(that.classes()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total;
    h *= 1000003;
    h ^= this.classes.hashCode();
    return h;
  }

}
