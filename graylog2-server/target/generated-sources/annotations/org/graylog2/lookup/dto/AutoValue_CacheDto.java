package org.graylog2.lookup.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;
import org.graylog2.plugin.lookup.LookupCacheConfiguration;
import org.mongojack.Id;
import org.mongojack.ObjectId;

final class AutoValue_CacheDto extends $AutoValue_CacheDto {
  AutoValue_CacheDto(String id, String title, String description, String name,
      LookupCacheConfiguration config) {
    super(id, title, description, name, config);
  }

  @JsonIgnore
  @Id
  @ObjectId
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
