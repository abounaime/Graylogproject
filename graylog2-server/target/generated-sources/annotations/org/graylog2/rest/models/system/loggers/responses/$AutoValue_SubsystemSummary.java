
package org.graylog2.rest.models.system.loggers.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SubsystemSummary extends SubsystemSummary {

  private final Map<String, SingleSubsystemSummary> subsystems;

  $AutoValue_SubsystemSummary(
      Map<String, SingleSubsystemSummary> subsystems) {
    if (subsystems == null) {
      throw new NullPointerException("Null subsystems");
    }
    this.subsystems = subsystems;
  }

  @JsonProperty
  @Override
  public Map<String, SingleSubsystemSummary> subsystems() {
    return subsystems;
  }

  @Override
  public String toString() {
    return "SubsystemSummary{"
        + "subsystems=" + subsystems
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SubsystemSummary) {
      SubsystemSummary that = (SubsystemSummary) o;
      return (this.subsystems.equals(that.subsystems()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.subsystems.hashCode();
    return h;
  }

}
