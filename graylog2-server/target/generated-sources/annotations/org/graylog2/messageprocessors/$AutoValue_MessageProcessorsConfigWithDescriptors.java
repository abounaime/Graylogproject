
package org.graylog2.messageprocessors;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MessageProcessorsConfigWithDescriptors extends MessageProcessorsConfigWithDescriptors {

  private final List<MessageProcessorDescriptor> processorOrder;
  private final Set<String> disabledProcessors;

  $AutoValue_MessageProcessorsConfigWithDescriptors(
      List<MessageProcessorDescriptor> processorOrder,
      Set<String> disabledProcessors) {
    if (processorOrder == null) {
      throw new NullPointerException("Null processorOrder");
    }
    this.processorOrder = processorOrder;
    if (disabledProcessors == null) {
      throw new NullPointerException("Null disabledProcessors");
    }
    this.disabledProcessors = disabledProcessors;
  }

  @JsonProperty(value = "processor_order")
  @Override
  public List<MessageProcessorDescriptor> processorOrder() {
    return processorOrder;
  }

  @JsonProperty(value = "disabled_processors")
  @Override
  public Set<String> disabledProcessors() {
    return disabledProcessors;
  }

  @Override
  public String toString() {
    return "MessageProcessorsConfigWithDescriptors{"
        + "processorOrder=" + processorOrder + ", "
        + "disabledProcessors=" + disabledProcessors
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MessageProcessorsConfigWithDescriptors) {
      MessageProcessorsConfigWithDescriptors that = (MessageProcessorsConfigWithDescriptors) o;
      return (this.processorOrder.equals(that.processorOrder()))
           && (this.disabledProcessors.equals(that.disabledProcessors()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.processorOrder.hashCode();
    h *= 1000003;
    h ^= this.disabledProcessors.hashCode();
    return h;
  }

  @Override
  public MessageProcessorsConfigWithDescriptors.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends MessageProcessorsConfigWithDescriptors.Builder {
    private List<MessageProcessorDescriptor> processorOrder;
    private Set<String> disabledProcessors;
    Builder() {
    }
    private Builder(MessageProcessorsConfigWithDescriptors source) {
      this.processorOrder = source.processorOrder();
      this.disabledProcessors = source.disabledProcessors();
    }
    @Override
    public MessageProcessorsConfigWithDescriptors.Builder processorOrder(List<MessageProcessorDescriptor> processorOrder) {
      if (processorOrder == null) {
        throw new NullPointerException("Null processorOrder");
      }
      this.processorOrder = processorOrder;
      return this;
    }
    @Override
    public MessageProcessorsConfigWithDescriptors.Builder disabledProcessors(Set<String> disabledProcessors) {
      if (disabledProcessors == null) {
        throw new NullPointerException("Null disabledProcessors");
      }
      this.disabledProcessors = disabledProcessors;
      return this;
    }
    @Override
    public MessageProcessorsConfigWithDescriptors build() {
      String missing = "";
      if (this.processorOrder == null) {
        missing += " processorOrder";
      }
      if (this.disabledProcessors == null) {
        missing += " disabledProcessors";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MessageProcessorsConfigWithDescriptors(
          this.processorOrder,
          this.disabledProcessors);
    }
  }

}
