
package org.graylog2.rest.models.system.inputs.extractors.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CreateExtractorRequest extends CreateExtractorRequest {

  private final String title;
  private final String cutOrCopy;
  private final String sourceField;
  private final String targetField;
  private final String extractorType;
  private final Map<String, Object> extractorConfig;
  private final Map<String, Map<String, Object>> converters;
  private final String conditionType;
  private final String conditionValue;
  private final long order;

  $AutoValue_CreateExtractorRequest(
      String title,
      String cutOrCopy,
      String sourceField,
      String targetField,
      String extractorType,
      Map<String, Object> extractorConfig,
      Map<String, Map<String, Object>> converters,
      String conditionType,
      String conditionValue,
      long order) {
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    if (cutOrCopy == null) {
      throw new NullPointerException("Null cutOrCopy");
    }
    this.cutOrCopy = cutOrCopy;
    if (sourceField == null) {
      throw new NullPointerException("Null sourceField");
    }
    this.sourceField = sourceField;
    if (targetField == null) {
      throw new NullPointerException("Null targetField");
    }
    this.targetField = targetField;
    if (extractorType == null) {
      throw new NullPointerException("Null extractorType");
    }
    this.extractorType = extractorType;
    if (extractorConfig == null) {
      throw new NullPointerException("Null extractorConfig");
    }
    this.extractorConfig = extractorConfig;
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
    this.order = order;
  }

  @JsonProperty
  @Override
  public String title() {
    return title;
  }

  @JsonProperty(value = "cut_or_copy")
  @Override
  public String cutOrCopy() {
    return cutOrCopy;
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

  @JsonProperty(value = "extractor_type")
  @Override
  public String extractorType() {
    return extractorType;
  }

  @JsonProperty(value = "extractor_config")
  @Override
  public Map<String, Object> extractorConfig() {
    return extractorConfig;
  }

  @JsonProperty
  @Override
  public Map<String, Map<String, Object>> converters() {
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
  public long order() {
    return order;
  }

  @Override
  public String toString() {
    return "CreateExtractorRequest{"
        + "title=" + title + ", "
        + "cutOrCopy=" + cutOrCopy + ", "
        + "sourceField=" + sourceField + ", "
        + "targetField=" + targetField + ", "
        + "extractorType=" + extractorType + ", "
        + "extractorConfig=" + extractorConfig + ", "
        + "converters=" + converters + ", "
        + "conditionType=" + conditionType + ", "
        + "conditionValue=" + conditionValue + ", "
        + "order=" + order
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateExtractorRequest) {
      CreateExtractorRequest that = (CreateExtractorRequest) o;
      return (this.title.equals(that.title()))
           && (this.cutOrCopy.equals(that.cutOrCopy()))
           && (this.sourceField.equals(that.sourceField()))
           && (this.targetField.equals(that.targetField()))
           && (this.extractorType.equals(that.extractorType()))
           && (this.extractorConfig.equals(that.extractorConfig()))
           && (this.converters.equals(that.converters()))
           && (this.conditionType.equals(that.conditionType()))
           && (this.conditionValue.equals(that.conditionValue()))
           && (this.order == that.order());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= this.cutOrCopy.hashCode();
    h *= 1000003;
    h ^= this.sourceField.hashCode();
    h *= 1000003;
    h ^= this.targetField.hashCode();
    h *= 1000003;
    h ^= this.extractorType.hashCode();
    h *= 1000003;
    h ^= this.extractorConfig.hashCode();
    h *= 1000003;
    h ^= this.converters.hashCode();
    h *= 1000003;
    h ^= this.conditionType.hashCode();
    h *= 1000003;
    h ^= this.conditionValue.hashCode();
    h *= 1000003;
    h ^= (this.order >>> 32) ^ this.order;
    return h;
  }

}
