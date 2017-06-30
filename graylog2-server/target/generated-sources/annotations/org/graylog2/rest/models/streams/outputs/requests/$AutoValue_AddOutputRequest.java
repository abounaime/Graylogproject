
package org.graylog2.rest.models.streams.outputs.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AddOutputRequest extends AddOutputRequest {

  private final Set<String> outputs;

  $AutoValue_AddOutputRequest(
      Set<String> outputs) {
    if (outputs == null) {
      throw new NullPointerException("Null outputs");
    }
    this.outputs = outputs;
  }

  @JsonProperty
  @Override
  public Set<String> outputs() {
    return outputs;
  }

  @Override
  public String toString() {
    return "AddOutputRequest{"
        + "outputs=" + outputs
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AddOutputRequest) {
      AddOutputRequest that = (AddOutputRequest) o;
      return (this.outputs.equals(that.outputs()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.outputs.hashCode();
    return h;
  }

}
