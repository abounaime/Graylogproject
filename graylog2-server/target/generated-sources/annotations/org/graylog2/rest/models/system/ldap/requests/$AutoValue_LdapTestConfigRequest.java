
package org.graylog2.rest.models.system.ldap.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_LdapTestConfigRequest extends LdapTestConfigRequest {

  private final String systemUsername;
  private final String systemPassword;
  private final URI ldapUri;
  private final boolean useStartTls;
  private final boolean trustAllCertificates;
  private final boolean activeDirectory;
  private final String searchBase;
  private final String searchPattern;
  private final String principal;
  private final String password;
  private final boolean testConnectOnly;
  private final String groupSearchBase;
  private final String groupIdAttribute;
  private final String groupSearchPattern;

  $AutoValue_LdapTestConfigRequest(
      @Nullable String systemUsername,
      @Nullable String systemPassword,
      URI ldapUri,
      boolean useStartTls,
      boolean trustAllCertificates,
      boolean activeDirectory,
      @Nullable String searchBase,
      @Nullable String searchPattern,
      @Nullable String principal,
      @Nullable String password,
      boolean testConnectOnly,
      @Nullable String groupSearchBase,
      @Nullable String groupIdAttribute,
      @Nullable String groupSearchPattern) {
    this.systemUsername = systemUsername;
    this.systemPassword = systemPassword;
    if (ldapUri == null) {
      throw new NullPointerException("Null ldapUri");
    }
    this.ldapUri = ldapUri;
    this.useStartTls = useStartTls;
    this.trustAllCertificates = trustAllCertificates;
    this.activeDirectory = activeDirectory;
    this.searchBase = searchBase;
    this.searchPattern = searchPattern;
    this.principal = principal;
    this.password = password;
    this.testConnectOnly = testConnectOnly;
    this.groupSearchBase = groupSearchBase;
    this.groupIdAttribute = groupIdAttribute;
    this.groupSearchPattern = groupSearchPattern;
  }

  @JsonProperty
  @Nullable
  @Override
  public String systemUsername() {
    return systemUsername;
  }

  @JsonProperty
  @Nullable
  @Override
  public String systemPassword() {
    return systemPassword;
  }

  @JsonProperty
  @Override
  public URI ldapUri() {
    return ldapUri;
  }

  @JsonProperty
  @Override
  public boolean useStartTls() {
    return useStartTls;
  }

  @JsonProperty
  @Override
  public boolean trustAllCertificates() {
    return trustAllCertificates;
  }

  @JsonProperty
  @Override
  public boolean activeDirectory() {
    return activeDirectory;
  }

  @JsonProperty
  @Nullable
  @Override
  public String searchBase() {
    return searchBase;
  }

  @JsonProperty
  @Nullable
  @Override
  public String searchPattern() {
    return searchPattern;
  }

  @JsonProperty
  @Nullable
  @Override
  public String principal() {
    return principal;
  }

  @JsonProperty
  @Nullable
  @Override
  public String password() {
    return password;
  }

  @JsonProperty
  @Override
  public boolean testConnectOnly() {
    return testConnectOnly;
  }

  @JsonProperty
  @Nullable
  @Override
  public String groupSearchBase() {
    return groupSearchBase;
  }

  @JsonProperty
  @Nullable
  @Override
  public String groupIdAttribute() {
    return groupIdAttribute;
  }

  @JsonProperty
  @Nullable
  @Override
  public String groupSearchPattern() {
    return groupSearchPattern;
  }

  @Override
  public String toString() {
    return "LdapTestConfigRequest{"
        + "systemUsername=" + systemUsername + ", "
        + "systemPassword=" + systemPassword + ", "
        + "ldapUri=" + ldapUri + ", "
        + "useStartTls=" + useStartTls + ", "
        + "trustAllCertificates=" + trustAllCertificates + ", "
        + "activeDirectory=" + activeDirectory + ", "
        + "searchBase=" + searchBase + ", "
        + "searchPattern=" + searchPattern + ", "
        + "principal=" + principal + ", "
        + "password=" + password + ", "
        + "testConnectOnly=" + testConnectOnly + ", "
        + "groupSearchBase=" + groupSearchBase + ", "
        + "groupIdAttribute=" + groupIdAttribute + ", "
        + "groupSearchPattern=" + groupSearchPattern
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LdapTestConfigRequest) {
      LdapTestConfigRequest that = (LdapTestConfigRequest) o;
      return ((this.systemUsername == null) ? (that.systemUsername() == null) : this.systemUsername.equals(that.systemUsername()))
           && ((this.systemPassword == null) ? (that.systemPassword() == null) : this.systemPassword.equals(that.systemPassword()))
           && (this.ldapUri.equals(that.ldapUri()))
           && (this.useStartTls == that.useStartTls())
           && (this.trustAllCertificates == that.trustAllCertificates())
           && (this.activeDirectory == that.activeDirectory())
           && ((this.searchBase == null) ? (that.searchBase() == null) : this.searchBase.equals(that.searchBase()))
           && ((this.searchPattern == null) ? (that.searchPattern() == null) : this.searchPattern.equals(that.searchPattern()))
           && ((this.principal == null) ? (that.principal() == null) : this.principal.equals(that.principal()))
           && ((this.password == null) ? (that.password() == null) : this.password.equals(that.password()))
           && (this.testConnectOnly == that.testConnectOnly())
           && ((this.groupSearchBase == null) ? (that.groupSearchBase() == null) : this.groupSearchBase.equals(that.groupSearchBase()))
           && ((this.groupIdAttribute == null) ? (that.groupIdAttribute() == null) : this.groupIdAttribute.equals(that.groupIdAttribute()))
           && ((this.groupSearchPattern == null) ? (that.groupSearchPattern() == null) : this.groupSearchPattern.equals(that.groupSearchPattern()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (systemUsername == null) ? 0 : this.systemUsername.hashCode();
    h *= 1000003;
    h ^= (systemPassword == null) ? 0 : this.systemPassword.hashCode();
    h *= 1000003;
    h ^= this.ldapUri.hashCode();
    h *= 1000003;
    h ^= this.useStartTls ? 1231 : 1237;
    h *= 1000003;
    h ^= this.trustAllCertificates ? 1231 : 1237;
    h *= 1000003;
    h ^= this.activeDirectory ? 1231 : 1237;
    h *= 1000003;
    h ^= (searchBase == null) ? 0 : this.searchBase.hashCode();
    h *= 1000003;
    h ^= (searchPattern == null) ? 0 : this.searchPattern.hashCode();
    h *= 1000003;
    h ^= (principal == null) ? 0 : this.principal.hashCode();
    h *= 1000003;
    h ^= (password == null) ? 0 : this.password.hashCode();
    h *= 1000003;
    h ^= this.testConnectOnly ? 1231 : 1237;
    h *= 1000003;
    h ^= (groupSearchBase == null) ? 0 : this.groupSearchBase.hashCode();
    h *= 1000003;
    h ^= (groupIdAttribute == null) ? 0 : this.groupIdAttribute.hashCode();
    h *= 1000003;
    h ^= (groupSearchPattern == null) ? 0 : this.groupSearchPattern.hashCode();
    return h;
  }

}
