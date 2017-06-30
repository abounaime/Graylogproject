package org.graylog2.shared.system.stats.network;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

final class AutoValue_NetworkStats extends $AutoValue_NetworkStats {
  AutoValue_NetworkStats(String primaryInterface, Map<String, NetworkStats.Interface> interfaces,
      NetworkStats.TcpStats tcp) {
    super(primaryInterface, interfaces, tcp);
  }

  @JsonIgnore
  @Nullable
  public final String getPrimaryInterface() {
    return primaryInterface();
  }

  @JsonIgnore
  public final Map<String, NetworkStats.Interface> getInterfaces() {
    return interfaces();
  }

  @JsonIgnore
  @Nullable
  public final NetworkStats.TcpStats getTcp() {
    return tcp();
  }
}
