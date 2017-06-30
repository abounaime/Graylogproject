package org.graylog2.rest.resources.streams.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collection;
import javax.annotation.Nullable;
import org.graylog2.plugin.streams.StreamRule;
import org.graylog2.rest.models.alarmcallbacks.requests.AlertReceivers;
import org.graylog2.rest.models.streams.alerts.AlertConditionSummary;
import org.graylog2.rest.models.system.outputs.responses.OutputSummary;

final class AutoValue_StreamResponse extends $AutoValue_StreamResponse {
  AutoValue_StreamResponse(String id, String creatorUserId, Collection<OutputSummary> outputs,
      String matchingType, String description, String createdAt, boolean disabled,
      Collection<StreamRule> rules, Collection<AlertConditionSummary> alertConditions,
      AlertReceivers alertReceivers, String title, String contentPack, Boolean isDefault,
      boolean removeMatchesFromDefaultStream, String indexSetId, Boolean isFavoriteStream) {
    super(id, creatorUserId, outputs, matchingType, description, createdAt, disabled, rules, alertConditions, alertReceivers, title, contentPack, isDefault, removeMatchesFromDefaultStream, indexSetId, isFavoriteStream);
  }

  @JsonIgnore
  public final String getId() {
    return id();
  }

  @JsonIgnore
  public final String getCreatorUserId() {
    return creatorUserId();
  }

  @JsonIgnore
  public final Collection<OutputSummary> getOutputs() {
    return outputs();
  }

  @JsonIgnore
  public final String getMatchingType() {
    return matchingType();
  }

  @JsonIgnore
  @Nullable
  public final String getDescription() {
    return description();
  }

  @JsonIgnore
  public final String getCreatedAt() {
    return createdAt();
  }

  @JsonIgnore
  public final boolean isDisabled() {
    return disabled();
  }

  @JsonIgnore
  public final Collection<StreamRule> getRules() {
    return rules();
  }

  @JsonIgnore
  public final Collection<AlertConditionSummary> getAlertConditions() {
    return alertConditions();
  }

  @JsonIgnore
  public final AlertReceivers getAlertReceivers() {
    return alertReceivers();
  }

  @JsonIgnore
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  @Nullable
  public final String getContentPack() {
    return contentPack();
  }

  @JsonIgnore
  @Nullable
  public final Boolean isIsDefault() {
    return isDefault();
  }

  @JsonIgnore
  public final boolean isRemoveMatchesFromDefaultStream() {
    return removeMatchesFromDefaultStream();
  }

  @JsonIgnore
  public final String getIndexSetId() {
    return indexSetId();
  }

  @JsonIgnore
  public final Boolean isIsFavoriteStream() {
    return isFavoriteStream();
  }
}
