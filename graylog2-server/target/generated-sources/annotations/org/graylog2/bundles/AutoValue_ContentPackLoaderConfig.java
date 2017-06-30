package org.graylog2.bundles;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;
import java.util.Set;

final class AutoValue_ContentPackLoaderConfig extends $AutoValue_ContentPackLoaderConfig {
  AutoValue_ContentPackLoaderConfig(Set<String> loadedContentPacks, Set<String> appliedContentPacks,
      Map<String, String> checksums) {
    super(loadedContentPacks, appliedContentPacks, checksums);
  }

  @JsonIgnore
  public final Set<String> getLoadedContentPacks() {
    return loadedContentPacks();
  }

  @JsonIgnore
  public final Set<String> getAppliedContentPacks() {
    return appliedContentPacks();
  }

  @JsonIgnore
  public final Map<String, String> getChecksums() {
    return checksums();
  }
}
