package org.graylog2.cluster;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Nullable;
import org.joda.time.DateTime;
import org.mongojack.Id;
import org.mongojack.ObjectId;

final class AutoValue_ClusterConfig extends $AutoValue_ClusterConfig {
  AutoValue_ClusterConfig(String id, String type, Object payload, DateTime lastUpdated,
      String lastUpdatedBy) {
    super(id, type, payload, lastUpdated, lastUpdatedBy);
  }

  @JsonIgnore
  @Id
  @ObjectId
  @Nullable
  public final String getId() {
    return id();
  }

  @JsonIgnore
  @Nullable
  public final String getType() {
    return type();
  }

  @JsonIgnore
  @Nullable
  public final Object getPayload() {
    return payload();
  }

  @JsonIgnore
  @Nullable
  public final DateTime getLastUpdated() {
    return lastUpdated();
  }

  @JsonIgnore
  @Nullable
  public final String getLastUpdatedBy() {
    return lastUpdatedBy();
  }
}
