package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_HostInfo_Extra extends $AutoValue_HostInfo_Extra {
  AutoValue_HostInfo_Extra(String versionString, String libcVersion, String kernelVersion,
      String cpuFrequencyMHz, String cpuFeatures, String scheduler, Long pageSize, Long numPages,
      Long maxOpenFiles) {
    super(versionString, libcVersion, kernelVersion, cpuFrequencyMHz, cpuFeatures, scheduler, pageSize, numPages, maxOpenFiles);
  }

  @JsonIgnore
  @Nullable
  public final String getVersionString() {
    return versionString();
  }

  @JsonIgnore
  @Nullable
  public final String getLibcVersion() {
    return libcVersion();
  }

  @JsonIgnore
  @Nullable
  public final String getKernelVersion() {
    return kernelVersion();
  }

  @JsonIgnore
  @Nullable
  public final String getCpuFrequencyMHz() {
    return cpuFrequencyMHz();
  }

  @JsonIgnore
  @Nullable
  public final String getCpuFeatures() {
    return cpuFeatures();
  }

  @JsonIgnore
  @Nullable
  public final String getScheduler() {
    return scheduler();
  }

  @JsonIgnore
  public final Long getPageSize() {
    return pageSize();
  }

  @JsonIgnore
  @Nullable
  public final Long getNumPages() {
    return numPages();
  }

  @JsonIgnore
  @Nullable
  public final Long getMaxOpenFiles() {
    return maxOpenFiles();
  }
}
