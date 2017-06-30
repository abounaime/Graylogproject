
package org.graylog2.rest.models.dashboards.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AddWidgetRequest extends AddWidgetRequest {

  private final String description;
  private final String type;
  private final int cacheTime;
  private final Map<String, Object> config;

  $AutoValue_AddWidgetRequest(
      String description,
      String type,
      int cacheTime,
      Map<String, Object> config) {
    if (description == null) {
      throw new NullPointerException("Null description");
    }
    this.description = description;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.cacheTime = cacheTime;
    if (config == null) {
      throw new NullPointerException("Null config");
    }
    this.config = config;
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

  @JsonProperty
  @Override
  public Map<String, Object> config() {
    return config;
  }

  @Override
  public String toString() {
    return "AddWidgetRequest{"
        + "description=" + description + ", "
        + "type=" + type + ", "
        + "cacheTime=" + cacheTime + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AddWidgetRequest) {
      AddWidgetRequest that = (AddWidgetRequest) o;
      return (this.description.equals(that.description()))
           && (this.type.equals(that.type()))
           && (this.cacheTime == that.cacheTime())
           && (this.config.equals(that.config()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.description.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.cacheTime;
    h *= 1000003;
    h ^= this.config.hashCode();
    return h;
  }

}
