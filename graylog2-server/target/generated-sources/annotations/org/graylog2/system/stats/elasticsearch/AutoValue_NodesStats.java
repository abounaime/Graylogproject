package org.graylog2.system.stats.elasticsearch;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_NodesStats extends $AutoValue_NodesStats {
  AutoValue_NodesStats(int total, int masterOnly, int dataOnly, int masterData, int client) {
    super(total, masterOnly, dataOnly, masterData, client);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final int getMasterOnly() {
    return masterOnly();
  }

  @JsonIgnore
  public final int getDataOnly() {
    return dataOnly();
  }

  @JsonIgnore
  public final int getMasterData() {
    return masterData();
  }

  @JsonIgnore
  public final int getClient() {
    return client();
  }
}
