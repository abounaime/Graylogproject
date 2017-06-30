
package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_BuildInfo extends BuildInfo {

  private final String version;
  private final String gitVersion;
  private final String sysInfo;
  private final String loaderFlags;
  private final String compilerFlags;
  private final String allocator;
  private final List<Integer> versionArray;
  private final String javascriptEngine;
  private final int bits;
  private final boolean debug;
  private final long maxBsonObjectSize;

  $AutoValue_BuildInfo(
      String version,
      String gitVersion,
      String sysInfo,
      @Nullable String loaderFlags,
      @Nullable String compilerFlags,
      @Nullable String allocator,
      List<Integer> versionArray,
      @Nullable String javascriptEngine,
      int bits,
      boolean debug,
      long maxBsonObjectSize) {
    if (version == null) {
      throw new NullPointerException("Null version");
    }
    this.version = version;
    if (gitVersion == null) {
      throw new NullPointerException("Null gitVersion");
    }
    this.gitVersion = gitVersion;
    if (sysInfo == null) {
      throw new NullPointerException("Null sysInfo");
    }
    this.sysInfo = sysInfo;
    this.loaderFlags = loaderFlags;
    this.compilerFlags = compilerFlags;
    this.allocator = allocator;
    if (versionArray == null) {
      throw new NullPointerException("Null versionArray");
    }
    this.versionArray = versionArray;
    this.javascriptEngine = javascriptEngine;
    this.bits = bits;
    this.debug = debug;
    this.maxBsonObjectSize = maxBsonObjectSize;
  }

  @JsonProperty
  @Override
  public String version() {
    return version;
  }

  @JsonProperty
  @Override
  public String gitVersion() {
    return gitVersion;
  }

  @JsonProperty
  @Override
  public String sysInfo() {
    return sysInfo;
  }

  @JsonProperty
  @Nullable
  @Override
  public String loaderFlags() {
    return loaderFlags;
  }

  @JsonProperty
  @Nullable
  @Override
  public String compilerFlags() {
    return compilerFlags;
  }

  @JsonProperty
  @Nullable
  @Override
  public String allocator() {
    return allocator;
  }

  @JsonProperty
  @Override
  public List<Integer> versionArray() {
    return versionArray;
  }

  @JsonProperty
  @Nullable
  @Override
  public String javascriptEngine() {
    return javascriptEngine;
  }

  @JsonProperty
  @Override
  public int bits() {
    return bits;
  }

  @JsonProperty
  @Override
  public boolean debug() {
    return debug;
  }

  @JsonProperty
  @Override
  public long maxBsonObjectSize() {
    return maxBsonObjectSize;
  }

  @Override
  public String toString() {
    return "BuildInfo{"
        + "version=" + version + ", "
        + "gitVersion=" + gitVersion + ", "
        + "sysInfo=" + sysInfo + ", "
        + "loaderFlags=" + loaderFlags + ", "
        + "compilerFlags=" + compilerFlags + ", "
        + "allocator=" + allocator + ", "
        + "versionArray=" + versionArray + ", "
        + "javascriptEngine=" + javascriptEngine + ", "
        + "bits=" + bits + ", "
        + "debug=" + debug + ", "
        + "maxBsonObjectSize=" + maxBsonObjectSize
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BuildInfo) {
      BuildInfo that = (BuildInfo) o;
      return (this.version.equals(that.version()))
           && (this.gitVersion.equals(that.gitVersion()))
           && (this.sysInfo.equals(that.sysInfo()))
           && ((this.loaderFlags == null) ? (that.loaderFlags() == null) : this.loaderFlags.equals(that.loaderFlags()))
           && ((this.compilerFlags == null) ? (that.compilerFlags() == null) : this.compilerFlags.equals(that.compilerFlags()))
           && ((this.allocator == null) ? (that.allocator() == null) : this.allocator.equals(that.allocator()))
           && (this.versionArray.equals(that.versionArray()))
           && ((this.javascriptEngine == null) ? (that.javascriptEngine() == null) : this.javascriptEngine.equals(that.javascriptEngine()))
           && (this.bits == that.bits())
           && (this.debug == that.debug())
           && (this.maxBsonObjectSize == that.maxBsonObjectSize());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.version.hashCode();
    h *= 1000003;
    h ^= this.gitVersion.hashCode();
    h *= 1000003;
    h ^= this.sysInfo.hashCode();
    h *= 1000003;
    h ^= (loaderFlags == null) ? 0 : this.loaderFlags.hashCode();
    h *= 1000003;
    h ^= (compilerFlags == null) ? 0 : this.compilerFlags.hashCode();
    h *= 1000003;
    h ^= (allocator == null) ? 0 : this.allocator.hashCode();
    h *= 1000003;
    h ^= this.versionArray.hashCode();
    h *= 1000003;
    h ^= (javascriptEngine == null) ? 0 : this.javascriptEngine.hashCode();
    h *= 1000003;
    h ^= this.bits;
    h *= 1000003;
    h ^= this.debug ? 1231 : 1237;
    h *= 1000003;
    h ^= (this.maxBsonObjectSize >>> 32) ^ this.maxBsonObjectSize;
    return h;
  }

}
