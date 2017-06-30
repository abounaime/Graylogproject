package org.graylog2.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;
import java.util.Map;

final class AutoValue_ModuleFiles extends $AutoValue_ModuleFiles {
  AutoValue_ModuleFiles(Map<String, ChunkDescription> chunks, List<String> jsFiles,
      List<String> cssFiles) {
    super(chunks, jsFiles, cssFiles);
  }

  @JsonIgnore
  public final Map<String, ChunkDescription> getChunks() {
    return chunks();
  }

  @JsonIgnore
  public final List<String> getJsFiles() {
    return jsFiles();
  }

  @JsonIgnore
  public final List<String> getCssFiles() {
    return cssFiles();
  }
}
