package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

final class AutoValue_InputSummary extends $AutoValue_InputSummary {
  AutoValue_InputSummary(String title, Boolean global, String name, String contentPack,
      String inputId, DateTime createdAt, String type, String creatorUserId,
      Map<String, Object> attributes, Map<String, String> staticFields, String node) {
    super(title, global, name, contentPack, inputId, createdAt, type, creatorUserId, attributes, staticFields, node);
  }

  @JsonIgnore
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  public final Boolean isGlobal() {
    return global();
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  @Nullable
  public final String getContentPack() {
    return contentPack();
  }

  @JsonIgnore
  public final String getInputId() {
    return inputId();
  }

  @JsonIgnore
  public final DateTime getCreatedAt() {
    return createdAt();
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final String getCreatorUserId() {
    return creatorUserId();
  }

  @JsonIgnore
  public final Map<String, Object> getAttributes() {
    return attributes();
  }

  @JsonIgnore
  public final Map<String, String> getStaticFields() {
    return staticFields();
  }

  @JsonIgnore
  @Nullable
  public final String getNode() {
    return node();
  }
}
