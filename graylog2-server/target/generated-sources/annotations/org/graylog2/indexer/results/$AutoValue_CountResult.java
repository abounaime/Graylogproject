
package org.graylog2.indexer.results;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CountResult extends CountResult {

  private final long count;
  private final long tookMs;

  $AutoValue_CountResult(
      long count,
      long tookMs) {
    this.count = count;
    this.tookMs = tookMs;
  }

  @Override
  public long count() {
    return count;
  }

  @Override
  public long tookMs() {
    return tookMs;
  }

  @Override
  public String toString() {
    return "CountResult{"
        + "count=" + count + ", "
        + "tookMs=" + tookMs
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CountResult) {
      CountResult that = (CountResult) o;
      return (this.count == that.count())
           && (this.tookMs == that.tookMs());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.count >>> 32) ^ this.count;
    h *= 1000003;
    h ^= (this.tookMs >>> 32) ^ this.tookMs;
    return h;
  }

}
