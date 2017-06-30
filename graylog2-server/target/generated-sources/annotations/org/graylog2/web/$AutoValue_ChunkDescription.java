
package org.graylog2.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ChunkDescription extends ChunkDescription {

  private final long size;
  private final String entry;
  private final List<String> css;

  $AutoValue_ChunkDescription(
      long size,
      String entry,
      List<String> css) {
    this.size = size;
    if (entry == null) {
      throw new NullPointerException("Null entry");
    }
    this.entry = entry;
    if (css == null) {
      throw new NullPointerException("Null css");
    }
    this.css = css;
  }

  @JsonProperty(value = "size")
  @Override
  public long size() {
    return size;
  }

  @JsonProperty(value = "entry")
  @Override
  public String entry() {
    return entry;
  }

  @JsonProperty(value = "css")
  @Override
  public List<String> css() {
    return css;
  }

  @Override
  public String toString() {
    return "ChunkDescription{"
        + "size=" + size + ", "
        + "entry=" + entry + ", "
        + "css=" + css
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ChunkDescription) {
      ChunkDescription that = (ChunkDescription) o;
      return (this.size == that.size())
           && (this.entry.equals(that.entry()))
           && (this.css.equals(that.css()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.size >>> 32) ^ this.size;
    h *= 1000003;
    h ^= this.entry.hashCode();
    h *= 1000003;
    h ^= this.css.hashCode();
    return h;
  }

}
