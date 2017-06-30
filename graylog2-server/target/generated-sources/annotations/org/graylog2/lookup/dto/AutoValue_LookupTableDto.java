package org.graylog2.lookup.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;
import org.mongojack.Id;
import org.mongojack.ObjectId;

final class AutoValue_LookupTableDto extends $AutoValue_LookupTableDto {
  AutoValue_LookupTableDto(String id, String title, String description, String name, String cacheId,
      String dataAdapterId) {
    super(id, title, description, name, cacheId, dataAdapterId);
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
  @ObjectId
  public final String getCacheId() {
    return cacheId();
  }

  @JsonIgnore
  @ObjectId
  public final String getDataAdapterId() {
    return dataAdapterId();
  }
}
