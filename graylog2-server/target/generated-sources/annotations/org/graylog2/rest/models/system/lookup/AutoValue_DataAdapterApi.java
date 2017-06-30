package org.graylog2.rest.models.system.lookup;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import org.graylog2.plugin.lookup.LookupDataAdapterConfiguration;
import org.hibernate.validator.constraints.NotEmpty;

final class AutoValue_DataAdapterApi extends $AutoValue_DataAdapterApi {
  AutoValue_DataAdapterApi(String id, String title, String description, String name,
      LookupDataAdapterConfiguration config) {
    super(id, title, description, name, config);
  }

  @JsonIgnore
  @Nullable
  public final String getId() {
    return id();
  }

  @JsonIgnore
  @NotEmpty
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  public final String getDescription() {
    return description();
  }

  @JsonIgnore
  @NotEmpty
  public final String getName() {
    return name();
  }

  @JsonIgnore
  @NotNull
  public final LookupDataAdapterConfiguration getConfig() {
    return config();
  }
}
