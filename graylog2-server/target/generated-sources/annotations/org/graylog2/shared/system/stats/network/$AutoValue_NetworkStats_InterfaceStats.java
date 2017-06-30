
package org.graylog2.shared.system.stats.network;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_NetworkStats_InterfaceStats extends NetworkStats.InterfaceStats {

  private final long rxPackets;
  private final long rxErrors;
  private final long rxDropped;
  private final long rxOverruns;
  private final long rxFrame;
  private final long txPackets;
  private final long txErrors;
  private final long txDropped;
  private final long txOverruns;
  private final long txCarrier;
  private final long txCollisions;
  private final long rxBytes;
  private final long txBytes;

  $AutoValue_NetworkStats_InterfaceStats(
      long rxPackets,
      long rxErrors,
      long rxDropped,
      long rxOverruns,
      long rxFrame,
      long txPackets,
      long txErrors,
      long txDropped,
      long txOverruns,
      long txCarrier,
      long txCollisions,
      long rxBytes,
      long txBytes) {
    this.rxPackets = rxPackets;
    this.rxErrors = rxErrors;
    this.rxDropped = rxDropped;
    this.rxOverruns = rxOverruns;
    this.rxFrame = rxFrame;
    this.txPackets = txPackets;
    this.txErrors = txErrors;
    this.txDropped = txDropped;
    this.txOverruns = txOverruns;
    this.txCarrier = txCarrier;
    this.txCollisions = txCollisions;
    this.rxBytes = rxBytes;
    this.txBytes = txBytes;
  }

  @JsonProperty
  @Override
  public long rxPackets() {
    return rxPackets;
  }

  @JsonProperty
  @Override
  public long rxErrors() {
    return rxErrors;
  }

  @JsonProperty
  @Override
  public long rxDropped() {
    return rxDropped;
  }

  @JsonProperty
  @Override
  public long rxOverruns() {
    return rxOverruns;
  }

  @JsonProperty
  @Override
  public long rxFrame() {
    return rxFrame;
  }

  @JsonProperty
  @Override
  public long txPackets() {
    return txPackets;
  }

  @JsonProperty
  @Override
  public long txErrors() {
    return txErrors;
  }

  @JsonProperty
  @Override
  public long txDropped() {
    return txDropped;
  }

  @JsonProperty
  @Override
  public long txOverruns() {
    return txOverruns;
  }

  @JsonProperty
  @Override
  public long txCarrier() {
    return txCarrier;
  }

  @JsonProperty
  @Override
  public long txCollisions() {
    return txCollisions;
  }

  @JsonProperty
  @Override
  public long rxBytes() {
    return rxBytes;
  }

  @JsonProperty
  @Override
  public long txBytes() {
    return txBytes;
  }

  @Override
  public String toString() {
    return "InterfaceStats{"
        + "rxPackets=" + rxPackets + ", "
        + "rxErrors=" + rxErrors + ", "
        + "rxDropped=" + rxDropped + ", "
        + "rxOverruns=" + rxOverruns + ", "
        + "rxFrame=" + rxFrame + ", "
        + "txPackets=" + txPackets + ", "
        + "txErrors=" + txErrors + ", "
        + "txDropped=" + txDropped + ", "
        + "txOverruns=" + txOverruns + ", "
        + "txCarrier=" + txCarrier + ", "
        + "txCollisions=" + txCollisions + ", "
        + "rxBytes=" + rxBytes + ", "
        + "txBytes=" + txBytes
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NetworkStats.InterfaceStats) {
      NetworkStats.InterfaceStats that = (NetworkStats.InterfaceStats) o;
      return (this.rxPackets == that.rxPackets())
           && (this.rxErrors == that.rxErrors())
           && (this.rxDropped == that.rxDropped())
           && (this.rxOverruns == that.rxOverruns())
           && (this.rxFrame == that.rxFrame())
           && (this.txPackets == that.txPackets())
           && (this.txErrors == that.txErrors())
           && (this.txDropped == that.txDropped())
           && (this.txOverruns == that.txOverruns())
           && (this.txCarrier == that.txCarrier())
           && (this.txCollisions == that.txCollisions())
           && (this.rxBytes == that.rxBytes())
           && (this.txBytes == that.txBytes());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.rxPackets >>> 32) ^ this.rxPackets;
    h *= 1000003;
    h ^= (this.rxErrors >>> 32) ^ this.rxErrors;
    h *= 1000003;
    h ^= (this.rxDropped >>> 32) ^ this.rxDropped;
    h *= 1000003;
    h ^= (this.rxOverruns >>> 32) ^ this.rxOverruns;
    h *= 1000003;
    h ^= (this.rxFrame >>> 32) ^ this.rxFrame;
    h *= 1000003;
    h ^= (this.txPackets >>> 32) ^ this.txPackets;
    h *= 1000003;
    h ^= (this.txErrors >>> 32) ^ this.txErrors;
    h *= 1000003;
    h ^= (this.txDropped >>> 32) ^ this.txDropped;
    h *= 1000003;
    h ^= (this.txOverruns >>> 32) ^ this.txOverruns;
    h *= 1000003;
    h ^= (this.txCarrier >>> 32) ^ this.txCarrier;
    h *= 1000003;
    h ^= (this.txCollisions >>> 32) ^ this.txCollisions;
    h *= 1000003;
    h ^= (this.rxBytes >>> 32) ^ this.rxBytes;
    h *= 1000003;
    h ^= (this.txBytes >>> 32) ^ this.txBytes;
    return h;
  }

}
