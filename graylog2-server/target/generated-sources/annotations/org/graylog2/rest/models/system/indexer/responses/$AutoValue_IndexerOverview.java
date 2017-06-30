
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;
import org.graylog2.rest.models.count.responses.MessageCountResponse;
import org.graylog2.rest.models.system.deflector.responses.DeflectorSummary;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexerOverview extends IndexerOverview {

  private final DeflectorSummary deflectorSummary;
  private final IndexerClusterOverview indexerCluster;
  private final MessageCountResponse messageCountResponse;
  private final Map<String, IndexSummary> indices;

  $AutoValue_IndexerOverview(
      DeflectorSummary deflectorSummary,
      IndexerClusterOverview indexerCluster,
      MessageCountResponse messageCountResponse,
      Map<String, IndexSummary> indices) {
    if (deflectorSummary == null) {
      throw new NullPointerException("Null deflectorSummary");
    }
    this.deflectorSummary = deflectorSummary;
    if (indexerCluster == null) {
      throw new NullPointerException("Null indexerCluster");
    }
    this.indexerCluster = indexerCluster;
    if (messageCountResponse == null) {
      throw new NullPointerException("Null messageCountResponse");
    }
    this.messageCountResponse = messageCountResponse;
    if (indices == null) {
      throw new NullPointerException("Null indices");
    }
    this.indices = indices;
  }

  @JsonProperty(value = "deflector")
  @Override
  public DeflectorSummary deflectorSummary() {
    return deflectorSummary;
  }

  @JsonProperty(value = "indexer_cluster")
  @Override
  public IndexerClusterOverview indexerCluster() {
    return indexerCluster;
  }

  @JsonProperty(value = "counts")
  @Override
  public MessageCountResponse messageCountResponse() {
    return messageCountResponse;
  }

  @JsonProperty(value = "indices")
  @Override
  public Map<String, IndexSummary> indices() {
    return indices;
  }

  @Override
  public String toString() {
    return "IndexerOverview{"
        + "deflectorSummary=" + deflectorSummary + ", "
        + "indexerCluster=" + indexerCluster + ", "
        + "messageCountResponse=" + messageCountResponse + ", "
        + "indices=" + indices
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexerOverview) {
      IndexerOverview that = (IndexerOverview) o;
      return (this.deflectorSummary.equals(that.deflectorSummary()))
           && (this.indexerCluster.equals(that.indexerCluster()))
           && (this.messageCountResponse.equals(that.messageCountResponse()))
           && (this.indices.equals(that.indices()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.deflectorSummary.hashCode();
    h *= 1000003;
    h ^= this.indexerCluster.hashCode();
    h *= 1000003;
    h ^= this.messageCountResponse.hashCode();
    h *= 1000003;
    h ^= this.indices.hashCode();
    return h;
  }

}
