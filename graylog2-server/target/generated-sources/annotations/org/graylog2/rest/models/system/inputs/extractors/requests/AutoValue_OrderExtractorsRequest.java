package org.graylog2.rest.models.system.inputs.extractors.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;

final class AutoValue_OrderExtractorsRequest extends $AutoValue_OrderExtractorsRequest {
  AutoValue_OrderExtractorsRequest(Map<Integer, String> order) {
    super(order);
  }

  @JsonIgnore
  public final Map<Integer, String> getOrder() {
    return order();
  }
}
