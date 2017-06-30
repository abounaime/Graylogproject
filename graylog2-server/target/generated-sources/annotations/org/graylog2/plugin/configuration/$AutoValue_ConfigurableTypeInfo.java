
package org.graylog2.plugin.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ConfigurableTypeInfo extends ConfigurableTypeInfo {

  private final String type;
  private final String name;
  private final String humanName;
  private final ConfigurationRequest requestedConfiguration;
  private final String linkToDocs;

  $AutoValue_ConfigurableTypeInfo(
      String type,
      String name,
      String humanName,
      ConfigurationRequest requestedConfiguration,
      String linkToDocs) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (humanName == null) {
      throw new NullPointerException("Null humanName");
    }
    this.humanName = humanName;
    if (requestedConfiguration == null) {
      throw new NullPointerException("Null requestedConfiguration");
    }
    this.requestedConfiguration = requestedConfiguration;
    if (linkToDocs == null) {
      throw new NullPointerException("Null linkToDocs");
    }
    this.linkToDocs = linkToDocs;
  }

  @JsonProperty(value = "type")
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "name")
  @Override
  public String name() {
    return name;
  }

  @JsonProperty(value = "human_name")
  @Override
  public String humanName() {
    return humanName;
  }

  @JsonProperty(value = "requested_configuration")
  @Override
  public ConfigurationRequest requestedConfiguration() {
    return requestedConfiguration;
  }

  @JsonProperty(value = "link_to_docs")
  @Override
  public String linkToDocs() {
    return linkToDocs;
  }

  @Override
  public String toString() {
    return "ConfigurableTypeInfo{"
        + "type=" + type + ", "
        + "name=" + name + ", "
        + "humanName=" + humanName + ", "
        + "requestedConfiguration=" + requestedConfiguration + ", "
        + "linkToDocs=" + linkToDocs
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ConfigurableTypeInfo) {
      ConfigurableTypeInfo that = (ConfigurableTypeInfo) o;
      return (this.type.equals(that.type()))
           && (this.name.equals(that.name()))
           && (this.humanName.equals(that.humanName()))
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
    h ^= this.humanName.hashCode();
    h *= 1000003;
    h ^= this.requestedConfiguration.hashCode();
    h *= 1000003;
    h ^= this.linkToDocs.hashCode();
    return h;
  }

}
