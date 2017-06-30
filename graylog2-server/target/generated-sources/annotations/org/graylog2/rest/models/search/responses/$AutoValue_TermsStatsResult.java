
package org.graylog2.rest.models.search.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_TermsStatsResult extends TermsStatsResult {

  private final long time;
  private final List<Map<String, Object>> terms;
  private final String builtQuery;

  $AutoValue_TermsStatsResult(
      long time,
      List<Map<String, Object>> terms,
      String builtQuery) {
    this.time = time;
    if (terms == null) {
      throw new NullPointerException("Null terms");
    }
    this.terms = terms;
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
  public List<Map<String, Object>> terms() {
    return terms;
  }

  @JsonProperty
  @Override
  public String builtQuery() {
    return builtQuery;
  }

  @Override
  public String toString() {
    return "TermsStatsResult{"
        + "time=" + time + ", "
        + "terms=" + terms + ", "
        + "builtQuery=" + builtQuery
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TermsStatsResult) {
      TermsStatsResult that = (TermsStatsResult) o;
      return (this.time == that.time())
           && (this.terms.equals(that.terms()))
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
    h ^= this.builtQuery.hashCode();
    return h;
  }

}
