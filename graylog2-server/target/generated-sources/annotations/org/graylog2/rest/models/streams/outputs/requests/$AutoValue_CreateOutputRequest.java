
package org.graylog2.rest.models.streams.outputs.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CreateOutputRequest extends CreateOutputRequest {

  private final String title;
  private final String type;
  private final Map<String, Object> configuration;
  private final Set<String> streams;
  private final String contentPack;

  $AutoValue_CreateOutputRequest(
      String title,
      String type,
      Map<String, Object> configuration,
      @Nullable Set<String> streams,
      @Nullable String contentPack) {
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (configuration == null) {
      throw new NullPointerException("Null configuration");
    }
    this.configuration = configuration;
    this.streams = streams;
    this.contentPack = contentPack;
  }

  @JsonProperty
  @Override
  public String title() {
    return title;
  }

  @JsonProperty
  @Override
  public String type() {
    return type;
  }

  @JsonProperty
  @Override
  public Map<String, Object> configuration() {
    return configuration;
  }

  @JsonProperty
  @Nullable
  @Override
  public Set<String> streams() {
    return streams;
  }

  @JsonProperty
  @Nullable
  @Override
  public String contentPack() {
    return contentPack;
  }

  @Override
  public String toString() {
    return "CreateOutputRequest{"
        + "title=" + title + ", "
        + "type=" + type + ", "
        + "configuration=" + configuration + ", "
        + "streams=" + streams + ", "
        + "contentPack=" + contentPack
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateOutputRequest) {
      CreateOutputRequest that = (CreateOutputRequest) o;
      return (this.title.equals(that.title()))
           && (this.type.equals(that.type()))
           && (this.configuration.equals(that.configuration()))
           && ((this.streams == null) ? (that.streams() == null) : this.streams.equals(that.streams()))
           && ((this.contentPack == null) ? (that.contentPack() == null) : this.contentPack.equals(that.contentPack()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.configuration.hashCode();
    h *= 1000003;
    h ^= (streams == null) ? 0 : this.streams.hashCode();
    h *= 1000003;
    h ^= (contentPack == null) ? 0 : this.contentPack.hashCode();
    return h;
  }

}
