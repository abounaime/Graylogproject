
package org.graylog2.shared.system.stats.network;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_NetworkStats_Interface extends NetworkStats.Interface {

  private final String name;
  private final Set<String> addresses;
  private final String macAddress;
  private final long mtu;
  private final NetworkStats.InterfaceStats interfaceStats;

  $AutoValue_NetworkStats_Interface(
      String name,
      Set<String> addresses,
      String macAddress,
      long mtu,
      @Nullable NetworkStats.InterfaceStats interfaceStats) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (addresses == null) {
      throw new NullPointerException("Null addresses");
    }
    this.addresses = addresses;
    if (macAddress == null) {
      throw new NullPointerException("Null macAddress");
    }
    this.macAddress = macAddress;
    this.mtu = mtu;
    this.interfaceStats = interfaceStats;
  }

  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  @JsonProperty
  @Override
  public Set<String> addresses() {
    return addresses;
  }

  @JsonProperty
  @Override
  public String macAddress() {
    return macAddress;
  }

  @JsonProperty
  @Override
  public long mtu() {
    return mtu;
  }

  @JsonProperty
  @Nullable
  @Override
  public NetworkStats.InterfaceStats interfaceStats() {
    return interfaceStats;
  }

  @Override
  public String toString() {
    return "Interface{"
        + "name=" + name + ", "
        + "addresses=" + addresses + ", "
        + "macAddress=" + macAddress + ", "
        + "mtu=" + mtu + ", "
        + "interfaceStats=" + interfaceStats
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NetworkStats.Interface) {
      NetworkStats.Interface that = (NetworkStats.Interface) o;
      return (this.name.equals(that.name()))
           && (this.addresses.equals(that.addresses()))
           && (this.macAddress.equals(that.macAddress()))
           && (this.mtu == that.mtu())
           && ((this.interfaceStats == null) ? (that.interfaceStats() == null) : this.interfaceStats.equals(that.interfaceStats()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.addresses.hashCode();
    h *= 1000003;
    h ^= this.macAddress.hashCode();
    h *= 1000003;
    h ^= (this.mtu >>> 32) ^ this.mtu;
    h *= 1000003;
    h ^= (interfaceStats == null) ? 0 : this.interfaceStats.hashCode();
    return h;
  }

}
