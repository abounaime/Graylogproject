package org.graylog2.rest.models.messages.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;

final class AutoValue_DecorationStats extends $AutoValue_DecorationStats {
  AutoValue_DecorationStats(Map<String, Object> originalMessage,
      Map<String, Object> decoratedMessage) {
    super(originalMessage, decoratedMessage);
  }

  @JsonIgnore
  public final Map<String, Object> getOriginalMessage() {
    return originalMessage();
  }

  @JsonIgnore
  public final Map<String, Object> getDecoratedMessage() {
    return decoratedMessage();
  }
}
