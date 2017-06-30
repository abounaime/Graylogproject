package org.graylog2.rest.models.tools.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.hibernate.validator.constraints.NotEmpty;

final class AutoValue_JsonTestRequest extends $AutoValue_JsonTestRequest {
  AutoValue_JsonTestRequest(boolean flatten, String listSeparator, String keySeparator,
      String kvSeparator, boolean replaceKeyWhitespace, String keyWhitespaceReplacement,
      String keyPrefix, String string) {
    super(flatten, listSeparator, keySeparator, kvSeparator, replaceKeyWhitespace, keyWhitespaceReplacement, keyPrefix, string);
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
  public final boolean isReplaceKeyWhitespace() {
    return replaceKeyWhitespace();
  }

  @JsonIgnore
  public final String getKeyWhitespaceReplacement() {
    return keyWhitespaceReplacement();
  }

  @JsonIgnore
  public final String getKeyPrefix() {
    return keyPrefix();
  }

  @JsonIgnore
  @NotEmpty
  public final String getString() {
    return string();
  }
}
