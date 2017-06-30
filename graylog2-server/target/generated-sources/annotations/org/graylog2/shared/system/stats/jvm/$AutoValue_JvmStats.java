
package org.graylog2.shared.system.stats.jvm;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_JvmStats extends JvmStats {

  private final String version;
  private final String vmName;
  private final String vmVersion;
  private final String vmVendor;
  private final String specName;
  private final String specVersion;
  private final String specVendor;
  private final long startTime;
  private final JvmStats.Memory mem;
  private final List<String> inputArguments;
  private final String bootClassPath;
  private final String classPath;
  private final Map<String, String> systemProperties;
  private final List<String> garbageCollectors;
  private final List<String> memoryPools;

  $AutoValue_JvmStats(
      String version,
      String vmName,
      String vmVersion,
      String vmVendor,
      String specName,
      String specVersion,
      String specVendor,
      long startTime,
      JvmStats.Memory mem,
      List<String> inputArguments,
      String bootClassPath,
      String classPath,
      Map<String, String> systemProperties,
      List<String> garbageCollectors,
      List<String> memoryPools) {
    if (version == null) {
      throw new NullPointerException("Null version");
    }
    this.version = version;
    if (vmName == null) {
      throw new NullPointerException("Null vmName");
    }
    this.vmName = vmName;
    if (vmVersion == null) {
      throw new NullPointerException("Null vmVersion");
    }
    this.vmVersion = vmVersion;
    if (vmVendor == null) {
      throw new NullPointerException("Null vmVendor");
    }
    this.vmVendor = vmVendor;
    if (specName == null) {
      throw new NullPointerException("Null specName");
    }
    this.specName = specName;
    if (specVersion == null) {
      throw new NullPointerException("Null specVersion");
    }
    this.specVersion = specVersion;
    if (specVendor == null) {
      throw new NullPointerException("Null specVendor");
    }
    this.specVendor = specVendor;
    this.startTime = startTime;
    if (mem == null) {
      throw new NullPointerException("Null mem");
    }
    this.mem = mem;
    if (inputArguments == null) {
      throw new NullPointerException("Null inputArguments");
    }
    this.inputArguments = inputArguments;
    if (bootClassPath == null) {
      throw new NullPointerException("Null bootClassPath");
    }
    this.bootClassPath = bootClassPath;
    if (classPath == null) {
      throw new NullPointerException("Null classPath");
    }
    this.classPath = classPath;
    if (systemProperties == null) {
      throw new NullPointerException("Null systemProperties");
    }
    this.systemProperties = systemProperties;
    if (garbageCollectors == null) {
      throw new NullPointerException("Null garbageCollectors");
    }
    this.garbageCollectors = garbageCollectors;
    if (memoryPools == null) {
      throw new NullPointerException("Null memoryPools");
    }
    this.memoryPools = memoryPools;
  }

  @JsonProperty
  @Override
  public String version() {
    return version;
  }

  @JsonProperty
  @Override
  public String vmName() {
    return vmName;
  }

  @JsonProperty
  @Override
  public String vmVersion() {
    return vmVersion;
  }

  @JsonProperty
  @Override
  public String vmVendor() {
    return vmVendor;
  }

  @JsonProperty
  @Override
  public String specName() {
    return specName;
  }

  @JsonProperty
  @Override
  public String specVersion() {
    return specVersion;
  }

  @JsonProperty
  @Override
  public String specVendor() {
    return specVendor;
  }

  @JsonProperty
  @Override
  public long startTime() {
    return startTime;
  }

  @JsonProperty
  @Override
  public JvmStats.Memory mem() {
    return mem;
  }

  @JsonProperty
  @Override
  public List<String> inputArguments() {
    return inputArguments;
  }

  @JsonProperty
  @Override
  public String bootClassPath() {
    return bootClassPath;
  }

  @JsonProperty
  @Override
  public String classPath() {
    return classPath;
  }

  @JsonProperty
  @Override
  public Map<String, String> systemProperties() {
    return systemProperties;
  }

  @JsonProperty
  @Override
  public List<String> garbageCollectors() {
    return garbageCollectors;
  }

  @JsonProperty
  @Override
  public List<String> memoryPools() {
    return memoryPools;
  }

  @Override
  public String toString() {
    return "JvmStats{"
        + "version=" + version + ", "
        + "vmName=" + vmName + ", "
        + "vmVersion=" + vmVersion + ", "
        + "vmVendor=" + vmVendor + ", "
        + "specName=" + specName + ", "
        + "specVersion=" + specVersion + ", "
        + "specVendor=" + specVendor + ", "
        + "startTime=" + startTime + ", "
        + "mem=" + mem + ", "
        + "inputArguments=" + inputArguments + ", "
        + "bootClassPath=" + bootClassPath + ", "
        + "classPath=" + classPath + ", "
        + "systemProperties=" + systemProperties + ", "
        + "garbageCollectors=" + garbageCollectors + ", "
        + "memoryPools=" + memoryPools
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof JvmStats) {
      JvmStats that = (JvmStats) o;
      return (this.version.equals(that.version()))
           && (this.vmName.equals(that.vmName()))
           && (this.vmVersion.equals(that.vmVersion()))
           && (this.vmVendor.equals(that.vmVendor()))
           && (this.specName.equals(that.specName()))
           && (this.specVersion.equals(that.specVersion()))
           && (this.specVendor.equals(that.specVendor()))
           && (this.startTime == that.startTime())
           && (this.mem.equals(that.mem()))
           && (this.inputArguments.equals(that.inputArguments()))
           && (this.bootClassPath.equals(that.bootClassPath()))
           && (this.classPath.equals(that.classPath()))
           && (this.systemProperties.equals(that.systemProperties()))
           && (this.garbageCollectors.equals(that.garbageCollectors()))
           && (this.memoryPools.equals(that.memoryPools()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.version.hashCode();
    h *= 1000003;
    h ^= this.vmName.hashCode();
    h *= 1000003;
    h ^= this.vmVersion.hashCode();
    h *= 1000003;
    h ^= this.vmVendor.hashCode();
    h *= 1000003;
    h ^= this.specName.hashCode();
    h *= 1000003;
    h ^= this.specVersion.hashCode();
    h *= 1000003;
    h ^= this.specVendor.hashCode();
    h *= 1000003;
    h ^= (this.startTime >>> 32) ^ this.startTime;
    h *= 1000003;
    h ^= this.mem.hashCode();
    h *= 1000003;
    h ^= this.inputArguments.hashCode();
    h *= 1000003;
    h ^= this.bootClassPath.hashCode();
    h *= 1000003;
    h ^= this.classPath.hashCode();
    h *= 1000003;
    h ^= this.systemProperties.hashCode();
    h *= 1000003;
    h ^= this.garbageCollectors.hashCode();
    h *= 1000003;
    h ^= this.memoryPools.hashCode();
    return h;
  }

}
