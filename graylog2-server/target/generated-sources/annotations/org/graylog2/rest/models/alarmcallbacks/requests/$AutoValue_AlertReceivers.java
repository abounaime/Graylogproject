
package org.graylog2.rest.models.alarmcallbacks.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AlertReceivers extends AlertReceivers {

  private final List<String> emails;
  private final List<String> users;

  $AutoValue_AlertReceivers(
      List<String> emails,
      List<String> users) {
    if (emails == null) {
      throw new NullPointerException("Null emails");
    }
    this.emails = emails;
    if (users == null) {
      throw new NullPointerException("Null users");
    }
    this.users = users;
  }

  @JsonProperty(value = "emails")
  @Override
  public List<String> emails() {
    return emails;
  }

  @JsonProperty(value = "users")
  @Override
  public List<String> users() {
    return users;
  }

  @Override
  public String toString() {
    return "AlertReceivers{"
        + "emails=" + emails + ", "
        + "users=" + users
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AlertReceivers) {
      AlertReceivers that = (AlertReceivers) o;
      return (this.emails.equals(that.emails()))
           && (this.users.equals(that.users()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.emails.hashCode();
    h *= 1000003;
    h ^= this.users.hashCode();
    return h;
  }

}
