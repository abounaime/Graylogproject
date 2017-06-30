
package org.graylog2.autovalue;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_WithBeanGetterTest_TestBean extends WithBeanGetterTest.TestBean {

  private final String text;
  private final boolean bool;
  private final Boolean boxedBool;

  $AutoValue_WithBeanGetterTest_TestBean(
      String text,
      boolean bool,
      Boolean boxedBool) {
    if (text == null) {
      throw new NullPointerException("Null text");
    }
    this.text = text;
    this.bool = bool;
    if (boxedBool == null) {
      throw new NullPointerException("Null boxedBool");
    }
    this.boxedBool = boxedBool;
  }

  @JsonProperty
  @Override
  public String text() {
    return text;
  }

  @JsonProperty
  @Override
  public boolean bool() {
    return bool;
  }

  @JsonProperty
  @Override
  public Boolean boxedBool() {
    return boxedBool;
  }

  @Override
  public String toString() {
    return "TestBean{"
        + "text=" + text + ", "
        + "bool=" + bool + ", "
        + "boxedBool=" + boxedBool
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof WithBeanGetterTest.TestBean) {
      WithBeanGetterTest.TestBean that = (WithBeanGetterTest.TestBean) o;
      return (this.text.equals(that.text()))
           && (this.bool == that.bool())
           && (this.boxedBool.equals(that.boxedBool()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.text.hashCode();
    h *= 1000003;
    h ^= this.bool ? 1231 : 1237;
    h *= 1000003;
    h ^= this.boxedBool.hashCode();
    return h;
  }

}
