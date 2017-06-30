package org.graylog2.rest.resources.search.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_QueryParseError extends $AutoValue_QueryParseError {
  AutoValue_QueryParseError(String query, Integer beginColumn, Integer beginLine, Integer endColumn,
      Integer endLine, String message, String exceptionName) {
    super(query, beginColumn, beginLine, endColumn, endLine, message, exceptionName);
  }

  @JsonIgnore
  public final String getQuery() {
    return query();
  }

  @JsonIgnore
  @Nullable
  public final Integer getBeginColumn() {
    return beginColumn();
  }

  @JsonIgnore
  @Nullable
  public final Integer getBeginLine() {
    return beginLine();
  }

  @JsonIgnore
  @Nullable
  public final Integer getEndColumn() {
    return endColumn();
  }

  @JsonIgnore
  @Nullable
  public final Integer getEndLine() {
    return endLine();
  }

  @JsonIgnore
  @Nullable
  public final String getMessage() {
    return message();
  }

  @JsonIgnore
  public final String getExceptionName() {
    return exceptionName();
  }
}
