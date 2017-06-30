
package org.graylog2.rest.models.system.plugins.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_PluginList extends PluginList {

  private final List<PluginMetaDataValue> plugins;
  private final int total;

  $AutoValue_PluginList(
      List<PluginMetaDataValue> plugins,
      int total) {
    if (plugins == null) {
      throw new NullPointerException("Null plugins");
    }
    this.plugins = plugins;
    this.total = total;
  }

  @JsonProperty
  @Override
  public List<PluginMetaDataValue> plugins() {
    return plugins;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @Override
  public String toString() {
    return "PluginList{"
        + "plugins=" + plugins + ", "
        + "total=" + total
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PluginList) {
      PluginList that = (PluginList) o;
      return (this.plugins.equals(that.plugins()))
           && (this.total == that.total());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.plugins.hashCode();
    h *= 1000003;
    h ^= this.total;
    return h;
  }

}
