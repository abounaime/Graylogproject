package org.graylog2.rest.models.system.plugins.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

final class AutoValue_PluginList extends $AutoValue_PluginList {
  AutoValue_PluginList(List<PluginMetaDataValue> plugins, int total) {
    super(plugins, total);
  }

  @JsonIgnore
  public final List<PluginMetaDataValue> getPlugins() {
    return plugins();
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }
}
