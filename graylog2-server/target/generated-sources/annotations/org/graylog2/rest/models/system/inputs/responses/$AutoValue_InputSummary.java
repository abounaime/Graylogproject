
package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_InputSummary extends InputSummary {

  private final String title;
  private final Boolean global;
  private final String name;
  private final String contentPack;
  private final String inputId;
  private final DateTime createdAt;
  private final String type;
  private final String creatorUserId;
  private final Map<String, Object> attributes;
  private final Map<String, String> staticFields;
  private final String node;

  $AutoValue_InputSummary(
      String title,
      Boolean global,
      String name,
      @Nullable String contentPack,
      String inputId,
      DateTime createdAt,
      String type,
      String creatorUserId,
      Map<String, Object> attributes,
      Map<String, String> staticFields,
      @Nullable String node) {
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    if (global == null) {
      throw new NullPointerException("Null global");
    }
    this.global = global;
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    this.contentPack = contentPack;
    if (inputId == null) {
      throw new NullPointerException("Null inputId");
    }
    this.inputId = inputId;
    if (createdAt == null) {
      throw new NullPointerException("Null createdAt");
    }
    this.createdAt = createdAt;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (creatorUserId == null) {
      throw new NullPointerException("Null creatorUserId");
    }
    this.creatorUserId = creatorUserId;
    if (attributes == null) {
      throw new NullPointerException("Null attributes");
    }
    this.attributes = attributes;
    if (staticFields == null) {
      throw new NullPointerException("Null staticFields");
    }
    this.staticFields = staticFields;
    this.node = node;
  }

  @JsonProperty
  @Override
  public String title() {
    return title;
  }

  @JsonProperty
  @Override
  public Boolean global() {
    return global;
  }

  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  @JsonProperty
  @Nullable
  @Override
  public String contentPack() {
    return contentPack;
  }

  @JsonProperty(value = "id")
  @Override
  public String inputId() {
    return inputId;
  }

  @JsonProperty
  @Override
  public DateTime createdAt() {
    return createdAt;
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
  public Map<String, Object> attributes() {
    return attributes;
  }

  @JsonProperty
  @Override
  public Map<String, String> staticFields() {
    return staticFields;
  }

  @JsonProperty
  @Nullable
  @Override
  public String node() {
    return node;
  }

  @Override
  public String toString() {
    return "InputSummary{"
        + "title=" + title + ", "
        + "global=" + global + ", "
        + "name=" + name + ", "
        + "contentPack=" + contentPack + ", "
        + "inputId=" + inputId + ", "
        + "createdAt=" + createdAt + ", "
        + "type=" + type + ", "
        + "creatorUserId=" + creatorUserId + ", "
        + "attributes=" + attributes + ", "
        + "staticFields=" + staticFields + ", "
        + "node=" + node
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InputSummary) {
      InputSummary that = (InputSummary) o;
      return (this.title.equals(that.title()))
           && (this.global.equals(that.global()))
           && (this.name.equals(that.name()))
           && ((this.contentPack == null) ? (that.contentPack() == null) : this.contentPack.equals(that.contentPack()))
           && (this.inputId.equals(that.inputId()))
           && (this.createdAt.equals(that.createdAt()))
           && (this.type.equals(that.type()))
           && (this.creatorUserId.equals(that.creatorUserId()))
           && (this.attributes.equals(that.attributes()))
           && (this.staticFields.equals(that.staticFields()))
           && ((this.node == null) ? (that.node() == null) : this.node.equals(that.node()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= this.global.hashCode();
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= (contentPack == null) ? 0 : this.contentPack.hashCode();
    h *= 1000003;
    h ^= this.inputId.hashCode();
    h *= 1000003;
    h ^= this.createdAt.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.creatorUserId.hashCode();
    h *= 1000003;
    h ^= this.attributes.hashCode();
    h *= 1000003;
    h ^= this.staticFields.hashCode();
    h *= 1000003;
    h ^= (node == null) ? 0 : this.node.hashCode();
    return h;
  }

}
