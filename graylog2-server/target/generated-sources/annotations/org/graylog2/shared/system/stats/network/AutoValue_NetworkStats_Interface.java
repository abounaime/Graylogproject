package org.graylog2.shared.system.stats.network;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Set;
import javax.annotation.Nullable;

final class AutoValue_NetworkStats_Interface extends $AutoValue_NetworkStats_Interface {
  AutoValue_NetworkStats_Interface(String name, Set<String> addresses, String macAddress, long mtu,
      NetworkStats.InterfaceStats interfaceStats) {
    super(name, addresses, macAddress, mtu, interfaceStats);
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final Set<String> getAddresses() {
    return addresses();
  }

  @JsonIgnore
  public final String getMacAddress() {
    return macAddress();
  }

  @JsonIgnore
  public final long getMtu() {
    return mtu();
  }

  @JsonIgnore
  @Nullable
  public final NetworkStats.InterfaceStats getInterfaceStats() {
    return interfaceStats();
  }
}
