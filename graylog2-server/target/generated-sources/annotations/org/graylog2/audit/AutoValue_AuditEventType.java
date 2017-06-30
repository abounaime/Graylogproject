package org.graylog2.audit;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_AuditEventType extends $AutoValue_AuditEventType {
  AutoValue_AuditEventType(String namespace, String object, String action) {
    super(namespace, object, action);
  }

  @JsonIgnore
  public final String getNamespace() {
    return namespace();
  }

  @JsonIgnore
  public final String getObject() {
    return object();
  }

  @JsonIgnore
  public final String getAction() {
    return action();
  }
}
