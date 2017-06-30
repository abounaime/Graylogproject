
package org.graylog2.lookup.caches;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_NullCache_Config extends NullCache.Config {

  private final String type;

  $AutoValue_NullCache_Config(
      String type) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
  }

  @JsonProperty(value = "type")
  @Override
  public String type() {
    return type;
  }

  @Override
  public String toString() {
    return "Config{"
        + "type=" + type
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NullCache.Config) {
      NullCache.Config that = (NullCache.Config) o;
      return (this.type.equals(that.type()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    return h;
  }

  static final class Builder extends NullCache.Config.Builder {
    private String type;
    Builder() {
    }
    @Override
    public NullCache.Config.Builder type(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public NullCache.Config build() {
      String missing = "";
      if (this.type == null) {
        missing += " type";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_NullCache_Config(
          this.type);
    }
  }

}
