
package org.graylog2.rest.models.alarmcallbacks.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CreateAlarmCallbackRequest extends CreateAlarmCallbackRequest {

  private final String type;
  private final String title;
  private final Map<String, Object> configuration;

  $AutoValue_CreateAlarmCallbackRequest(
      String type,
      String title,
      Map<String, Object> configuration) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    if (configuration == null) {
      throw new NullPointerException("Null configuration");
    }
    this.configuration = configuration;
  }

  @JsonProperty(value = "type")
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "title")
  @Override
  public String title() {
    return title;
  }

  @JsonProperty(value = "configuration")
  @Override
  public Map<String, Object> configuration() {
    return configuration;
  }

  @Override
  public String toString() {
    return "CreateAlarmCallbackRequest{"
        + "type=" + type + ", "
        + "title=" + title + ", "
        + "configuration=" + configuration
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateAlarmCallbackRequest) {
      CreateAlarmCallbackRequest that = (CreateAlarmCallbackRequest) o;
      return (this.type.equals(that.type()))
           && (this.title.equals(that.title()))
           && (this.configuration.equals(that.configuration()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= this.configuration.hashCode();
    return h;
  }

}
