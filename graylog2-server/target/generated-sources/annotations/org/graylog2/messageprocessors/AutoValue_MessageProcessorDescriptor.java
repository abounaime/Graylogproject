package org.graylog2.messageprocessors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_MessageProcessorDescriptor extends $AutoValue_MessageProcessorDescriptor {
  AutoValue_MessageProcessorDescriptor(String name, String className) {
    super(name, className);
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final String getClassName() {
    return className();
  }
}
