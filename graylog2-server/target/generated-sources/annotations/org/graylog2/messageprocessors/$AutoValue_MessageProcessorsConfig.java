
package org.graylog2.messageprocessors;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MessageProcessorsConfig extends MessageProcessorsConfig {

  private final List<String> processorOrder;
  private final Set<String> disabledProcessors;

  $AutoValue_MessageProcessorsConfig(
      List<String> processorOrder,
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
  public List<String> processorOrder() {
    return processorOrder;
  }

  @JsonProperty(value = "disabled_processors")
  @Override
  public Set<String> disabledProcessors() {
    return disabledProcessors;
  }

  @Override
  public String toString() {
    return "MessageProcessorsConfig{"
        + "processorOrder=" + processorOrder + ", "
        + "disabledProcessors=" + disabledProcessors
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MessageProcessorsConfig) {
      MessageProcessorsConfig that = (MessageProcessorsConfig) o;
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
  public MessageProcessorsConfig.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends MessageProcessorsConfig.Builder {
    private List<String> processorOrder;
    private Set<String> disabledProcessors;
    Builder() {
    }
    private Builder(MessageProcessorsConfig source) {
      this.processorOrder = source.processorOrder();
      this.disabledProcessors = source.disabledProcessors();
    }
    @Override
    public MessageProcessorsConfig.Builder processorOrder(List<String> processorOrder) {
      if (processorOrder == null) {
        throw new NullPointerException("Null processorOrder");
      }
      this.processorOrder = processorOrder;
      return this;
    }
    @Override
    public MessageProcessorsConfig.Builder disabledProcessors(Set<String> disabledProcessors) {
      if (disabledProcessors == null) {
        throw new NullPointerException("Null disabledProcessors");
      }
      this.disabledProcessors = disabledProcessors;
      return this;
    }
    @Override
    public MessageProcessorsConfig build() {
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
      return new AutoValue_MessageProcessorsConfig(
          this.processorOrder,
          this.disabledProcessors);
    }
  }

}
