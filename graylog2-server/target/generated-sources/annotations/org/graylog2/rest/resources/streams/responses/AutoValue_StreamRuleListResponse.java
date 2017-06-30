package org.graylog2.rest.resources.streams.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import org.graylog2.plugin.streams.StreamRule;

final class AutoValue_StreamRuleListResponse extends $AutoValue_StreamRuleListResponse {
  AutoValue_StreamRuleListResponse(int total, Collection<StreamRule> streamRules) {
    super(total, streamRules);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final Collection<StreamRule> getStreamRules() {
    return streamRules();
  }
}
