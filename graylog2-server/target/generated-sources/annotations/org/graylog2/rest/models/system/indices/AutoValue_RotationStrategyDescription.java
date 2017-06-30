package org.graylog2.rest.models.system.indices;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import java.lang.String;
import org.graylog2.plugin.indexer.rotation.RotationStrategyConfig;

final class AutoValue_RotationStrategyDescription extends $AutoValue_RotationStrategyDescription {
  AutoValue_RotationStrategyDescription(String type, RotationStrategyConfig defaultConfig,
      JsonSchema jsonSchema) {
    super(type, defaultConfig, jsonSchema);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final RotationStrategyConfig getDefaultConfig() {
    return defaultConfig();
  }

  @JsonIgnore
  public final JsonSchema getJsonSchema() {
    return jsonSchema();
  }
}
