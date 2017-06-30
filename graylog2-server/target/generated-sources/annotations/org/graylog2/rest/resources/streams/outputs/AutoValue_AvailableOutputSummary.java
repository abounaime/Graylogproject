package org.graylog2.rest.resources.streams.outputs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.graylog2.plugin.configuration.ConfigurationRequest;

final class AutoValue_AvailableOutputSummary extends $AutoValue_AvailableOutputSummary {
  AutoValue_AvailableOutputSummary(String name, String type, String humanName, String linkToDocs,
      ConfigurationRequest requestedConfiguration) {
    super(name, type, humanName, linkToDocs, requestedConfiguration);
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final String getHumanName() {
    return humanName();
  }

  @JsonIgnore
  public final String getLinkToDocs() {
    return linkToDocs();
  }

  @JsonIgnore
  public final ConfigurationRequest getRequestedConfiguration() {
    return requestedConfiguration();
  }
}
