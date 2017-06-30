package org.graylog2.lookup;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;
import org.graylog2.plugin.lookup.LookupCache;
import org.graylog2.plugin.lookup.LookupDataAdapter;

final class AutoValue_LookupTable extends $AutoValue_LookupTable {
  AutoValue_LookupTable(String id, String title, String description, String name, LookupCache cache,
      LookupDataAdapter dataAdapter) {
    super(id, title, description, name, cache, dataAdapter);
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
  public final LookupCache getCache() {
    return cache();
  }

  @JsonIgnore
  public final LookupDataAdapter getDataAdapter() {
    return dataAdapter();
  }
}
