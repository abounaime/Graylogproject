
package org.graylog2.shared.system.stats.network;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_NetworkStats extends NetworkStats {

  private final String primaryInterface;
  private final Map<String, NetworkStats.Interface> interfaces;
  private final NetworkStats.TcpStats tcp;

  $AutoValue_NetworkStats(
      @Nullable String primaryInterface,
      Map<String, NetworkStats.Interface> interfaces,
      @Nullable NetworkStats.TcpStats tcp) {
    this.primaryInterface = primaryInterface;
    if (interfaces == null) {
      throw new NullPointerException("Null interfaces");
    }
    this.interfaces = interfaces;
    this.tcp = tcp;
  }

  @JsonProperty
  @Nullable
  @Override
  public String primaryInterface() {
    return primaryInterface;
  }

  @JsonProperty
  @Override
  public Map<String, NetworkStats.Interface> interfaces() {
    return interfaces;
  }

  @JsonProperty
  @Nullable
  @Override
  public NetworkStats.TcpStats tcp() {
    return tcp;
  }

  @Override
  public String toString() {
    return "NetworkStats{"
        + "primaryInterface=" + primaryInterface + ", "
        + "interfaces=" + interfaces + ", "
        + "tcp=" + tcp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NetworkStats) {
      NetworkStats that = (NetworkStats) o;
      return ((this.primaryInterface == null) ? (that.primaryInterface() == null) : this.primaryInterface.equals(that.primaryInterface()))
           && (this.interfaces.equals(that.interfaces()))
           && ((this.tcp == null) ? (that.tcp() == null) : this.tcp.equals(that.tcp()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (primaryInterface == null) ? 0 : this.primaryInterface.hashCode();
    h *= 1000003;
    h ^= this.interfaces.hashCode();
    h *= 1000003;
    h ^= (tcp == null) ? 0 : this.tcp.hashCode();
    return h;
  }

}
