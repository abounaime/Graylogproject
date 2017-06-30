package org.graylog2.lookup.adapters;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

final class AutoValue_CSVFileDataAdapter_Config extends $AutoValue_CSVFileDataAdapter_Config {
  AutoValue_CSVFileDataAdapter_Config(String type, String path, String separator, String quotechar,
      String keyColumn, String valueColumn, long checkInterval) {
    super(type, path, separator, quotechar, keyColumn, valueColumn, checkInterval);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  @NotEmpty
  public final String getPath() {
    return path();
  }

  @JsonIgnore
  @Size(
      min = 1,
      max = 1
  )
  @NotEmpty
  public final String getSeparator() {
    return separator();
  }

  @JsonIgnore
  @Size(
      min = 1,
      max = 1
  )
  @NotEmpty
  public final String getQuotechar() {
    return quotechar();
  }

  @JsonIgnore
  @NotEmpty
  public final String getKeyColumn() {
    return keyColumn();
  }

  @JsonIgnore
  @NotEmpty
  public final String getValueColumn() {
    return valueColumn();
  }

  @JsonIgnore
  @Min(1)
  public final long getCheckInterval() {
    return checkInterval();
  }
}
