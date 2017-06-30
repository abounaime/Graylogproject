package org.graylog2.system.stats;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_LdapStats extends $AutoValue_LdapStats {
  AutoValue_LdapStats(boolean enabled, boolean activeDirectory, int roleMappingCount,
      int roleCount) {
    super(enabled, activeDirectory, roleMappingCount, roleCount);
  }

  @JsonIgnore
  public final boolean isEnabled() {
    return enabled();
  }

  @JsonIgnore
  public final boolean isActiveDirectory() {
    return activeDirectory();
  }

  @JsonIgnore
  public final int getRoleMappingCount() {
    return roleMappingCount();
  }

  @JsonIgnore
  public final int getRoleCount() {
    return roleCount();
  }
}
