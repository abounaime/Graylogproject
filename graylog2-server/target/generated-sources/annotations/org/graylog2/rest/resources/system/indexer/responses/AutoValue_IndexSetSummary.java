package org.graylog2.rest.resources.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.time.ZonedDateTime;
import javax.annotation.Nullable;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.graylog2.plugin.indexer.retention.RetentionStrategyConfig;
import org.graylog2.plugin.indexer.rotation.RotationStrategyConfig;
import org.hibernate.validator.constraints.NotBlank;

final class AutoValue_IndexSetSummary extends $AutoValue_IndexSetSummary {
  AutoValue_IndexSetSummary(String id, String title, String description, boolean isDefault,
      boolean isWritable, String indexPrefix, int shards, int replicas,
      String rotationStrategyClass, RotationStrategyConfig rotationStrategy,
      String retentionStrategyClass, RetentionStrategyConfig retentionStrategy,
      ZonedDateTime creationDate, String indexAnalyzer, int indexOptimizationMaxNumSegments,
      boolean indexOptimizationDisabled) {
    super(id, title, description, isDefault, isWritable, indexPrefix, shards, replicas, rotationStrategyClass, rotationStrategy, retentionStrategyClass, retentionStrategy, creationDate, indexAnalyzer, indexOptimizationMaxNumSegments, indexOptimizationDisabled);
  }

  @JsonIgnore
  @Nullable
  public final String getId() {
    return id();
  }

  @JsonIgnore
  @NotBlank
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  @Nullable
  public final String getDescription() {
    return description();
  }

  @JsonIgnore
  public final boolean isIsDefault() {
    return isDefault();
  }

  @JsonIgnore
  public final boolean isIsWritable() {
    return isWritable();
  }

  @JsonIgnore
  @Pattern(
      regexp = "^[a-z0-9][a-z0-9_+-]*$"
  )
  public final String getIndexPrefix() {
    return indexPrefix();
  }

  @JsonIgnore
  @Min(1)
  public final int getShards() {
    return shards();
  }

  @JsonIgnore
  @Min(0)
  public final int getReplicas() {
    return replicas();
  }

  @JsonIgnore
  @NotNull
  public final String getRotationStrategyClass() {
    return rotationStrategyClass();
  }

  @JsonIgnore
  @NotNull
  public final RotationStrategyConfig getRotationStrategy() {
    return rotationStrategy();
  }

  @JsonIgnore
  @NotNull
  public final String getRetentionStrategyClass() {
    return retentionStrategyClass();
  }

  @JsonIgnore
  @NotNull
  public final RetentionStrategyConfig getRetentionStrategy() {
    return retentionStrategy();
  }

  @JsonIgnore
  @NotNull
  public final ZonedDateTime getCreationDate() {
    return creationDate();
  }

  @JsonIgnore
  @NotBlank
  public final String getIndexAnalyzer() {
    return indexAnalyzer();
  }

  @JsonIgnore
  @Min(1)
  public final int getIndexOptimizationMaxNumSegments() {
    return indexOptimizationMaxNumSegments();
  }

  @JsonIgnore
  public final boolean isIndexOptimizationDisabled() {
    return indexOptimizationDisabled();
  }
}
