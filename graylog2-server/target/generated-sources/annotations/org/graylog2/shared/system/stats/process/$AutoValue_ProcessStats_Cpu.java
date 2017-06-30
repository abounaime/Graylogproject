
package org.graylog2.shared.system.stats.process;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ProcessStats_Cpu extends ProcessStats.Cpu {

  private final short percent;
  private final long sys;
  private final long user;
  private final long total;

  $AutoValue_ProcessStats_Cpu(
      short percent,
      long sys,
      long user,
      long total) {
    this.percent = percent;
    this.sys = sys;
    this.user = user;
    this.total = total;
  }

  @JsonProperty
  @Override
  public short percent() {
    return percent;
  }

  @JsonProperty
  @Override
  public long sys() {
    return sys;
  }

  @JsonProperty
  @Override
  public long user() {
    return user;
  }

  @JsonProperty
  @Override
  public long total() {
    return total;
  }

  @Override
  public String toString() {
    return "Cpu{"
        + "percent=" + percent + ", "
        + "sys=" + sys + ", "
        + "user=" + user + ", "
        + "total=" + total
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProcessStats.Cpu) {
      ProcessStats.Cpu that = (ProcessStats.Cpu) o;
      return (this.percent == that.percent())
           && (this.sys == that.sys())
           && (this.user == that.user())
           && (this.total == that.total());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.percent;
    h *= 1000003;
    h ^= (this.sys >>> 32) ^ this.sys;
    h *= 1000003;
    h ^= (this.user >>> 32) ^ this.user;
    h *= 1000003;
    h ^= (this.total >>> 32) ^ this.total;
    return h;
  }

}
