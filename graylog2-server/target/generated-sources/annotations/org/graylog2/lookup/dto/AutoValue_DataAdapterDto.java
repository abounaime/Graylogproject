package org.graylog2.lookup.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;
import org.graylog2.plugin.lookup.LookupDataAdapterConfiguration;
import org.mongojack.Id;
import org.mongojack.ObjectId;

final class AutoValue_DataAdapterDto extends $AutoValue_DataAdapterDto {
  AutoValue_DataAdapterDto(String id, String title, String description, String name,
      LookupDataAdapterConfiguration config) {
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
  public final LookupDataAdapterConfiguration getConfig() {
    return config();
  }
}
