
package org.graylog2.indexer.indexset;

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
import org.mongojack.Id;
import org.mongojack.ObjectId;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexSetConfig extends IndexSetConfig {

  private final String id;
  private final String title;
  private final String description;
  private final boolean isWritable;
  private final String indexPrefix;
  private final String indexMatchPattern;
  private final String indexWildcard;
  private final int shards;
  private final int replicas;
  private final String rotationStrategyClass;
  private final RotationStrategyConfig rotationStrategy;
  private final String retentionStrategyClass;
  private final RetentionStrategyConfig retentionStrategy;
  private final ZonedDateTime creationDate;
  private final String indexAnalyzer;
  private final String indexTemplateName;
  private final int indexOptimizationMaxNumSegments;
  private final boolean indexOptimizationDisabled;

  $AutoValue_IndexSetConfig(
      @Nullable String id,
      String title,
      @Nullable String description,
      boolean isWritable,
      String indexPrefix,
      @Nullable String indexMatchPattern,
      @Nullable String indexWildcard,
      int shards,
      int replicas,
      @Nullable String rotationStrategyClass,
      RotationStrategyConfig rotationStrategy,
      @Nullable String retentionStrategyClass,
      RetentionStrategyConfig retentionStrategy,
      ZonedDateTime creationDate,
      String indexAnalyzer,
      String indexTemplateName,
      int indexOptimizationMaxNumSegments,
      boolean indexOptimizationDisabled) {
    this.id = id;
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    this.description = description;
    this.isWritable = isWritable;
    if (indexPrefix == null) {
      throw new NullPointerException("Null indexPrefix");
    }
    this.indexPrefix = indexPrefix;
    this.indexMatchPattern = indexMatchPattern;
    this.indexWildcard = indexWildcard;
    this.shards = shards;
    this.replicas = replicas;
    this.rotationStrategyClass = rotationStrategyClass;
    if (rotationStrategy == null) {
      throw new NullPointerException("Null rotationStrategy");
    }
    this.rotationStrategy = rotationStrategy;
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
    if (indexTemplateName == null) {
      throw new NullPointerException("Null indexTemplateName");
    }
    this.indexTemplateName = indexTemplateName;
    this.indexOptimizationMaxNumSegments = indexOptimizationMaxNumSegments;
    this.indexOptimizationDisabled = indexOptimizationDisabled;
  }

  @JsonProperty(value = "id")
  @Nullable
  @Id
  @ObjectId
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

  @JsonProperty(value = "writable")
  @Override
  public boolean isWritable() {
    return isWritable;
  }

  @JsonProperty(value = "index_prefix")
  @NotBlank
  @Pattern(regexp = "^[a-z0-9][a-z0-9_+-]*$")
  @Override
  public String indexPrefix() {
    return indexPrefix;
  }

  @JsonProperty(value = "index_match_pattern")
  @Nullable
  @Override
  public String indexMatchPattern() {
    return indexMatchPattern;
  }

  @JsonProperty(value = "index_wildcard")
  @Nullable
  @Override
  public String indexWildcard() {
    return indexWildcard;
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
  @Nullable
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
  @Nullable
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

  @JsonProperty(value = "index_template_name")
  @NotBlank
  @Override
  public String indexTemplateName() {
    return indexTemplateName;
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
    return "IndexSetConfig{"
        + "id=" + id + ", "
        + "title=" + title + ", "
        + "description=" + description + ", "
        + "isWritable=" + isWritable + ", "
        + "indexPrefix=" + indexPrefix + ", "
        + "indexMatchPattern=" + indexMatchPattern + ", "
        + "indexWildcard=" + indexWildcard + ", "
        + "shards=" + shards + ", "
        + "replicas=" + replicas + ", "
        + "rotationStrategyClass=" + rotationStrategyClass + ", "
        + "rotationStrategy=" + rotationStrategy + ", "
        + "retentionStrategyClass=" + retentionStrategyClass + ", "
        + "retentionStrategy=" + retentionStrategy + ", "
        + "creationDate=" + creationDate + ", "
        + "indexAnalyzer=" + indexAnalyzer + ", "
        + "indexTemplateName=" + indexTemplateName + ", "
        + "indexOptimizationMaxNumSegments=" + indexOptimizationMaxNumSegments + ", "
        + "indexOptimizationDisabled=" + indexOptimizationDisabled
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexSetConfig) {
      IndexSetConfig that = (IndexSetConfig) o;
      return ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && (this.title.equals(that.title()))
           && ((this.description == null) ? (that.description() == null) : this.description.equals(that.description()))
           && (this.isWritable == that.isWritable())
           && (this.indexPrefix.equals(that.indexPrefix()))
           && ((this.indexMatchPattern == null) ? (that.indexMatchPattern() == null) : this.indexMatchPattern.equals(that.indexMatchPattern()))
           && ((this.indexWildcard == null) ? (that.indexWildcard() == null) : this.indexWildcard.equals(that.indexWildcard()))
           && (this.shards == that.shards())
           && (this.replicas == that.replicas())
           && ((this.rotationStrategyClass == null) ? (that.rotationStrategyClass() == null) : this.rotationStrategyClass.equals(that.rotationStrategyClass()))
           && (this.rotationStrategy.equals(that.rotationStrategy()))
           && ((this.retentionStrategyClass == null) ? (that.retentionStrategyClass() == null) : this.retentionStrategyClass.equals(that.retentionStrategyClass()))
           && (this.retentionStrategy.equals(that.retentionStrategy()))
           && (this.creationDate.equals(that.creationDate()))
           && (this.indexAnalyzer.equals(that.indexAnalyzer()))
           && (this.indexTemplateName.equals(that.indexTemplateName()))
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
    h ^= this.isWritable ? 1231 : 1237;
    h *= 1000003;
    h ^= this.indexPrefix.hashCode();
    h *= 1000003;
    h ^= (indexMatchPattern == null) ? 0 : this.indexMatchPattern.hashCode();
    h *= 1000003;
    h ^= (indexWildcard == null) ? 0 : this.indexWildcard.hashCode();
    h *= 1000003;
    h ^= this.shards;
    h *= 1000003;
    h ^= this.replicas;
    h *= 1000003;
    h ^= (rotationStrategyClass == null) ? 0 : this.rotationStrategyClass.hashCode();
    h *= 1000003;
    h ^= this.rotationStrategy.hashCode();
    h *= 1000003;
    h ^= (retentionStrategyClass == null) ? 0 : this.retentionStrategyClass.hashCode();
    h *= 1000003;
    h ^= this.retentionStrategy.hashCode();
    h *= 1000003;
    h ^= this.creationDate.hashCode();
    h *= 1000003;
    h ^= this.indexAnalyzer.hashCode();
    h *= 1000003;
    h ^= this.indexTemplateName.hashCode();
    h *= 1000003;
    h ^= this.indexOptimizationMaxNumSegments;
    h *= 1000003;
    h ^= this.indexOptimizationDisabled ? 1231 : 1237;
    return h;
  }

  @Override
  public IndexSetConfig.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends IndexSetConfig.Builder {
    private String id;
    private String title;
    private String description;
    private Boolean isWritable;
    private String indexPrefix;
    private String indexMatchPattern;
    private String indexWildcard;
    private Integer shards;
    private Integer replicas;
    private String rotationStrategyClass;
    private RotationStrategyConfig rotationStrategy;
    private String retentionStrategyClass;
    private RetentionStrategyConfig retentionStrategy;
    private ZonedDateTime creationDate;
    private String indexAnalyzer;
    private String indexTemplateName;
    private Integer indexOptimizationMaxNumSegments;
    private Boolean indexOptimizationDisabled;
    Builder() {
    }
    private Builder(IndexSetConfig source) {
      this.id = source.id();
      this.title = source.title();
      this.description = source.description();
      this.isWritable = source.isWritable();
      this.indexPrefix = source.indexPrefix();
      this.indexMatchPattern = source.indexMatchPattern();
      this.indexWildcard = source.indexWildcard();
      this.shards = source.shards();
      this.replicas = source.replicas();
      this.rotationStrategyClass = source.rotationStrategyClass();
      this.rotationStrategy = source.rotationStrategy();
      this.retentionStrategyClass = source.retentionStrategyClass();
      this.retentionStrategy = source.retentionStrategy();
      this.creationDate = source.creationDate();
      this.indexAnalyzer = source.indexAnalyzer();
      this.indexTemplateName = source.indexTemplateName();
      this.indexOptimizationMaxNumSegments = source.indexOptimizationMaxNumSegments();
      this.indexOptimizationDisabled = source.indexOptimizationDisabled();
    }
    @Override
    public IndexSetConfig.Builder id(@Nullable String id) {
      this.id = id;
      return this;
    }
    @Override
    public IndexSetConfig.Builder title(String title) {
      if (title == null) {
        throw new NullPointerException("Null title");
      }
      this.title = title;
      return this;
    }
    @Override
    public IndexSetConfig.Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }
    @Override
    public IndexSetConfig.Builder isWritable(boolean isWritable) {
      this.isWritable = isWritable;
      return this;
    }
    @Override
    public IndexSetConfig.Builder indexPrefix(String indexPrefix) {
      if (indexPrefix == null) {
        throw new NullPointerException("Null indexPrefix");
      }
      this.indexPrefix = indexPrefix;
      return this;
    }
    @Override
    public IndexSetConfig.Builder indexMatchPattern(@Nullable String indexMatchPattern) {
      this.indexMatchPattern = indexMatchPattern;
      return this;
    }
    @Override
    public IndexSetConfig.Builder indexWildcard(@Nullable String indexWildcard) {
      this.indexWildcard = indexWildcard;
      return this;
    }
    @Override
    public IndexSetConfig.Builder shards(int shards) {
      this.shards = shards;
      return this;
    }
    @Override
    public IndexSetConfig.Builder replicas(int replicas) {
      this.replicas = replicas;
      return this;
    }
    @Override
    public IndexSetConfig.Builder rotationStrategyClass(@Nullable String rotationStrategyClass) {
      this.rotationStrategyClass = rotationStrategyClass;
      return this;
    }
    @Override
    public IndexSetConfig.Builder rotationStrategy(RotationStrategyConfig rotationStrategy) {
      if (rotationStrategy == null) {
        throw new NullPointerException("Null rotationStrategy");
      }
      this.rotationStrategy = rotationStrategy;
      return this;
    }
    @Override
    public IndexSetConfig.Builder retentionStrategyClass(@Nullable String retentionStrategyClass) {
      this.retentionStrategyClass = retentionStrategyClass;
      return this;
    }
    @Override
    public IndexSetConfig.Builder retentionStrategy(RetentionStrategyConfig retentionStrategy) {
      if (retentionStrategy == null) {
        throw new NullPointerException("Null retentionStrategy");
      }
      this.retentionStrategy = retentionStrategy;
      return this;
    }
    @Override
    public IndexSetConfig.Builder creationDate(ZonedDateTime creationDate) {
      if (creationDate == null) {
        throw new NullPointerException("Null creationDate");
      }
      this.creationDate = creationDate;
      return this;
    }
    @Override
    public IndexSetConfig.Builder indexAnalyzer(String indexAnalyzer) {
      if (indexAnalyzer == null) {
        throw new NullPointerException("Null indexAnalyzer");
      }
      this.indexAnalyzer = indexAnalyzer;
      return this;
    }
    @Override
    public IndexSetConfig.Builder indexTemplateName(String indexTemplateName) {
      if (indexTemplateName == null) {
        throw new NullPointerException("Null indexTemplateName");
      }
      this.indexTemplateName = indexTemplateName;
      return this;
    }
    @Override
    public IndexSetConfig.Builder indexOptimizationMaxNumSegments(int indexOptimizationMaxNumSegments) {
      this.indexOptimizationMaxNumSegments = indexOptimizationMaxNumSegments;
      return this;
    }
    @Override
    public IndexSetConfig.Builder indexOptimizationDisabled(boolean indexOptimizationDisabled) {
      this.indexOptimizationDisabled = indexOptimizationDisabled;
      return this;
    }
    @Override
    public IndexSetConfig build() {
      String missing = "";
      if (this.title == null) {
        missing += " title";
      }
      if (this.isWritable == null) {
        missing += " isWritable";
      }
      if (this.indexPrefix == null) {
        missing += " indexPrefix";
      }
      if (this.shards == null) {
        missing += " shards";
      }
      if (this.replicas == null) {
        missing += " replicas";
      }
      if (this.rotationStrategy == null) {
        missing += " rotationStrategy";
      }
      if (this.retentionStrategy == null) {
        missing += " retentionStrategy";
      }
      if (this.creationDate == null) {
        missing += " creationDate";
      }
      if (this.indexAnalyzer == null) {
        missing += " indexAnalyzer";
      }
      if (this.indexTemplateName == null) {
        missing += " indexTemplateName";
      }
      if (this.indexOptimizationMaxNumSegments == null) {
        missing += " indexOptimizationMaxNumSegments";
      }
      if (this.indexOptimizationDisabled == null) {
        missing += " indexOptimizationDisabled";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_IndexSetConfig(
          this.id,
          this.title,
          this.description,
          this.isWritable,
          this.indexPrefix,
          this.indexMatchPattern,
          this.indexWildcard,
          this.shards,
          this.replicas,
          this.rotationStrategyClass,
          this.rotationStrategy,
          this.retentionStrategyClass,
          this.retentionStrategy,
          this.creationDate,
          this.indexAnalyzer,
          this.indexTemplateName,
          this.indexOptimizationMaxNumSegments,
          this.indexOptimizationDisabled);
    }
  }

}
