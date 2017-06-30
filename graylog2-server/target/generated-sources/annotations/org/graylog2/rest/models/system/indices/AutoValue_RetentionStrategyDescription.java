package org.graylog2.rest.models.system.indices;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import java.lang.String;
import org.graylog2.plugin.indexer.retention.RetentionStrategyConfig;

final class AutoValue_RetentionStrategyDescription extends $AutoValue_RetentionStrategyDescription {
  AutoValue_RetentionStrategyDescription(String type, RetentionStrategyConfig defaultConfig,
      JsonSchema jsonSchema) {
    super(type, defaultConfig, jsonSchema);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final RetentionStrategyConfig getDefaultConfig() {
    return defaultConfig();
  }

  @JsonIgnore
  public final JsonSchema getJsonSchema() {
    return jsonSchema();
  }
}
