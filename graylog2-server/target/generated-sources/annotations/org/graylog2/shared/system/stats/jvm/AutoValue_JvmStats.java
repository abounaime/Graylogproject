package org.graylog2.shared.system.stats.jvm;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;
import java.util.Map;

final class AutoValue_JvmStats extends $AutoValue_JvmStats {
  AutoValue_JvmStats(String version, String vmName, String vmVersion, String vmVendor,
      String specName, String specVersion, String specVendor, long startTime, JvmStats.Memory mem,
      List<String> inputArguments, String bootClassPath, String classPath,
      Map<String, String> systemProperties, List<String> garbageCollectors,
      List<String> memoryPools) {
    super(version, vmName, vmVersion, vmVendor, specName, specVersion, specVendor, startTime, mem, inputArguments, bootClassPath, classPath, systemProperties, garbageCollectors, memoryPools);
  }

  @JsonIgnore
  public final String getVersion() {
    return version();
  }

  @JsonIgnore
  public final String getVmName() {
    return vmName();
  }

  @JsonIgnore
  public final String getVmVersion() {
    return vmVersion();
  }

  @JsonIgnore
  public final String getVmVendor() {
    return vmVendor();
  }

  @JsonIgnore
  public final String getSpecName() {
    return specName();
  }

  @JsonIgnore
  public final String getSpecVersion() {
    return specVersion();
  }

  @JsonIgnore
  public final String getSpecVendor() {
    return specVendor();
  }

  @JsonIgnore
  public final long getStartTime() {
    return startTime();
  }

  @JsonIgnore
  public final JvmStats.Memory getMem() {
    return mem();
  }

  @JsonIgnore
  public final List<String> getInputArguments() {
    return inputArguments();
  }

  @JsonIgnore
  public final String getBootClassPath() {
    return bootClassPath();
  }

  @JsonIgnore
  public final String getClassPath() {
    return classPath();
  }

  @JsonIgnore
  public final Map<String, String> getSystemProperties() {
    return systemProperties();
  }

  @JsonIgnore
  public final List<String> getGarbageCollectors() {
    return garbageCollectors();
  }

  @JsonIgnore
  public final List<String> getMemoryPools() {
    return memoryPools();
  }
}
