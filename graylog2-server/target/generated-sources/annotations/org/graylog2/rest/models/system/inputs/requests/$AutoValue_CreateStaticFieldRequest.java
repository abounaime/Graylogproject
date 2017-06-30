
package org.graylog2.rest.models.system.inputs.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CreateStaticFieldRequest extends CreateStaticFieldRequest {

  private final String key;
  private final String value;

  $AutoValue_CreateStaticFieldRequest(
      String key,
      String value) {
    if (key == null) {
      throw new NullPointerException("Null key");
    }
    this.key = key;
    if (value == null) {
      throw new NullPointerException("Null value");
    }
    this.value = value;
  }

  @JsonProperty
  @Override
  public String key() {
    return key;
  }

  @JsonProperty
  @Override
  public String value() {
    return value;
  }

  @Override
  public String toString() {
    return "CreateStaticFieldRequest{"
        + "key=" + key + ", "
        + "value=" + value
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateStaticFieldRequest) {
      CreateStaticFieldRequest that = (CreateStaticFieldRequest) o;
      return (this.key.equals(that.key()))
           && (this.value.equals(that.value()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.key.hashCode();
    h *= 1000003;
    h ^= this.value.hashCode();
    return h;
  }

}
