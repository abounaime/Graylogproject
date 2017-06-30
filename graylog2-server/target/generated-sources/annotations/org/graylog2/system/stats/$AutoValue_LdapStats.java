
package org.graylog2.system.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_LdapStats extends LdapStats {

  private final boolean enabled;
  private final boolean activeDirectory;
  private final int roleMappingCount;
  private final int roleCount;

  $AutoValue_LdapStats(
      boolean enabled,
      boolean activeDirectory,
      int roleMappingCount,
      int roleCount) {
    this.enabled = enabled;
    this.activeDirectory = activeDirectory;
    this.roleMappingCount = roleMappingCount;
    this.roleCount = roleCount;
  }

  @JsonProperty
  @Override
  public boolean enabled() {
    return enabled;
  }

  @JsonProperty
  @Override
  public boolean activeDirectory() {
    return activeDirectory;
  }

  @JsonProperty
  @Override
  public int roleMappingCount() {
    return roleMappingCount;
  }

  @JsonProperty
  @Override
  public int roleCount() {
    return roleCount;
  }

  @Override
  public String toString() {
    return "LdapStats{"
        + "enabled=" + enabled + ", "
        + "activeDirectory=" + activeDirectory + ", "
        + "roleMappingCount=" + roleMappingCount + ", "
        + "roleCount=" + roleCount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LdapStats) {
      LdapStats that = (LdapStats) o;
      return (this.enabled == that.enabled())
           && (this.activeDirectory == that.activeDirectory())
           && (this.roleMappingCount == that.roleMappingCount())
           && (this.roleCount == that.roleCount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.enabled ? 1231 : 1237;
    h *= 1000003;
    h ^= this.activeDirectory ? 1231 : 1237;
    h *= 1000003;
    h ^= this.roleMappingCount;
    h *= 1000003;
    h ^= this.roleCount;
    return h;
  }

}
