package org.graylog2.rest.models.system;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

final class AutoValue_SystemJobSummary extends $AutoValue_SystemJobSummary {
  AutoValue_SystemJobSummary(UUID id, String description, String name, String info, String nodeId,
      DateTime startedAt, int percentComplete, boolean isCancelable, boolean providesProgress) {
    super(id, description, name, info, nodeId, startedAt, percentComplete, isCancelable, providesProgress);
  }

  @JsonIgnore
  public final UUID getId() {
    return id();
  }

  @JsonIgnore
  public final String getDescription() {
    return description();
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final String getInfo() {
    return info();
  }

  @JsonIgnore
  public final String getNodeId() {
    return nodeId();
  }

  @JsonIgnore
  @Nullable
  public final DateTime getStartedAt() {
    return startedAt();
  }

  @JsonIgnore
  public final int getPercentComplete() {
    return percentComplete();
  }

  @JsonIgnore
  public final boolean isIsCancelable() {
    return isCancelable();
  }

  @JsonIgnore
  public final boolean isProvidesProgress() {
    return providesProgress();
  }
}
