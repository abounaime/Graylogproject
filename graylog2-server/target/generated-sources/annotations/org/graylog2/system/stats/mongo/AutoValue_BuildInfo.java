package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

final class AutoValue_BuildInfo extends $AutoValue_BuildInfo {
  AutoValue_BuildInfo(String version, String gitVersion, String sysInfo, String loaderFlags,
      String compilerFlags, String allocator, List<Integer> versionArray, String javascriptEngine,
      int bits, boolean debug, long maxBsonObjectSize) {
    super(version, gitVersion, sysInfo, loaderFlags, compilerFlags, allocator, versionArray, javascriptEngine, bits, debug, maxBsonObjectSize);
  }

  @JsonIgnore
  public final String getVersion() {
    return version();
  }

  @JsonIgnore
  public final String getGitVersion() {
    return gitVersion();
  }

  @JsonIgnore
  public final String getSysInfo() {
    return sysInfo();
  }

  @JsonIgnore
  @Nullable
  public final String getLoaderFlags() {
    return loaderFlags();
  }

  @JsonIgnore
  @Nullable
  public final String getCompilerFlags() {
    return compilerFlags();
  }

  @JsonIgnore
  @Nullable
  public final String getAllocator() {
    return allocator();
  }

  @JsonIgnore
  public final List<Integer> getVersionArray() {
    return versionArray();
  }

  @JsonIgnore
  @Nullable
  public final String getJavascriptEngine() {
    return javascriptEngine();
  }

  @JsonIgnore
  public final int getBits() {
    return bits();
  }

  @JsonIgnore
  public final boolean isDebug() {
    return debug();
  }

  @JsonIgnore
  public final long getMaxBsonObjectSize() {
    return maxBsonObjectSize();
  }
}
