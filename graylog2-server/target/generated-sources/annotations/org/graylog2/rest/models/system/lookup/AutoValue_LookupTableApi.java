package org.graylog2.rest.models.system.lookup;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_LookupTableApi extends $AutoValue_LookupTableApi {
  AutoValue_LookupTableApi(String id, String title, String description, String name, String cacheId,
      String dataAdapterId) {
    super(id, title, description, name, cacheId, dataAdapterId);
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
  public final String getCacheId() {
    return cacheId();
  }

  @JsonIgnore
  public final String getDataAdapterId() {
    return dataAdapterId();
  }
}
