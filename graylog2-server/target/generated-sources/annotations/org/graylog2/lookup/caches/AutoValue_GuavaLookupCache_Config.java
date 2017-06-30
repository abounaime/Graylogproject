package org.graylog2.lookup.caches;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.validation.constraints.Min;

final class AutoValue_GuavaLookupCache_Config extends $AutoValue_GuavaLookupCache_Config {
  AutoValue_GuavaLookupCache_Config(String type, int maxSize, long expireAfterAccess,
      TimeUnit expireAfterAccessUnit, long expireAfterWrite, TimeUnit expireAfterWriteUnit,
      long refreshAfterWrite, TimeUnit refreshAfterWriteUnit) {
    super(type, maxSize, expireAfterAccess, expireAfterAccessUnit, expireAfterWrite, expireAfterWriteUnit, refreshAfterWrite, refreshAfterWriteUnit);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  @Min(0)
  public final int getMaxSize() {
    return maxSize();
  }

  @JsonIgnore
  @Min(0)
  public final long getExpireAfterAccess() {
    return expireAfterAccess();
  }

  @JsonIgnore
  @Nullable
  public final TimeUnit getExpireAfterAccessUnit() {
    return expireAfterAccessUnit();
  }

  @JsonIgnore
  @Min(0)
  public final long getExpireAfterWrite() {
    return expireAfterWrite();
  }

  @JsonIgnore
  @Nullable
  public final TimeUnit getExpireAfterWriteUnit() {
    return expireAfterWriteUnit();
  }

  @JsonIgnore
  @Min(0)
  public final long getRefreshAfterWrite() {
    return refreshAfterWrite();
  }

  @JsonIgnore
  @Nullable
  public final TimeUnit getRefreshAfterWriteUnit() {
    return refreshAfterWriteUnit();
  }
}
