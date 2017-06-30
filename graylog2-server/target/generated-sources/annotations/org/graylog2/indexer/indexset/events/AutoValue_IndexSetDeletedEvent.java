package org.graylog2.indexer.indexset.events;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.hibernate.validator.constraints.NotBlank;

final class AutoValue_IndexSetDeletedEvent extends $AutoValue_IndexSetDeletedEvent {
  AutoValue_IndexSetDeletedEvent(String id) {
    super(id);
  }

  @JsonIgnore
  @NotBlank
  public final String getId() {
    return id();
  }
}
