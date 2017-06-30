
package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_InputTypeInfo extends InputTypeInfo {

  private final String type;
  private final String name;
  private final boolean isExclusive;
  private final Map<String, Map<String, Object>> requestedConfiguration;
  private final String linkToDocs;

  $AutoValue_InputTypeInfo(
      String type,
      String name,
      boolean isExclusive,
      Map<String, Map<String, Object>> requestedConfiguration,
      String linkToDocs) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    this.isExclusive = isExclusive;
    if (requestedConfiguration == null) {
      throw new NullPointerException("Null requestedConfiguration");
    }
    this.requestedConfiguration = requestedConfiguration;
    if (linkToDocs == null) {
      throw new NullPointerException("Null linkToDocs");
    }
    this.linkToDocs = linkToDocs;
  }

  @JsonProperty
  @Override
  public String type() {
    return type;
  }

  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  @JsonProperty(value = "is_exclusive")
  @Override
  public boolean isExclusive() {
    return isExclusive;
  }

  @JsonProperty
  @Override
  public Map<String, Map<String, Object>> requestedConfiguration() {
    return requestedConfiguration;
  }

  @JsonProperty
  @Override
  public String linkToDocs() {
    return linkToDocs;
  }

  @Override
  public String toString() {
    return "InputTypeInfo{"
        + "type=" + type + ", "
        + "name=" + name + ", "
        + "isExclusive=" + isExclusive + ", "
        + "requestedConfiguration=" + requestedConfiguration + ", "
        + "linkToDocs=" + linkToDocs
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InputTypeInfo) {
      InputTypeInfo that = (InputTypeInfo) o;
      return (this.type.equals(that.type()))
           && (this.name.equals(that.name()))
           && (this.isExclusive == that.isExclusive())
           && (this.requestedConfiguration.equals(that.requestedConfiguration()))
           && (this.linkToDocs.equals(that.linkToDocs()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.isExclusive ? 1231 : 1237;
    h *= 1000003;
    h ^= this.requestedConfiguration.hashCode();
    h *= 1000003;
    h ^= this.linkToDocs.hashCode();
    return h;
  }

}
