
package org.graylog2.rest.models.system.ldap.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_LdapSettingsResponse extends LdapSettingsResponse {

  private final boolean enabled;
  private final String systemUsername;
  private final String systemPassword;
  private final URI ldapUri;
  private final boolean useStartTls;
  private final boolean trustAllCertificates;
  private final boolean activeDirectory;
  private final String searchBase;
  private final String searchPattern;
  private final String displayNameAttribute;
  private final String defaultGroup;
  private final Map<String, String> groupMapping;
  private final String groupSearchBase;
  private final String groupIdAttribute;
  private final Set<String> additionalDefaultGroups;
  private final String groupSearchPattern;

  $AutoValue_LdapSettingsResponse(
      boolean enabled,
      String systemUsername,
      String systemPassword,
      URI ldapUri,
      boolean useStartTls,
      boolean trustAllCertificates,
      boolean activeDirectory,
      String searchBase,
      String searchPattern,
      String displayNameAttribute,
      String defaultGroup,
      @Nullable Map<String, String> groupMapping,
      @Nullable String groupSearchBase,
      @Nullable String groupIdAttribute,
      @Nullable Set<String> additionalDefaultGroups,
      @Nullable String groupSearchPattern) {
    this.enabled = enabled;
    if (systemUsername == null) {
      throw new NullPointerException("Null systemUsername");
    }
    this.systemUsername = systemUsername;
    if (systemPassword == null) {
      throw new NullPointerException("Null systemPassword");
    }
    this.systemPassword = systemPassword;
    if (ldapUri == null) {
      throw new NullPointerException("Null ldapUri");
    }
    this.ldapUri = ldapUri;
    this.useStartTls = useStartTls;
    this.trustAllCertificates = trustAllCertificates;
    this.activeDirectory = activeDirectory;
    if (searchBase == null) {
      throw new NullPointerException("Null searchBase");
    }
    this.searchBase = searchBase;
    if (searchPattern == null) {
      throw new NullPointerException("Null searchPattern");
    }
    this.searchPattern = searchPattern;
    if (displayNameAttribute == null) {
      throw new NullPointerException("Null displayNameAttribute");
    }
    this.displayNameAttribute = displayNameAttribute;
    if (defaultGroup == null) {
      throw new NullPointerException("Null defaultGroup");
    }
    this.defaultGroup = defaultGroup;
    this.groupMapping = groupMapping;
    this.groupSearchBase = groupSearchBase;
    this.groupIdAttribute = groupIdAttribute;
    this.additionalDefaultGroups = additionalDefaultGroups;
    this.groupSearchPattern = groupSearchPattern;
  }

  @JsonProperty
  @Override
  public boolean enabled() {
    return enabled;
  }

  @JsonProperty
  @Override
  public String systemUsername() {
    return systemUsername;
  }

  @JsonProperty
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
  @Override
  public String searchBase() {
    return searchBase;
  }

  @JsonProperty
  @Override
  public String searchPattern() {
    return searchPattern;
  }

  @JsonProperty
  @Override
  public String displayNameAttribute() {
    return displayNameAttribute;
  }

  @JsonProperty
  @Override
  public String defaultGroup() {
    return defaultGroup;
  }

  @JsonProperty
  @Nullable
  @Override
  public Map<String, String> groupMapping() {
    return groupMapping;
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
  public Set<String> additionalDefaultGroups() {
    return additionalDefaultGroups;
  }

  @JsonProperty
  @Nullable
  @Override
  public String groupSearchPattern() {
    return groupSearchPattern;
  }

  @Override
  public String toString() {
    return "LdapSettingsResponse{"
        + "enabled=" + enabled + ", "
        + "systemUsername=" + systemUsername + ", "
        + "systemPassword=" + systemPassword + ", "
        + "ldapUri=" + ldapUri + ", "
        + "useStartTls=" + useStartTls + ", "
        + "trustAllCertificates=" + trustAllCertificates + ", "
        + "activeDirectory=" + activeDirectory + ", "
        + "searchBase=" + searchBase + ", "
        + "searchPattern=" + searchPattern + ", "
        + "displayNameAttribute=" + displayNameAttribute + ", "
        + "defaultGroup=" + defaultGroup + ", "
        + "groupMapping=" + groupMapping + ", "
        + "groupSearchBase=" + groupSearchBase + ", "
        + "groupIdAttribute=" + groupIdAttribute + ", "
        + "additionalDefaultGroups=" + additionalDefaultGroups + ", "
        + "groupSearchPattern=" + groupSearchPattern
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LdapSettingsResponse) {
      LdapSettingsResponse that = (LdapSettingsResponse) o;
      return (this.enabled == that.enabled())
           && (this.systemUsername.equals(that.systemUsername()))
           && (this.systemPassword.equals(that.systemPassword()))
           && (this.ldapUri.equals(that.ldapUri()))
           && (this.useStartTls == that.useStartTls())
           && (this.trustAllCertificates == that.trustAllCertificates())
           && (this.activeDirectory == that.activeDirectory())
           && (this.searchBase.equals(that.searchBase()))
           && (this.searchPattern.equals(that.searchPattern()))
           && (this.displayNameAttribute.equals(that.displayNameAttribute()))
           && (this.defaultGroup.equals(that.defaultGroup()))
           && ((this.groupMapping == null) ? (that.groupMapping() == null) : this.groupMapping.equals(that.groupMapping()))
           && ((this.groupSearchBase == null) ? (that.groupSearchBase() == null) : this.groupSearchBase.equals(that.groupSearchBase()))
           && ((this.groupIdAttribute == null) ? (that.groupIdAttribute() == null) : this.groupIdAttribute.equals(that.groupIdAttribute()))
           && ((this.additionalDefaultGroups == null) ? (that.additionalDefaultGroups() == null) : this.additionalDefaultGroups.equals(that.additionalDefaultGroups()))
           && ((this.groupSearchPattern == null) ? (that.groupSearchPattern() == null) : this.groupSearchPattern.equals(that.groupSearchPattern()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.enabled ? 1231 : 1237;
    h *= 1000003;
    h ^= this.systemUsername.hashCode();
    h *= 1000003;
    h ^= this.systemPassword.hashCode();
    h *= 1000003;
    h ^= this.ldapUri.hashCode();
    h *= 1000003;
    h ^= this.useStartTls ? 1231 : 1237;
    h *= 1000003;
    h ^= this.trustAllCertificates ? 1231 : 1237;
    h *= 1000003;
    h ^= this.activeDirectory ? 1231 : 1237;
    h *= 1000003;
    h ^= this.searchBase.hashCode();
    h *= 1000003;
    h ^= this.searchPattern.hashCode();
    h *= 1000003;
    h ^= this.displayNameAttribute.hashCode();
    h *= 1000003;
    h ^= this.defaultGroup.hashCode();
    h *= 1000003;
    h ^= (groupMapping == null) ? 0 : this.groupMapping.hashCode();
    h *= 1000003;
    h ^= (groupSearchBase == null) ? 0 : this.groupSearchBase.hashCode();
    h *= 1000003;
    h ^= (groupIdAttribute == null) ? 0 : this.groupIdAttribute.hashCode();
    h *= 1000003;
    h ^= (additionalDefaultGroups == null) ? 0 : this.additionalDefaultGroups.hashCode();
    h *= 1000003;
    h ^= (groupSearchPattern == null) ? 0 : this.groupSearchPattern.hashCode();
    return h;
  }

}
