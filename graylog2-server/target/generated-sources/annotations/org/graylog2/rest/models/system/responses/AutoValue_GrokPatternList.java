package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import org.graylog2.grok.GrokPattern;

final class AutoValue_GrokPatternList extends $AutoValue_GrokPatternList {
  AutoValue_GrokPatternList(Collection<GrokPattern> patterns) {
    super(patterns);
  }

  @JsonIgnore
  public final Collection<GrokPattern> getPatterns() {
    return patterns();
  }
}
