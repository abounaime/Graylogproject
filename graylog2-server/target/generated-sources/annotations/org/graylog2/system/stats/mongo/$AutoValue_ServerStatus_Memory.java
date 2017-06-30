
package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ServerStatus_Memory extends ServerStatus.Memory {

  private final int bits;
  private final int resident;
  private final int virtual;
  private final boolean supported;
  private final int mapped;
  private final int mappedWithJournal;

  $AutoValue_ServerStatus_Memory(
      int bits,
      int resident,
      int virtual,
      boolean supported,
      int mapped,
      int mappedWithJournal) {
    this.bits = bits;
    this.resident = resident;
    this.virtual = virtual;
    this.supported = supported;
    this.mapped = mapped;
    this.mappedWithJournal = mappedWithJournal;
  }

  @JsonProperty
  @Override
  public int bits() {
    return bits;
  }

  @JsonProperty
  @Override
  public int resident() {
    return resident;
  }

  @JsonProperty
  @Override
  public int virtual() {
    return virtual;
  }

  @JsonProperty
  @Override
  public boolean supported() {
    return supported;
  }

  @JsonProperty
  @Override
  public int mapped() {
    return mapped;
  }

  @JsonProperty
  @Override
  public int mappedWithJournal() {
    return mappedWithJournal;
  }

  @Override
  public String toString() {
    return "Memory{"
        + "bits=" + bits + ", "
        + "resident=" + resident + ", "
        + "virtual=" + virtual + ", "
        + "supported=" + supported + ", "
        + "mapped=" + mapped + ", "
        + "mappedWithJournal=" + mappedWithJournal
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ServerStatus.Memory) {
      ServerStatus.Memory that = (ServerStatus.Memory) o;
      return (this.bits == that.bits())
           && (this.resident == that.resident())
           && (this.virtual == that.virtual())
           && (this.supported == that.supported())
           && (this.mapped == that.mapped())
           && (this.mappedWithJournal == that.mappedWithJournal());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.bits;
    h *= 1000003;
    h ^= this.resident;
    h *= 1000003;
    h ^= this.virtual;
    h *= 1000003;
    h ^= this.supported ? 1231 : 1237;
    h *= 1000003;
    h ^= this.mapped;
    h *= 1000003;
    h ^= this.mappedWithJournal;
    return h;
  }

}
