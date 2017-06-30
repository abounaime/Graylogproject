
package org.graylog2.system.stats.elasticsearch;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ClusterHealth extends ClusterHealth {

  private final int numberOfNodes;
  private final int numberOfDataNodes;
  private final int activeShards;
  private final int relocatingShards;
  private final int activePrimaryShards;
  private final int initializingShards;
  private final int unassignedShards;
  private final boolean timedOut;
  private final int pendingTasks;
  private final List<Long> pendingTasksTimeInQueue;

  $AutoValue_ClusterHealth(
      int numberOfNodes,
      int numberOfDataNodes,
      int activeShards,
      int relocatingShards,
      int activePrimaryShards,
      int initializingShards,
      int unassignedShards,
      boolean timedOut,
      int pendingTasks,
      List<Long> pendingTasksTimeInQueue) {
    this.numberOfNodes = numberOfNodes;
    this.numberOfDataNodes = numberOfDataNodes;
    this.activeShards = activeShards;
    this.relocatingShards = relocatingShards;
    this.activePrimaryShards = activePrimaryShards;
    this.initializingShards = initializingShards;
    this.unassignedShards = unassignedShards;
    this.timedOut = timedOut;
    this.pendingTasks = pendingTasks;
    if (pendingTasksTimeInQueue == null) {
      throw new NullPointerException("Null pendingTasksTimeInQueue");
    }
    this.pendingTasksTimeInQueue = pendingTasksTimeInQueue;
  }

  @JsonProperty
  @Override
  public int numberOfNodes() {
    return numberOfNodes;
  }

  @JsonProperty
  @Override
  public int numberOfDataNodes() {
    return numberOfDataNodes;
  }

  @JsonProperty
  @Override
  public int activeShards() {
    return activeShards;
  }

  @JsonProperty
  @Override
  public int relocatingShards() {
    return relocatingShards;
  }

  @JsonProperty
  @Override
  public int activePrimaryShards() {
    return activePrimaryShards;
  }

  @JsonProperty
  @Override
  public int initializingShards() {
    return initializingShards;
  }

  @JsonProperty
  @Override
  public int unassignedShards() {
    return unassignedShards;
  }

  @JsonProperty
  @Override
  public boolean timedOut() {
    return timedOut;
  }

  @JsonProperty
  @Override
  public int pendingTasks() {
    return pendingTasks;
  }

  @JsonProperty
  @Override
  public List<Long> pendingTasksTimeInQueue() {
    return pendingTasksTimeInQueue;
  }

  @Override
  public String toString() {
    return "ClusterHealth{"
        + "numberOfNodes=" + numberOfNodes + ", "
        + "numberOfDataNodes=" + numberOfDataNodes + ", "
        + "activeShards=" + activeShards + ", "
        + "relocatingShards=" + relocatingShards + ", "
        + "activePrimaryShards=" + activePrimaryShards + ", "
        + "initializingShards=" + initializingShards + ", "
        + "unassignedShards=" + unassignedShards + ", "
        + "timedOut=" + timedOut + ", "
        + "pendingTasks=" + pendingTasks + ", "
        + "pendingTasksTimeInQueue=" + pendingTasksTimeInQueue
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClusterHealth) {
      ClusterHealth that = (ClusterHealth) o;
      return (this.numberOfNodes == that.numberOfNodes())
           && (this.numberOfDataNodes == that.numberOfDataNodes())
           && (this.activeShards == that.activeShards())
           && (this.relocatingShards == that.relocatingShards())
           && (this.activePrimaryShards == that.activePrimaryShards())
           && (this.initializingShards == that.initializingShards())
           && (this.unassignedShards == that.unassignedShards())
           && (this.timedOut == that.timedOut())
           && (this.pendingTasks == that.pendingTasks())
           && (this.pendingTasksTimeInQueue.equals(that.pendingTasksTimeInQueue()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.numberOfNodes;
    h *= 1000003;
    h ^= this.numberOfDataNodes;
    h *= 1000003;
    h ^= this.activeShards;
    h *= 1000003;
    h ^= this.relocatingShards;
    h *= 1000003;
    h ^= this.activePrimaryShards;
    h *= 1000003;
    h ^= this.initializingShards;
    h *= 1000003;
    h ^= this.unassignedShards;
    h *= 1000003;
    h ^= this.timedOut ? 1231 : 1237;
    h *= 1000003;
    h ^= this.pendingTasks;
    h *= 1000003;
    h ^= this.pendingTasksTimeInQueue.hashCode();
    return h;
  }

}
