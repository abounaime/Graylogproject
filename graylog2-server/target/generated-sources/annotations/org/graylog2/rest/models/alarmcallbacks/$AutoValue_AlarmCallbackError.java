
package org.graylog2.rest.models.alarmcallbacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AlarmCallbackError extends AlarmCallbackError {

  private final String error;

  $AutoValue_AlarmCallbackError(
      String error) {
    if (error == null) {
      throw new NullPointerException("Null error");
    }
    this.error = error;
  }

  @JsonProperty(value = "error")
  @Override
  public String error() {
    return error;
  }

  @Override
  public String toString() {
    return "AlarmCallbackError{"
        + "error=" + error
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AlarmCallbackError) {
      AlarmCallbackError that = (AlarmCallbackError) o;
      return (this.error.equals(that.error()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.error.hashCode();
    return h;
  }

}
