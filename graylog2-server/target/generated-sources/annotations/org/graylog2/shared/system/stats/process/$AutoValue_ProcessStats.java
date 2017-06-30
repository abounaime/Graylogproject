
package org.graylog2.shared.system.stats.process;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ProcessStats extends ProcessStats {

  private final long pid;
  private final long openFileDescriptors;
  private final long maxFileDescriptors;
  private final ProcessStats.Cpu cpu;
  private final ProcessStats.Memory memory;

  $AutoValue_ProcessStats(
      long pid,
      long openFileDescriptors,
      long maxFileDescriptors,
      @Nullable ProcessStats.Cpu cpu,
      @Nullable ProcessStats.Memory memory) {
    this.pid = pid;
    this.openFileDescriptors = openFileDescriptors;
    this.maxFileDescriptors = maxFileDescriptors;
    this.cpu = cpu;
    this.memory = memory;
  }

  @JsonProperty
  @Override
  public long pid() {
    return pid;
  }

  @JsonProperty
  @Override
  public long openFileDescriptors() {
    return openFileDescriptors;
  }

  @JsonProperty
  @Override
  public long maxFileDescriptors() {
    return maxFileDescriptors;
  }

  @JsonProperty
  @Nullable
  @Override
  public ProcessStats.Cpu cpu() {
    return cpu;
  }

  @JsonProperty
  @Nullable
  @Override
  public ProcessStats.Memory memory() {
    return memory;
  }

  @Override
  public String toString() {
    return "ProcessStats{"
        + "pid=" + pid + ", "
        + "openFileDescriptors=" + openFileDescriptors + ", "
        + "maxFileDescriptors=" + maxFileDescriptors + ", "
        + "cpu=" + cpu + ", "
        + "memory=" + memory
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProcessStats) {
      ProcessStats that = (ProcessStats) o;
      return (this.pid == that.pid())
           && (this.openFileDescriptors == that.openFileDescriptors())
           && (this.maxFileDescriptors == that.maxFileDescriptors())
           && ((this.cpu == null) ? (that.cpu() == null) : this.cpu.equals(that.cpu()))
           && ((this.memory == null) ? (that.memory() == null) : this.memory.equals(that.memory()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.pid >>> 32) ^ this.pid;
    h *= 1000003;
    h ^= (this.openFileDescriptors >>> 32) ^ this.openFileDescriptors;
    h *= 1000003;
    h ^= (this.maxFileDescriptors >>> 32) ^ this.maxFileDescriptors;
    h *= 1000003;
    h ^= (cpu == null) ? 0 : this.cpu.hashCode();
    h *= 1000003;
    h ^= (memory == null) ? 0 : this.memory.hashCode();
    return h;
  }

}
