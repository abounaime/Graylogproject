package org.graylog2.rest.models.users.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

final class AutoValue_UserList extends $AutoValue_UserList {
  AutoValue_UserList(List<UserSummary> users) {
    super(users);
  }

  @JsonIgnore
  public final List<UserSummary> getUsers() {
    return users();
  }
}
