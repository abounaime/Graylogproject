
package org.graylog2.rest.models.messages.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MessageTokens extends MessageTokens {

  private final List<String> tokens;

  $AutoValue_MessageTokens(
      List<String> tokens) {
    if (tokens == null) {
      throw new NullPointerException("Null tokens");
    }
    this.tokens = tokens;
  }

  @JsonProperty
  @Override
  public List<String> tokens() {
    return tokens;
  }

  @Override
  public String toString() {
    return "MessageTokens{"
        + "tokens=" + tokens
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MessageTokens) {
      MessageTokens that = (MessageTokens) o;
      return (this.tokens.equals(that.tokens()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.tokens.hashCode();
    return h;
  }

}
