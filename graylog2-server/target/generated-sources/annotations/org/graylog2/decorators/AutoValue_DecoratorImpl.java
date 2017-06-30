package org.graylog2.decorators;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.hibernate.validator.constraints.NotBlank;
import org.mongojack.Id;
import org.mongojack.ObjectId;

final class AutoValue_DecoratorImpl extends $AutoValue_DecoratorImpl {
  AutoValue_DecoratorImpl(String id, String type, Map<String, Object> config,
      Optional<String> stream, int order) {
    super(id, type, config, stream, order);
  }

  @JsonIgnore
  @Id
  @ObjectId
  @Nullable
  public final String getId() {
    return id();
  }

  @JsonIgnore
  @NotBlank
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final Map<String, Object> getConfig() {
    return config();
  }

  @JsonIgnore
  public final Optional<String> getStream() {
    return stream();
  }

  @JsonIgnore
  public final int getOrder() {
    return order();
  }
}
