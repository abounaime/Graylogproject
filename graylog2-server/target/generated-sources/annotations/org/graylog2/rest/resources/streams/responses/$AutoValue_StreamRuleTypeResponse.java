
package org.graylog2.rest.resources.streams.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_StreamRuleTypeResponse extends StreamRuleTypeResponse {

  private final int id;
  private final String name;
  private final String shortDesc;
  private final String longDesc;

  $AutoValue_StreamRuleTypeResponse(
      int id,
      String name,
      String shortDesc,
      String longDesc) {
    this.id = id;
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (shortDesc == null) {
      throw new NullPointerException("Null shortDesc");
    }
    this.shortDesc = shortDesc;
    if (longDesc == null) {
      throw new NullPointerException("Null longDesc");
    }
    this.longDesc = longDesc;
  }

  @JsonProperty
  @Override
  public int id() {
    return id;
  }

  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  @JsonProperty(value = "short_desc")
  @Override
  public String shortDesc() {
    return shortDesc;
  }

  @JsonProperty(value = "long_desc")
  @Override
  public String longDesc() {
    return longDesc;
  }

  @Override
  public String toString() {
    return "StreamRuleTypeResponse{"
        + "id=" + id + ", "
        + "name=" + name + ", "
        + "shortDesc=" + shortDesc + ", "
        + "longDesc=" + longDesc
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof StreamRuleTypeResponse) {
      StreamRuleTypeResponse that = (StreamRuleTypeResponse) o;
      return (this.id == that.id())
           && (this.name.equals(that.name()))
           && (this.shortDesc.equals(that.shortDesc()))
           && (this.longDesc.equals(that.longDesc()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id;
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.shortDesc.hashCode();
    h *= 1000003;
    h ^= this.longDesc.hashCode();
    return h;
  }

}
