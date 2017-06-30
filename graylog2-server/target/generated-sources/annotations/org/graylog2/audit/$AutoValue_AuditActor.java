
package org.graylog2.audit;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AuditActor extends AuditActor {

  private final String urn;

  $AutoValue_AuditActor(
      String urn) {
    if (urn == null) {
      throw new NullPointerException("Null urn");
    }
    this.urn = urn;
  }

  @Override
  public String urn() {
    return urn;
  }

  @Override
  public String toString() {
    return "AuditActor{"
        + "urn=" + urn
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AuditActor) {
      AuditActor that = (AuditActor) o;
      return (this.urn.equals(that.urn()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.urn.hashCode();
    return h;
  }

}
