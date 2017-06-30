
package org.graylog2.rest.models.tools.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.hibernate.validator.constraints.NotEmpty;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_JsonTestRequest extends JsonTestRequest {

  private final boolean flatten;
  private final String listSeparator;
  private final String keySeparator;
  private final String kvSeparator;
  private final boolean replaceKeyWhitespace;
  private final String keyWhitespaceReplacement;
  private final String keyPrefix;
  private final String string;

  $AutoValue_JsonTestRequest(
      boolean flatten,
      String listSeparator,
      String keySeparator,
      String kvSeparator,
      boolean replaceKeyWhitespace,
      String keyWhitespaceReplacement,
      String keyPrefix,
      String string) {
    this.flatten = flatten;
    if (listSeparator == null) {
      throw new NullPointerException("Null listSeparator");
    }
    this.listSeparator = listSeparator;
    if (keySeparator == null) {
      throw new NullPointerException("Null keySeparator");
    }
    this.keySeparator = keySeparator;
    if (kvSeparator == null) {
      throw new NullPointerException("Null kvSeparator");
    }
    this.kvSeparator = kvSeparator;
    this.replaceKeyWhitespace = replaceKeyWhitespace;
    if (keyWhitespaceReplacement == null) {
      throw new NullPointerException("Null keyWhitespaceReplacement");
    }
    this.keyWhitespaceReplacement = keyWhitespaceReplacement;
    if (keyPrefix == null) {
      throw new NullPointerException("Null keyPrefix");
    }
    this.keyPrefix = keyPrefix;
    if (string == null) {
      throw new NullPointerException("Null string");
    }
    this.string = string;
  }

  @JsonProperty(value = "flatten")
  @Override
  public boolean flatten() {
    return flatten;
  }

  @JsonProperty(value = "list_separator")
  @NotEmpty
  @Override
  public String listSeparator() {
    return listSeparator;
  }

  @JsonProperty(value = "key_separator")
  @NotEmpty
  @Override
  public String keySeparator() {
    return keySeparator;
  }

  @JsonProperty(value = "kv_separator")
  @NotEmpty
  @Override
  public String kvSeparator() {
    return kvSeparator;
  }

  @JsonProperty(value = "replace_key_whitespace")
  @Override
  public boolean replaceKeyWhitespace() {
    return replaceKeyWhitespace;
  }

  @JsonProperty(value = "key_whitespace_replacement")
  @Override
  public String keyWhitespaceReplacement() {
    return keyWhitespaceReplacement;
  }

  @JsonProperty(value = "key_prefix")
  @Override
  public String keyPrefix() {
    return keyPrefix;
  }

  @JsonProperty(value = "string")
  @NotEmpty
  @Override
  public String string() {
    return string;
  }

  @Override
  public String toString() {
    return "JsonTestRequest{"
        + "flatten=" + flatten + ", "
        + "listSeparator=" + listSeparator + ", "
        + "keySeparator=" + keySeparator + ", "
        + "kvSeparator=" + kvSeparator + ", "
        + "replaceKeyWhitespace=" + replaceKeyWhitespace + ", "
        + "keyWhitespaceReplacement=" + keyWhitespaceReplacement + ", "
        + "keyPrefix=" + keyPrefix + ", "
        + "string=" + string
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof JsonTestRequest) {
      JsonTestRequest that = (JsonTestRequest) o;
      return (this.flatten == that.flatten())
           && (this.listSeparator.equals(that.listSeparator()))
           && (this.keySeparator.equals(that.keySeparator()))
           && (this.kvSeparator.equals(that.kvSeparator()))
           && (this.replaceKeyWhitespace == that.replaceKeyWhitespace())
           && (this.keyWhitespaceReplacement.equals(that.keyWhitespaceReplacement()))
           && (this.keyPrefix.equals(that.keyPrefix()))
           && (this.string.equals(that.string()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.flatten ? 1231 : 1237;
    h *= 1000003;
    h ^= this.listSeparator.hashCode();
    h *= 1000003;
    h ^= this.keySeparator.hashCode();
    h *= 1000003;
    h ^= this.kvSeparator.hashCode();
    h *= 1000003;
    h ^= this.replaceKeyWhitespace ? 1231 : 1237;
    h *= 1000003;
    h ^= this.keyWhitespaceReplacement.hashCode();
    h *= 1000003;
    h ^= this.keyPrefix.hashCode();
    h *= 1000003;
    h ^= this.string.hashCode();
    return h;
  }

}
