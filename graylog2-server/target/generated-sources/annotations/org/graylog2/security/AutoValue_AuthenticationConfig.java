package org.graylog2.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;
import java.util.Set;

final class AutoValue_AuthenticationConfig extends $AutoValue_AuthenticationConfig {
  AutoValue_AuthenticationConfig(List<String> realmOrder, Set<String> disabledRealms) {
    super(realmOrder, disabledRealms);
  }

  @JsonIgnore
  public final List<String> getRealmOrder() {
    return realmOrder();
  }

  @JsonIgnore
  public final Set<String> getDisabledRealms() {
    return disabledRealms();
  }
}
