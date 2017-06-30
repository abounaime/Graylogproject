
package org.graylog2.rest.models.streams.alerts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AlertConditionListSummary extends AlertConditionListSummary {

  private final long total;
  private final List<AlertConditionSummary> conditions;

  $AutoValue_AlertConditionListSummary(
      long total,
      List<AlertConditionSummary> conditions) {
    this.total = total;
    if (conditions == null) {
      throw new NullPointerException("Null conditions");
    }
    this.conditions = conditions;
  }

  @JsonProperty(value = "total")
  @Override
  public long total() {
    return total;
  }

  @JsonProperty(value = "conditions")
  @Override
  public List<AlertConditionSummary> conditions() {
    return conditions;
  }

  @Override
  public String toString() {
    return "AlertConditionListSummary{"
        + "total=" + total + ", "
        + "conditions=" + conditions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AlertConditionListSummary) {
      AlertConditionListSummary that = (AlertConditionListSummary) o;
      return (this.total == that.total())
           && (this.conditions.equals(that.conditions()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.total >>> 32) ^ this.total;
    h *= 1000003;
    h ^= this.conditions.hashCode();
    return h;
  }

}
