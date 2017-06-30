
package org.graylog2.rest.models.streams.outputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import javax.annotation.Generated;
import org.graylog2.rest.models.system.outputs.responses.OutputSummary;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_OutputListResponse extends OutputListResponse {

  private final long total;
  private final Collection<OutputSummary> outputs;

  $AutoValue_OutputListResponse(
      long total,
      Collection<OutputSummary> outputs) {
    this.total = total;
    if (outputs == null) {
      throw new NullPointerException("Null outputs");
    }
    this.outputs = outputs;
  }

  @JsonProperty
  @Override
  public long total() {
    return total;
  }

  @JsonProperty
  @Override
  public Collection<OutputSummary> outputs() {
    return outputs;
  }

  @Override
  public String toString() {
    return "OutputListResponse{"
        + "total=" + total + ", "
        + "outputs=" + outputs
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OutputListResponse) {
      OutputListResponse that = (OutputListResponse) o;
      return (this.total == that.total())
           && (this.outputs.equals(that.outputs()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.total >>> 32) ^ this.total;
    h *= 1000003;
    h ^= this.outputs.hashCode();
    return h;
  }

}
