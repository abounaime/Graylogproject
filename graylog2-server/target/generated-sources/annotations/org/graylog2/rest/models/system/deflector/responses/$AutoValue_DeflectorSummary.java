
package org.graylog2.rest.models.system.deflector.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_DeflectorSummary extends DeflectorSummary {

  private final boolean isUp;
  private final String currentTarget;

  $AutoValue_DeflectorSummary(
      boolean isUp,
      @Nullable String currentTarget) {
    this.isUp = isUp;
    this.currentTarget = currentTarget;
  }

  @JsonProperty(value = "is_up")
  @Override
  public boolean isUp() {
    return isUp;
  }

  @JsonProperty(value = "current_target")
  @Nullable
  @Override
  public String currentTarget() {
    return currentTarget;
  }

  @Override
  public String toString() {
    return "DeflectorSummary{"
        + "isUp=" + isUp + ", "
        + "currentTarget=" + currentTarget
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeflectorSummary) {
      DeflectorSummary that = (DeflectorSummary) o;
      return (this.isUp == that.isUp())
           && ((this.currentTarget == null) ? (that.currentTarget() == null) : this.currentTarget.equals(that.currentTarget()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.isUp ? 1231 : 1237;
    h *= 1000003;
    h ^= (currentTarget == null) ? 0 : this.currentTarget.hashCode();
    return h;
  }

}
