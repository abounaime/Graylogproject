package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import org.hibernate.validator.constraints.NotEmpty;

final class AutoValue_JsonTesterResponse extends $AutoValue_JsonTesterResponse {
  AutoValue_JsonTesterResponse(Map<String, Object> matches, boolean flatten, String listSeparator,
      String keySeparator, String kvSeparator, String string) {
    super(matches, flatten, listSeparator, keySeparator, kvSeparator, string);
  }

  @JsonIgnore
  public final Map<String, Object> getMatches() {
    return matches();
  }

  @JsonIgnore
  public final boolean isFlatten() {
    return flatten();
  }

  @JsonIgnore
  @NotEmpty
  public final String getListSeparator() {
    return listSeparator();
  }

  @JsonIgnore
  @NotEmpty
  public final String getKeySeparator() {
    return keySeparator();
  }

  @JsonIgnore
  @NotEmpty
  public final String getKvSeparator() {
    return kvSeparator();
  }

  @JsonIgnore
  @NotEmpty
  public final String getString() {
    return string();
  }
}
