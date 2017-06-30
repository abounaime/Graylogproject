package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_DatabaseStats_ExtentFreeList extends $AutoValue_DatabaseStats_ExtentFreeList {
  AutoValue_DatabaseStats_ExtentFreeList(int num, int totalSize) {
    super(num, totalSize);
  }

  @JsonIgnore
  public final int getNum() {
    return num();
  }

  @JsonIgnore
  public final int getTotalSize() {
    return totalSize();
  }
}
