package org.graylog2.rest.models.system.lookup;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;
import org.graylog2.plugin.lookup.LookupCacheConfiguration;

final class AutoValue_CacheApi extends $AutoValue_CacheApi {
  AutoValue_CacheApi(String id, String title, String description, String name,
      LookupCacheConfiguration config) {
    super(id, title, description, name, config);
  }

  @JsonIgnore
  @Nullable
  public final String getId() {
    return id();
  }

  @JsonIgnore
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  public final String getDescription() {
    return description();
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final LookupCacheConfiguration getConfig() {
    return config();
  }
}
