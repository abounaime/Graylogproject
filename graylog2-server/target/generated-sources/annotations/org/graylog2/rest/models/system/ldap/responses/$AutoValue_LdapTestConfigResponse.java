
package org.graylog2.rest.models.system.ldap.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_LdapTestConfigResponse extends LdapTestConfigResponse {

  private final boolean connected;
  private final boolean systemAuthenticated;
  private final boolean loginAuthenticated;
  private final Map<String, String> entry;
  private final Set<String> groups;
  private final String exception;

  $AutoValue_LdapTestConfigResponse(
      boolean connected,
      boolean systemAuthenticated,
      boolean loginAuthenticated,
      Map<String, String> entry,
      Set<String> groups,
      @Nullable String exception) {
    this.connected = connected;
    this.systemAuthenticated = systemAuthenticated;
    this.loginAuthenticated = loginAuthenticated;
    if (entry == null) {
      throw new NullPointerException("Null entry");
    }
    this.entry = entry;
    if (groups == null) {
      throw new NullPointerException("Null groups");
    }
    this.groups = groups;
    this.exception = exception;
  }

  @JsonProperty
  @Override
  public boolean connected() {
    return connected;
  }

  @JsonProperty
  @Override
  public boolean systemAuthenticated() {
    return systemAuthenticated;
  }

  @JsonProperty
  @Override
  public boolean loginAuthenticated() {
    return loginAuthenticated;
  }

  @JsonProperty
  @Override
  public Map<String, String> entry() {
    return entry;
  }

  @JsonProperty
  @Override
  public Set<String> groups() {
    return groups;
  }

  @JsonProperty
  @Nullable
  @Override
  public String exception() {
    return exception;
  }

  @Override
  public String toString() {
    return "LdapTestConfigResponse{"
        + "connected=" + connected + ", "
        + "systemAuthenticated=" + systemAuthenticated + ", "
        + "loginAuthenticated=" + loginAuthenticated + ", "
        + "entry=" + entry + ", "
        + "groups=" + groups + ", "
        + "exception=" + exception
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LdapTestConfigResponse) {
      LdapTestConfigResponse that = (LdapTestConfigResponse) o;
      return (this.connected == that.connected())
           && (this.systemAuthenticated == that.systemAuthenticated())
           && (this.loginAuthenticated == that.loginAuthenticated())
           && (this.entry.equals(that.entry()))
           && (this.groups.equals(that.groups()))
           && ((this.exception == null) ? (that.exception() == null) : this.exception.equals(that.exception()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.connected ? 1231 : 1237;
    h *= 1000003;
    h ^= this.systemAuthenticated ? 1231 : 1237;
    h *= 1000003;
    h ^= this.loginAuthenticated ? 1231 : 1237;
    h *= 1000003;
    h ^= this.entry.hashCode();
    h *= 1000003;
    h ^= this.groups.hashCode();
    h *= 1000003;
    h ^= (exception == null) ? 0 : this.exception.hashCode();
    return h;
  }

}
