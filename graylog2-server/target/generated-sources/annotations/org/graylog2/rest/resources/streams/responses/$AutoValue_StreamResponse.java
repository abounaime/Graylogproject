
package org.graylog2.rest.resources.streams.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.graylog2.plugin.streams.StreamRule;
import org.graylog2.rest.models.alarmcallbacks.requests.AlertReceivers;
import org.graylog2.rest.models.streams.alerts.AlertConditionSummary;
import org.graylog2.rest.models.system.outputs.responses.OutputSummary;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_StreamResponse extends StreamResponse {

  private final String id;
  private final String creatorUserId;
  private final Collection<OutputSummary> outputs;
  private final String matchingType;
  private final String description;
  private final String createdAt;
  private final boolean disabled;
  private final Collection<StreamRule> rules;
  private final Collection<AlertConditionSummary> alertConditions;
  private final AlertReceivers alertReceivers;
  private final String title;
  private final String contentPack;
  private final Boolean isDefault;
  private final boolean removeMatchesFromDefaultStream;
  private final String indexSetId;
  private final Boolean isFavoriteStream;

  $AutoValue_StreamResponse(
      String id,
      String creatorUserId,
      Collection<OutputSummary> outputs,
      String matchingType,
      @Nullable String description,
      String createdAt,
      boolean disabled,
      Collection<StreamRule> rules,
      Collection<AlertConditionSummary> alertConditions,
      AlertReceivers alertReceivers,
      String title,
      @Nullable String contentPack,
      @Nullable Boolean isDefault,
      boolean removeMatchesFromDefaultStream,
      String indexSetId,
      Boolean isFavoriteStream) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    if (creatorUserId == null) {
      throw new NullPointerException("Null creatorUserId");
    }
    this.creatorUserId = creatorUserId;
    if (outputs == null) {
      throw new NullPointerException("Null outputs");
    }
    this.outputs = outputs;
    if (matchingType == null) {
      throw new NullPointerException("Null matchingType");
    }
    this.matchingType = matchingType;
    this.description = description;
    if (createdAt == null) {
      throw new NullPointerException("Null createdAt");
    }
    this.createdAt = createdAt;
    this.disabled = disabled;
    if (rules == null) {
      throw new NullPointerException("Null rules");
    }
    this.rules = rules;
    if (alertConditions == null) {
      throw new NullPointerException("Null alertConditions");
    }
    this.alertConditions = alertConditions;
    if (alertReceivers == null) {
      throw new NullPointerException("Null alertReceivers");
    }
    this.alertReceivers = alertReceivers;
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    this.contentPack = contentPack;
    this.isDefault = isDefault;
    this.removeMatchesFromDefaultStream = removeMatchesFromDefaultStream;
    if (indexSetId == null) {
      throw new NullPointerException("Null indexSetId");
    }
    this.indexSetId = indexSetId;
    if (isFavoriteStream == null) {
      throw new NullPointerException("Null isFavoriteStream");
    }
    this.isFavoriteStream = isFavoriteStream;
  }

  @JsonProperty(value = "id")
  @Override
  public String id() {
    return id;
  }

  @JsonProperty(value = "creator_user_id")
  @Override
  public String creatorUserId() {
    return creatorUserId;
  }

  @JsonProperty(value = "outputs")
  @Override
  public Collection<OutputSummary> outputs() {
    return outputs;
  }

  @JsonProperty(value = "matching_type")
  @Override
  public String matchingType() {
    return matchingType;
  }

  @JsonProperty(value = "description")
  @Nullable
  @Override
  public String description() {
    return description;
  }

  @JsonProperty(value = "created_at")
  @Override
  public String createdAt() {
    return createdAt;
  }

  @JsonProperty(value = "disabled")
  @Override
  public boolean disabled() {
    return disabled;
  }

  @JsonProperty(value = "rules")
  @Override
  public Collection<StreamRule> rules() {
    return rules;
  }

  @JsonProperty(value = "alert_conditions")
  @Override
  public Collection<AlertConditionSummary> alertConditions() {
    return alertConditions;
  }

  @JsonProperty(value = "alert_receivers")
  @Override
  public AlertReceivers alertReceivers() {
    return alertReceivers;
  }

  @JsonProperty(value = "title")
  @Override
  public String title() {
    return title;
  }

  @JsonProperty(value = "content_pack")
  @Nullable
  @Override
  public String contentPack() {
    return contentPack;
  }

  @JsonProperty(value = "is_default")
  @Nullable
  @Override
  public Boolean isDefault() {
    return isDefault;
  }

  @JsonProperty(value = "remove_matches_from_default_stream")
  @Override
  public boolean removeMatchesFromDefaultStream() {
    return removeMatchesFromDefaultStream;
  }

  @JsonProperty(value = "index_set_id")
  @Override
  public String indexSetId() {
    return indexSetId;
  }

  @JsonProperty(value = "isFavoriteStream")
  @Override
  public Boolean isFavoriteStream() {
    return isFavoriteStream;
  }

  @Override
  public String toString() {
    return "StreamResponse{"
        + "id=" + id + ", "
        + "creatorUserId=" + creatorUserId + ", "
        + "outputs=" + outputs + ", "
        + "matchingType=" + matchingType + ", "
        + "description=" + description + ", "
        + "createdAt=" + createdAt + ", "
        + "disabled=" + disabled + ", "
        + "rules=" + rules + ", "
        + "alertConditions=" + alertConditions + ", "
        + "alertReceivers=" + alertReceivers + ", "
        + "title=" + title + ", "
        + "contentPack=" + contentPack + ", "
        + "isDefault=" + isDefault + ", "
        + "removeMatchesFromDefaultStream=" + removeMatchesFromDefaultStream + ", "
        + "indexSetId=" + indexSetId + ", "
        + "isFavoriteStream=" + isFavoriteStream
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof StreamResponse) {
      StreamResponse that = (StreamResponse) o;
      return (this.id.equals(that.id()))
           && (this.creatorUserId.equals(that.creatorUserId()))
           && (this.outputs.equals(that.outputs()))
           && (this.matchingType.equals(that.matchingType()))
           && ((this.description == null) ? (that.description() == null) : this.description.equals(that.description()))
           && (this.createdAt.equals(that.createdAt()))
           && (this.disabled == that.disabled())
           && (this.rules.equals(that.rules()))
           && (this.alertConditions.equals(that.alertConditions()))
           && (this.alertReceivers.equals(that.alertReceivers()))
           && (this.title.equals(that.title()))
           && ((this.contentPack == null) ? (that.contentPack() == null) : this.contentPack.equals(that.contentPack()))
           && ((this.isDefault == null) ? (that.isDefault() == null) : this.isDefault.equals(that.isDefault()))
           && (this.removeMatchesFromDefaultStream == that.removeMatchesFromDefaultStream())
           && (this.indexSetId.equals(that.indexSetId()))
           && (this.isFavoriteStream.equals(that.isFavoriteStream()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    h *= 1000003;
    h ^= this.creatorUserId.hashCode();
    h *= 1000003;
    h ^= this.outputs.hashCode();
    h *= 1000003;
    h ^= this.matchingType.hashCode();
    h *= 1000003;
    h ^= (description == null) ? 0 : this.description.hashCode();
    h *= 1000003;
    h ^= this.createdAt.hashCode();
    h *= 1000003;
    h ^= this.disabled ? 1231 : 1237;
    h *= 1000003;
    h ^= this.rules.hashCode();
    h *= 1000003;
    h ^= this.alertConditions.hashCode();
    h *= 1000003;
    h ^= this.alertReceivers.hashCode();
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= (contentPack == null) ? 0 : this.contentPack.hashCode();
    h *= 1000003;
    h ^= (isDefault == null) ? 0 : this.isDefault.hashCode();
    h *= 1000003;
    h ^= this.removeMatchesFromDefaultStream ? 1231 : 1237;
    h *= 1000003;
    h ^= this.indexSetId.hashCode();
    h *= 1000003;
    h ^= this.isFavoriteStream.hashCode();
    return h;
  }

}
