package org.graylog2.audit;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_AuditActor extends $AutoValue_AuditActor {
  AutoValue_AuditActor(String urn) {
    super(urn);
  }

  @JsonIgnore
  public final String getUrn() {
    return urn();
  }
}
