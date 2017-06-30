package org.graylog2.rest.resources.streams.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_SingleStreamRuleSummaryResponse extends $AutoValue_SingleStreamRuleSummaryResponse {
  AutoValue_SingleStreamRuleSummaryResponse(String streamRuleId) {
    super(streamRuleId);
  }

  @JsonIgnore
  public final String getStreamRuleId() {
    return streamRuleId();
  }
}
