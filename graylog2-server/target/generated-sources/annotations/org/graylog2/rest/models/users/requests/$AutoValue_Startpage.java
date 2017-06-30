
package org.graylog2.rest.models.users.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Startpage extends Startpage {

  private final String type;
  private final String id;

  $AutoValue_Startpage(
      @Nullable String type,
      @Nullable String id) {
    this.type = type;
    this.id = id;
  }

  @JsonProperty
  @Nullable
  @Override
  public String type() {
    return type;
  }

  @JsonProperty
  @Nullable
  @Override
  public String id() {
    return id;
  }

  @Override
  public String toString() {
    return "Startpage{"
        + "type=" + type + ", "
        + "id=" + id
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Startpage) {
      Startpage that = (Startpage) o;
      return ((this.type == null) ? (that.type() == null) : this.type.equals(that.type()))
           && ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (type == null) ? 0 : this.type.hashCode();
    h *= 1000003;
    h ^= (id == null) ? 0 : this.id.hashCode();
    return h;
  }

}
