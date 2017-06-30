package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_SubstringTesterResponse extends $AutoValue_SubstringTesterResponse {
  AutoValue_SubstringTesterResponse(boolean successful, String cut, int beginIndex, int endIndex) {
    super(successful, cut, beginIndex, endIndex);
  }

  @JsonIgnore
  public final boolean isSuccessful() {
    return successful();
  }

  @JsonIgnore
  @Nullable
  public final String getCut() {
    return cut();
  }

  @JsonIgnore
  public final int getBeginIndex() {
    return beginIndex();
  }

  @JsonIgnore
  public final int getEndIndex() {
    return endIndex();
  }
}
