
package org.graylog2.shared.system.stats.network;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_NetworkStats_TcpStats extends NetworkStats.TcpStats {

  private final long activeOpens;
  private final long passiveOpens;
  private final long attemptFails;
  private final long estabResets;
  private final long currEstab;
  private final long inSegs;
  private final long outSegs;
  private final long retransSegs;
  private final long inErrs;
  private final long outRsts;

  $AutoValue_NetworkStats_TcpStats(
      long activeOpens,
      long passiveOpens,
      long attemptFails,
      long estabResets,
      long currEstab,
      long inSegs,
      long outSegs,
      long retransSegs,
      long inErrs,
      long outRsts) {
    this.activeOpens = activeOpens;
    this.passiveOpens = passiveOpens;
    this.attemptFails = attemptFails;
    this.estabResets = estabResets;
    this.currEstab = currEstab;
    this.inSegs = inSegs;
    this.outSegs = outSegs;
    this.retransSegs = retransSegs;
    this.inErrs = inErrs;
    this.outRsts = outRsts;
  }

  @JsonProperty
  @Override
  public long activeOpens() {
    return activeOpens;
  }

  @JsonProperty
  @Override
  public long passiveOpens() {
    return passiveOpens;
  }

  @JsonProperty
  @Override
  public long attemptFails() {
    return attemptFails;
  }

  @JsonProperty
  @Override
  public long estabResets() {
    return estabResets;
  }

  @JsonProperty
  @Override
  public long currEstab() {
    return currEstab;
  }

  @JsonProperty
  @Override
  public long inSegs() {
    return inSegs;
  }

  @JsonProperty
  @Override
  public long outSegs() {
    return outSegs;
  }

  @JsonProperty
  @Override
  public long retransSegs() {
    return retransSegs;
  }

  @JsonProperty
  @Override
  public long inErrs() {
    return inErrs;
  }

  @JsonProperty
  @Override
  public long outRsts() {
    return outRsts;
  }

  @Override
  public String toString() {
    return "TcpStats{"
        + "activeOpens=" + activeOpens + ", "
        + "passiveOpens=" + passiveOpens + ", "
        + "attemptFails=" + attemptFails + ", "
        + "estabResets=" + estabResets + ", "
        + "currEstab=" + currEstab + ", "
        + "inSegs=" + inSegs + ", "
        + "outSegs=" + outSegs + ", "
        + "retransSegs=" + retransSegs + ", "
        + "inErrs=" + inErrs + ", "
        + "outRsts=" + outRsts
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NetworkStats.TcpStats) {
      NetworkStats.TcpStats that = (NetworkStats.TcpStats) o;
      return (this.activeOpens == that.activeOpens())
           && (this.passiveOpens == that.passiveOpens())
           && (this.attemptFails == that.attemptFails())
           && (this.estabResets == that.estabResets())
           && (this.currEstab == that.currEstab())
           && (this.inSegs == that.inSegs())
           && (this.outSegs == that.outSegs())
           && (this.retransSegs == that.retransSegs())
           && (this.inErrs == that.inErrs())
           && (this.outRsts == that.outRsts());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.activeOpens >>> 32) ^ this.activeOpens;
    h *= 1000003;
    h ^= (this.passiveOpens >>> 32) ^ this.passiveOpens;
    h *= 1000003;
    h ^= (this.attemptFails >>> 32) ^ this.attemptFails;
    h *= 1000003;
    h ^= (this.estabResets >>> 32) ^ this.estabResets;
    h *= 1000003;
    h ^= (this.currEstab >>> 32) ^ this.currEstab;
    h *= 1000003;
    h ^= (this.inSegs >>> 32) ^ this.inSegs;
    h *= 1000003;
    h ^= (this.outSegs >>> 32) ^ this.outSegs;
    h *= 1000003;
    h ^= (this.retransSegs >>> 32) ^ this.retransSegs;
    h *= 1000003;
    h ^= (this.inErrs >>> 32) ^ this.inErrs;
    h *= 1000003;
    h ^= (this.outRsts >>> 32) ^ this.outRsts;
    return h;
  }

}
