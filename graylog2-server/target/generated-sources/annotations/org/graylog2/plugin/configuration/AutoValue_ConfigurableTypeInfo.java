package org.graylog2.plugin.configuration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_ConfigurableTypeInfo extends $AutoValue_ConfigurableTypeInfo {
  AutoValue_ConfigurableTypeInfo(String type, String name, String humanName,
      ConfigurationRequest requestedConfiguration, String linkToDocs) {
    super(type, name, humanName, requestedConfiguration, linkToDocs);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final String getHumanName() {
    return humanName();
  }

  @JsonIgnore
  public final ConfigurationRequest getRequestedConfiguration() {
    return requestedConfiguration();
  }

  @JsonIgnore
  public final String getLinkToDocs() {
    return linkToDocs();
  }
}
