package org.graylog2.system.stats.elasticsearch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.util.List;

final class AutoValue_ClusterHealth extends $AutoValue_ClusterHealth {
  AutoValue_ClusterHealth(int numberOfNodes, int numberOfDataNodes, int activeShards,
      int relocatingShards, int activePrimaryShards, int initializingShards, int unassignedShards,
      boolean timedOut, int pendingTasks, List<Long> pendingTasksTimeInQueue) {
    super(numberOfNodes, numberOfDataNodes, activeShards, relocatingShards, activePrimaryShards, initializingShards, unassignedShards, timedOut, pendingTasks, pendingTasksTimeInQueue);
  }

  @JsonIgnore
  public final int getNumberOfNodes() {
    return numberOfNodes();
  }

  @JsonIgnore
  public final int getNumberOfDataNodes() {
    return numberOfDataNodes();
  }

  @JsonIgnore
  public final int getActiveShards() {
    return activeShards();
  }

  @JsonIgnore
  public final int getRelocatingShards() {
    return relocatingShards();
  }

  @JsonIgnore
  public final int getActivePrimaryShards() {
    return activePrimaryShards();
  }

  @JsonIgnore
  public final int getInitializingShards() {
    return initializingShards();
  }

  @JsonIgnore
  public final int getUnassignedShards() {
    return unassignedShards();
  }

  @JsonIgnore
  public final boolean isTimedOut() {
    return timedOut();
  }

  @JsonIgnore
  public final int getPendingTasks() {
    return pendingTasks();
  }

  @JsonIgnore
  public final List<Long> getPendingTasksTimeInQueue() {
    return pendingTasksTimeInQueue();
  }
}
