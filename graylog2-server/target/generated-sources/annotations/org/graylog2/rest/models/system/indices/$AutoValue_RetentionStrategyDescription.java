
package org.graylog2.rest.models.system.indices;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import javax.annotation.Generated;
import org.graylog2.plugin.indexer.retention.RetentionStrategyConfig;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RetentionStrategyDescription extends RetentionStrategyDescription {

  private final String type;
  private final RetentionStrategyConfig defaultConfig;
  private final JsonSchema jsonSchema;

  $AutoValue_RetentionStrategyDescription(
      String type,
      RetentionStrategyConfig defaultConfig,
      JsonSchema jsonSchema) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (defaultConfig == null) {
      throw new NullPointerException("Null defaultConfig");
    }
    this.defaultConfig = defaultConfig;
    if (jsonSchema == null) {
      throw new NullPointerException("Null jsonSchema");
    }
    this.jsonSchema = jsonSchema;
  }

  @JsonProperty(value = "type")
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "default_config")
  @Override
  public RetentionStrategyConfig defaultConfig() {
    return defaultConfig;
  }

  @JsonProperty(value = "json_schema")
  @Override
  public JsonSchema jsonSchema() {
    return jsonSchema;
  }

  @Override
  public String toString() {
    return "RetentionStrategyDescription{"
        + "type=" + type + ", "
        + "defaultConfig=" + defaultConfig + ", "
        + "jsonSchema=" + jsonSchema
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RetentionStrategyDescription) {
      RetentionStrategyDescription that = (RetentionStrategyDescription) o;
      return (this.type.equals(that.type()))
           && (this.defaultConfig.equals(that.defaultConfig()))
           && (this.jsonSchema.equals(that.jsonSchema()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.defaultConfig.hashCode();
    h *= 1000003;
    h ^= this.jsonSchema.hashCode();
    return h;
  }

}
