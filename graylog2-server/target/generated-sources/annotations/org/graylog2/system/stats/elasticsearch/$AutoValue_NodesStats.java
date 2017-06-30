
package org.graylog2.system.stats.elasticsearch;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_NodesStats extends NodesStats {

  private final int total;
  private final int masterOnly;
  private final int dataOnly;
  private final int masterData;
  private final int client;

  $AutoValue_NodesStats(
      int total,
      int masterOnly,
      int dataOnly,
      int masterData,
      int client) {
    this.total = total;
    this.masterOnly = masterOnly;
    this.dataOnly = dataOnly;
    this.masterData = masterData;
    this.client = client;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @JsonProperty
  @Override
  public int masterOnly() {
    return masterOnly;
  }

  @JsonProperty
  @Override
  public int dataOnly() {
    return dataOnly;
  }

  @JsonProperty
  @Override
  public int masterData() {
    return masterData;
  }

  @JsonProperty
  @Override
  public int client() {
    return client;
  }

  @Override
  public String toString() {
    return "NodesStats{"
        + "total=" + total + ", "
        + "masterOnly=" + masterOnly + ", "
        + "dataOnly=" + dataOnly + ", "
        + "masterData=" + masterData + ", "
        + "client=" + client
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NodesStats) {
      NodesStats that = (NodesStats) o;
      return (this.total == that.total())
           && (this.masterOnly == that.masterOnly())
           && (this.dataOnly == that.dataOnly())
           && (this.masterData == that.masterData())
           && (this.client == that.client());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total;
    h *= 1000003;
    h ^= this.masterOnly;
    h *= 1000003;
    h ^= this.dataOnly;
    h *= 1000003;
    h ^= this.masterData;
    h *= 1000003;
    h ^= this.client;
    return h;
  }

}
