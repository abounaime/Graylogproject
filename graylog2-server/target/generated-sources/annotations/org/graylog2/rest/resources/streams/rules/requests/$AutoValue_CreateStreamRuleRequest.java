
package org.graylog2.rest.resources.streams.rules.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CreateStreamRuleRequest extends CreateStreamRuleRequest {

  private final int type;
  private final String value;
  private final String field;
  private final boolean inverted;
  private final String description;

  $AutoValue_CreateStreamRuleRequest(
      int type,
      String value,
      String field,
      boolean inverted,
      @Nullable String description) {
    this.type = type;
    if (value == null) {
      throw new NullPointerException("Null value");
    }
    this.value = value;
    if (field == null) {
      throw new NullPointerException("Null field");
    }
    this.field = field;
    this.inverted = inverted;
    this.description = description;
  }

  @JsonProperty
  @Override
  public int type() {
    return type;
  }

  @JsonProperty
  @Override
  public String value() {
    return value;
  }

  @JsonProperty
  @Override
  public String field() {
    return field;
  }

  @JsonProperty
  @Override
  public boolean inverted() {
    return inverted;
  }

  @JsonProperty
  @Nullable
  @Override
  public String description() {
    return description;
  }

  @Override
  public String toString() {
    return "CreateStreamRuleRequest{"
        + "type=" + type + ", "
        + "value=" + value + ", "
        + "field=" + field + ", "
        + "inverted=" + inverted + ", "
        + "description=" + description
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateStreamRuleRequest) {
      CreateStreamRuleRequest that = (CreateStreamRuleRequest) o;
      return (this.type == that.type())
           && (this.value.equals(that.value()))
           && (this.field.equals(that.field()))
           && (this.inverted == that.inverted())
           && ((this.description == null) ? (that.description() == null) : this.description.equals(that.description()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type;
    h *= 1000003;
    h ^= this.value.hashCode();
    h *= 1000003;
    h ^= this.field.hashCode();
    h *= 1000003;
    h ^= this.inverted ? 1231 : 1237;
    h *= 1000003;
    h ^= (description == null) ? 0 : this.description.hashCode();
    return h;
  }

}
