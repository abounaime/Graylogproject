
package org.graylog2.rest.models.system;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SystemJobSummary extends SystemJobSummary {

  private final UUID id;
  private final String description;
  private final String name;
  private final String info;
  private final String nodeId;
  private final DateTime startedAt;
  private final int percentComplete;
  private final boolean isCancelable;
  private final boolean providesProgress;

  $AutoValue_SystemJobSummary(
      UUID id,
      String description,
      String name,
      String info,
      String nodeId,
      @Nullable DateTime startedAt,
      int percentComplete,
      boolean isCancelable,
      boolean providesProgress) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    if (description == null) {
      throw new NullPointerException("Null description");
    }
    this.description = description;
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (info == null) {
      throw new NullPointerException("Null info");
    }
    this.info = info;
    if (nodeId == null) {
      throw new NullPointerException("Null nodeId");
    }
    this.nodeId = nodeId;
    this.startedAt = startedAt;
    this.percentComplete = percentComplete;
    this.isCancelable = isCancelable;
    this.providesProgress = providesProgress;
  }

  @JsonProperty
  @Override
  public UUID id() {
    return id;
  }

  @JsonProperty
  @Override
  public String description() {
    return description;
  }

  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  @JsonProperty
  @Override
  public String info() {
    return info;
  }

  @JsonProperty(value = "node_id")
  @Override
  public String nodeId() {
    return nodeId;
  }

  @JsonProperty(value = "started_at")
  @Nullable
  @Override
  public DateTime startedAt() {
    return startedAt;
  }

  @JsonProperty(value = "percent_complete")
  @Override
  public int percentComplete() {
    return percentComplete;
  }

  @JsonProperty(value = "is_cancelable")
  @Override
  public boolean isCancelable() {
    return isCancelable;
  }

  @JsonProperty(value = "provides_progress")
  @Override
  public boolean providesProgress() {
    return providesProgress;
  }

  @Override
  public String toString() {
    return "SystemJobSummary{"
        + "id=" + id + ", "
        + "description=" + description + ", "
        + "name=" + name + ", "
        + "info=" + info + ", "
        + "nodeId=" + nodeId + ", "
        + "startedAt=" + startedAt + ", "
        + "percentComplete=" + percentComplete + ", "
        + "isCancelable=" + isCancelable + ", "
        + "providesProgress=" + providesProgress
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SystemJobSummary) {
      SystemJobSummary that = (SystemJobSummary) o;
      return (this.id.equals(that.id()))
           && (this.description.equals(that.description()))
           && (this.name.equals(that.name()))
           && (this.info.equals(that.info()))
           && (this.nodeId.equals(that.nodeId()))
           && ((this.startedAt == null) ? (that.startedAt() == null) : this.startedAt.equals(that.startedAt()))
           && (this.percentComplete == that.percentComplete())
           && (this.isCancelable == that.isCancelable())
           && (this.providesProgress == that.providesProgress());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    h *= 1000003;
    h ^= this.description.hashCode();
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.info.hashCode();
    h *= 1000003;
    h ^= this.nodeId.hashCode();
    h *= 1000003;
    h ^= (startedAt == null) ? 0 : this.startedAt.hashCode();
    h *= 1000003;
    h ^= this.percentComplete;
    h *= 1000003;
    h ^= this.isCancelable ? 1231 : 1237;
    h *= 1000003;
    h ^= this.providesProgress ? 1231 : 1237;
    return h;
  }

}
