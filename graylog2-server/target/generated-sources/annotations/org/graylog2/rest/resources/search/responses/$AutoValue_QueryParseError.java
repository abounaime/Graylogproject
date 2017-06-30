
package org.graylog2.rest.resources.search.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_QueryParseError extends QueryParseError {

  private final String query;
  private final Integer beginColumn;
  private final Integer beginLine;
  private final Integer endColumn;
  private final Integer endLine;
  private final String message;
  private final String exceptionName;

  $AutoValue_QueryParseError(
      String query,
      @Nullable Integer beginColumn,
      @Nullable Integer beginLine,
      @Nullable Integer endColumn,
      @Nullable Integer endLine,
      @Nullable String message,
      String exceptionName) {
    if (query == null) {
      throw new NullPointerException("Null query");
    }
    this.query = query;
    this.beginColumn = beginColumn;
    this.beginLine = beginLine;
    this.endColumn = endColumn;
    this.endLine = endLine;
    this.message = message;
    if (exceptionName == null) {
      throw new NullPointerException("Null exceptionName");
    }
    this.exceptionName = exceptionName;
  }

  @JsonProperty
  @Override
  public String query() {
    return query;
  }

  @JsonProperty
  @Nullable
  @Override
  public Integer beginColumn() {
    return beginColumn;
  }

  @JsonProperty
  @Nullable
  @Override
  public Integer beginLine() {
    return beginLine;
  }

  @JsonProperty
  @Nullable
  @Override
  public Integer endColumn() {
    return endColumn;
  }

  @JsonProperty
  @Nullable
  @Override
  public Integer endLine() {
    return endLine;
  }

  @JsonProperty
  @Nullable
  @Override
  public String message() {
    return message;
  }

  @JsonProperty
  @Override
  public String exceptionName() {
    return exceptionName;
  }

  @Override
  public String toString() {
    return "QueryParseError{"
        + "query=" + query + ", "
        + "beginColumn=" + beginColumn + ", "
        + "beginLine=" + beginLine + ", "
        + "endColumn=" + endColumn + ", "
        + "endLine=" + endLine + ", "
        + "message=" + message + ", "
        + "exceptionName=" + exceptionName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof QueryParseError) {
      QueryParseError that = (QueryParseError) o;
      return (this.query.equals(that.query()))
           && ((this.beginColumn == null) ? (that.beginColumn() == null) : this.beginColumn.equals(that.beginColumn()))
           && ((this.beginLine == null) ? (that.beginLine() == null) : this.beginLine.equals(that.beginLine()))
           && ((this.endColumn == null) ? (that.endColumn() == null) : this.endColumn.equals(that.endColumn()))
           && ((this.endLine == null) ? (that.endLine() == null) : this.endLine.equals(that.endLine()))
           && ((this.message == null) ? (that.message() == null) : this.message.equals(that.message()))
           && (this.exceptionName.equals(that.exceptionName()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.query.hashCode();
    h *= 1000003;
    h ^= (beginColumn == null) ? 0 : this.beginColumn.hashCode();
    h *= 1000003;
    h ^= (beginLine == null) ? 0 : this.beginLine.hashCode();
    h *= 1000003;
    h ^= (endColumn == null) ? 0 : this.endColumn.hashCode();
    h *= 1000003;
    h ^= (endLine == null) ? 0 : this.endLine.hashCode();
    h *= 1000003;
    h ^= (message == null) ? 0 : this.message.hashCode();
    h *= 1000003;
    h ^= this.exceptionName.hashCode();
    return h;
  }

}
