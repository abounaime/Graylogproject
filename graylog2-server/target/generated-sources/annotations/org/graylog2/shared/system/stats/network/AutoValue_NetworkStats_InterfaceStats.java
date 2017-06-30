package org.graylog2.shared.system.stats.network;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_NetworkStats_InterfaceStats extends $AutoValue_NetworkStats_InterfaceStats {
  AutoValue_NetworkStats_InterfaceStats(long rxPackets, long rxErrors, long rxDropped,
      long rxOverruns, long rxFrame, long txPackets, long txErrors, long txDropped, long txOverruns,
      long txCarrier, long txCollisions, long rxBytes, long txBytes) {
    super(rxPackets, rxErrors, rxDropped, rxOverruns, rxFrame, txPackets, txErrors, txDropped, txOverruns, txCarrier, txCollisions, rxBytes, txBytes);
  }

  @JsonIgnore
  public final long getRxPackets() {
    return rxPackets();
  }

  @JsonIgnore
  public final long getRxErrors() {
    return rxErrors();
  }

  @JsonIgnore
  public final long getRxDropped() {
    return rxDropped();
  }

  @JsonIgnore
  public final long getRxOverruns() {
    return rxOverruns();
  }

  @JsonIgnore
  public final long getRxFrame() {
    return rxFrame();
  }

  @JsonIgnore
  public final long getTxPackets() {
    return txPackets();
  }

  @JsonIgnore
  public final long getTxErrors() {
    return txErrors();
  }

  @JsonIgnore
  public final long getTxDropped() {
    return txDropped();
  }

  @JsonIgnore
  public final long getTxOverruns() {
    return txOverruns();
  }

  @JsonIgnore
  public final long getTxCarrier() {
    return txCarrier();
  }

  @JsonIgnore
  public final long getTxCollisions() {
    return txCollisions();
  }

  @JsonIgnore
  public final long getRxBytes() {
    return rxBytes();
  }

  @JsonIgnore
  public final long getTxBytes() {
    return txBytes();
  }
}
