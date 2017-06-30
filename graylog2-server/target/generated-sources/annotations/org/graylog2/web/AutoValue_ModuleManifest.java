package org.graylog2.web;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_ModuleManifest extends $AutoValue_ModuleManifest {
  AutoValue_ModuleManifest(ModuleFiles files) {
    super(files);
  }

  @JsonIgnore
  public final ModuleFiles getFiles() {
    return files();
  }
}
