
package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_HostInfo extends HostInfo {

  private final HostInfo.System system;
  private final HostInfo.Os os;
  private final HostInfo.Extra extra;

  $AutoValue_HostInfo(
      HostInfo.System system,
      HostInfo.Os os,
      HostInfo.Extra extra) {
    if (system == null) {
      throw new NullPointerException("Null system");
    }
    this.system = system;
    if (os == null) {
      throw new NullPointerException("Null os");
    }
    this.os = os;
    if (extra == null) {
      throw new NullPointerException("Null extra");
    }
    this.extra = extra;
  }

  @JsonProperty
  @Override
  public HostInfo.System system() {
    return system;
  }

  @JsonProperty
  @Override
  public HostInfo.Os os() {
    return os;
  }

  @JsonProperty
  @Override
  public HostInfo.Extra extra() {
    return extra;
  }

  @Override
  public String toString() {
    return "HostInfo{"
        + "system=" + system + ", "
        + "os=" + os + ", "
        + "extra=" + extra
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HostInfo) {
      HostInfo that = (HostInfo) o;
      return (this.system.equals(that.system()))
           && (this.os.equals(that.os()))
           && (this.extra.equals(that.extra()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.system.hashCode();
    h *= 1000003;
    h ^= this.os.hashCode();
    h *= 1000003;
    h ^= this.extra.hashCode();
    return h;
  }

}
