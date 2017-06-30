
package org.graylog2.shared.system.stats.os;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_OsStats extends OsStats {

  private final double[] loadAverage;
  private final long uptime;
  private final Processor processor;
  private final Memory memory;
  private final Swap swap;

  $AutoValue_OsStats(
      double[] loadAverage,
      long uptime,
      Processor processor,
      Memory memory,
      Swap swap) {
    if (loadAverage == null) {
      throw new NullPointerException("Null loadAverage");
    }
    this.loadAverage = loadAverage;
    this.uptime = uptime;
    if (processor == null) {
      throw new NullPointerException("Null processor");
    }
    this.processor = processor;
    if (memory == null) {
      throw new NullPointerException("Null memory");
    }
    this.memory = memory;
    if (swap == null) {
      throw new NullPointerException("Null swap");
    }
    this.swap = swap;
  }

  @JsonProperty
  @SuppressWarnings(value = {"mutable"})
  @Override
  public double[] loadAverage() {
    return loadAverage;
  }

  @JsonProperty
  @Override
  public long uptime() {
    return uptime;
  }

  @JsonProperty
  @Override
  public Processor processor() {
    return processor;
  }

  @JsonProperty
  @Override
  public Memory memory() {
    return memory;
  }

  @JsonProperty
  @Override
  public Swap swap() {
    return swap;
  }

  @Override
  public String toString() {
    return "OsStats{"
        + "loadAverage=" + Arrays.toString(loadAverage) + ", "
        + "uptime=" + uptime + ", "
        + "processor=" + processor + ", "
        + "memory=" + memory + ", "
        + "swap=" + swap
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OsStats) {
      OsStats that = (OsStats) o;
      return (Arrays.equals(this.loadAverage, (that instanceof $AutoValue_OsStats) ? (($AutoValue_OsStats) that).loadAverage : that.loadAverage()))
           && (this.uptime == that.uptime())
           && (this.processor.equals(that.processor()))
           && (this.memory.equals(that.memory()))
           && (this.swap.equals(that.swap()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Arrays.hashCode(this.loadAverage);
    h *= 1000003;
    h ^= (this.uptime >>> 32) ^ this.uptime;
    h *= 1000003;
    h ^= this.processor.hashCode();
    h *= 1000003;
    h ^= this.memory.hashCode();
    h *= 1000003;
    h ^= this.swap.hashCode();
    return h;
  }

}
