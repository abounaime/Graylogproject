
package org.graylog2.security;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AuthenticationConfig extends AuthenticationConfig {

  private final List<String> realmOrder;
  private final Set<String> disabledRealms;

  $AutoValue_AuthenticationConfig(
      List<String> realmOrder,
      Set<String> disabledRealms) {
    if (realmOrder == null) {
      throw new NullPointerException("Null realmOrder");
    }
    this.realmOrder = realmOrder;
    if (disabledRealms == null) {
      throw new NullPointerException("Null disabledRealms");
    }
    this.disabledRealms = disabledRealms;
  }

  @JsonProperty(value = "realm_order")
  @Override
  public List<String> realmOrder() {
    return realmOrder;
  }

  @JsonProperty(value = "disabled_realms")
  @Override
  public Set<String> disabledRealms() {
    return disabledRealms;
  }

  @Override
  public String toString() {
    return "AuthenticationConfig{"
        + "realmOrder=" + realmOrder + ", "
        + "disabledRealms=" + disabledRealms
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AuthenticationConfig) {
      AuthenticationConfig that = (AuthenticationConfig) o;
      return (this.realmOrder.equals(that.realmOrder()))
           && (this.disabledRealms.equals(that.disabledRealms()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.realmOrder.hashCode();
    h *= 1000003;
    h ^= this.disabledRealms.hashCode();
    return h;
  }

  @Override
  public AuthenticationConfig.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends AuthenticationConfig.Builder {
    private List<String> realmOrder;
    private Set<String> disabledRealms;
    Builder() {
    }
    private Builder(AuthenticationConfig source) {
      this.realmOrder = source.realmOrder();
      this.disabledRealms = source.disabledRealms();
    }
    @Override
    public AuthenticationConfig.Builder realmOrder(List<String> realmOrder) {
      if (realmOrder == null) {
        throw new NullPointerException("Null realmOrder");
      }
      this.realmOrder = realmOrder;
      return this;
    }
    @Override
    public AuthenticationConfig.Builder disabledRealms(Set<String> disabledRealms) {
      if (disabledRealms == null) {
        throw new NullPointerException("Null disabledRealms");
      }
      this.disabledRealms = disabledRealms;
      return this;
    }
    @Override
    public AuthenticationConfig build() {
      String missing = "";
      if (this.realmOrder == null) {
        missing += " realmOrder";
      }
      if (this.disabledRealms == null) {
        missing += " disabledRealms";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_AuthenticationConfig(
          this.realmOrder,
          this.disabledRealms);
    }
  }

}
