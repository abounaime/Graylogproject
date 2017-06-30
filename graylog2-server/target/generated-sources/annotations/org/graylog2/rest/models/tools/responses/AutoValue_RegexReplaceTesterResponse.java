package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_RegexReplaceTesterResponse extends $AutoValue_RegexReplaceTesterResponse {
  AutoValue_RegexReplaceTesterResponse(boolean matched, RegexReplaceTesterResponse.Match match,
      String regex, String replacement, boolean replaceAll, String string) {
    super(matched, match, regex, replacement, replaceAll, string);
  }

  @JsonIgnore
  public final boolean isMatched() {
    return matched();
  }

  @JsonIgnore
  @Nullable
  public final RegexReplaceTesterResponse.Match getMatch() {
    return match();
  }

  @JsonIgnore
  public final String getRegex() {
    return regex();
  }

  @JsonIgnore
  public final String getReplacement() {
    return replacement();
  }

  @JsonIgnore
  public final boolean isReplaceAll() {
    return replaceAll();
  }

  @JsonIgnore
  public final String getString() {
    return string();
  }
}
