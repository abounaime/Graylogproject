
package org.graylog2.streams;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.mongojack.ObjectId;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_OutputImpl extends OutputImpl {

  private final String id;
  private final String title;
  private final String type;
  private final String creatorUserId;
  private final Map<String, Object> configuration;
  private final Date createdAt;
  private final String contentPack;

  AutoValue_OutputImpl(
      String id,
      String title,
      String type,
      String creatorUserId,
      Map<String, Object> configuration,
      Date createdAt,
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
    if (configuration == null) {
      throw new NullPointerException("Null configuration");
    }
    this.configuration = configuration;
    if (createdAt == null) {
      throw new NullPointerException("Null createdAt");
    }
    this.createdAt = createdAt;
    this.contentPack = contentPack;
  }

  @JsonProperty(value = "_id")
  @ObjectId
  @Override
  public String getId() {
    return id;
  }

  @JsonProperty(value = "title")
  @Override
  public String getTitle() {
    return title;
  }

  @JsonProperty(value = "type")
  @Override
  public String getType() {
    return type;
  }

  @JsonProperty(value = "creator_user_id")
  @Override
  public String getCreatorUserId() {
    return creatorUserId;
  }

  @JsonProperty(value = "configuration")
  @Override
  public Map<String, Object> getConfiguration() {
    return configuration;
  }

  @JsonProperty(value = "created_at")
  @Override
  public Date getCreatedAt() {
    return createdAt;
  }

  @JsonProperty(value = "content_pack")
  @Nullable
  @Override
  public String getContentPack() {
    return contentPack;
  }

  @Override
  public String toString() {
    return "OutputImpl{"
        + "id=" + id + ", "
        + "title=" + title + ", "
        + "type=" + type + ", "
        + "creatorUserId=" + creatorUserId + ", "
        + "configuration=" + configuration + ", "
        + "createdAt=" + createdAt + ", "
        + "contentPack=" + contentPack
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OutputImpl) {
      OutputImpl that = (OutputImpl) o;
      return (this.id.equals(that.getId()))
           && (this.title.equals(that.getTitle()))
           && (this.type.equals(that.getType()))
           && (this.creatorUserId.equals(that.getCreatorUserId()))
           && (this.configuration.equals(that.getConfiguration()))
           && (this.createdAt.equals(that.getCreatedAt()))
           && ((this.contentPack == null) ? (that.getContentPack() == null) : this.contentPack.equals(that.getContentPack()));
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
    h ^= this.configuration.hashCode();
    h *= 1000003;
    h ^= this.createdAt.hashCode();
    h *= 1000003;
    h ^= (contentPack == null) ? 0 : this.contentPack.hashCode();
    return h;
  }

}
