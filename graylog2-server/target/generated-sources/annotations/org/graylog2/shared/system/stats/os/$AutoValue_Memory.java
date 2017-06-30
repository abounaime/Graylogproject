
package org.graylog2.shared.system.stats.os;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Memory extends Memory {

  private final long total;
  private final long free;
  private final short freePercent;
  private final long used;
  private final short usedPercent;
  private final long actualFree;
  private final long actualUsed;

  $AutoValue_Memory(
      long total,
      long free,
      short freePercent,
      long used,
      short usedPercent,
      long actualFree,
      long actualUsed) {
    this.total = total;
    this.free = free;
    this.freePercent = freePercent;
    this.used = used;
    this.usedPercent = usedPercent;
    this.actualFree = actualFree;
    this.actualUsed = actualUsed;
  }

  @JsonProperty
  @Override
  public long total() {
    return total;
  }

  @JsonProperty
  @Override
  public long free() {
    return free;
  }

  @JsonProperty
  @Override
  public short freePercent() {
    return freePercent;
  }

  @JsonProperty
  @Override
  public long used() {
    return used;
  }

  @JsonProperty
  @Override
  public short usedPercent() {
    return usedPercent;
  }

  @JsonProperty
  @Override
  public long actualFree() {
    return actualFree;
  }

  @JsonProperty
  @Override
  public long actualUsed() {
    return actualUsed;
  }

  @Override
  public String toString() {
    return "Memory{"
        + "total=" + total + ", "
        + "free=" + free + ", "
        + "freePercent=" + freePercent + ", "
        + "used=" + used + ", "
        + "usedPercent=" + usedPercent + ", "
        + "actualFree=" + actualFree + ", "
        + "actualUsed=" + actualUsed
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Memory) {
      Memory that = (Memory) o;
      return (this.total == that.total())
           && (this.free == that.free())
           && (this.freePercent == that.freePercent())
           && (this.used == that.used())
           && (this.usedPercent == that.usedPercent())
           && (this.actualFree == that.actualFree())
           && (this.actualUsed == that.actualUsed());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.total >>> 32) ^ this.total;
    h *= 1000003;
    h ^= (this.free >>> 32) ^ this.free;
    h *= 1000003;
    h ^= this.freePercent;
    h *= 1000003;
    h ^= (this.used >>> 32) ^ this.used;
    h *= 1000003;
    h ^= this.usedPercent;
    h *= 1000003;
    h ^= (this.actualFree >>> 32) ^ this.actualFree;
    h *= 1000003;
    h ^= (this.actualUsed >>> 32) ^ this.actualUsed;
    return h;
  }

}
