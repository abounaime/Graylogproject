package org.graylog2.rest.models.system.inputs.extractors.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;

final class AutoValue_CreateExtractorRequest extends $AutoValue_CreateExtractorRequest {
  AutoValue_CreateExtractorRequest(String title, String cutOrCopy, String sourceField,
      String targetField, String extractorType, Map<String, Object> extractorConfig,
      Map<String, Map<String, Object>> converters, String conditionType, String conditionValue,
      long order) {
    super(title, cutOrCopy, sourceField, targetField, extractorType, extractorConfig, converters, conditionType, conditionValue, order);
  }

  @JsonIgnore
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  public final String getCutOrCopy() {
    return cutOrCopy();
  }

  @JsonIgnore
  public final String getSourceField() {
    return sourceField();
  }

  @JsonIgnore
  public final String getTargetField() {
    return targetField();
  }

  @JsonIgnore
  public final String getExtractorType() {
    return extractorType();
  }

  @JsonIgnore
  public final Map<String, Object> getExtractorConfig() {
    return extractorConfig();
  }

  @JsonIgnore
  public final Map<String, Map<String, Object>> getConverters() {
    return converters();
  }

  @JsonIgnore
  public final String getConditionType() {
    return conditionType();
  }

  @JsonIgnore
  public final String getConditionValue() {
    return conditionValue();
  }

  @JsonIgnore
  public final long getOrder() {
    return order();
  }
}
