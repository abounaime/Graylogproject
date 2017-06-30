
package org.graylog2.rest.models.dashboards.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_WidgetSummary extends WidgetSummary {

  private final String id;
  private final String description;
  private final String type;
  private final int cacheTime;
  private final String creatorUserId;
  private final Map<String, Object> config;

  $AutoValue_WidgetSummary(
      String id,
      String description,
      String type,
      int cacheTime,
      String creatorUserId,
      Map<String, Object> config) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    if (description == null) {
      throw new NullPointerException("Null description");
    }
    this.description = description;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.cacheTime = cacheTime;
    if (creatorUserId == null) {
      throw new NullPointerException("Null creatorUserId");
    }
    this.creatorUserId = creatorUserId;
    if (config == null) {
      throw new NullPointerException("Null config");
    }
    this.config = config;
  }

  @JsonProperty
  @Override
  public String id() {
    return id;
  }

  @JsonProperty
  @Override
  public String description() {
    return description;
  }

  @JsonProperty
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "cache_time")
  @Override
  public int cacheTime() {
    return cacheTime;
  }

  @JsonProperty(value = "creator_user_id")
  @Override
  public String creatorUserId() {
    return creatorUserId;
  }

  @JsonProperty
  @Override
  public Map<String, Object> config() {
    return config;
  }

  @Override
  public String toString() {
    return "WidgetSummary{"
        + "id=" + id + ", "
        + "description=" + description + ", "
        + "type=" + type + ", "
        + "cacheTime=" + cacheTime + ", "
        + "creatorUserId=" + creatorUserId + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof WidgetSummary) {
      WidgetSummary that = (WidgetSummary) o;
      return (this.id.equals(that.id()))
           && (this.description.equals(that.description()))
           && (this.type.equals(that.type()))
           && (this.cacheTime == that.cacheTime())
           && (this.creatorUserId.equals(that.creatorUserId()))
           && (this.config.equals(that.config()));
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
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.cacheTime;
    h *= 1000003;
    h ^= this.creatorUserId.hashCode();
    h *= 1000003;
    h ^= this.config.hashCode();
    return h;
  }

}
