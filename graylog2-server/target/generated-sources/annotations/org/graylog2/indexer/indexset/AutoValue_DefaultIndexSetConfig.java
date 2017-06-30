
package org.graylog2.indexer.indexset;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_DefaultIndexSetConfig extends DefaultIndexSetConfig {

  private final String defaultIndexSetId;

  AutoValue_DefaultIndexSetConfig(
      String defaultIndexSetId) {
    if (defaultIndexSetId == null) {
      throw new NullPointerException("Null defaultIndexSetId");
    }
    this.defaultIndexSetId = defaultIndexSetId;
  }

  @JsonProperty(value = "default_index_set_id")
  @Override
  public String defaultIndexSetId() {
    return defaultIndexSetId;
  }

  @Override
  public String toString() {
    return "DefaultIndexSetConfig{"
        + "defaultIndexSetId=" + defaultIndexSetId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DefaultIndexSetConfig) {
      DefaultIndexSetConfig that = (DefaultIndexSetConfig) o;
      return (this.defaultIndexSetId.equals(that.defaultIndexSetId()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.defaultIndexSetId.hashCode();
    return h;
  }

}
