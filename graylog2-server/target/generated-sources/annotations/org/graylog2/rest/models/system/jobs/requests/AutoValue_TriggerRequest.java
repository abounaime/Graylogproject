package org.graylog2.rest.models.system.jobs.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_TriggerRequest extends $AutoValue_TriggerRequest {
  AutoValue_TriggerRequest(String jobName) {
    super(jobName);
  }

  @JsonIgnore
  public final String getJobName() {
    return jobName();
  }
}
