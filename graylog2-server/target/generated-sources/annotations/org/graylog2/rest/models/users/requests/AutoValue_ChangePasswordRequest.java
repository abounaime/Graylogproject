package org.graylog2.rest.models.users.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_ChangePasswordRequest extends $AutoValue_ChangePasswordRequest {
  AutoValue_ChangePasswordRequest(String oldPassword, String password) {
    super(oldPassword, password);
  }

  @JsonIgnore
  @Nullable
  public final String getOldPassword() {
    return oldPassword();
  }

  @JsonIgnore
  public final String getPassword() {
    return password();
  }
}
