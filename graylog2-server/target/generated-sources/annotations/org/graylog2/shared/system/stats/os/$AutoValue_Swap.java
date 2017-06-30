
package org.graylog2.shared.system.stats.os;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Swap extends Swap {

  private final long total;
  private final long free;
  private final long used;

  $AutoValue_Swap(
      long total,
      long free,
      long used) {
    this.total = total;
    this.free = free;
    this.used = used;
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
  public long used() {
    return used;
  }

  @Override
  public String toString() {
    return "Swap{"
        + "total=" + total + ", "
        + "free=" + free + ", "
        + "used=" + used
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Swap) {
      Swap that = (Swap) o;
      return (this.total == that.total())
           && (this.free == that.free())
           && (this.used == that.used());
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
    h ^= (this.used >>> 32) ^ this.used;
    return h;
  }

}
