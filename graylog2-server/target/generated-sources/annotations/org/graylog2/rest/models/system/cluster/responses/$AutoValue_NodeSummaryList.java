
package org.graylog2.rest.models.system.cluster.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_NodeSummaryList extends NodeSummaryList {

  private final List<NodeSummary> nodes;
  private final int total;

  $AutoValue_NodeSummaryList(
      List<NodeSummary> nodes,
      int total) {
    if (nodes == null) {
      throw new NullPointerException("Null nodes");
    }
    this.nodes = nodes;
    this.total = total;
  }

  @JsonProperty
  @Override
  public List<NodeSummary> nodes() {
    return nodes;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @Override
  public String toString() {
    return "NodeSummaryList{"
        + "nodes=" + nodes + ", "
        + "total=" + total
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NodeSummaryList) {
      NodeSummaryList that = (NodeSummaryList) o;
      return (this.nodes.equals(that.nodes()))
           && (this.total == that.total());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.nodes.hashCode();
    h *= 1000003;
    h ^= this.total;
    return h;
  }

}
