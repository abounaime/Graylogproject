
package org.graylog2.rest.models.system.outputs.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_OutputSummary extends OutputSummary {

  private final String id;
  private final String title;
  private final String type;
  private final String creatorUserId;
  private final DateTime createdAt;
  private final Map<String, Object> configuration;
  private final String contentPack;

  $AutoValue_OutputSummary(
      String id,
      String title,
      String type,
      String creatorUserId,
      DateTime createdAt,
      Map<String, Object> configuration,
      @Nullable String contentPack) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (creatorUserId == null) {
      throw new NullPointerException("Null creatorUserId");
    }
    this.creatorUserId = creatorUserId;
    if (createdAt == null) {
      throw new NullPointerException("Null createdAt");
    }
    this.createdAt = createdAt;
    if (configuration == null) {
      throw new NullPointerException("Null configuration");
    }
    this.configuration = configuration;
    this.contentPack = contentPack;
  }

  @JsonProperty
  @Override
  public String id() {
    return id;
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
  public String creatorUserId() {
    return creatorUserId;
  }

  @JsonProperty
  @Override
  public DateTime createdAt() {
    return createdAt;
  }

  @JsonProperty
  @Override
  public Map<String, Object> configuration() {
    return configuration;
  }

  @JsonProperty
  @Nullable
  @Override
  public String contentPack() {
    return contentPack;
  }

  @Override
  public String toString() {
    return "OutputSummary{"
        + "id=" + id + ", "
        + "title=" + title + ", "
        + "type=" + type + ", "
        + "creatorUserId=" + creatorUserId + ", "
        + "createdAt=" + createdAt + ", "
        + "configuration=" + configuration + ", "
        + "contentPack=" + contentPack
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OutputSummary) {
      OutputSummary that = (OutputSummary) o;
      return (this.id.equals(that.id()))
           && (this.title.equals(that.title()))
           && (this.type.equals(that.type()))
           && (this.creatorUserId.equals(that.creatorUserId()))
           && (this.createdAt.equals(that.createdAt()))
           && (this.configuration.equals(that.configuration()))
           && ((this.contentPack == null) ? (that.contentPack() == null) : this.contentPack.equals(that.contentPack()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.creatorUserId.hashCode();
    h *= 1000003;
    h ^= this.createdAt.hashCode();
    h *= 1000003;
    h ^= this.configuration.hashCode();
    h *= 1000003;
    h ^= (contentPack == null) ? 0 : this.contentPack.hashCode();
    return h;
  }

}
