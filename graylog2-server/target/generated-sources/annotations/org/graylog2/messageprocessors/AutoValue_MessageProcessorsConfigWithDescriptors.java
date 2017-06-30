package org.graylog2.messageprocessors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;
import java.util.Set;

final class AutoValue_MessageProcessorsConfigWithDescriptors extends $AutoValue_MessageProcessorsConfigWithDescriptors {
  AutoValue_MessageProcessorsConfigWithDescriptors(List<MessageProcessorDescriptor> processorOrder,
      Set<String> disabledProcessors) {
    super(processorOrder, disabledProcessors);
  }

  @JsonIgnore
  public final List<MessageProcessorDescriptor> getProcessorOrder() {
    return processorOrder();
  }

  @JsonIgnore
  public final Set<String> getDisabledProcessors() {
    return disabledProcessors();
  }
}
