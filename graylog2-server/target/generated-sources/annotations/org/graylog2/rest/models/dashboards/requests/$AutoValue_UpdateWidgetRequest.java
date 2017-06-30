
package org.graylog2.rest.models.dashboards.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_UpdateWidgetRequest extends UpdateWidgetRequest {

  private final String description;
  private final int cacheTime;

  $AutoValue_UpdateWidgetRequest(
      @Nullable String description,
      int cacheTime) {
    this.description = description;
    this.cacheTime = cacheTime;
  }

  @Nullable
  @JsonProperty
  @Override
  public String description() {
    return description;
  }

  @JsonProperty(value = "cache_time")
  @Override
  public int cacheTime() {
    return cacheTime;
  }

  @Override
  public String toString() {
    return "UpdateWidgetRequest{"
        + "description=" + description + ", "
        + "cacheTime=" + cacheTime
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UpdateWidgetRequest) {
      UpdateWidgetRequest that = (UpdateWidgetRequest) o;
      return ((this.description == null) ? (that.description() == null) : this.description.equals(that.description()))
           && (this.cacheTime == that.cacheTime());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (description == null) ? 0 : this.description.hashCode();
    h *= 1000003;
    h ^= this.cacheTime;
    return h;
  }

}
