
package org.graylog2.indexer.ranges;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.bson.types.ObjectId;
import org.joda.time.DateTime;
import org.mongojack.Id;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MongoIndexRange extends MongoIndexRange {

  private final ObjectId id;
  private final String indexName;
  private final DateTime begin;
  private final DateTime end;
  private final DateTime calculatedAt;
  private final int calculationDuration;
  private final List<String> streamIds;

  $AutoValue_MongoIndexRange(
      @Nullable ObjectId id,
      String indexName,
      DateTime begin,
      DateTime end,
      DateTime calculatedAt,
      int calculationDuration,
      @Nullable List<String> streamIds) {
    this.id = id;
    if (indexName == null) {
      throw new NullPointerException("Null indexName");
    }
    this.indexName = indexName;
    if (begin == null) {
      throw new NullPointerException("Null begin");
    }
    this.begin = begin;
    if (end == null) {
      throw new NullPointerException("Null end");
    }
    this.end = end;
    if (calculatedAt == null) {
      throw new NullPointerException("Null calculatedAt");
    }
    this.calculatedAt = calculatedAt;
    this.calculationDuration = calculationDuration;
    this.streamIds = streamIds;
  }

  @Id
  @Nullable
  @JsonProperty(value = "_id")
  @Override
  public ObjectId id() {
    return id;
  }

  @JsonProperty(value = "index_name")
  @Override
  public String indexName() {
    return indexName;
  }

  @Override
  public DateTime begin() {
    return begin;
  }

  @Override
  public DateTime end() {
    return end;
  }

  @Override
  public DateTime calculatedAt() {
    return calculatedAt;
  }

  @JsonProperty(value = "took_ms")
  @Override
  public int calculationDuration() {
    return calculationDuration;
  }

  @JsonProperty(value = "stream_ids")
  @Nullable
  @Override
  public List<String> streamIds() {
    return streamIds;
  }

  @Override
  public String toString() {
    return "MongoIndexRange{"
        + "id=" + id + ", "
        + "indexName=" + indexName + ", "
        + "begin=" + begin + ", "
        + "end=" + end + ", "
        + "calculatedAt=" + calculatedAt + ", "
        + "calculationDuration=" + calculationDuration + ", "
        + "streamIds=" + streamIds
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MongoIndexRange) {
      MongoIndexRange that = (MongoIndexRange) o;
      return ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && (this.indexName.equals(that.indexName()))
           && (this.begin.equals(that.begin()))
           && (this.end.equals(that.end()))
           && (this.calculatedAt.equals(that.calculatedAt()))
           && (this.calculationDuration == that.calculationDuration())
           && ((this.streamIds == null) ? (that.streamIds() == null) : this.streamIds.equals(that.streamIds()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (id == null) ? 0 : this.id.hashCode();
    h *= 1000003;
    h ^= this.indexName.hashCode();
    h *= 1000003;
    h ^= this.begin.hashCode();
    h *= 1000003;
    h ^= this.end.hashCode();
    h *= 1000003;
    h ^= this.calculatedAt.hashCode();
    h *= 1000003;
    h ^= this.calculationDuration;
    h *= 1000003;
    h ^= (streamIds == null) ? 0 : this.streamIds.hashCode();
    return h;
  }

}
