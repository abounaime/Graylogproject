
package org.graylog2.shared.system.stats.os;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Processor extends Processor {

  private final String model;
  private final String vendor;
  private final int mhz;
  private final int totalCores;
  private final int totalSockets;
  private final int coresPerSocket;
  private final long cacheSize;
  private final short sys;
  private final short user;
  private final short idle;
  private final short stolen;

  $AutoValue_Processor(
      String model,
      String vendor,
      int mhz,
      int totalCores,
      int totalSockets,
      int coresPerSocket,
      long cacheSize,
      short sys,
      short user,
      short idle,
      short stolen) {
    if (model == null) {
      throw new NullPointerException("Null model");
    }
    this.model = model;
    if (vendor == null) {
      throw new NullPointerException("Null vendor");
    }
    this.vendor = vendor;
    this.mhz = mhz;
    this.totalCores = totalCores;
    this.totalSockets = totalSockets;
    this.coresPerSocket = coresPerSocket;
    this.cacheSize = cacheSize;
    this.sys = sys;
    this.user = user;
    this.idle = idle;
    this.stolen = stolen;
  }

  @JsonProperty
  @Override
  public String model() {
    return model;
  }

  @JsonProperty
  @Override
  public String vendor() {
    return vendor;
  }

  @JsonProperty
  @Override
  public int mhz() {
    return mhz;
  }

  @JsonProperty
  @Override
  public int totalCores() {
    return totalCores;
  }

  @JsonProperty
  @Override
  public int totalSockets() {
    return totalSockets;
  }

  @JsonProperty
  @Override
  public int coresPerSocket() {
    return coresPerSocket;
  }

  @JsonProperty
  @Override
  public long cacheSize() {
    return cacheSize;
  }

  @JsonProperty
  @Override
  public short sys() {
    return sys;
  }

  @JsonProperty
  @Override
  public short user() {
    return user;
  }

  @JsonProperty
  @Override
  public short idle() {
    return idle;
  }

  @JsonProperty
  @Override
  public short stolen() {
    return stolen;
  }

  @Override
  public String toString() {
    return "Processor{"
        + "model=" + model + ", "
        + "vendor=" + vendor + ", "
        + "mhz=" + mhz + ", "
        + "totalCores=" + totalCores + ", "
        + "totalSockets=" + totalSockets + ", "
        + "coresPerSocket=" + coresPerSocket + ", "
        + "cacheSize=" + cacheSize + ", "
        + "sys=" + sys + ", "
        + "user=" + user + ", "
        + "idle=" + idle + ", "
        + "stolen=" + stolen
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Processor) {
      Processor that = (Processor) o;
      return (this.model.equals(that.model()))
           && (this.vendor.equals(that.vendor()))
           && (this.mhz == that.mhz())
           && (this.totalCores == that.totalCores())
           && (this.totalSockets == that.totalSockets())
           && (this.coresPerSocket == that.coresPerSocket())
           && (this.cacheSize == that.cacheSize())
           && (this.sys == that.sys())
           && (this.user == that.user())
           && (this.idle == that.idle())
           && (this.stolen == that.stolen());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.model.hashCode();
    h *= 1000003;
    h ^= this.vendor.hashCode();
    h *= 1000003;
    h ^= this.mhz;
    h *= 1000003;
    h ^= this.totalCores;
    h *= 1000003;
    h ^= this.totalSockets;
    h *= 1000003;
    h ^= this.coresPerSocket;
    h *= 1000003;
    h ^= (this.cacheSize >>> 32) ^ this.cacheSize;
    h *= 1000003;
    h ^= this.sys;
    h *= 1000003;
    h ^= this.user;
    h *= 1000003;
    h ^= this.idle;
    h *= 1000003;
    h ^= this.stolen;
    return h;
  }

}
