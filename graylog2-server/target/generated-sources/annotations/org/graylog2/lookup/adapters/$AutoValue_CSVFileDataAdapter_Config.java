
package org.graylog2.lookup.adapters;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CSVFileDataAdapter_Config extends CSVFileDataAdapter.Config {

  private final String type;
  private final String path;
  private final String separator;
  private final String quotechar;
  private final String keyColumn;
  private final String valueColumn;
  private final long checkInterval;

  $AutoValue_CSVFileDataAdapter_Config(
      String type,
      String path,
      String separator,
      String quotechar,
      String keyColumn,
      String valueColumn,
      long checkInterval) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (path == null) {
      throw new NullPointerException("Null path");
    }
    this.path = path;
    if (separator == null) {
      throw new NullPointerException("Null separator");
    }
    this.separator = separator;
    if (quotechar == null) {
      throw new NullPointerException("Null quotechar");
    }
    this.quotechar = quotechar;
    if (keyColumn == null) {
      throw new NullPointerException("Null keyColumn");
    }
    this.keyColumn = keyColumn;
    if (valueColumn == null) {
      throw new NullPointerException("Null valueColumn");
    }
    this.valueColumn = valueColumn;
    this.checkInterval = checkInterval;
  }

  @JsonProperty(value = "type")
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "path")
  @NotEmpty
  @Override
  public String path() {
    return path;
  }

  @JsonProperty(value = "separator")
  @Size(min = 1, max = 1)
  @NotEmpty
  @Override
  public String separator() {
    return separator;
  }

  @JsonProperty(value = "quotechar")
  @Size(min = 1, max = 1)
  @NotEmpty
  @Override
  public String quotechar() {
    return quotechar;
  }

  @JsonProperty(value = "key_column")
  @NotEmpty
  @Override
  public String keyColumn() {
    return keyColumn;
  }

  @JsonProperty(value = "value_column")
  @NotEmpty
  @Override
  public String valueColumn() {
    return valueColumn;
  }

  @JsonProperty(value = "check_interval")
  @Min(value = 1L)
  @Override
  public long checkInterval() {
    return checkInterval;
  }

  @Override
  public String toString() {
    return "Config{"
        + "type=" + type + ", "
        + "path=" + path + ", "
        + "separator=" + separator + ", "
        + "quotechar=" + quotechar + ", "
        + "keyColumn=" + keyColumn + ", "
        + "valueColumn=" + valueColumn + ", "
        + "checkInterval=" + checkInterval
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CSVFileDataAdapter.Config) {
      CSVFileDataAdapter.Config that = (CSVFileDataAdapter.Config) o;
      return (this.type.equals(that.type()))
           && (this.path.equals(that.path()))
           && (this.separator.equals(that.separator()))
           && (this.quotechar.equals(that.quotechar()))
           && (this.keyColumn.equals(that.keyColumn()))
           && (this.valueColumn.equals(that.valueColumn()))
           && (this.checkInterval == that.checkInterval());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.path.hashCode();
    h *= 1000003;
    h ^= this.separator.hashCode();
    h *= 1000003;
    h ^= this.quotechar.hashCode();
    h *= 1000003;
    h ^= this.keyColumn.hashCode();
    h *= 1000003;
    h ^= this.valueColumn.hashCode();
    h *= 1000003;
    h ^= (this.checkInterval >>> 32) ^ this.checkInterval;
    return h;
  }

  static final class Builder extends CSVFileDataAdapter.Config.Builder {
    private String type;
    private String path;
    private String separator;
    private String quotechar;
    private String keyColumn;
    private String valueColumn;
    private Long checkInterval;
    Builder() {
    }
    @Override
    public CSVFileDataAdapter.Config.Builder type(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public CSVFileDataAdapter.Config.Builder path(String path) {
      if (path == null) {
        throw new NullPointerException("Null path");
      }
      this.path = path;
      return this;
    }
    @Override
    public CSVFileDataAdapter.Config.Builder separator(String separator) {
      if (separator == null) {
        throw new NullPointerException("Null separator");
      }
      this.separator = separator;
      return this;
    }
    @Override
    public CSVFileDataAdapter.Config.Builder quotechar(String quotechar) {
      if (quotechar == null) {
        throw new NullPointerException("Null quotechar");
      }
      this.quotechar = quotechar;
      return this;
    }
    @Override
    public CSVFileDataAdapter.Config.Builder keyColumn(String keyColumn) {
      if (keyColumn == null) {
        throw new NullPointerException("Null keyColumn");
      }
      this.keyColumn = keyColumn;
      return this;
    }
    @Override
    public CSVFileDataAdapter.Config.Builder valueColumn(String valueColumn) {
      if (valueColumn == null) {
        throw new NullPointerException("Null valueColumn");
      }
      this.valueColumn = valueColumn;
      return this;
    }
    @Override
    public CSVFileDataAdapter.Config.Builder checkInterval(long checkInterval) {
      this.checkInterval = checkInterval;
      return this;
    }
    @Override
    public CSVFileDataAdapter.Config build() {
      String missing = "";
      if (this.type == null) {
        missing += " type";
      }
      if (this.path == null) {
        missing += " path";
      }
      if (this.separator == null) {
        missing += " separator";
      }
      if (this.quotechar == null) {
        missing += " quotechar";
      }
      if (this.keyColumn == null) {
        missing += " keyColumn";
      }
      if (this.valueColumn == null) {
        missing += " valueColumn";
      }
      if (this.checkInterval == null) {
        missing += " checkInterval";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_CSVFileDataAdapter_Config(
          this.type,
          this.path,
          this.separator,
          this.quotechar,
          this.keyColumn,
          this.valueColumn,
          this.checkInterval);
    }
  }

}
