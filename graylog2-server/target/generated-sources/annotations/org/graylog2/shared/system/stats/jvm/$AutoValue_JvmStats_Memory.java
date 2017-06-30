
package org.graylog2.shared.system.stats.jvm;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_JvmStats_Memory extends JvmStats.Memory {

  private final long heapInit;
  private final long heapMax;
  private final long nonHeapInit;
  private final long nonHeapMax;
  private final long directMemoryMax;

  $AutoValue_JvmStats_Memory(
      long heapInit,
      long heapMax,
      long nonHeapInit,
      long nonHeapMax,
      long directMemoryMax) {
    this.heapInit = heapInit;
    this.heapMax = heapMax;
    this.nonHeapInit = nonHeapInit;
    this.nonHeapMax = nonHeapMax;
    this.directMemoryMax = directMemoryMax;
  }

  @JsonProperty
  @Override
  public long heapInit() {
    return heapInit;
  }

  @JsonProperty
  @Override
  public long heapMax() {
    return heapMax;
  }

  @JsonProperty
  @Override
  public long nonHeapInit() {
    return nonHeapInit;
  }

  @JsonProperty
  @Override
  public long nonHeapMax() {
    return nonHeapMax;
  }

  @JsonProperty
  @Override
  public long directMemoryMax() {
    return directMemoryMax;
  }

  @Override
  public String toString() {
    return "Memory{"
        + "heapInit=" + heapInit + ", "
        + "heapMax=" + heapMax + ", "
        + "nonHeapInit=" + nonHeapInit + ", "
        + "nonHeapMax=" + nonHeapMax + ", "
        + "directMemoryMax=" + directMemoryMax
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof JvmStats.Memory) {
      JvmStats.Memory that = (JvmStats.Memory) o;
      return (this.heapInit == that.heapInit())
           && (this.heapMax == that.heapMax())
           && (this.nonHeapInit == that.nonHeapInit())
           && (this.nonHeapMax == that.nonHeapMax())
           && (this.directMemoryMax == that.directMemoryMax());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.heapInit >>> 32) ^ this.heapInit;
    h *= 1000003;
    h ^= (this.heapMax >>> 32) ^ this.heapMax;
    h *= 1000003;
    h ^= (this.nonHeapInit >>> 32) ^ this.nonHeapInit;
    h *= 1000003;
    h ^= (this.nonHeapMax >>> 32) ^ this.nonHeapMax;
    h *= 1000003;
    h ^= (this.directMemoryMax >>> 32) ^ this.directMemoryMax;
    return h;
  }

}
