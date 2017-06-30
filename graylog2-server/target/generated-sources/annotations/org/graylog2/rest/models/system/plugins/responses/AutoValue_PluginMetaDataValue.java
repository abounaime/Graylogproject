package org.graylog2.rest.models.system.plugins.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.net.URI;
import java.util.Set;

final class AutoValue_PluginMetaDataValue extends $AutoValue_PluginMetaDataValue {
  AutoValue_PluginMetaDataValue(String uniqueId, String name, String author, URI url,
      String version, String description, String requiredVersion,
      Set<String> requiredCapabilities) {
    super(uniqueId, name, author, url, version, description, requiredVersion, requiredCapabilities);
  }

  @JsonIgnore
  public final String getUniqueId() {
    return uniqueId();
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final String getAuthor() {
    return author();
  }

  @JsonIgnore
  public final URI getUrl() {
    return url();
  }

  @JsonIgnore
  public final String getVersion() {
    return version();
  }

  @JsonIgnore
  public final String getDescription() {
    return description();
  }

  @JsonIgnore
  public final String getRequiredVersion() {
    return requiredVersion();
  }

  @JsonIgnore
  public final Set<String> getRequiredCapabilities() {
    return requiredCapabilities();
  }
}
