package org.graylog2.rest.models.alarmcallbacks.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;

final class AutoValue_AlertReceivers extends $AutoValue_AlertReceivers {
  AutoValue_AlertReceivers(List<String> emails, List<String> users) {
    super(emails, users);
  }

  @JsonIgnore
  public final List<String> getEmails() {
    return emails();
  }

  @JsonIgnore
  public final List<String> getUsers() {
    return users();
  }
}
