
package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ServerStatus_Connections extends ServerStatus.Connections {

  private final int current;
  private final int available;
  private final Long totalCreated;

  $AutoValue_ServerStatus_Connections(
      int current,
      int available,
      @Nullable Long totalCreated) {
    this.current = current;
    this.available = available;
    this.totalCreated = totalCreated;
  }

  @JsonProperty
  @Override
  public int current() {
    return current;
  }

  @JsonProperty
  @Override
  public int available() {
    return available;
  }

  @JsonProperty
  @Nullable
  @Override
  public Long totalCreated() {
    return totalCreated;
  }

  @Override
  public String toString() {
    return "Connections{"
        + "current=" + current + ", "
        + "available=" + available + ", "
        + "totalCreated=" + totalCreated
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ServerStatus.Connections) {
      ServerStatus.Connections that = (ServerStatus.Connections) o;
      return (this.current == that.current())
           && (this.available == that.available())
           && ((this.totalCreated == null) ? (that.totalCreated() == null) : this.totalCreated.equals(that.totalCreated()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.current;
    h *= 1000003;
    h ^= this.available;
    h *= 1000003;
    h ^= (totalCreated == null) ? 0 : this.totalCreated.hashCode();
    return h;
  }

}
