
package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SubstringTesterResponse extends SubstringTesterResponse {

  private final boolean successful;
  private final String cut;
  private final int beginIndex;
  private final int endIndex;

  $AutoValue_SubstringTesterResponse(
      boolean successful,
      @Nullable String cut,
      int beginIndex,
      int endIndex) {
    this.successful = successful;
    this.cut = cut;
    this.beginIndex = beginIndex;
    this.endIndex = endIndex;
  }

  @JsonProperty
  @Override
  public boolean successful() {
    return successful;
  }

  @JsonProperty
  @Nullable
  @Override
  public String cut() {
    return cut;
  }

  @JsonProperty(value = "begin_index")
  @Override
  public int beginIndex() {
    return beginIndex;
  }

  @JsonProperty(value = "end_index")
  @Override
  public int endIndex() {
    return endIndex;
  }

  @Override
  public String toString() {
    return "SubstringTesterResponse{"
        + "successful=" + successful + ", "
        + "cut=" + cut + ", "
        + "beginIndex=" + beginIndex + ", "
        + "endIndex=" + endIndex
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SubstringTesterResponse) {
      SubstringTesterResponse that = (SubstringTesterResponse) o;
      return (this.successful == that.successful())
           && ((this.cut == null) ? (that.cut() == null) : this.cut.equals(that.cut()))
           && (this.beginIndex == that.beginIndex())
           && (this.endIndex == that.endIndex());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.successful ? 1231 : 1237;
    h *= 1000003;
    h ^= (cut == null) ? 0 : this.cut.hashCode();
    h *= 1000003;
    h ^= this.beginIndex;
    h *= 1000003;
    h ^= this.endIndex;
    return h;
  }

}
