
package org.graylog2.indexer;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_IndexSetValidator_Violation extends IndexSetValidator.Violation {

  private final String message;

  AutoValue_IndexSetValidator_Violation(
      String message) {
    if (message == null) {
      throw new NullPointerException("Null message");
    }
    this.message = message;
  }

  @Override
  public String message() {
    return message;
  }

  @Override
  public String toString() {
    return "Violation{"
        + "message=" + message
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexSetValidator.Violation) {
      IndexSetValidator.Violation that = (IndexSetValidator.Violation) o;
      return (this.message.equals(that.message()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.message.hashCode();
    return h;
  }

}
