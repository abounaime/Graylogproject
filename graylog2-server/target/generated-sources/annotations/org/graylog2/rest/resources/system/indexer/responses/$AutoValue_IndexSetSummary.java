
package org.graylog2.rest.resources.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.graylog2.plugin.indexer.retention.RetentionStrategyConfig;
import org.graylog2.plugin.indexer.rotation.RotationStrategyConfig;
import org.hibernate.validator.constraints.NotBlank;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexSetSummary extends IndexSetSummary {

  private final String id;
  private final String title;
  private final String description;
  private final boolean isDefault;
  private final boolean isWritable;
  private final String indexPrefix;
  private final int shards;
  private final int replicas;
  private final String rotationStrategyClass;
  private final RotationStrategyConfig rotationStrategy;
  private final String retentionStrategyClass;
  private final RetentionStrategyConfig retentionStrategy;
  private final ZonedDateTime creationDate;
  private final String indexAnalyzer;
  private final int indexOptimizationMaxNumSegments;
  private final boolean indexOptimizationDisabled;

  $AutoValue_IndexSetSummary(
      @Nullable String id,
      String title,
      @Nullable String description,
      boolean isDefault,
      boolean isWritable,
      String indexPrefix,
      int shards,
      int replicas,
      String rotationStrategyClass,
      RotationStrategyConfig rotationStrategy,
      String retentionStrategyClass,
      RetentionStrategyConfig retentionStrategy,
      ZonedDateTime creationDate,
      String indexAnalyzer,
      int indexOptimizationMaxNumSegments,
      boolean indexOptimizationDisabled) {
    this.id = id;
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    this.description = description;
    this.isDefault = isDefault;
    this.isWritable = isWritable;
    if (indexPrefix == null) {
      throw new NullPointerException("Null indexPrefix");
    }
    this.indexPrefix = indexPrefix;
    this.shards = shards;
    this.replicas = replicas;
    if (rotationStrategyClass == null) {
      throw new NullPointerException("Null rotationStrategyClass");
    }
    this.rotationStrategyClass = rotationStrategyClass;
    if (rotationStrategy == null) {
      throw new NullPointerException("Null rotationStrategy");
    }
    this.rotationStrategy = rotationStrategy;
    if (retentionStrategyClass == null) {
      throw new NullPointerException("Null retentionStrategyClass");
    }
    this.retentionStrategyClass = retentionStrategyClass;
    if (retentionStrategy == null) {
      throw new NullPointerException("Null retentionStrategy");
    }
    this.retentionStrategy = retentionStrategy;
    if (creationDate == null) {
      throw new NullPointerException("Null creationDate");
    }
    this.creationDate = creationDate;
    if (indexAnalyzer == null) {
      throw new NullPointerException("Null indexAnalyzer");
    }
    this.indexAnalyzer = indexAnalyzer;
    this.indexOptimizationMaxNumSegments = indexOptimizationMaxNumSegments;
    this.indexOptimizationDisabled = indexOptimizationDisabled;
  }

  @JsonProperty(value = "id")
  @Nullable
  @Override
  public String id() {
    return id;
  }

  @JsonProperty(value = "title")
  @NotBlank
  @Override
  public String title() {
    return title;
  }

  @JsonProperty(value = "description")
  @Nullable
  @Override
  public String description() {
    return description;
  }

  @JsonProperty(value = "default")
  @Override
  public boolean isDefault() {
    return isDefault;
  }

  @JsonProperty(value = "writable")
  @Override
  public boolean isWritable() {
    return isWritable;
  }

  @JsonProperty(value = "index_prefix")
  @Pattern(regexp = "^[a-z0-9][a-z0-9_+-]*$")
  @Override
  public String indexPrefix() {
    return indexPrefix;
  }

  @JsonProperty(value = "shards")
  @Min(value = 1L)
  @Override
  public int shards() {
    return shards;
  }

  @JsonProperty(value = "replicas")
  @Min(value = 0L)
  @Override
  public int replicas() {
    return replicas;
  }

  @JsonProperty(value = "rotation_strategy_class")
  @NotNull
  @Override
  public String rotationStrategyClass() {
    return rotationStrategyClass;
  }

  @JsonProperty(value = "rotation_strategy")
  @NotNull
  @Override
  public RotationStrategyConfig rotationStrategy() {
    return rotationStrategy;
  }

  @JsonProperty(value = "retention_strategy_class")
  @NotNull
  @Override
  public String retentionStrategyClass() {
    return retentionStrategyClass;
  }

  @JsonProperty(value = "retention_strategy")
  @NotNull
  @Override
  public RetentionStrategyConfig retentionStrategy() {
    return retentionStrategy;
  }

  @JsonProperty(value = "creation_date")
  @NotNull
  @Override
  public ZonedDateTime creationDate() {
    return creationDate;
  }

  @JsonProperty(value = "index_analyzer")
  @NotBlank
  @Override
  public String indexAnalyzer() {
    return indexAnalyzer;
  }

  @JsonProperty(value = "index_optimization_max_num_segments")
  @Min(value = 1L)
  @Override
  public int indexOptimizationMaxNumSegments() {
    return indexOptimizationMaxNumSegments;
  }

  @JsonProperty(value = "index_optimization_disabled")
  @Override
  public boolean indexOptimizationDisabled() {
    return indexOptimizationDisabled;
  }

  @Override
  public String toString() {
    return "IndexSetSummary{"
        + "id=" + id + ", "
        + "title=" + title + ", "
        + "description=" + description + ", "
        + "isDefault=" + isDefault + ", "
        + "isWritable=" + isWritable + ", "
        + "indexPrefix=" + indexPrefix + ", "
        + "shards=" + shards + ", "
        + "replicas=" + replicas + ", "
        + "rotationStrategyClass=" + rotationStrategyClass + ", "
        + "rotationStrategy=" + rotationStrategy + ", "
        + "retentionStrategyClass=" + retentionStrategyClass + ", "
        + "retentionStrategy=" + retentionStrategy + ", "
        + "creationDate=" + creationDate + ", "
        + "indexAnalyzer=" + indexAnalyzer + ", "
        + "indexOptimizationMaxNumSegments=" + indexOptimizationMaxNumSegments + ", "
        + "indexOptimizationDisabled=" + indexOptimizationDisabled
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexSetSummary) {
      IndexSetSummary that = (IndexSetSummary) o;
      return ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && (this.title.equals(that.title()))
           && ((this.description == null) ? (that.description() == null) : this.description.equals(that.description()))
           && (this.isDefault == that.isDefault())
           && (this.isWritable == that.isWritable())
           && (this.indexPrefix.equals(that.indexPrefix()))
           && (this.shards == that.shards())
           && (this.replicas == that.replicas())
           && (this.rotationStrategyClass.equals(that.rotationStrategyClass()))
           && (this.rotationStrategy.equals(that.rotationStrategy()))
           && (this.retentionStrategyClass.equals(that.retentionStrategyClass()))
           && (this.retentionStrategy.equals(that.retentionStrategy()))
           && (this.creationDate.equals(that.creationDate()))
           && (this.indexAnalyzer.equals(that.indexAnalyzer()))
           && (this.indexOptimizationMaxNumSegments == that.indexOptimizationMaxNumSegments())
           && (this.indexOptimizationDisabled == that.indexOptimizationDisabled());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (id == null) ? 0 : this.id.hashCode();
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= (description == null) ? 0 : this.description.hashCode();
    h *= 1000003;
    h ^= this.isDefault ? 1231 : 1237;
    h *= 1000003;
    h ^= this.isWritable ? 1231 : 1237;
    h *= 1000003;
    h ^= this.indexPrefix.hashCode();
    h *= 1000003;
    h ^= this.shards;
    h *= 1000003;
    h ^= this.replicas;
    h *= 1000003;
    h ^= this.rotationStrategyClass.hashCode();
    h *= 1000003;
    h ^= this.rotationStrategy.hashCode();
    h *= 1000003;
    h ^= this.retentionStrategyClass.hashCode();
    h *= 1000003;
    h ^= this.retentionStrategy.hashCode();
    h *= 1000003;
    h ^= this.creationDate.hashCode();
    h *= 1000003;
    h ^= this.indexAnalyzer.hashCode();
    h *= 1000003;
    h ^= this.indexOptimizationMaxNumSegments;
    h *= 1000003;
    h ^= this.indexOptimizationDisabled ? 1231 : 1237;
    return h;
  }

}
