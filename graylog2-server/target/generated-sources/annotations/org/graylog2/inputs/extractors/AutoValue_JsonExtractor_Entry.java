package org.graylog2.inputs.extractors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_JsonExtractor_Entry extends $AutoValue_JsonExtractor_Entry {
  AutoValue_JsonExtractor_Entry(String key, Object value) {
    super(key, value);
  }

  @JsonIgnore
  public final String getKey() {
    return key();
  }

  @JsonIgnore
  @Nullable
  public final Object getValue() {
    return value();
  }
}
