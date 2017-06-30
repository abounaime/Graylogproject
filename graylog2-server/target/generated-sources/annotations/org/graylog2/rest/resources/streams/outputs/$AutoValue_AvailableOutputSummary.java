
package org.graylog2.rest.resources.streams.outputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.graylog2.plugin.configuration.ConfigurationRequest;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AvailableOutputSummary extends AvailableOutputSummary {

  private final String name;
  private final String type;
  private final String humanName;
  private final String linkToDocs;
  private final ConfigurationRequest requestedConfiguration;

  $AutoValue_AvailableOutputSummary(
      String name,
      String type,
      String humanName,
      String linkToDocs,
      ConfigurationRequest requestedConfiguration) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (humanName == null) {
      throw new NullPointerException("Null humanName");
    }
    this.humanName = humanName;
    if (linkToDocs == null) {
      throw new NullPointerException("Null linkToDocs");
    }
    this.linkToDocs = linkToDocs;
    if (requestedConfiguration == null) {
      throw new NullPointerException("Null requestedConfiguration");
    }
    this.requestedConfiguration = requestedConfiguration;
  }

  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  @JsonProperty
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "human_name")
  @Override
  public String humanName() {
    return humanName;
  }

  @JsonProperty(value = "link_to_docs")
  @Override
  public String linkToDocs() {
    return linkToDocs;
  }

  @JsonProperty
  @Override
  public ConfigurationRequest requestedConfiguration() {
    return requestedConfiguration;
  }

  @Override
  public String toString() {
    return "AvailableOutputSummary{"
        + "name=" + name + ", "
        + "type=" + type + ", "
        + "humanName=" + humanName + ", "
        + "linkToDocs=" + linkToDocs + ", "
        + "requestedConfiguration=" + requestedConfiguration
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AvailableOutputSummary) {
      AvailableOutputSummary that = (AvailableOutputSummary) o;
      return (this.name.equals(that.name()))
           && (this.type.equals(that.type()))
           && (this.humanName.equals(that.humanName()))
           && (this.linkToDocs.equals(that.linkToDocs()))
           && (this.requestedConfiguration.equals(that.requestedConfiguration()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.humanName.hashCode();
    h *= 1000003;
    h ^= this.linkToDocs.hashCode();
    h *= 1000003;
    h ^= this.requestedConfiguration.hashCode();
    return h;
  }

}
