package org.graylog2.messageprocessors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;
import java.util.Set;

final class AutoValue_MessageProcessorsConfig extends $AutoValue_MessageProcessorsConfig {
  AutoValue_MessageProcessorsConfig(List<String> processorOrder, Set<String> disabledProcessors) {
    super(processorOrder, disabledProcessors);
  }

  @JsonIgnore
  public final List<String> getProcessorOrder() {
    return processorOrder();
  }

  @JsonIgnore
  public final Set<String> getDisabledProcessors() {
    return disabledProcessors();
  }
}
