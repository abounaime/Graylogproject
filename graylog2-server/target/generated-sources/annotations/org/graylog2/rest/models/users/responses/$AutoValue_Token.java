
package org.graylog2.rest.models.users.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Token extends Token {

  private final String name;
  private final String token;
  private final DateTime lastAccess;

  $AutoValue_Token(
      String name,
      String token,
      DateTime lastAccess) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (token == null) {
      throw new NullPointerException("Null token");
    }
    this.token = token;
    if (lastAccess == null) {
      throw new NullPointerException("Null lastAccess");
    }
    this.lastAccess = lastAccess;
  }

  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  @JsonProperty
  @Override
  public String token() {
    return token;
  }

  @JsonProperty
  @Override
  public DateTime lastAccess() {
    return lastAccess;
  }

  @Override
  public String toString() {
    return "Token{"
        + "name=" + name + ", "
        + "token=" + token + ", "
        + "lastAccess=" + lastAccess
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Token) {
      Token that = (Token) o;
      return (this.name.equals(that.name()))
           && (this.token.equals(that.token()))
           && (this.lastAccess.equals(that.lastAccess()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.token.hashCode();
    h *= 1000003;
    h ^= this.lastAccess.hashCode();
    return h;
  }

}
