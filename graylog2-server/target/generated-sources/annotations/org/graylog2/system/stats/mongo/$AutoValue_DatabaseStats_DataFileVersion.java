
package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_DatabaseStats_DataFileVersion extends DatabaseStats.DataFileVersion {

  private final int major;
  private final int minor;

  $AutoValue_DatabaseStats_DataFileVersion(
      int major,
      int minor) {
    this.major = major;
    this.minor = minor;
  }

  @JsonProperty
  @Override
  public int major() {
    return major;
  }

  @JsonProperty
  @Override
  public int minor() {
    return minor;
  }

  @Override
  public String toString() {
    return "DataFileVersion{"
        + "major=" + major + ", "
        + "minor=" + minor
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DatabaseStats.DataFileVersion) {
      DatabaseStats.DataFileVersion that = (DatabaseStats.DataFileVersion) o;
      return (this.major == that.major())
           && (this.minor == that.minor());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.major;
    h *= 1000003;
    h ^= this.minor;
    return h;
  }

}
