package org.graylog2.indexer.ranges;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;
import org.bson.types.ObjectId;
import org.joda.time.DateTime;
import org.mongojack.Id;

final class AutoValue_MongoIndexRange extends $AutoValue_MongoIndexRange {
  AutoValue_MongoIndexRange(ObjectId id, String indexName, DateTime begin, DateTime end,
      DateTime calculatedAt, int calculationDuration, List<String> streamIds) {
    super(id, indexName, begin, end, calculatedAt, calculationDuration, streamIds);
  }

  @JsonIgnore
  @Id
  @Nullable
  public final ObjectId getId() {
    return id();
  }

  @JsonIgnore
  public final String getIndexName() {
    return indexName();
  }

  @JsonIgnore
  public final DateTime getBegin() {
    return begin();
  }

  @JsonIgnore
  public final DateTime getEnd() {
    return end();
  }

  @JsonIgnore
  public final DateTime getCalculatedAt() {
    return calculatedAt();
  }

  @JsonIgnore
  public final int getCalculationDuration() {
    return calculationDuration();
  }

  @JsonIgnore
  @Nullable
  public final List<String> getStreamIds() {
    return streamIds();
  }
}
