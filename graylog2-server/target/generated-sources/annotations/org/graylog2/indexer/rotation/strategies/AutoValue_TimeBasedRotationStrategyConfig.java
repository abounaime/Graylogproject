package org.graylog2.indexer.rotation.strategies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.joda.time.Period;

final class AutoValue_TimeBasedRotationStrategyConfig extends $AutoValue_TimeBasedRotationStrategyConfig {
  AutoValue_TimeBasedRotationStrategyConfig(String type, Period rotationPeriod) {
    super(type, rotationPeriod);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final Period getRotationPeriod() {
    return rotationPeriod();
  }
}
