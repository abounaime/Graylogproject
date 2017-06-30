package org.graylog2.rest.models.tools.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

final class AutoValue_RegexReplaceTestRequest extends $AutoValue_RegexReplaceTestRequest {
  AutoValue_RegexReplaceTestRequest(String string, String regex, String replacement,
      boolean replaceAll) {
    super(string, regex, replacement, replaceAll);
  }

  @JsonIgnore
  @NotNull
  public final String getString() {
    return string();
  }

  @JsonIgnore
  @NotEmpty
  public final String getRegex() {
    return regex();
  }

  @JsonIgnore
  @NotNull
  public final String getReplacement() {
    return replacement();
  }

  @JsonIgnore
  public final boolean isReplaceAll() {
    return replaceAll();
  }
}
