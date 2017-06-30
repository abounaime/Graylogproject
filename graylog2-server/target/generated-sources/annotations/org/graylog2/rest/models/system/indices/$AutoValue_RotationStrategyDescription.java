
package org.graylog2.rest.models.system.indices;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import javax.annotation.Generated;
import org.graylog2.plugin.indexer.rotation.RotationStrategyConfig;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RotationStrategyDescription extends RotationStrategyDescription {

  private final String type;
  private final RotationStrategyConfig defaultConfig;
  private final JsonSchema jsonSchema;

  $AutoValue_RotationStrategyDescription(
      String type,
      RotationStrategyConfig defaultConfig,
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
  public RotationStrategyConfig defaultConfig() {
    return defaultConfig;
  }

  @JsonProperty(value = "json_schema")
  @Override
  public JsonSchema jsonSchema() {
    return jsonSchema;
  }

  @Override
  public String toString() {
    return "RotationStrategyDescription{"
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
    if (o instanceof RotationStrategyDescription) {
      RotationStrategyDescription that = (RotationStrategyDescription) o;
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
