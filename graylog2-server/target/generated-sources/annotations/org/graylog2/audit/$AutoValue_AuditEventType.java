
package org.graylog2.audit;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AuditEventType extends AuditEventType {

  private final String namespace;
  private final String object;
  private final String action;

  $AutoValue_AuditEventType(
      String namespace,
      String object,
      String action) {
    if (namespace == null) {
      throw new NullPointerException("Null namespace");
    }
    this.namespace = namespace;
    if (object == null) {
      throw new NullPointerException("Null object");
    }
    this.object = object;
    if (action == null) {
      throw new NullPointerException("Null action");
    }
    this.action = action;
  }

  @JsonProperty(value = "namespace")
  @Override
  public String namespace() {
    return namespace;
  }

  @JsonProperty(value = "object")
  @Override
  public String object() {
    return object;
  }

  @JsonProperty(value = "action")
  @Override
  public String action() {
    return action;
  }

  @Override
  public String toString() {
    return "AuditEventType{"
        + "namespace=" + namespace + ", "
        + "object=" + object + ", "
        + "action=" + action
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AuditEventType) {
      AuditEventType that = (AuditEventType) o;
      return (this.namespace.equals(that.namespace()))
           && (this.object.equals(that.object()))
           && (this.action.equals(that.action()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.namespace.hashCode();
    h *= 1000003;
    h ^= this.object.hashCode();
    h *= 1000003;
    h ^= this.action.hashCode();
    return h;
  }

}
