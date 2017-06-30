
package org.graylog2.rest.resources.streams.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SingleStreamRuleSummaryResponse extends SingleStreamRuleSummaryResponse {

  private final String streamRuleId;

  $AutoValue_SingleStreamRuleSummaryResponse(
      String streamRuleId) {
    if (streamRuleId == null) {
      throw new NullPointerException("Null streamRuleId");
    }
    this.streamRuleId = streamRuleId;
  }

  @JsonProperty(value = "streamrule_id")
  @Override
  public String streamRuleId() {
    return streamRuleId;
  }

  @Override
  public String toString() {
    return "SingleStreamRuleSummaryResponse{"
        + "streamRuleId=" + streamRuleId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SingleStreamRuleSummaryResponse) {
      SingleStreamRuleSummaryResponse that = (SingleStreamRuleSummaryResponse) o;
      return (this.streamRuleId.equals(that.streamRuleId()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.streamRuleId.hashCode();
    return h;
  }

}
