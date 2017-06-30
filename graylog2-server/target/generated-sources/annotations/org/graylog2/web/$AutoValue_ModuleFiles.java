
package org.graylog2.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ModuleFiles extends ModuleFiles {

  private final Map<String, ChunkDescription> chunks;
  private final List<String> jsFiles;
  private final List<String> cssFiles;

  $AutoValue_ModuleFiles(
      Map<String, ChunkDescription> chunks,
      List<String> jsFiles,
      List<String> cssFiles) {
    if (chunks == null) {
      throw new NullPointerException("Null chunks");
    }
    this.chunks = chunks;
    if (jsFiles == null) {
      throw new NullPointerException("Null jsFiles");
    }
    this.jsFiles = jsFiles;
    if (cssFiles == null) {
      throw new NullPointerException("Null cssFiles");
    }
    this.cssFiles = cssFiles;
  }

  @JsonProperty(value = "chunks")
  @Override
  public Map<String, ChunkDescription> chunks() {
    return chunks;
  }

  @JsonProperty(value = "js")
  @Override
  public List<String> jsFiles() {
    return jsFiles;
  }

  @JsonProperty(value = "css")
  @Override
  public List<String> cssFiles() {
    return cssFiles;
  }

  @Override
  public String toString() {
    return "ModuleFiles{"
        + "chunks=" + chunks + ", "
        + "jsFiles=" + jsFiles + ", "
        + "cssFiles=" + cssFiles
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ModuleFiles) {
      ModuleFiles that = (ModuleFiles) o;
      return (this.chunks.equals(that.chunks()))
           && (this.jsFiles.equals(that.jsFiles()))
           && (this.cssFiles.equals(that.cssFiles()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.chunks.hashCode();
    h *= 1000003;
    h ^= this.jsFiles.hashCode();
    h *= 1000003;
    h ^= this.cssFiles.hashCode();
    return h;
  }

}
