package org.graylog2.grok;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;
import org.mongojack.Id;
import org.mongojack.ObjectId;

final class AutoValue_GrokPattern extends $AutoValue_GrokPattern {
  AutoValue_GrokPattern(String id, String name, String pattern, String contentPack) {
    super(id, name, pattern, contentPack);
  }

  @JsonIgnore
  @Nullable
  @Id
  @ObjectId
  public final String getId() {
    return id();
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final String getPattern() {
    return pattern();
  }

  @JsonIgnore
  @Nullable
  public final String getContentPack() {
    return contentPack();
  }
}
