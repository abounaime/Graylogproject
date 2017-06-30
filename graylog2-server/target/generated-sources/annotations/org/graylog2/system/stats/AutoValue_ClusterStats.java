package org.graylog2.system.stats;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import org.graylog2.plugin.inputs.Extractor;
import org.graylog2.system.stats.elasticsearch.ElasticsearchStats;
import org.graylog2.system.stats.mongo.MongoStats;

final class AutoValue_ClusterStats extends $AutoValue_ClusterStats {
  AutoValue_ClusterStats(ElasticsearchStats elasticsearchStats, MongoStats mongoStats,
      long streamCount, long streamRuleCount, Map<String, Long> streamRuleCountByStream,
      long userCount, long outputCount, Map<String, Long> outputCountByType, long dashboardCount,
      long inputCount, long globalInputCount, Map<String, Long> inputCountByType,
      long extractorCount, Map<Extractor.Type, Long> extractorCountByType, long contentPackCount,
      LdapStats ldapStats, AlarmStats alarmStats) {
    super(elasticsearchStats, mongoStats, streamCount, streamRuleCount, streamRuleCountByStream, userCount, outputCount, outputCountByType, dashboardCount, inputCount, globalInputCount, inputCountByType, extractorCount, extractorCountByType, contentPackCount, ldapStats, alarmStats);
  }

  @JsonIgnore
  public final ElasticsearchStats getElasticsearchStats() {
    return elasticsearchStats();
  }

  @JsonIgnore
  public final MongoStats getMongoStats() {
    return mongoStats();
  }

  @JsonIgnore
  public final long getStreamCount() {
    return streamCount();
  }

  @JsonIgnore
  public final long getStreamRuleCount() {
    return streamRuleCount();
  }

  @JsonIgnore
  public final Map<String, Long> getStreamRuleCountByStream() {
    return streamRuleCountByStream();
  }

  @JsonIgnore
  public final long getUserCount() {
    return userCount();
  }

  @JsonIgnore
  public final long getOutputCount() {
    return outputCount();
  }

  @JsonIgnore
  public final Map<String, Long> getOutputCountByType() {
    return outputCountByType();
  }

  @JsonIgnore
  public final long getDashboardCount() {
    return dashboardCount();
  }

  @JsonIgnore
  public final long getInputCount() {
    return inputCount();
  }

  @JsonIgnore
  public final long getGlobalInputCount() {
    return globalInputCount();
  }

  @JsonIgnore
  public final Map<String, Long> getInputCountByType() {
    return inputCountByType();
  }

  @JsonIgnore
  public final long getExtractorCount() {
    return extractorCount();
  }

  @JsonIgnore
  public final Map<Extractor.Type, Long> getExtractorCountByType() {
    return extractorCountByType();
  }

  @JsonIgnore
  public final long getContentPackCount() {
    return contentPackCount();
  }

  @JsonIgnore
  public final LdapStats getLdapStats() {
    return ldapStats();
  }

  @JsonIgnore
  public final AlarmStats getAlarmStats() {
    return alarmStats();
  }
}
