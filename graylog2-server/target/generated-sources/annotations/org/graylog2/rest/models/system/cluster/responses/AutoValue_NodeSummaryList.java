package org.graylog2.rest.models.system.cluster.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

final class AutoValue_NodeSummaryList extends $AutoValue_NodeSummaryList {
  AutoValue_NodeSummaryList(List<NodeSummary> nodes, int total) {
    super(nodes, total);
  }

  @JsonIgnore
  public final List<NodeSummary> getNodes() {
    return nodes();
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }
}
