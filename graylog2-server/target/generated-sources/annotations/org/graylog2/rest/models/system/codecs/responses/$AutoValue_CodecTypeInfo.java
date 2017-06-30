
package org.graylog2.rest.models.system.codecs.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CodecTypeInfo extends CodecTypeInfo {

  private final String type;
  private final String name;
  private final Map<String, Map<String, Object>> requestedConfiguration;

  $AutoValue_CodecTypeInfo(
      String type,
      String name,
      Map<String, Map<String, Object>> requestedConfiguration) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (requestedConfiguration == null) {
      throw new NullPointerException("Null requestedConfiguration");
    }
    this.requestedConfiguration = requestedConfiguration;
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

  @JsonProperty
  @Override
  public Map<String, Map<String, Object>> requestedConfiguration() {
    return requestedConfiguration;
  }

  @Override
  public String toString() {
    return "CodecTypeInfo{"
        + "type=" + type + ", "
        + "name=" + name + ", "
        + "requestedConfiguration=" + requestedConfiguration
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CodecTypeInfo) {
      CodecTypeInfo that = (CodecTypeInfo) o;
      return (this.type.equals(that.type()))
           && (this.name.equals(that.name()))
           && (this.requestedConfiguration.equals(that.requestedConfiguration()));
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
    h ^= this.requestedConfiguration.hashCode();
    return h;
  }

}
