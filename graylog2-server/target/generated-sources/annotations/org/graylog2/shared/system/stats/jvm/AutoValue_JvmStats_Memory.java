package org.graylog2.shared.system.stats.jvm;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_JvmStats_Memory extends $AutoValue_JvmStats_Memory {
  AutoValue_JvmStats_Memory(long heapInit, long heapMax, long nonHeapInit, long nonHeapMax,
      long directMemoryMax) {
    super(heapInit, heapMax, nonHeapInit, nonHeapMax, directMemoryMax);
  }

  @JsonIgnore
  public final long getHeapInit() {
    return heapInit();
  }

  @JsonIgnore
  public final long getHeapMax() {
    return heapMax();
  }

  @JsonIgnore
  public final long getNonHeapInit() {
    return nonHeapInit();
  }

  @JsonIgnore
  public final long getNonHeapMax() {
    return nonHeapMax();
  }

  @JsonIgnore
  public final long getDirectMemoryMax() {
    return directMemoryMax();
  }
}
