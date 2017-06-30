
package org.graylog2.rest.resources.streams.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import javax.annotation.Generated;
import org.graylog2.plugin.streams.StreamRule;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_StreamRuleListResponse extends StreamRuleListResponse {

  private final int total;
  private final Collection<StreamRule> streamRules;

  $AutoValue_StreamRuleListResponse(
      int total,
      Collection<StreamRule> streamRules) {
    this.total = total;
    if (streamRules == null) {
      throw new NullPointerException("Null streamRules");
    }
    this.streamRules = streamRules;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @JsonProperty(value = "stream_rules")
  @Override
  public Collection<StreamRule> streamRules() {
    return streamRules;
  }

  @Override
  public String toString() {
    return "StreamRuleListResponse{"
        + "total=" + total + ", "
        + "streamRules=" + streamRules
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof StreamRuleListResponse) {
      StreamRuleListResponse that = (StreamRuleListResponse) o;
      return (this.total == that.total())
           && (this.streamRules.equals(that.streamRules()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total;
    h *= 1000003;
    h ^= this.streamRules.hashCode();
    return h;
  }

}
