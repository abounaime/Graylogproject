package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_RegexTesterResponse extends $AutoValue_RegexTesterResponse {
  AutoValue_RegexTesterResponse(boolean matched, RegexTesterResponse.Match match, String regex,
      String string) {
    super(matched, match, regex, string);
  }

  @JsonIgnore
  public final boolean isMatched() {
    return matched();
  }

  @JsonIgnore
  @Nullable
  public final RegexTesterResponse.Match getMatch() {
    return match();
  }

  @JsonIgnore
  public final String getRegex() {
    return regex();
  }

  @JsonIgnore
  public final String getString() {
    return string();
  }
}
