package org.graylog2.rest.models.system.inputs.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

final class AutoValue_InputCreateRequest extends $AutoValue_InputCreateRequest {
  AutoValue_InputCreateRequest(String title, String type, boolean global,
      Map<String, Object> configuration, String node) {
    super(title, type, global, configuration, node);
  }

  @JsonIgnore
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final boolean isGlobal() {
    return global();
  }

  @JsonIgnore
  public final Map<String, Object> getConfiguration() {
    return configuration();
  }

  @JsonIgnore
  @Nullable
  public final String getNode() {
    return node();
  }
}
