
package org.graylog2.rest.models.messages.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MessageParseRequest extends MessageParseRequest {

  private final String message;
  private final String codec;
  private final String remoteAddress;
  private final Map<String, Object> configuration;

  $AutoValue_MessageParseRequest(
      String message,
      String codec,
      String remoteAddress,
      @Nullable Map<String, Object> configuration) {
    if (message == null) {
      throw new NullPointerException("Null message");
    }
    this.message = message;
    if (codec == null) {
      throw new NullPointerException("Null codec");
    }
    this.codec = codec;
    if (remoteAddress == null) {
      throw new NullPointerException("Null remoteAddress");
    }
    this.remoteAddress = remoteAddress;
    this.configuration = configuration;
  }

  @JsonProperty
  @Override
  public String message() {
    return message;
  }

  @JsonProperty
  @Override
  public String codec() {
    return codec;
  }

  @JsonProperty
  @Override
  public String remoteAddress() {
    return remoteAddress;
  }

  @JsonProperty
  @Nullable
  @Override
  public Map<String, Object> configuration() {
    return configuration;
  }

  @Override
  public String toString() {
    return "MessageParseRequest{"
        + "message=" + message + ", "
        + "codec=" + codec + ", "
        + "remoteAddress=" + remoteAddress + ", "
        + "configuration=" + configuration
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MessageParseRequest) {
      MessageParseRequest that = (MessageParseRequest) o;
      return (this.message.equals(that.message()))
           && (this.codec.equals(that.codec()))
           && (this.remoteAddress.equals(that.remoteAddress()))
           && ((this.configuration == null) ? (that.configuration() == null) : this.configuration.equals(that.configuration()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.message.hashCode();
    h *= 1000003;
    h ^= this.codec.hashCode();
    h *= 1000003;
    h ^= this.remoteAddress.hashCode();
    h *= 1000003;
    h ^= (configuration == null) ? 0 : this.configuration.hashCode();
    return h;
  }

}
