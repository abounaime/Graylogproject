
package org.graylog2.system.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;
import org.graylog2.plugin.inputs.Extractor;
import org.graylog2.system.stats.elasticsearch.ElasticsearchStats;
import org.graylog2.system.stats.mongo.MongoStats;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ClusterStats extends ClusterStats {

  private final ElasticsearchStats elasticsearchStats;
  private final MongoStats mongoStats;
  private final long streamCount;
  private final long streamRuleCount;
  private final Map<String, Long> streamRuleCountByStream;
  private final long userCount;
  private final long outputCount;
  private final Map<String, Long> outputCountByType;
  private final long dashboardCount;
  private final long inputCount;
  private final long globalInputCount;
  private final Map<String, Long> inputCountByType;
  private final long extractorCount;
  private final Map<Extractor.Type, Long> extractorCountByType;
  private final long contentPackCount;
  private final LdapStats ldapStats;
  private final AlarmStats alarmStats;

  $AutoValue_ClusterStats(
      ElasticsearchStats elasticsearchStats,
      MongoStats mongoStats,
      long streamCount,
      long streamRuleCount,
      Map<String, Long> streamRuleCountByStream,
      long userCount,
      long outputCount,
      Map<String, Long> outputCountByType,
      long dashboardCount,
      long inputCount,
      long globalInputCount,
      Map<String, Long> inputCountByType,
      long extractorCount,
      Map<Extractor.Type, Long> extractorCountByType,
      long contentPackCount,
      LdapStats ldapStats,
      AlarmStats alarmStats) {
    if (elasticsearchStats == null) {
      throw new NullPointerException("Null elasticsearchStats");
    }
    this.elasticsearchStats = elasticsearchStats;
    if (mongoStats == null) {
      throw new NullPointerException("Null mongoStats");
    }
    this.mongoStats = mongoStats;
    this.streamCount = streamCount;
    this.streamRuleCount = streamRuleCount;
    if (streamRuleCountByStream == null) {
      throw new NullPointerException("Null streamRuleCountByStream");
    }
    this.streamRuleCountByStream = streamRuleCountByStream;
    this.userCount = userCount;
    this.outputCount = outputCount;
    if (outputCountByType == null) {
      throw new NullPointerException("Null outputCountByType");
    }
    this.outputCountByType = outputCountByType;
    this.dashboardCount = dashboardCount;
    this.inputCount = inputCount;
    this.globalInputCount = globalInputCount;
    if (inputCountByType == null) {
      throw new NullPointerException("Null inputCountByType");
    }
    this.inputCountByType = inputCountByType;
    this.extractorCount = extractorCount;
    if (extractorCountByType == null) {
      throw new NullPointerException("Null extractorCountByType");
    }
    this.extractorCountByType = extractorCountByType;
    this.contentPackCount = contentPackCount;
    if (ldapStats == null) {
      throw new NullPointerException("Null ldapStats");
    }
    this.ldapStats = ldapStats;
    if (alarmStats == null) {
      throw new NullPointerException("Null alarmStats");
    }
    this.alarmStats = alarmStats;
  }

  @JsonProperty(value = "elasticsearch")
  @Override
  public ElasticsearchStats elasticsearchStats() {
    return elasticsearchStats;
  }

  @JsonProperty(value = "mongo")
  @Override
  public MongoStats mongoStats() {
    return mongoStats;
  }

  @JsonProperty
  @Override
  public long streamCount() {
    return streamCount;
  }

  @JsonProperty
  @Override
  public long streamRuleCount() {
    return streamRuleCount;
  }

  @JsonProperty
  @Override
  public Map<String, Long> streamRuleCountByStream() {
    return streamRuleCountByStream;
  }

  @JsonProperty
  @Override
  public long userCount() {
    return userCount;
  }

  @JsonProperty
  @Override
  public long outputCount() {
    return outputCount;
  }

  @JsonProperty
  @Override
  public Map<String, Long> outputCountByType() {
    return outputCountByType;
  }

  @JsonProperty
  @Override
  public long dashboardCount() {
    return dashboardCount;
  }

  @JsonProperty
  @Override
  public long inputCount() {
    return inputCount;
  }

  @JsonProperty
  @Override
  public long globalInputCount() {
    return globalInputCount;
  }

  @JsonProperty
  @Override
  public Map<String, Long> inputCountByType() {
    return inputCountByType;
  }

  @JsonProperty
  @Override
  public long extractorCount() {
    return extractorCount;
  }

  @JsonProperty
  @Override
  public Map<Extractor.Type, Long> extractorCountByType() {
    return extractorCountByType;
  }

  @JsonProperty
  @Override
  public long contentPackCount() {
    return contentPackCount;
  }

  @JsonProperty
  @Override
  public LdapStats ldapStats() {
    return ldapStats;
  }

  @JsonProperty
  @Override
  public AlarmStats alarmStats() {
    return alarmStats;
  }

  @Override
  public String toString() {
    return "ClusterStats{"
        + "elasticsearchStats=" + elasticsearchStats + ", "
        + "mongoStats=" + mongoStats + ", "
        + "streamCount=" + streamCount + ", "
        + "streamRuleCount=" + streamRuleCount + ", "
        + "streamRuleCountByStream=" + streamRuleCountByStream + ", "
        + "userCount=" + userCount + ", "
        + "outputCount=" + outputCount + ", "
        + "outputCountByType=" + outputCountByType + ", "
        + "dashboardCount=" + dashboardCount + ", "
        + "inputCount=" + inputCount + ", "
        + "globalInputCount=" + globalInputCount + ", "
        + "inputCountByType=" + inputCountByType + ", "
        + "extractorCount=" + extractorCount + ", "
        + "extractorCountByType=" + extractorCountByType + ", "
        + "contentPackCount=" + contentPackCount + ", "
        + "ldapStats=" + ldapStats + ", "
        + "alarmStats=" + alarmStats
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClusterStats) {
      ClusterStats that = (ClusterStats) o;
      return (this.elasticsearchStats.equals(that.elasticsearchStats()))
           && (this.mongoStats.equals(that.mongoStats()))
           && (this.streamCount == that.streamCount())
           && (this.streamRuleCount == that.streamRuleCount())
           && (this.streamRuleCountByStream.equals(that.streamRuleCountByStream()))
           && (this.userCount == that.userCount())
           && (this.outputCount == that.outputCount())
           && (this.outputCountByType.equals(that.outputCountByType()))
           && (this.dashboardCount == that.dashboardCount())
           && (this.inputCount == that.inputCount())
           && (this.globalInputCount == that.globalInputCount())
           && (this.inputCountByType.equals(that.inputCountByType()))
           && (this.extractorCount == that.extractorCount())
           && (this.extractorCountByType.equals(that.extractorCountByType()))
           && (this.contentPackCount == that.contentPackCount())
           && (this.ldapStats.equals(that.ldapStats()))
           && (this.alarmStats.equals(that.alarmStats()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.elasticsearchStats.hashCode();
    h *= 1000003;
    h ^= this.mongoStats.hashCode();
    h *= 1000003;
    h ^= (this.streamCount >>> 32) ^ this.streamCount;
    h *= 1000003;
    h ^= (this.streamRuleCount >>> 32) ^ this.streamRuleCount;
    h *= 1000003;
    h ^= this.streamRuleCountByStream.hashCode();
    h *= 1000003;
    h ^= (this.userCount >>> 32) ^ this.userCount;
    h *= 1000003;
    h ^= (this.outputCount >>> 32) ^ this.outputCount;
    h *= 1000003;
    h ^= this.outputCountByType.hashCode();
    h *= 1000003;
    h ^= (this.dashboardCount >>> 32) ^ this.dashboardCount;
    h *= 1000003;
    h ^= (this.inputCount >>> 32) ^ this.inputCount;
    h *= 1000003;
    h ^= (this.globalInputCount >>> 32) ^ this.globalInputCount;
    h *= 1000003;
    h ^= this.inputCountByType.hashCode();
    h *= 1000003;
    h ^= (this.extractorCount >>> 32) ^ this.extractorCount;
    h *= 1000003;
    h ^= this.extractorCountByType.hashCode();
    h *= 1000003;
    h ^= (this.contentPackCount >>> 32) ^ this.contentPackCount;
    h *= 1000003;
    h ^= this.ldapStats.hashCode();
    h *= 1000003;
    h ^= this.alarmStats.hashCode();
    return h;
  }

}
