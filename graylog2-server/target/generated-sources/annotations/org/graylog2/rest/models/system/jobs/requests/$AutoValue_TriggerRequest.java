
package org.graylog2.rest.models.system.jobs.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_TriggerRequest extends TriggerRequest {

  private final String jobName;

  $AutoValue_TriggerRequest(
      String jobName) {
    if (jobName == null) {
      throw new NullPointerException("Null jobName");
    }
    this.jobName = jobName;
  }

  @JsonProperty(value = "job_name")
  @Override
  public String jobName() {
    return jobName;
  }

  @Override
  public String toString() {
    return "TriggerRequest{"
        + "jobName=" + jobName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TriggerRequest) {
      TriggerRequest that = (TriggerRequest) o;
      return (this.jobName.equals(that.jobName()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.jobName.hashCode();
    return h;
  }

}
