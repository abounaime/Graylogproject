package org.graylog2.rest.models.system.ldap.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

final class AutoValue_LdapTestConfigResponse extends $AutoValue_LdapTestConfigResponse {
  AutoValue_LdapTestConfigResponse(boolean connected, boolean systemAuthenticated,
      boolean loginAuthenticated, Map<String, String> entry, Set<String> groups, String exception) {
    super(connected, systemAuthenticated, loginAuthenticated, entry, groups, exception);
  }

  @JsonIgnore
  public final boolean isConnected() {
    return connected();
  }

  @JsonIgnore
  public final boolean isSystemAuthenticated() {
    return systemAuthenticated();
  }

  @JsonIgnore
  public final boolean isLoginAuthenticated() {
    return loginAuthenticated();
  }

  @JsonIgnore
  public final Map<String, String> getEntry() {
    return entry();
  }

  @JsonIgnore
  public final Set<String> getGroups() {
    return groups();
  }

  @JsonIgnore
  @Nullable
  public final String getException() {
    return exception();
  }
}
