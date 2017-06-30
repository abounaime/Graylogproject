
package org.graylog2.rest.models.users.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_TokenList extends TokenList {

  private final List<Token> tokens;

  $AutoValue_TokenList(
      List<Token> tokens) {
    if (tokens == null) {
      throw new NullPointerException("Null tokens");
    }
    this.tokens = tokens;
  }

  @JsonProperty
  @Override
  public List<Token> tokens() {
    return tokens;
  }

  @Override
  public String toString() {
    return "TokenList{"
        + "tokens=" + tokens
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TokenList) {
      TokenList that = (TokenList) o;
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
