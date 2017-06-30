
package org.graylog2.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ModuleManifest extends ModuleManifest {

  private final ModuleFiles files;

  $AutoValue_ModuleManifest(
      ModuleFiles files) {
    if (files == null) {
      throw new NullPointerException("Null files");
    }
    this.files = files;
  }

  @JsonProperty(value = "files")
  @Override
  public ModuleFiles files() {
    return files;
  }

  @Override
  public String toString() {
    return "ModuleManifest{"
        + "files=" + files
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ModuleManifest) {
      ModuleManifest that = (ModuleManifest) o;
      return (this.files.equals(that.files()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.files.hashCode();
    return h;
  }

}
