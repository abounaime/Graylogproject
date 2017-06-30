
package org.graylog2.plugin.events.inputs;

import javax.annotation.Generated;
import org.graylog2.plugin.IOState;
import org.graylog2.plugin.Stoppable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IOStateChangedEvent<T extends Stoppable> extends IOStateChangedEvent<T> {

  private final IOState.Type oldState;
  private final IOState.Type newState;
  private final IOState<T> changedState;

  $AutoValue_IOStateChangedEvent(
      IOState.Type oldState,
      IOState.Type newState,
      IOState<T> changedState) {
    if (oldState == null) {
      throw new NullPointerException("Null oldState");
    }
    this.oldState = oldState;
    if (newState == null) {
      throw new NullPointerException("Null newState");
    }
    this.newState = newState;
    if (changedState == null) {
      throw new NullPointerException("Null changedState");
    }
    this.changedState = changedState;
  }

  @Override
  public IOState.Type oldState() {
    return oldState;
  }

  @Override
  public IOState.Type newState() {
    return newState;
  }

  @Override
  public IOState<T> changedState() {
    return changedState;
  }

  @Override
  public String toString() {
    return "IOStateChangedEvent{"
        + "oldState=" + oldState + ", "
        + "newState=" + newState + ", "
        + "changedState=" + changedState
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IOStateChangedEvent) {
      IOStateChangedEvent<?> that = (IOStateChangedEvent<?>) o;
      return (this.oldState.equals(that.oldState()))
           && (this.newState.equals(that.newState()))
           && (this.changedState.equals(that.changedState()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.oldState.hashCode();
    h *= 1000003;
    h ^= this.newState.hashCode();
    h *= 1000003;
    h ^= this.changedState.hashCode();
    return h;
  }

}
