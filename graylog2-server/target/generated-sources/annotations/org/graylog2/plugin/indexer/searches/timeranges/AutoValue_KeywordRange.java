
package org.graylog2.plugin.indexer.searches.timeranges;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_KeywordRange extends KeywordRange {

  private final String type;
  private final String keyword;

  private AutoValue_KeywordRange(
      String type,
      String keyword) {
    this.type = type;
    this.keyword = keyword;
  }

  @JsonProperty
  @Override
  public String type() {
    return type;
  }

  @JsonProperty
  @Override
  public String keyword() {
    return keyword;
  }

  @Override
  public String toString() {
    return "KeywordRange{"
        + "type=" + type + ", "
        + "keyword=" + keyword
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof KeywordRange) {
      KeywordRange that = (KeywordRange) o;
      return (this.type.equals(that.type()))
           && (this.keyword.equals(that.keyword()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.keyword.hashCode();
    return h;
  }

  static final class Builder extends KeywordRange.Builder {
    private String type;
    private String keyword;
    Builder() {
    }
    @Override
    public KeywordRange.Builder type(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public KeywordRange.Builder keyword(String keyword) {
      if (keyword == null) {
        throw new NullPointerException("Null keyword");
      }
      this.keyword = keyword;
      return this;
    }
    @Override
    String keyword() {
      if (keyword == null) {
        throw new IllegalStateException("Property \"keyword\" has not been set");
      }
      return keyword;
    }
    @Override
    KeywordRange autoBuild() {
      String missing = "";
      if (this.type == null) {
        missing += " type";
      }
      if (this.keyword == null) {
        missing += " keyword";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_KeywordRange(
          this.type,
          this.keyword);
    }
  }

}
