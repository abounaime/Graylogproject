
package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_HostInfo_Os extends HostInfo.Os {

  private final String type;
  private final String name;
  private final String version;

  $AutoValue_HostInfo_Os(
      String type,
      String name,
      String version) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (version == null) {
      throw new NullPointerException("Null version");
    }
    this.version = version;
  }

  @JsonProperty
  @Override
  public String type() {
    return type;
  }

  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  @JsonProperty
  @Override
  public String version() {
    return version;
  }

  @Override
  public String toString() {
    return "Os{"
        + "type=" + type + ", "
        + "name=" + name + ", "
        + "version=" + version
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HostInfo.Os) {
      HostInfo.Os that = (HostInfo.Os) o;
      return (this.type.equals(that.type()))
           && (this.name.equals(that.name()))
           && (this.version.equals(that.version()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.version.hashCode();
    return h;
  }

}
