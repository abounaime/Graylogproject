
package org.graylog2.grok;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.mongojack.Id;
import org.mongojack.ObjectId;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_GrokPattern extends GrokPattern {

  private final String id;
  private final String name;
  private final String pattern;
  private final String contentPack;

  $AutoValue_GrokPattern(
      @Nullable String id,
      String name,
      String pattern,
      @Nullable String contentPack) {
    this.id = id;
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (pattern == null) {
      throw new NullPointerException("Null pattern");
    }
    this.pattern = pattern;
    this.contentPack = contentPack;
  }

  @JsonProperty(value = "id")
  @Nullable
  @Id
  @ObjectId
  @Override
  public String id() {
    return id;
  }

  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  @JsonProperty
  @Override
  public String pattern() {
    return pattern;
  }

  @JsonProperty
  @Nullable
  @Override
  public String contentPack() {
    return contentPack;
  }

  @Override
  public String toString() {
    return "GrokPattern{"
        + "id=" + id + ", "
        + "name=" + name + ", "
        + "pattern=" + pattern + ", "
        + "contentPack=" + contentPack
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GrokPattern) {
      GrokPattern that = (GrokPattern) o;
      return ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && (this.name.equals(that.name()))
           && (this.pattern.equals(that.pattern()))
           && ((this.contentPack == null) ? (that.contentPack() == null) : this.contentPack.equals(that.contentPack()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (id == null) ? 0 : this.id.hashCode();
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.pattern.hashCode();
    h *= 1000003;
    h ^= (contentPack == null) ? 0 : this.contentPack.hashCode();
    return h;
  }

  @Override
  public GrokPattern.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends GrokPattern.Builder {
    private String id;
    private String name;
    private String pattern;
    private String contentPack;
    Builder() {
    }
    private Builder(GrokPattern source) {
      this.id = source.id();
      this.name = source.name();
      this.pattern = source.pattern();
      this.contentPack = source.contentPack();
    }
    @Override
    public GrokPattern.Builder id(@Nullable String id) {
      this.id = id;
      return this;
    }
    @Override
    public GrokPattern.Builder name(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public GrokPattern.Builder pattern(String pattern) {
      if (pattern == null) {
        throw new NullPointerException("Null pattern");
      }
      this.pattern = pattern;
      return this;
    }
    @Override
    public GrokPattern.Builder contentPack(@Nullable String contentPack) {
      this.contentPack = contentPack;
      return this;
    }
    @Override
    public GrokPattern build() {
      String missing = "";
      if (this.name == null) {
        missing += " name";
      }
      if (this.pattern == null) {
        missing += " pattern";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_GrokPattern(
          this.id,
          this.name,
          this.pattern,
          this.contentPack);
    }
  }

}
