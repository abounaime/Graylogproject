
package org.graylog2.rest.models.users.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ChangePasswordRequest extends ChangePasswordRequest {

  private final String oldPassword;
  private final String password;

  $AutoValue_ChangePasswordRequest(
      @Nullable String oldPassword,
      String password) {
    this.oldPassword = oldPassword;
    if (password == null) {
      throw new NullPointerException("Null password");
    }
    this.password = password;
  }

  @JsonProperty
  @Nullable
  @Override
  public String oldPassword() {
    return oldPassword;
  }

  @JsonProperty
  @Override
  public String password() {
    return password;
  }

  @Override
  public String toString() {
    return "ChangePasswordRequest{"
        + "oldPassword=" + oldPassword + ", "
        + "password=" + password
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ChangePasswordRequest) {
      ChangePasswordRequest that = (ChangePasswordRequest) o;
      return ((this.oldPassword == null) ? (that.oldPassword() == null) : this.oldPassword.equals(that.oldPassword()))
           && (this.password.equals(that.password()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (oldPassword == null) ? 0 : this.oldPassword.hashCode();
    h *= 1000003;
    h ^= this.password.hashCode();
    return h;
  }

}
