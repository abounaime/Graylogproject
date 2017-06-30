
package org.graylog2.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AppConfig extends AppConfig {

  private final URI serverUri;
  private final String appPathPrefix;

  $AutoValue_AppConfig(
      URI serverUri,
      String appPathPrefix) {
    if (serverUri == null) {
      throw new NullPointerException("Null serverUri");
    }
    this.serverUri = serverUri;
    if (appPathPrefix == null) {
      throw new NullPointerException("Null appPathPrefix");
    }
    this.appPathPrefix = appPathPrefix;
  }

  @JsonProperty(value = "gl2ServerUrl")
  @Override
  public URI serverUri() {
    return serverUri;
  }

  @JsonProperty(value = "gl2AppPathPrefix")
  @Override
  public String appPathPrefix() {
    return appPathPrefix;
  }

  @Override
  public String toString() {
    return "AppConfig{"
        + "serverUri=" + serverUri + ", "
        + "appPathPrefix=" + appPathPrefix
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AppConfig) {
      AppConfig that = (AppConfig) o;
      return (this.serverUri.equals(that.serverUri()))
           && (this.appPathPrefix.equals(that.appPathPrefix()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.serverUri.hashCode();
    h *= 1000003;
    h ^= this.appPathPrefix.hashCode();
    return h;
  }

}
