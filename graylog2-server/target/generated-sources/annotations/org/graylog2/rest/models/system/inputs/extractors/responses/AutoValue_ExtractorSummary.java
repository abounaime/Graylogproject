package org.graylog2.rest.models.system.inputs.extractors.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

final class AutoValue_ExtractorSummary extends $AutoValue_ExtractorSummary {
  AutoValue_ExtractorSummary(String id, String title, String type, String cursorStrategy,
      String sourceField, String targetField, Map<String, Object> extractorConfig,
      String creatorUserId, List<Map<String, Object>> converters, String conditionType,
      String conditionValue, Long order, Long exceptions, Long converterExceptions,
      ExtractorMetrics metrics) {
    super(id, title, type, cursorStrategy, sourceField, targetField, extractorConfig, creatorUserId, converters, conditionType, conditionValue, order, exceptions, converterExceptions, metrics);
  }

  @JsonIgnore
  public final String getId() {
    return id();
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
  public final String getCursorStrategy() {
    return cursorStrategy();
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
  public final Map<String, Object> getExtractorConfig() {
    return extractorConfig();
  }

  @JsonIgnore
  public final String getCreatorUserId() {
    return creatorUserId();
  }

  @JsonIgnore
  public final List<Map<String, Object>> getConverters() {
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
  public final Long getOrder() {
    return order();
  }

  @JsonIgnore
  public final Long getExceptions() {
    return exceptions();
  }

  @JsonIgnore
  public final Long getConverterExceptions() {
    return converterExceptions();
  }

  @JsonIgnore
  public final ExtractorMetrics getMetrics() {
    return metrics();
  }
}
