
package org.graylog2.rest.models.search.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_FieldStatsResult extends FieldStatsResult {

  private final long time;
  private final long count;
  private final double sum;
  private final double sumOfSquares;
  private final double mean;
  private final double min;
  private final double max;
  private final double variance;
  private final double stdDeviation;
  private final String builtQuery;
  private final long cardinality;

  $AutoValue_FieldStatsResult(
      long time,
      long count,
      double sum,
      double sumOfSquares,
      double mean,
      double min,
      double max,
      double variance,
      double stdDeviation,
      String builtQuery,
      long cardinality) {
    this.time = time;
    this.count = count;
    this.sum = sum;
    this.sumOfSquares = sumOfSquares;
    this.mean = mean;
    this.min = min;
    this.max = max;
    this.variance = variance;
    this.stdDeviation = stdDeviation;
    if (builtQuery == null) {
      throw new NullPointerException("Null builtQuery");
    }
    this.builtQuery = builtQuery;
    this.cardinality = cardinality;
  }

  @JsonProperty
  @Override
  public long time() {
    return time;
  }

  @JsonProperty
  @Override
  public long count() {
    return count;
  }

  @JsonProperty
  @Override
  public double sum() {
    return sum;
  }

  @JsonProperty
  @Override
  public double sumOfSquares() {
    return sumOfSquares;
  }

  @JsonProperty
  @Override
  public double mean() {
    return mean;
  }

  @JsonProperty
  @Override
  public double min() {
    return min;
  }

  @JsonProperty
  @Override
  public double max() {
    return max;
  }

  @JsonProperty
  @Override
  public double variance() {
    return variance;
  }

  @JsonProperty
  @Override
  public double stdDeviation() {
    return stdDeviation;
  }

  @JsonProperty
  @Override
  public String builtQuery() {
    return builtQuery;
  }

  @JsonProperty
  @Override
  public long cardinality() {
    return cardinality;
  }

  @Override
  public String toString() {
    return "FieldStatsResult{"
        + "time=" + time + ", "
        + "count=" + count + ", "
        + "sum=" + sum + ", "
        + "sumOfSquares=" + sumOfSquares + ", "
        + "mean=" + mean + ", "
        + "min=" + min + ", "
        + "max=" + max + ", "
        + "variance=" + variance + ", "
        + "stdDeviation=" + stdDeviation + ", "
        + "builtQuery=" + builtQuery + ", "
        + "cardinality=" + cardinality
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FieldStatsResult) {
      FieldStatsResult that = (FieldStatsResult) o;
      return (this.time == that.time())
           && (this.count == that.count())
           && (Double.doubleToLongBits(this.sum) == Double.doubleToLongBits(that.sum()))
           && (Double.doubleToLongBits(this.sumOfSquares) == Double.doubleToLongBits(that.sumOfSquares()))
           && (Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(that.mean()))
           && (Double.doubleToLongBits(this.min) == Double.doubleToLongBits(that.min()))
           && (Double.doubleToLongBits(this.max) == Double.doubleToLongBits(that.max()))
           && (Double.doubleToLongBits(this.variance) == Double.doubleToLongBits(that.variance()))
           && (Double.doubleToLongBits(this.stdDeviation) == Double.doubleToLongBits(that.stdDeviation()))
           && (this.builtQuery.equals(that.builtQuery()))
           && (this.cardinality == that.cardinality());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.time >>> 32) ^ this.time;
    h *= 1000003;
    h ^= (this.count >>> 32) ^ this.count;
    h *= 1000003;
    h ^= (Double.doubleToLongBits(this.sum) >>> 32) ^ Double.doubleToLongBits(this.sum);
    h *= 1000003;
    h ^= (Double.doubleToLongBits(this.sumOfSquares) >>> 32) ^ Double.doubleToLongBits(this.sumOfSquares);
    h *= 1000003;
    h ^= (Double.doubleToLongBits(this.mean) >>> 32) ^ Double.doubleToLongBits(this.mean);
    h *= 1000003;
    h ^= (Double.doubleToLongBits(this.min) >>> 32) ^ Double.doubleToLongBits(this.min);
    h *= 1000003;
    h ^= (Double.doubleToLongBits(this.max) >>> 32) ^ Double.doubleToLongBits(this.max);
    h *= 1000003;
    h ^= (Double.doubleToLongBits(this.variance) >>> 32) ^ Double.doubleToLongBits(this.variance);
    h *= 1000003;
    h ^= (Double.doubleToLongBits(this.stdDeviation) >>> 32) ^ Double.doubleToLongBits(this.stdDeviation);
    h *= 1000003;
    h ^= this.builtQuery.hashCode();
    h *= 1000003;
    h ^= (this.cardinality >>> 32) ^ this.cardinality;
    return h;
  }

}
