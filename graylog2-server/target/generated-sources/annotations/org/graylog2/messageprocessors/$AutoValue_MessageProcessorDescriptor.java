
package org.graylog2.messageprocessors;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MessageProcessorDescriptor extends MessageProcessorDescriptor {

  private final String name;
  private final String className;

  $AutoValue_MessageProcessorDescriptor(
      String name,
      String className) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (className == null) {
      throw new NullPointerException("Null className");
    }
    this.className = className;
  }

  @JsonProperty(value = "name")
  @Override
  public String name() {
    return name;
  }

  @JsonProperty(value = "class_name")
  @Override
  public String className() {
    return className;
  }

  @Override
  public String toString() {
    return "MessageProcessorDescriptor{"
        + "name=" + name + ", "
        + "className=" + className
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MessageProcessorDescriptor) {
      MessageProcessorDescriptor that = (MessageProcessorDescriptor) o;
      return (this.name.equals(that.name()))
           && (this.className.equals(that.className()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.className.hashCode();
    return h;
  }

}
