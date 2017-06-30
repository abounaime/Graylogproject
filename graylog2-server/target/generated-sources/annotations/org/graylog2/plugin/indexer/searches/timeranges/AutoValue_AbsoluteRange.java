
package org.graylog2.plugin.indexer.searches.timeranges;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AbsoluteRange extends AbsoluteRange {

  private final String type;
  private final DateTime from;
  private final DateTime to;

  private AutoValue_AbsoluteRange(
      String type,
      DateTime from,
      DateTime to) {
    this.type = type;
    this.from = from;
    this.to = to;
  }

  @JsonProperty
  @Override
  public String type() {
    return type;
  }

  @JsonProperty
  @Override
  public DateTime from() {
    return from;
  }

  @JsonProperty
  @Override
  public DateTime to() {
    return to;
  }

  @Override
  public String toString() {
    return "AbsoluteRange{"
        + "type=" + type + ", "
        + "from=" + from + ", "
        + "to=" + to
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AbsoluteRange) {
      AbsoluteRange that = (AbsoluteRange) o;
      return (this.type.equals(that.type()))
           && (this.from.equals(that.from()))
           && (this.to.equals(that.to()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.from.hashCode();
    h *= 1000003;
    h ^= this.to.hashCode();
    return h;
  }

  static final class Builder extends AbsoluteRange.Builder {
    private String type;
    private DateTime from;
    private DateTime to;
    Builder() {
    }
    @Override
    public AbsoluteRange.Builder type(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public AbsoluteRange.Builder from(DateTime from) {
      if (from == null) {
        throw new NullPointerException("Null from");
      }
      this.from = from;
      return this;
    }
    @Override
    public AbsoluteRange.Builder to(DateTime to) {
      if (to == null) {
        throw new NullPointerException("Null to");
      }
      this.to = to;
      return this;
    }
    @Override
    public AbsoluteRange build() {
      String missing = "";
      if (this.type == null) {
        missing += " type";
      }
      if (this.from == null) {
        missing += " from";
      }
      if (this.to == null) {
        missing += " to";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_AbsoluteRange(
          this.type,
          this.from,
          this.to);
    }
  }

}
