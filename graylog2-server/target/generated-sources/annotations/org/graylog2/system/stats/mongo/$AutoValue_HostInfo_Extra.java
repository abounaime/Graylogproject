
package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_HostInfo_Extra extends HostInfo.Extra {

  private final String versionString;
  private final String libcVersion;
  private final String kernelVersion;
  private final String cpuFrequencyMHz;
  private final String cpuFeatures;
  private final String scheduler;
  private final Long pageSize;
  private final Long numPages;
  private final Long maxOpenFiles;

  $AutoValue_HostInfo_Extra(
      @Nullable String versionString,
      @Nullable String libcVersion,
      @Nullable String kernelVersion,
      @Nullable String cpuFrequencyMHz,
      @Nullable String cpuFeatures,
      @Nullable String scheduler,
      Long pageSize,
      @Nullable Long numPages,
      @Nullable Long maxOpenFiles) {
    this.versionString = versionString;
    this.libcVersion = libcVersion;
    this.kernelVersion = kernelVersion;
    this.cpuFrequencyMHz = cpuFrequencyMHz;
    this.cpuFeatures = cpuFeatures;
    this.scheduler = scheduler;
    if (pageSize == null) {
      throw new NullPointerException("Null pageSize");
    }
    this.pageSize = pageSize;
    this.numPages = numPages;
    this.maxOpenFiles = maxOpenFiles;
  }

  @JsonProperty
  @Nullable
  @Override
  public String versionString() {
    return versionString;
  }

  @JsonProperty
  @Nullable
  @Override
  public String libcVersion() {
    return libcVersion;
  }

  @JsonProperty
  @Nullable
  @Override
  public String kernelVersion() {
    return kernelVersion;
  }

  @JsonProperty
  @Nullable
  @Override
  public String cpuFrequencyMHz() {
    return cpuFrequencyMHz;
  }

  @JsonProperty
  @Nullable
  @Override
  public String cpuFeatures() {
    return cpuFeatures;
  }

  @JsonProperty
  @Nullable
  @Override
  public String scheduler() {
    return scheduler;
  }

  @JsonProperty
  @Override
  public Long pageSize() {
    return pageSize;
  }

  @JsonProperty
  @Nullable
  @Override
  public Long numPages() {
    return numPages;
  }

  @JsonProperty
  @Nullable
  @Override
  public Long maxOpenFiles() {
    return maxOpenFiles;
  }

  @Override
  public String toString() {
    return "Extra{"
        + "versionString=" + versionString + ", "
        + "libcVersion=" + libcVersion + ", "
        + "kernelVersion=" + kernelVersion + ", "
        + "cpuFrequencyMHz=" + cpuFrequencyMHz + ", "
        + "cpuFeatures=" + cpuFeatures + ", "
        + "scheduler=" + scheduler + ", "
        + "pageSize=" + pageSize + ", "
        + "numPages=" + numPages + ", "
        + "maxOpenFiles=" + maxOpenFiles
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HostInfo.Extra) {
      HostInfo.Extra that = (HostInfo.Extra) o;
      return ((this.versionString == null) ? (that.versionString() == null) : this.versionString.equals(that.versionString()))
           && ((this.libcVersion == null) ? (that.libcVersion() == null) : this.libcVersion.equals(that.libcVersion()))
           && ((this.kernelVersion == null) ? (that.kernelVersion() == null) : this.kernelVersion.equals(that.kernelVersion()))
           && ((this.cpuFrequencyMHz == null) ? (that.cpuFrequencyMHz() == null) : this.cpuFrequencyMHz.equals(that.cpuFrequencyMHz()))
           && ((this.cpuFeatures == null) ? (that.cpuFeatures() == null) : this.cpuFeatures.equals(that.cpuFeatures()))
           && ((this.scheduler == null) ? (that.scheduler() == null) : this.scheduler.equals(that.scheduler()))
           && (this.pageSize.equals(that.pageSize()))
           && ((this.numPages == null) ? (that.numPages() == null) : this.numPages.equals(that.numPages()))
           && ((this.maxOpenFiles == null) ? (that.maxOpenFiles() == null) : this.maxOpenFiles.equals(that.maxOpenFiles()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (versionString == null) ? 0 : this.versionString.hashCode();
    h *= 1000003;
    h ^= (libcVersion == null) ? 0 : this.libcVersion.hashCode();
    h *= 1000003;
    h ^= (kernelVersion == null) ? 0 : this.kernelVersion.hashCode();
    h *= 1000003;
    h ^= (cpuFrequencyMHz == null) ? 0 : this.cpuFrequencyMHz.hashCode();
    h *= 1000003;
    h ^= (cpuFeatures == null) ? 0 : this.cpuFeatures.hashCode();
    h *= 1000003;
    h ^= (scheduler == null) ? 0 : this.scheduler.hashCode();
    h *= 1000003;
    h ^= this.pageSize.hashCode();
    h *= 1000003;
    h ^= (numPages == null) ? 0 : this.numPages.hashCode();
    h *= 1000003;
    h ^= (maxOpenFiles == null) ? 0 : this.maxOpenFiles.hashCode();
    return h;
  }

}
