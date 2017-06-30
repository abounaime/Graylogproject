package org.graylog2.rest.models.system.config;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Set;

final class AutoValue_ClusterConfigList extends $AutoValue_ClusterConfigList {
  AutoValue_ClusterConfigList(int total, Set<String> classes) {
    super(total, classes);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final Set<String> getClasses() {
    return classes();
  }
}
