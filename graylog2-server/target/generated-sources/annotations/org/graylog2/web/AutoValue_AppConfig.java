package org.graylog2.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.net.URI;

final class AutoValue_AppConfig extends $AutoValue_AppConfig {
  AutoValue_AppConfig(URI serverUri, String appPathPrefix) {
    super(serverUri, appPathPrefix);
  }

  @JsonIgnore
  public final URI getServerUri() {
    return serverUri();
  }

  @JsonIgnore
  public final String getAppPathPrefix() {
    return appPathPrefix();
  }
}
