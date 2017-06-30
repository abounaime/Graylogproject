package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_ServerStatus_Memory extends $AutoValue_ServerStatus_Memory {
  AutoValue_ServerStatus_Memory(int bits, int resident, int virtual, boolean supported, int mapped,
      int mappedWithJournal) {
    super(bits, resident, virtual, supported, mapped, mappedWithJournal);
  }

  @JsonIgnore
  public final int getBits() {
    return bits();
  }

  @JsonIgnore
  public final int getResident() {
    return resident();
  }

  @JsonIgnore
  public final int getVirtual() {
    return virtual();
  }

  @JsonIgnore
  public final boolean isSupported() {
    return supported();
  }

  @JsonIgnore
  public final int getMapped() {
    return mapped();
  }

  @JsonIgnore
  public final int getMappedWithJournal() {
    return mappedWithJournal();
  }
}
