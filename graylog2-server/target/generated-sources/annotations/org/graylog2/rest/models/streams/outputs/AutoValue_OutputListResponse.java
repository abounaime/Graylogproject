package org.graylog2.rest.models.streams.outputs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import org.graylog2.rest.models.system.outputs.responses.OutputSummary;

final class AutoValue_OutputListResponse extends $AutoValue_OutputListResponse {
  AutoValue_OutputListResponse(long total, Collection<OutputSummary> outputs) {
    super(total, outputs);
  }

  @JsonIgnore
  public final long getTotal() {
    return total();
  }

  @JsonIgnore
  public final Collection<OutputSummary> getOutputs() {
    return outputs();
  }
}
