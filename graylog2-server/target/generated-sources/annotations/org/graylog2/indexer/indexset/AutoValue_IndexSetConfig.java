package org.graylog2.indexer.indexset;

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
import org.mongojack.Id;
import org.mongojack.ObjectId;

final class AutoValue_IndexSetConfig extends $AutoValue_IndexSetConfig {
  AutoValue_IndexSetConfig(String id, String title, String description, boolean isWritable,
      String indexPrefix, String indexMatchPattern, String indexWildcard, int shards, int replicas,
      String rotationStrategyClass, RotationStrategyConfig rotationStrategy,
      String retentionStrategyClass, RetentionStrategyConfig retentionStrategy,
      ZonedDateTime creationDate, String indexAnalyzer, String indexTemplateName,
      int indexOptimizationMaxNumSegments, boolean indexOptimizationDisabled) {
    super(id, title, description, isWritable, indexPrefix, indexMatchPattern, indexWildcard, shards, replicas, rotationStrategyClass, rotationStrategy, retentionStrategyClass, retentionStrategy, creationDate, indexAnalyzer, indexTemplateName, indexOptimizationMaxNumSegments, indexOptimizationDisabled);
  }

  @JsonIgnore
  @Nullable
  @Id
  @ObjectId
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
  public final boolean isIsWritable() {
    return isWritable();
  }

  @JsonIgnore
  @NotBlank
  @Pattern(
      regexp = "^[a-z0-9][a-z0-9_+-]*$"
  )
  public final String getIndexPrefix() {
    return indexPrefix();
  }

  @JsonIgnore
  @Nullable
  public final String getIndexMatchPattern() {
    return indexMatchPattern();
  }

  @JsonIgnore
  @Nullable
  public final String getIndexWildcard() {
    return indexWildcard();
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
  @Nullable
  public final String getRotationStrategyClass() {
    return rotationStrategyClass();
  }

  @JsonIgnore
  @NotNull
  public final RotationStrategyConfig getRotationStrategy() {
    return rotationStrategy();
  }

  @JsonIgnore
  @Nullable
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
  @NotBlank
  public final String getIndexTemplateName() {
    return indexTemplateName();
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
