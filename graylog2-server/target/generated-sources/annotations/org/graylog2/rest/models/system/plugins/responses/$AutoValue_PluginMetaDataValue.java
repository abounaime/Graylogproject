
package org.graylog2.rest.models.system.plugins.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_PluginMetaDataValue extends PluginMetaDataValue {

  private final String uniqueId;
  private final String name;
  private final String author;
  private final URI url;
  private final String version;
  private final String description;
  private final String requiredVersion;
  private final Set<String> requiredCapabilities;

  $AutoValue_PluginMetaDataValue(
      String uniqueId,
      String name,
      String author,
      URI url,
      String version,
      String description,
      String requiredVersion,
      Set<String> requiredCapabilities) {
    if (uniqueId == null) {
      throw new NullPointerException("Null uniqueId");
    }
    this.uniqueId = uniqueId;
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (author == null) {
      throw new NullPointerException("Null author");
    }
    this.author = author;
    if (url == null) {
      throw new NullPointerException("Null url");
    }
    this.url = url;
    if (version == null) {
      throw new NullPointerException("Null version");
    }
    this.version = version;
    if (description == null) {
      throw new NullPointerException("Null description");
    }
    this.description = description;
    if (requiredVersion == null) {
      throw new NullPointerException("Null requiredVersion");
    }
    this.requiredVersion = requiredVersion;
    if (requiredCapabilities == null) {
      throw new NullPointerException("Null requiredCapabilities");
    }
    this.requiredCapabilities = requiredCapabilities;
  }

  @JsonProperty(value = "unique_id")
  @Override
  public String uniqueId() {
    return uniqueId;
  }

  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  @JsonProperty
  @Override
  public String author() {
    return author;
  }

  @JsonProperty
  @Override
  public URI url() {
    return url;
  }

  @JsonProperty
  @Override
  public String version() {
    return version;
  }

  @JsonProperty
  @Override
  public String description() {
    return description;
  }

  @JsonProperty(value = "required_version")
  @Override
  public String requiredVersion() {
    return requiredVersion;
  }

  @JsonProperty(value = "required_capabilities")
  @Override
  public Set<String> requiredCapabilities() {
    return requiredCapabilities;
  }

  @Override
  public String toString() {
    return "PluginMetaDataValue{"
        + "uniqueId=" + uniqueId + ", "
        + "name=" + name + ", "
        + "author=" + author + ", "
        + "url=" + url + ", "
        + "version=" + version + ", "
        + "description=" + description + ", "
        + "requiredVersion=" + requiredVersion + ", "
        + "requiredCapabilities=" + requiredCapabilities
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PluginMetaDataValue) {
      PluginMetaDataValue that = (PluginMetaDataValue) o;
      return (this.uniqueId.equals(that.uniqueId()))
           && (this.name.equals(that.name()))
           && (this.author.equals(that.author()))
           && (this.url.equals(that.url()))
           && (this.version.equals(that.version()))
           && (this.description.equals(that.description()))
           && (this.requiredVersion.equals(that.requiredVersion()))
           && (this.requiredCapabilities.equals(that.requiredCapabilities()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.uniqueId.hashCode();
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.author.hashCode();
    h *= 1000003;
    h ^= this.url.hashCode();
    h *= 1000003;
    h ^= this.version.hashCode();
    h *= 1000003;
    h ^= this.description.hashCode();
    h *= 1000003;
    h ^= this.requiredVersion.hashCode();
    h *= 1000003;
    h ^= this.requiredCapabilities.hashCode();
    return h;
  }

}
