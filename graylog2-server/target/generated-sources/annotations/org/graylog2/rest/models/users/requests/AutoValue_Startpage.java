package org.graylog2.rest.models.users.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_Startpage extends $AutoValue_Startpage {
  AutoValue_Startpage(String type, String id) {
    super(type, id);
  }

  @JsonIgnore
  @Nullable
  public final String getType() {
    return type();
  }

  @JsonIgnore
  @Nullable
  public final String getId() {
    return id();
  }
}
