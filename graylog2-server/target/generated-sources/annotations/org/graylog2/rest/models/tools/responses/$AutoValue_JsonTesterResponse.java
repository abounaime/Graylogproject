
package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;
import org.hibernate.validator.constraints.NotEmpty;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_JsonTesterResponse extends JsonTesterResponse {

  private final Map<String, Object> matches;
  private final boolean flatten;
  private final String listSeparator;
  private final String keySeparator;
  private final String kvSeparator;
  private final String string;

  $AutoValue_JsonTesterResponse(
      Map<String, Object> matches,
      boolean flatten,
      String listSeparator,
      String keySeparator,
      String kvSeparator,
      String string) {
    if (matches == null) {
      throw new NullPointerException("Null matches");
    }
    this.matches = matches;
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
    if (string == null) {
      throw new NullPointerException("Null string");
    }
    this.string = string;
  }

  @JsonProperty(value = "matches")
  @Override
  public Map<String, Object> matches() {
    return matches;
  }

  @JsonProperty(value = "flatten")
  @Override
  public boolean flatten() {
    return flatten;
  }

  @JsonProperty(value = "line_separator")
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

  @JsonProperty(value = "string")
  @NotEmpty
  @Override
  public String string() {
    return string;
  }

  @Override
  public String toString() {
    return "JsonTesterResponse{"
        + "matches=" + matches + ", "
        + "flatten=" + flatten + ", "
        + "listSeparator=" + listSeparator + ", "
        + "keySeparator=" + keySeparator + ", "
        + "kvSeparator=" + kvSeparator + ", "
        + "string=" + string
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof JsonTesterResponse) {
      JsonTesterResponse that = (JsonTesterResponse) o;
      return (this.matches.equals(that.matches()))
           && (this.flatten == that.flatten())
           && (this.listSeparator.equals(that.listSeparator()))
           && (this.keySeparator.equals(that.keySeparator()))
           && (this.kvSeparator.equals(that.kvSeparator()))
           && (this.string.equals(that.string()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.matches.hashCode();
    h *= 1000003;
    h ^= this.flatten ? 1231 : 1237;
    h *= 1000003;
    h ^= this.listSeparator.hashCode();
    h *= 1000003;
    h ^= this.keySeparator.hashCode();
    h *= 1000003;
    h ^= this.kvSeparator.hashCode();
    h *= 1000003;
    h ^= this.string.hashCode();
    return h;
  }

}
