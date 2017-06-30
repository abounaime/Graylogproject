package org.graylog2.shared.system.stats.os;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_Processor extends $AutoValue_Processor {
  AutoValue_Processor(String model, String vendor, int mhz, int totalCores, int totalSockets,
      int coresPerSocket, long cacheSize, short sys, short user, short idle, short stolen) {
    super(model, vendor, mhz, totalCores, totalSockets, coresPerSocket, cacheSize, sys, user, idle, stolen);
  }

  @JsonIgnore
  public final String getModel() {
    return model();
  }

  @JsonIgnore
  public final String getVendor() {
    return vendor();
  }

  @JsonIgnore
  public final int getMhz() {
    return mhz();
  }

  @JsonIgnore
  public final int getTotalCores() {
    return totalCores();
  }

  @JsonIgnore
  public final int getTotalSockets() {
    return totalSockets();
  }

  @JsonIgnore
  public final int getCoresPerSocket() {
    return coresPerSocket();
  }

  @JsonIgnore
  public final long getCacheSize() {
    return cacheSize();
  }

  @JsonIgnore
  public final short getSys() {
    return sys();
  }

  @JsonIgnore
  public final short getUser() {
    return user();
  }

  @JsonIgnore
  public final short getIdle() {
    return idle();
  }

  @JsonIgnore
  public final short getStolen() {
    return stolen();
  }
}
