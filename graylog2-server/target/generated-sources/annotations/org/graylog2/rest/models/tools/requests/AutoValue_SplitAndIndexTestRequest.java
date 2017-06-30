package org.graylog2.rest.models.tools.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_SplitAndIndexTestRequest extends $AutoValue_SplitAndIndexTestRequest {
  AutoValue_SplitAndIndexTestRequest(String string, String splitBy, int index) {
    super(string, splitBy, index);
  }

  @JsonIgnore
  public final String getString() {
    return string();
  }

  @JsonIgnore
  public final String getSplitBy() {
    return splitBy();
  }

  @JsonIgnore
  public final int getIndex() {
    return index();
  }
}
