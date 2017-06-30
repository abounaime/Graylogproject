package org.graylog2.rest.models.search.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_FieldStatsResult extends $AutoValue_FieldStatsResult {
  AutoValue_FieldStatsResult(long time, long count, double sum, double sumOfSquares, double mean,
      double min, double max, double variance, double stdDeviation, String builtQuery,
      long cardinality) {
    super(time, count, sum, sumOfSquares, mean, min, max, variance, stdDeviation, builtQuery, cardinality);
  }

  @JsonIgnore
  public final long getTime() {
    return time();
  }

  @JsonIgnore
  public final long getCount() {
    return count();
  }

  @JsonIgnore
  public final double getSum() {
    return sum();
  }

  @JsonIgnore
  public final double getSumOfSquares() {
    return sumOfSquares();
  }

  @JsonIgnore
  public final double getMean() {
    return mean();
  }

  @JsonIgnore
  public final double getMin() {
    return min();
  }

  @JsonIgnore
  public final double getMax() {
    return max();
  }

  @JsonIgnore
  public final double getVariance() {
    return variance();
  }

  @JsonIgnore
  public final double getStdDeviation() {
    return stdDeviation();
  }

  @JsonIgnore
  public final String getBuiltQuery() {
    return builtQuery();
  }

  @JsonIgnore
  public final long getCardinality() {
    return cardinality();
  }
}
