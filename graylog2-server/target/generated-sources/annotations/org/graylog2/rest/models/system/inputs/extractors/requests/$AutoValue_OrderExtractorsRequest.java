
package org.graylog2.rest.models.system.inputs.extractors.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_OrderExtractorsRequest extends OrderExtractorsRequest {

  private final Map<Integer, String> order;

  $AutoValue_OrderExtractorsRequest(
      Map<Integer, String> order) {
    if (order == null) {
      throw new NullPointerException("Null order");
    }
    this.order = order;
  }

  @JsonProperty
  @Override
  public Map<Integer, String> order() {
    return order;
  }

  @Override
  public String toString() {
    return "OrderExtractorsRequest{"
        + "order=" + order
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OrderExtractorsRequest) {
      OrderExtractorsRequest that = (OrderExtractorsRequest) o;
      return (this.order.equals(that.order()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.order.hashCode();
    return h;
  }

}
