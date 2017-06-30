
package org.graylog2.lookup.caches;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.validation.constraints.Min;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_GuavaLookupCache_Config extends GuavaLookupCache.Config {

  private final String type;
  private final int maxSize;
  private final long expireAfterAccess;
  private final TimeUnit expireAfterAccessUnit;
  private final long expireAfterWrite;
  private final TimeUnit expireAfterWriteUnit;
  private final long refreshAfterWrite;
  private final TimeUnit refreshAfterWriteUnit;

  $AutoValue_GuavaLookupCache_Config(
      String type,
      int maxSize,
      long expireAfterAccess,
      @Nullable TimeUnit expireAfterAccessUnit,
      long expireAfterWrite,
      @Nullable TimeUnit expireAfterWriteUnit,
      long refreshAfterWrite,
      @Nullable TimeUnit refreshAfterWriteUnit) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.maxSize = maxSize;
    this.expireAfterAccess = expireAfterAccess;
    this.expireAfterAccessUnit = expireAfterAccessUnit;
    this.expireAfterWrite = expireAfterWrite;
    this.expireAfterWriteUnit = expireAfterWriteUnit;
    this.refreshAfterWrite = refreshAfterWrite;
    this.refreshAfterWriteUnit = refreshAfterWriteUnit;
  }

  @JsonProperty(value = "type")
  @Override
  public String type() {
    return type;
  }

  @Min(value = 0L)
  @JsonProperty(value = "max_size")
  @Override
  public int maxSize() {
    return maxSize;
  }

  @Min(value = 0L)
  @JsonProperty(value = "expire_after_access")
  @Override
  public long expireAfterAccess() {
    return expireAfterAccess;
  }

  @Nullable
  @JsonProperty(value = "expire_after_access_unit")
  @Override
  public TimeUnit expireAfterAccessUnit() {
    return expireAfterAccessUnit;
  }

  @Min(value = 0L)
  @JsonProperty(value = "expire_after_write")
  @Override
  public long expireAfterWrite() {
    return expireAfterWrite;
  }

  @Nullable
  @JsonProperty(value = "expire_after_write_unit")
  @Override
  public TimeUnit expireAfterWriteUnit() {
    return expireAfterWriteUnit;
  }

  @Min(value = 0L)
  @JsonProperty(value = "refresh_after_write")
  @Override
  public long refreshAfterWrite() {
    return refreshAfterWrite;
  }

  @Nullable
  @JsonProperty(value = "refresh_after_write_unit")
  @Override
  public TimeUnit refreshAfterWriteUnit() {
    return refreshAfterWriteUnit;
  }

  @Override
  public String toString() {
    return "Config{"
        + "type=" + type + ", "
        + "maxSize=" + maxSize + ", "
        + "expireAfterAccess=" + expireAfterAccess + ", "
        + "expireAfterAccessUnit=" + expireAfterAccessUnit + ", "
        + "expireAfterWrite=" + expireAfterWrite + ", "
        + "expireAfterWriteUnit=" + expireAfterWriteUnit + ", "
        + "refreshAfterWrite=" + refreshAfterWrite + ", "
        + "refreshAfterWriteUnit=" + refreshAfterWriteUnit
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GuavaLookupCache.Config) {
      GuavaLookupCache.Config that = (GuavaLookupCache.Config) o;
      return (this.type.equals(that.type()))
           && (this.maxSize == that.maxSize())
           && (this.expireAfterAccess == that.expireAfterAccess())
           && ((this.expireAfterAccessUnit == null) ? (that.expireAfterAccessUnit() == null) : this.expireAfterAccessUnit.equals(that.expireAfterAccessUnit()))
           && (this.expireAfterWrite == that.expireAfterWrite())
           && ((this.expireAfterWriteUnit == null) ? (that.expireAfterWriteUnit() == null) : this.expireAfterWriteUnit.equals(that.expireAfterWriteUnit()))
           && (this.refreshAfterWrite == that.refreshAfterWrite())
           && ((this.refreshAfterWriteUnit == null) ? (that.refreshAfterWriteUnit() == null) : this.refreshAfterWriteUnit.equals(that.refreshAfterWriteUnit()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.maxSize;
    h *= 1000003;
    h ^= (this.expireAfterAccess >>> 32) ^ this.expireAfterAccess;
    h *= 1000003;
    h ^= (expireAfterAccessUnit == null) ? 0 : this.expireAfterAccessUnit.hashCode();
    h *= 1000003;
    h ^= (this.expireAfterWrite >>> 32) ^ this.expireAfterWrite;
    h *= 1000003;
    h ^= (expireAfterWriteUnit == null) ? 0 : this.expireAfterWriteUnit.hashCode();
    h *= 1000003;
    h ^= (this.refreshAfterWrite >>> 32) ^ this.refreshAfterWrite;
    h *= 1000003;
    h ^= (refreshAfterWriteUnit == null) ? 0 : this.refreshAfterWriteUnit.hashCode();
    return h;
  }

  static final class Builder extends GuavaLookupCache.Config.Builder {
    private String type;
    private Integer maxSize;
    private Long expireAfterAccess;
    private TimeUnit expireAfterAccessUnit;
    private Long expireAfterWrite;
    private TimeUnit expireAfterWriteUnit;
    private Long refreshAfterWrite;
    private TimeUnit refreshAfterWriteUnit;
    Builder() {
    }
    @Override
    public GuavaLookupCache.Config.Builder type(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public GuavaLookupCache.Config.Builder maxSize(int maxSize) {
      this.maxSize = maxSize;
      return this;
    }
    @Override
    public GuavaLookupCache.Config.Builder expireAfterAccess(long expireAfterAccess) {
      this.expireAfterAccess = expireAfterAccess;
      return this;
    }
    @Override
    public GuavaLookupCache.Config.Builder expireAfterAccessUnit(@Nullable TimeUnit expireAfterAccessUnit) {
      this.expireAfterAccessUnit = expireAfterAccessUnit;
      return this;
    }
    @Override
    public GuavaLookupCache.Config.Builder expireAfterWrite(long expireAfterWrite) {
      this.expireAfterWrite = expireAfterWrite;
      return this;
    }
    @Override
    public GuavaLookupCache.Config.Builder expireAfterWriteUnit(@Nullable TimeUnit expireAfterWriteUnit) {
      this.expireAfterWriteUnit = expireAfterWriteUnit;
      return this;
    }
    @Override
    public GuavaLookupCache.Config.Builder refreshAfterWrite(long refreshAfterWrite) {
      this.refreshAfterWrite = refreshAfterWrite;
      return this;
    }
    @Override
    public GuavaLookupCache.Config.Builder refreshAfterWriteUnit(@Nullable TimeUnit refreshAfterWriteUnit) {
      this.refreshAfterWriteUnit = refreshAfterWriteUnit;
      return this;
    }
    @Override
    public GuavaLookupCache.Config build() {
      String missing = "";
      if (this.type == null) {
        missing += " type";
      }
      if (this.maxSize == null) {
        missing += " maxSize";
      }
      if (this.expireAfterAccess == null) {
        missing += " expireAfterAccess";
      }
      if (this.expireAfterWrite == null) {
        missing += " expireAfterWrite";
      }
      if (this.refreshAfterWrite == null) {
        missing += " refreshAfterWrite";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_GuavaLookupCache_Config(
          this.type,
          this.maxSize,
          this.expireAfterAccess,
          this.expireAfterAccessUnit,
          this.expireAfterWrite,
          this.expireAfterWriteUnit,
          this.refreshAfterWrite,
          this.refreshAfterWriteUnit);
    }
  }

}
