
package org.graylog2.shared.system.stats.process;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ProcessStats_Memory extends ProcessStats.Memory {

  private final long totalVirtual;
  private final long resident;
  private final long share;

  $AutoValue_ProcessStats_Memory(
      long totalVirtual,
      long resident,
      long share) {
    this.totalVirtual = totalVirtual;
    this.resident = resident;
    this.share = share;
  }

  @JsonProperty
  @Override
  public long totalVirtual() {
    return totalVirtual;
  }

  @JsonProperty
  @Override
  public long resident() {
    return resident;
  }

  @JsonProperty
  @Override
  public long share() {
    return share;
  }

  @Override
  public String toString() {
    return "Memory{"
        + "totalVirtual=" + totalVirtual + ", "
        + "resident=" + resident + ", "
        + "share=" + share
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProcessStats.Memory) {
      ProcessStats.Memory that = (ProcessStats.Memory) o;
      return (this.totalVirtual == that.totalVirtual())
           && (this.resident == that.resident())
           && (this.share == that.share());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.totalVirtual >>> 32) ^ this.totalVirtual;
    h *= 1000003;
    h ^= (this.resident >>> 32) ^ this.resident;
    h *= 1000003;
    h ^= (this.share >>> 32) ^ this.share;
    return h;
  }

}
