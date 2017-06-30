
package org.graylog2.bundles;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ContentPackLoaderConfig extends ContentPackLoaderConfig {

  private final Set<String> loadedContentPacks;
  private final Set<String> appliedContentPacks;
  private final Map<String, String> checksums;

  $AutoValue_ContentPackLoaderConfig(
      Set<String> loadedContentPacks,
      Set<String> appliedContentPacks,
      Map<String, String> checksums) {
    if (loadedContentPacks == null) {
      throw new NullPointerException("Null loadedContentPacks");
    }
    this.loadedContentPacks = loadedContentPacks;
    if (appliedContentPacks == null) {
      throw new NullPointerException("Null appliedContentPacks");
    }
    this.appliedContentPacks = appliedContentPacks;
    if (checksums == null) {
      throw new NullPointerException("Null checksums");
    }
    this.checksums = checksums;
  }

  @JsonProperty(value = "loaded_content_packs")
  @Override
  public Set<String> loadedContentPacks() {
    return loadedContentPacks;
  }

  @JsonProperty(value = "applied_content_packs")
  @Override
  public Set<String> appliedContentPacks() {
    return appliedContentPacks;
  }

  @JsonProperty(value = "checksums")
  @Override
  public Map<String, String> checksums() {
    return checksums;
  }

  @Override
  public String toString() {
    return "ContentPackLoaderConfig{"
        + "loadedContentPacks=" + loadedContentPacks + ", "
        + "appliedContentPacks=" + appliedContentPacks + ", "
        + "checksums=" + checksums
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ContentPackLoaderConfig) {
      ContentPackLoaderConfig that = (ContentPackLoaderConfig) o;
      return (this.loadedContentPacks.equals(that.loadedContentPacks()))
           && (this.appliedContentPacks.equals(that.appliedContentPacks()))
           && (this.checksums.equals(that.checksums()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.loadedContentPacks.hashCode();
    h *= 1000003;
    h ^= this.appliedContentPacks.hashCode();
    h *= 1000003;
    h ^= this.checksums.hashCode();
    return h;
  }

}
