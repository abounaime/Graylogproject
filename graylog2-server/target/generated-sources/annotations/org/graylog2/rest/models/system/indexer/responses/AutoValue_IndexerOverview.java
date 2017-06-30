package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;
import org.graylog2.rest.models.count.responses.MessageCountResponse;
import org.graylog2.rest.models.system.deflector.responses.DeflectorSummary;

final class AutoValue_IndexerOverview extends $AutoValue_IndexerOverview {
  AutoValue_IndexerOverview(DeflectorSummary deflectorSummary,
      IndexerClusterOverview indexerCluster, MessageCountResponse messageCountResponse,
      Map<String, IndexSummary> indices) {
    super(deflectorSummary, indexerCluster, messageCountResponse, indices);
  }

  @JsonIgnore
  public final DeflectorSummary getDeflectorSummary() {
    return deflectorSummary();
  }

  @JsonIgnore
  public final IndexerClusterOverview getIndexerCluster() {
    return indexerCluster();
  }

  @JsonIgnore
  public final MessageCountResponse getMessageCountResponse() {
    return messageCountResponse();
  }

  @JsonIgnore
  public final Map<String, IndexSummary> getIndices() {
    return indices();
  }
}
