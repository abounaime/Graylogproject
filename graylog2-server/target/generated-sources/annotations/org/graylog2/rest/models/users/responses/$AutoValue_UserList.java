
package org.graylog2.rest.models.users.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_UserList extends UserList {

  private final List<UserSummary> users;

  $AutoValue_UserList(
      List<UserSummary> users) {
    if (users == null) {
      throw new NullPointerException("Null users");
    }
    this.users = users;
  }

  @JsonProperty
  @Override
  public List<UserSummary> users() {
    return users;
  }

  @Override
  public String toString() {
    return "UserList{"
        + "users=" + users
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UserList) {
      UserList that = (UserList) o;
      return (this.users.equals(that.users()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.users.hashCode();
    return h;
  }

}
