
package org.graylog2.rest.models.system.inputs.extractors.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ExtractorSummary extends ExtractorSummary {

  private final String id;
  private final String title;
  private final String type;
  private final String cursorStrategy;
  private final String sourceField;
  private final String targetField;
  private final Map<String, Object> extractorConfig;
  private final String creatorUserId;
  private final List<Map<String, Object>> converters;
  private final String conditionType;
  private final String conditionValue;
  private final Long order;
  private final Long exceptions;
  private final Long converterExceptions;
  private final ExtractorMetrics metrics;

  $AutoValue_ExtractorSummary(
      String id,
      String title,
      String type,
      String cursorStrategy,
      String sourceField,
      String targetField,
      Map<String, Object> extractorConfig,
      String creatorUserId,
      List<Map<String, Object>> converters,
      String conditionType,
      String conditionValue,
      Long order,
      Long exceptions,
      Long converterExceptions,
      ExtractorMetrics metrics) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (cursorStrategy == null) {
      throw new NullPointerException("Null cursorStrategy");
    }
    this.cursorStrategy = cursorStrategy;
    if (sourceField == null) {
      throw new NullPointerException("Null sourceField");
    }
    this.sourceField = sourceField;
    if (targetField == null) {
      throw new NullPointerException("Null targetField");
    }
    this.targetField = targetField;
    if (extractorConfig == null) {
      throw new NullPointerException("Null extractorConfig");
    }
    this.extractorConfig = extractorConfig;
    if (creatorUserId == null) {
      throw new NullPointerException("Null creatorUserId");
    }
    this.creatorUserId = creatorUserId;
    if (converters == null) {
      throw new NullPointerException("Null converters");
    }
    this.converters = converters;
    if (conditionType == null) {
      throw new NullPointerException("Null conditionType");
    }
    this.conditionType = conditionType;
    if (conditionValue == null) {
      throw new NullPointerException("Null conditionValue");
    }
    this.conditionValue = conditionValue;
    if (order == null) {
      throw new NullPointerException("Null order");
    }
    this.order = order;
    if (exceptions == null) {
      throw new NullPointerException("Null exceptions");
    }
    this.exceptions = exceptions;
    if (converterExceptions == null) {
      throw new NullPointerException("Null converterExceptions");
    }
    this.converterExceptions = converterExceptions;
    if (metrics == null) {
      throw new NullPointerException("Null metrics");
    }
    this.metrics = metrics;
  }

  @JsonProperty
  @Override
  public String id() {
    return id;
  }

  @JsonProperty
  @Override
  public String title() {
    return title;
  }

  @JsonProperty
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "cursor_strategy")
  @Override
  public String cursorStrategy() {
    return cursorStrategy;
  }

  @JsonProperty(value = "source_field")
  @Override
  public String sourceField() {
    return sourceField;
  }

  @JsonProperty(value = "target_field")
  @Override
  public String targetField() {
    return targetField;
  }

  @JsonProperty(value = "extractor_config")
  @Override
  public Map<String, Object> extractorConfig() {
    return extractorConfig;
  }

  @JsonProperty(value = "creator_user_id")
  @Override
  public String creatorUserId() {
    return creatorUserId;
  }

  @JsonProperty
  @Override
  public List<Map<String, Object>> converters() {
    return converters;
  }

  @JsonProperty(value = "condition_type")
  @Override
  public String conditionType() {
    return conditionType;
  }

  @JsonProperty(value = "condition_value")
  @Override
  public String conditionValue() {
    return conditionValue;
  }

  @JsonProperty
  @Override
  public Long order() {
    return order;
  }

  @JsonProperty
  @Override
  public Long exceptions() {
    return exceptions;
  }

  @JsonProperty(value = "converter_exceptions")
  @Override
  public Long converterExceptions() {
    return converterExceptions;
  }

  @JsonProperty
  @Override
  public ExtractorMetrics metrics() {
    return metrics;
  }

  @Override
  public String toString() {
    return "ExtractorSummary{"
        + "id=" + id + ", "
        + "title=" + title + ", "
        + "type=" + type + ", "
        + "cursorStrategy=" + cursorStrategy + ", "
        + "sourceField=" + sourceField + ", "
        + "targetField=" + targetField + ", "
        + "extractorConfig=" + extractorConfig + ", "
        + "creatorUserId=" + creatorUserId + ", "
        + "converters=" + converters + ", "
        + "conditionType=" + conditionType + ", "
        + "conditionValue=" + conditionValue + ", "
        + "order=" + order + ", "
        + "exceptions=" + exceptions + ", "
        + "converterExceptions=" + converterExceptions + ", "
        + "metrics=" + metrics
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ExtractorSummary) {
      ExtractorSummary that = (ExtractorSummary) o;
      return (this.id.equals(that.id()))
           && (this.title.equals(that.title()))
           && (this.type.equals(that.type()))
           && (this.cursorStrategy.equals(that.cursorStrategy()))
           && (this.sourceField.equals(that.sourceField()))
           && (this.targetField.equals(that.targetField()))
           && (this.extractorConfig.equals(that.extractorConfig()))
           && (this.creatorUserId.equals(that.creatorUserId()))
           && (this.converters.equals(that.converters()))
           && (this.conditionType.equals(that.conditionType()))
           && (this.conditionValue.equals(that.conditionValue()))
           && (this.order.equals(that.order()))
           && (this.exceptions.equals(that.exceptions()))
           && (this.converterExceptions.equals(that.converterExceptions()))
           && (this.metrics.equals(that.metrics()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.cursorStrategy.hashCode();
    h *= 1000003;
    h ^= this.sourceField.hashCode();
    h *= 1000003;
    h ^= this.targetField.hashCode();
    h *= 1000003;
    h ^= this.extractorConfig.hashCode();
    h *= 1000003;
    h ^= this.creatorUserId.hashCode();
    h *= 1000003;
    h ^= this.converters.hashCode();
    h *= 1000003;
    h ^= this.conditionType.hashCode();
    h *= 1000003;
    h ^= this.conditionValue.hashCode();
    h *= 1000003;
    h ^= this.order.hashCode();
    h *= 1000003;
    h ^= this.exceptions.hashCode();
    h *= 1000003;
    h ^= this.converterExceptions.hashCode();
    h *= 1000003;
    h ^= this.metrics.hashCode();
    return h;
  }

}
