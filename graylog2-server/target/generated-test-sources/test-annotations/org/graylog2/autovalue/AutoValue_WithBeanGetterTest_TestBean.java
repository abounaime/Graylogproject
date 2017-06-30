package org.graylog2.autovalue;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.String;

final class AutoValue_WithBeanGetterTest_TestBean extends $AutoValue_WithBeanGetterTest_TestBean {
  AutoValue_WithBeanGetterTest_TestBean(String text, boolean bool, Boolean boxedBool) {
    super(text, bool, boxedBool);
  }

  @JsonIgnore
  public final String getText() {
    return text();
  }

  @JsonIgnore
  public final boolean isBool() {
    return bool();
  }

  @JsonIgnore
  public final Boolean isBoxedBool() {
    return boxedBool();
  }
}
