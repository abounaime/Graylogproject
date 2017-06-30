
package org.graylog2.rest.models.search.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_TermsResult extends TermsResult {

  private final long time;
  private final Map<String, Long> terms;
  private final long missing;
  private final long other;
  private final long total;
  private final String builtQuery;

  $AutoValue_TermsResult(
      long time,
      Map<String, Long> terms,
      long missing,
      long other,
      long total,
      String builtQuery) {
    this.time = time;
    if (terms == null) {
      throw new NullPointerException("Null terms");
    }
    this.terms = terms;
    this.missing = missing;
    this.other = other;
    this.total = total;
    if (builtQuery == null) {
      throw new NullPointerException("Null builtQuery");
    }
    this.builtQuery = builtQuery;
  }

  @JsonProperty
  @Override
  public long time() {
    return time;
  }

  @JsonProperty
  @Override
  public Map<String, Long> terms() {
    return terms;
  }

  @JsonProperty
  @Override
  public long missing() {
    return missing;
  }

  @JsonProperty
  @Override
  public long other() {
    return other;
  }

  @JsonProperty
  @Override
  public long total() {
    return total;
  }

  @JsonProperty
  @Override
  public String builtQuery() {
    return builtQuery;
  }

  @Override
  public String toString() {
    return "TermsResult{"
        + "time=" + time + ", "
        + "terms=" + terms + ", "
        + "missing=" + missing + ", "
        + "other=" + other + ", "
        + "total=" + total + ", "
        + "builtQuery=" + builtQuery
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TermsResult) {
      TermsResult that = (TermsResult) o;
      return (this.time == that.time())
           && (this.terms.equals(that.terms()))
           && (this.missing == that.missing())
           && (this.other == that.other())
           && (this.total == that.total())
           && (this.builtQuery.equals(that.builtQuery()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.time >>> 32) ^ this.time;
    h *= 1000003;
    h ^= this.terms.hashCode();
    h *= 1000003;
    h ^= (this.missing >>> 32) ^ this.missing;
    h *= 1000003;
    h ^= (this.other >>> 32) ^ this.other;
    h *= 1000003;
    h ^= (this.total >>> 32) ^ this.total;
    h *= 1000003;
    h ^= this.builtQuery.hashCode();
    return h;
  }

}
