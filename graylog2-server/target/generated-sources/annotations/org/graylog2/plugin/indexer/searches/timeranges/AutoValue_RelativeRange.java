
package org.graylog2.plugin.indexer.searches.timeranges;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_RelativeRange extends RelativeRange {

  private final String type;
  private final int range;

  private AutoValue_RelativeRange(
      String type,
      int range) {
    this.type = type;
    this.range = range;
  }

  @JsonProperty
  @Override
  public String type() {
    return type;
  }

  @JsonProperty
  @Override
  public int range() {
    return range;
  }

  @Override
  public String toString() {
    return "RelativeRange{"
        + "type=" + type + ", "
        + "range=" + range
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RelativeRange) {
      RelativeRange that = (RelativeRange) o;
      return (this.type.equals(that.type()))
           && (this.range == that.range());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.range;
    return h;
  }

  static final class Builder extends RelativeRange.Builder {
    private String type;
    private Integer range;
    Builder() {
    }
    @Override
    public RelativeRange.Builder type(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public RelativeRange.Builder range(int range) {
      this.range = range;
      return this;
    }
    @Override
    public RelativeRange build() {
      String missing = "";
      if (this.type == null) {
        missing += " type";
      }
      if (this.range == null) {
        missing += " range";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_RelativeRange(
          this.type,
          this.range);
    }
  }

}
