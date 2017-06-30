
package org.graylog2.rest.models.streams.alerts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AlertConditionSummary extends AlertConditionSummary {

  private final String id;
  private final String type;
  private final String creatorUserId;
  private final Date createdAt;
  private final Map<String, Object> parameters;
  private final Boolean inGrace;
  private final String title;

  $AutoValue_AlertConditionSummary(
      String id,
      String type,
      String creatorUserId,
      Date createdAt,
      Map<String, Object> parameters,
      @Nullable Boolean inGrace,
      @Nullable String title) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
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
    if (parameters == null) {
      throw new NullPointerException("Null parameters");
    }
    this.parameters = parameters;
    this.inGrace = inGrace;
    this.title = title;
  }

  @JsonProperty(value = "id")
  @Override
  public String id() {
    return id;
  }

  @JsonProperty(value = "type")
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "creator_user_id")
  @Override
  public String creatorUserId() {
    return creatorUserId;
  }

  @JsonProperty(value = "created_at")
  @Override
  public Date createdAt() {
    return createdAt;
  }

  @JsonProperty(value = "parameters")
  @Override
  public Map<String, Object> parameters() {
    return parameters;
  }

  @JsonProperty(value = "in_grace")
  @Nullable
  @JsonInclude(value = JsonInclude.Include.NON_NULL)
  @Override
  public Boolean inGrace() {
    return inGrace;
  }

  @JsonProperty(value = "title")
  @Nullable
  @Override
  public String title() {
    return title;
  }

  @Override
  public String toString() {
    return "AlertConditionSummary{"
        + "id=" + id + ", "
        + "type=" + type + ", "
        + "creatorUserId=" + creatorUserId + ", "
        + "createdAt=" + createdAt + ", "
        + "parameters=" + parameters + ", "
        + "inGrace=" + inGrace + ", "
        + "title=" + title
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AlertConditionSummary) {
      AlertConditionSummary that = (AlertConditionSummary) o;
      return (this.id.equals(that.id()))
           && (this.type.equals(that.type()))
           && (this.creatorUserId.equals(that.creatorUserId()))
           && (this.createdAt.equals(that.createdAt()))
           && (this.parameters.equals(that.parameters()))
           && ((this.inGrace == null) ? (that.inGrace() == null) : this.inGrace.equals(that.inGrace()))
           && ((this.title == null) ? (that.title() == null) : this.title.equals(that.title()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.creatorUserId.hashCode();
    h *= 1000003;
    h ^= this.createdAt.hashCode();
    h *= 1000003;
    h ^= this.parameters.hashCode();
    h *= 1000003;
    h ^= (inGrace == null) ? 0 : this.inGrace.hashCode();
    h *= 1000003;
    h ^= (title == null) ? 0 : this.title.hashCode();
    return h;
  }

}
