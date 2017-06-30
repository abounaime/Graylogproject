package org.graylog2.shared.system.stats.network;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_NetworkStats_TcpStats extends $AutoValue_NetworkStats_TcpStats {
  AutoValue_NetworkStats_TcpStats(long activeOpens, long passiveOpens, long attemptFails,
      long estabResets, long currEstab, long inSegs, long outSegs, long retransSegs, long inErrs,
      long outRsts) {
    super(activeOpens, passiveOpens, attemptFails, estabResets, currEstab, inSegs, outSegs, retransSegs, inErrs, outRsts);
  }

  @JsonIgnore
  public final long getActiveOpens() {
    return activeOpens();
  }

  @JsonIgnore
  public final long getPassiveOpens() {
    return passiveOpens();
  }

  @JsonIgnore
  public final long getAttemptFails() {
    return attemptFails();
  }

  @JsonIgnore
  public final long getEstabResets() {
    return estabResets();
  }

  @JsonIgnore
  public final long getCurrEstab() {
    return currEstab();
  }

  @JsonIgnore
  public final long getInSegs() {
    return inSegs();
  }

  @JsonIgnore
  public final long getOutSegs() {
    return outSegs();
  }

  @JsonIgnore
  public final long getRetransSegs() {
    return retransSegs();
  }

  @JsonIgnore
  public final long getInErrs() {
    return inErrs();
  }

  @JsonIgnore
  public final long getOutRsts() {
    return outRsts();
  }
}
