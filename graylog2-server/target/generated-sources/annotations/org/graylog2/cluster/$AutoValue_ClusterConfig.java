
package org.graylog2.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.joda.time.DateTime;
import org.mongojack.Id;
import org.mongojack.ObjectId;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ClusterConfig extends ClusterConfig {

  private final String id;
  private final String type;
  private final Object payload;
  private final DateTime lastUpdated;
  private final String lastUpdatedBy;

  $AutoValue_ClusterConfig(
      @Nullable String id,
      @Nullable String type,
      @Nullable Object payload,
      @Nullable DateTime lastUpdated,
      @Nullable String lastUpdatedBy) {
    this.id = id;
    this.type = type;
    this.payload = payload;
    this.lastUpdated = lastUpdated;
    this.lastUpdatedBy = lastUpdatedBy;
  }

  @Id
  @ObjectId
  @Nullable
  @Override
  public String id() {
    return id;
  }

  @JsonProperty
  @Nullable
  @Override
  public String type() {
    return type;
  }

  @JsonProperty
  @Nullable
  @Override
  public Object payload() {
    return payload;
  }

  @JsonProperty
  @Nullable
  @Override
  public DateTime lastUpdated() {
    return lastUpdated;
  }

  @JsonProperty
  @Nullable
  @Override
  public String lastUpdatedBy() {
    return lastUpdatedBy;
  }

  @Override
  public String toString() {
    return "ClusterConfig{"
        + "id=" + id + ", "
        + "type=" + type + ", "
        + "payload=" + payload + ", "
        + "lastUpdated=" + lastUpdated + ", "
        + "lastUpdatedBy=" + lastUpdatedBy
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClusterConfig) {
      ClusterConfig that = (ClusterConfig) o;
      return ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && ((this.type == null) ? (that.type() == null) : this.type.equals(that.type()))
           && ((this.payload == null) ? (that.payload() == null) : this.payload.equals(that.payload()))
           && ((this.lastUpdated == null) ? (that.lastUpdated() == null) : this.lastUpdated.equals(that.lastUpdated()))
           && ((this.lastUpdatedBy == null) ? (that.lastUpdatedBy() == null) : this.lastUpdatedBy.equals(that.lastUpdatedBy()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (id == null) ? 0 : this.id.hashCode();
    h *= 1000003;
    h ^= (type == null) ? 0 : this.type.hashCode();
    h *= 1000003;
    h ^= (payload == null) ? 0 : this.payload.hashCode();
    h *= 1000003;
    h ^= (lastUpdated == null) ? 0 : this.lastUpdated.hashCode();
    h *= 1000003;
    h ^= (lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode();
    return h;
  }

}
