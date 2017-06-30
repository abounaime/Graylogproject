package org.graylog2.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;

final class AutoValue_ChunkDescription extends $AutoValue_ChunkDescription {
  AutoValue_ChunkDescription(long size, String entry, List<String> css) {
    super(size, entry, css);
  }

  @JsonIgnore
  public final long getSize() {
    return size();
  }

  @JsonIgnore
  public final String getEntry() {
    return entry();
  }

  @JsonIgnore
  public final List<String> getCss() {
    return css();
  }
}
