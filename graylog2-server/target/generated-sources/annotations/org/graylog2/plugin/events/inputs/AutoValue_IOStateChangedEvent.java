package org.graylog2.plugin.events.inputs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.graylog2.plugin.IOState;
import org.graylog2.plugin.Stoppable;

final class AutoValue_IOStateChangedEvent<T extends Stoppable> extends $AutoValue_IOStateChangedEvent<T> {
  AutoValue_IOStateChangedEvent(IOState.Type oldState, IOState.Type newState,
      IOState<T> changedState) {
    super(oldState, newState, changedState);
  }

  @JsonIgnore
  public final IOState.Type getOldState() {
    return oldState();
  }

  @JsonIgnore
  public final IOState.Type getNewState() {
    return newState();
  }

  @JsonIgnore
  public final IOState<T> getChangedState() {
    return changedState();
  }
}
