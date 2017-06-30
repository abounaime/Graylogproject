
package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_DatabaseStats_ExtentFreeList extends DatabaseStats.ExtentFreeList {

  private final int num;
  private final int totalSize;

  $AutoValue_DatabaseStats_ExtentFreeList(
      int num,
      int totalSize) {
    this.num = num;
    this.totalSize = totalSize;
  }

  @JsonProperty
  @Override
  public int num() {
    return num;
  }

  @JsonProperty
  @Override
  public int totalSize() {
    return totalSize;
  }

  @Override
  public String toString() {
    return "ExtentFreeList{"
        + "num=" + num + ", "
        + "totalSize=" + totalSize
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DatabaseStats.ExtentFreeList) {
      DatabaseStats.ExtentFreeList that = (DatabaseStats.ExtentFreeList) o;
      return (this.num == that.num())
           && (this.totalSize == that.totalSize());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.num;
    h *= 1000003;
    h ^= this.totalSize;
    return h;
  }

}
