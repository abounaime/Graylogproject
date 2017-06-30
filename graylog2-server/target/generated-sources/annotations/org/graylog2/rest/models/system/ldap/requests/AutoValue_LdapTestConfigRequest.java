package org.graylog2.rest.models.system.ldap.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.net.URI;
import javax.annotation.Nullable;

final class AutoValue_LdapTestConfigRequest extends $AutoValue_LdapTestConfigRequest {
  AutoValue_LdapTestConfigRequest(String systemUsername, String systemPassword, URI ldapUri,
      boolean useStartTls, boolean trustAllCertificates, boolean activeDirectory, String searchBase,
      String searchPattern, String principal, String password, boolean testConnectOnly,
      String groupSearchBase, String groupIdAttribute, String groupSearchPattern) {
    super(systemUsername, systemPassword, ldapUri, useStartTls, trustAllCertificates, activeDirectory, searchBase, searchPattern, principal, password, testConnectOnly, groupSearchBase, groupIdAttribute, groupSearchPattern);
  }

  @JsonIgnore
  @Nullable
  public final String getSystemUsername() {
    return systemUsername();
  }

  @JsonIgnore
  @Nullable
  public final String getSystemPassword() {
    return systemPassword();
  }

  @JsonIgnore
  public final URI getLdapUri() {
    return ldapUri();
  }

  @JsonIgnore
  public final boolean isUseStartTls() {
    return useStartTls();
  }

  @JsonIgnore
  public final boolean isTrustAllCertificates() {
    return trustAllCertificates();
  }

  @JsonIgnore
  public final boolean isActiveDirectory() {
    return activeDirectory();
  }

  @JsonIgnore
  @Nullable
  public final String getSearchBase() {
    return searchBase();
  }

  @JsonIgnore
  @Nullable
  public final String getSearchPattern() {
    return searchPattern();
  }

  @JsonIgnore
  @Nullable
  public final String getPrincipal() {
    return principal();
  }

  @JsonIgnore
  @Nullable
  public final String getPassword() {
    return password();
  }

  @JsonIgnore
  public final boolean isTestConnectOnly() {
    return testConnectOnly();
  }

  @JsonIgnore
  @Nullable
  public final String getGroupSearchBase() {
    return groupSearchBase();
  }

  @JsonIgnore
  @Nullable
  public final String getGroupIdAttribute() {
    return groupIdAttribute();
  }

  @JsonIgnore
  @Nullable
  public final String getGroupSearchPattern() {
    return groupSearchPattern();
  }
}
