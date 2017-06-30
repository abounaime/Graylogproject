
package org.graylog2.inputs.extractors;

import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_JsonExtractor_Entry extends JsonExtractor.Entry {

  private final String key;
  private final Object value;

  $AutoValue_JsonExtractor_Entry(
      String key,
      @Nullable Object value) {
    if (key == null) {
      throw new NullPointerException("Null key");
    }
    this.key = key;
    this.value = value;
  }

  @Override
  public String key() {
    return key;
  }

  @Nullable
  @Override
  public Object value() {
    return value;
  }

  @Override
  public String toString() {
    return "Entry{"
        + "key=" + key + ", "
        + "value=" + value
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof JsonExtractor.Entry) {
      JsonExtractor.Entry that = (JsonExtractor.Entry) o;
      return (this.key.equals(that.key()))
           && ((this.value == null) ? (that.value() == null) : this.value.equals(that.value()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.key.hashCode();
    h *= 1000003;
    h ^= (value == null) ? 0 : this.value.hashCode();
    return h;
  }

}
