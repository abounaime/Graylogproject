package org.graylog2.rest.models.messages.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

final class AutoValue_MessageParseRequest extends $AutoValue_MessageParseRequest {
  AutoValue_MessageParseRequest(String message, String codec, String remoteAddress,
      Map<String, Object> configuration) {
    super(message, codec, remoteAddress, configuration);
  }

  @JsonIgnore
  public final String getMessage() {
    return message();
  }

  @JsonIgnore
  public final String getCodec() {
    return codec();
  }

  @JsonIgnore
  public final String getRemoteAddress() {
    return remoteAddress();
  }

  @JsonIgnore
  @Nullable
  public final Map<String, Object> getConfiguration() {
    return configuration();
  }
}
