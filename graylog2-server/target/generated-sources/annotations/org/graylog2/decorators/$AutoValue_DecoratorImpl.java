
package org.graylog2.decorators;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.hibernate.validator.constraints.NotBlank;
import org.mongojack.Id;
import org.mongojack.ObjectId;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_DecoratorImpl extends DecoratorImpl {

  private final String id;
  private final String type;
  private final Map<String, Object> config;
  private final Optional<String> stream;
  private final int order;

  $AutoValue_DecoratorImpl(
      @Nullable String id,
      String type,
      Map<String, Object> config,
      Optional<String> stream,
      int order) {
    this.id = id;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (config == null) {
      throw new NullPointerException("Null config");
    }
    this.config = config;
    if (stream == null) {
      throw new NullPointerException("Null stream");
    }
    this.stream = stream;
    this.order = order;
  }

  @JsonProperty(value = "id")
  @Id
  @ObjectId
  @Nullable
  @Override
  public String id() {
    return id;
  }

  @JsonProperty(value = "type")
  @NotBlank
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "config")
  @Override
  public Map<String, Object> config() {
    return config;
  }

  @JsonProperty(value = "stream")
  @Override
  public Optional<String> stream() {
    return stream;
  }

  @JsonProperty(value = "order")
  @Override
  public int order() {
    return order;
  }

  @Override
  public String toString() {
    return "DecoratorImpl{"
        + "id=" + id + ", "
        + "type=" + type + ", "
        + "config=" + config + ", "
        + "stream=" + stream + ", "
        + "order=" + order
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DecoratorImpl) {
      DecoratorImpl that = (DecoratorImpl) o;
      return ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && (this.type.equals(that.type()))
           && (this.config.equals(that.config()))
           && (this.stream.equals(that.stream()))
           && (this.order == that.order());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (id == null) ? 0 : this.id.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.config.hashCode();
    h *= 1000003;
    h ^= this.stream.hashCode();
    h *= 1000003;
    h ^= this.order;
    return h;
  }

  @Override
  public DecoratorImpl.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends DecoratorImpl.Builder {
    private String id;
    private String type;
    private Map<String, Object> config;
    private Optional<String> stream = Optional.empty();
    private Integer order;
    Builder() {
    }
    private Builder(DecoratorImpl source) {
      this.id = source.id();
      this.type = source.type();
      this.config = source.config();
      this.stream = source.stream();
      this.order = source.order();
    }
    @Override
    public DecoratorImpl.Builder id(@Nullable String id) {
      this.id = id;
      return this;
    }
    @Override
    DecoratorImpl.Builder type(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    DecoratorImpl.Builder config(Map<String, Object> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    DecoratorImpl.Builder stream(Optional<String> stream) {
      if (stream == null) {
        throw new NullPointerException("Null stream");
      }
      this.stream = stream;
      return this;
    }
    @Override
    DecoratorImpl.Builder order(int order) {
      this.order = order;
      return this;
    }
    @Override
    public DecoratorImpl build() {
      String missing = "";
      if (this.type == null) {
        missing += " type";
      }
      if (this.config == null) {
        missing += " config";
      }
      if (this.order == null) {
        missing += " order";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_DecoratorImpl(
          this.id,
          this.type,
          this.config,
          this.stream,
          this.order);
    }
  }

}
