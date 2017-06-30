
package org.graylog2.lookup.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.graylog2.plugin.lookup.LookupDataAdapterConfiguration;
import org.mongojack.Id;
import org.mongojack.ObjectId;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_DataAdapterDto extends DataAdapterDto {

  private final String id;
  private final String title;
  private final String description;
  private final String name;
  private final LookupDataAdapterConfiguration config;

  $AutoValue_DataAdapterDto(
      @Nullable String id,
      String title,
      String description,
      String name,
      LookupDataAdapterConfiguration config) {
    this.id = id;
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    if (description == null) {
      throw new NullPointerException("Null description");
    }
    this.description = description;
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (config == null) {
      throw new NullPointerException("Null config");
    }
    this.config = config;
  }

  @Id
  @ObjectId
  @Nullable
  @JsonProperty(value = "id")
  @Override
  public String id() {
    return id;
  }

  @JsonProperty(value = "title")
  @Override
  public String title() {
    return title;
  }

  @JsonProperty(value = "description")
  @Override
  public String description() {
    return description;
  }

  @JsonProperty(value = "name")
  @Override
  public String name() {
    return name;
  }

  @JsonProperty(value = "config")
  @Override
  public LookupDataAdapterConfiguration config() {
    return config;
  }

  @Override
  public String toString() {
    return "DataAdapterDto{"
        + "id=" + id + ", "
        + "title=" + title + ", "
        + "description=" + description + ", "
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DataAdapterDto) {
      DataAdapterDto that = (DataAdapterDto) o;
      return ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && (this.title.equals(that.title()))
           && (this.description.equals(that.description()))
           && (this.name.equals(that.name()))
           && (this.config.equals(that.config()));
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
    h ^= this.description.hashCode();
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.config.hashCode();
    return h;
  }

  static final class Builder extends DataAdapterDto.Builder {
    private String id;
    private String title;
    private String description;
    private String name;
    private LookupDataAdapterConfiguration config;
    Builder() {
    }
    @Override
    public DataAdapterDto.Builder id(@Nullable String id) {
      this.id = id;
      return this;
    }
    @Override
    public DataAdapterDto.Builder title(String title) {
      if (title == null) {
        throw new NullPointerException("Null title");
      }
      this.title = title;
      return this;
    }
    @Override
    public DataAdapterDto.Builder description(String description) {
      if (description == null) {
        throw new NullPointerException("Null description");
      }
      this.description = description;
      return this;
    }
    @Override
    public DataAdapterDto.Builder name(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public DataAdapterDto.Builder config(LookupDataAdapterConfiguration config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public DataAdapterDto build() {
      String missing = "";
      if (this.title == null) {
        missing += " title";
      }
      if (this.description == null) {
        missing += " description";
      }
      if (this.name == null) {
        missing += " name";
      }
      if (this.config == null) {
        missing += " config";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_DataAdapterDto(
          this.id,
          this.title,
          this.description,
          this.name,
          this.config);
    }
  }

}
