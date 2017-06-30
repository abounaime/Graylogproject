
package org.graylog2.rest.models.system.inputs.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_InputCreateRequest extends InputCreateRequest {

  private final String title;
  private final String type;
  private final boolean global;
  private final Map<String, Object> configuration;
  private final String node;

  $AutoValue_InputCreateRequest(
      String title,
      String type,
      boolean global,
      Map<String, Object> configuration,
      @Nullable String node) {
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.global = global;
    if (configuration == null) {
      throw new NullPointerException("Null configuration");
    }
    this.configuration = configuration;
    this.node = node;
  }

  @JsonProperty
  @Override
  public String title() {
    return title;
  }

  @JsonProperty
  @Override
  public String type() {
    return type;
  }

  @JsonProperty
  @Override
  public boolean global() {
    return global;
  }

  @JsonProperty
  @Override
  public Map<String, Object> configuration() {
    return configuration;
  }

  @JsonProperty
  @Nullable
  @Override
  public String node() {
    return node;
  }

  @Override
  public String toString() {
    return "InputCreateRequest{"
        + "title=" + title + ", "
        + "type=" + type + ", "
        + "global=" + global + ", "
        + "configuration=" + configuration + ", "
        + "node=" + node
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InputCreateRequest) {
      InputCreateRequest that = (InputCreateRequest) o;
      return (this.title.equals(that.title()))
           && (this.type.equals(that.type()))
           && (this.global == that.global())
           && (this.configuration.equals(that.configuration()))
           && ((this.node == null) ? (that.node() == null) : this.node.equals(that.node()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.global ? 1231 : 1237;
    h *= 1000003;
    h ^= this.configuration.hashCode();
    h *= 1000003;
    h ^= (node == null) ? 0 : this.node.hashCode();
    return h;
  }

}
