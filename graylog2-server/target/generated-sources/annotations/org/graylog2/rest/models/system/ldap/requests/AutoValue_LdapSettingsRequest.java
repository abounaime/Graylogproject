package org.graylog2.rest.models.system.ldap.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.net.URI;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

final class AutoValue_LdapSettingsRequest extends $AutoValue_LdapSettingsRequest {
  AutoValue_LdapSettingsRequest(boolean enabled, String systemUsername, String systemPassword,
      URI ldapUri, boolean useStartTls, boolean trustAllCertificates, boolean activeDirectory,
      String searchBase, String searchPattern, String displayNameAttribute, String defaultGroup,
      Map<String, String> groupMapping, String groupSearchBase, String groupIdAttribute,
      Set<String> additionalDefaultGroups, String groupSearchPattern) {
    super(enabled, systemUsername, systemPassword, ldapUri, useStartTls, trustAllCertificates, activeDirectory, searchBase, searchPattern, displayNameAttribute, defaultGroup, groupMapping, groupSearchBase, groupIdAttribute, additionalDefaultGroups, groupSearchPattern);
  }

  @JsonIgnore
  public final boolean isEnabled() {
    return enabled();
  }

  @JsonIgnore
  public final String getSystemUsername() {
    return systemUsername();
  }

  @JsonIgnore
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
  public final String getSearchBase() {
    return searchBase();
  }

  @JsonIgnore
  public final String getSearchPattern() {
    return searchPattern();
  }

  @JsonIgnore
  public final String getDisplayNameAttribute() {
    return displayNameAttribute();
  }

  @JsonIgnore
  public final String getDefaultGroup() {
    return defaultGroup();
  }

  @JsonIgnore
  @Nullable
  public final Map<String, String> getGroupMapping() {
    return groupMapping();
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
  public final Set<String> getAdditionalDefaultGroups() {
    return additionalDefaultGroups();
  }

  @JsonIgnore
  @Nullable
  public final String getGroupSearchPattern() {
    return groupSearchPattern();
  }
}
