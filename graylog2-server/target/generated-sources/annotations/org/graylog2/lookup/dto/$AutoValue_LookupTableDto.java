
package org.graylog2.lookup.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.mongojack.Id;
import org.mongojack.ObjectId;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_LookupTableDto extends LookupTableDto {

  private final String id;
  private final String title;
  private final String description;
  private final String name;
  private final String cacheId;
  private final String dataAdapterId;

  $AutoValue_LookupTableDto(
      @Nullable String id,
      String title,
      String description,
      String name,
      String cacheId,
      String dataAdapterId) {
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
    if (cacheId == null) {
      throw new NullPointerException("Null cacheId");
    }
    this.cacheId = cacheId;
    if (dataAdapterId == null) {
      throw new NullPointerException("Null dataAdapterId");
    }
    this.dataAdapterId = dataAdapterId;
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

  @ObjectId
  @JsonProperty(value = "cache")
  @Override
  public String cacheId() {
    return cacheId;
  }

  @ObjectId
  @JsonProperty(value = "data_adapter")
  @Override
  public String dataAdapterId() {
    return dataAdapterId;
  }

  @Override
  public String toString() {
    return "LookupTableDto{"
        + "id=" + id + ", "
        + "title=" + title + ", "
        + "description=" + description + ", "
        + "name=" + name + ", "
        + "cacheId=" + cacheId + ", "
        + "dataAdapterId=" + dataAdapterId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LookupTableDto) {
      LookupTableDto that = (LookupTableDto) o;
      return ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && (this.title.equals(that.title()))
           && (this.description.equals(that.description()))
           && (this.name.equals(that.name()))
           && (this.cacheId.equals(that.cacheId()))
           && (this.dataAdapterId.equals(that.dataAdapterId()));
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
    h ^= this.cacheId.hashCode();
    h *= 1000003;
    h ^= this.dataAdapterId.hashCode();
    return h;
  }

  static final class Builder extends LookupTableDto.Builder {
    private String id;
    private String title;
    private String description;
    private String name;
    private String cacheId;
    private String dataAdapterId;
    Builder() {
    }
    @Override
    public LookupTableDto.Builder id(@Nullable String id) {
      this.id = id;
      return this;
    }
    @Override
    public LookupTableDto.Builder title(String title) {
      if (title == null) {
        throw new NullPointerException("Null title");
      }
      this.title = title;
      return this;
    }
    @Override
    public LookupTableDto.Builder description(String description) {
      if (description == null) {
        throw new NullPointerException("Null description");
      }
      this.description = description;
      return this;
    }
    @Override
    public LookupTableDto.Builder name(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public LookupTableDto.Builder cacheId(String cacheId) {
      if (cacheId == null) {
        throw new NullPointerException("Null cacheId");
      }
      this.cacheId = cacheId;
      return this;
    }
    @Override
    public LookupTableDto.Builder dataAdapterId(String dataAdapterId) {
      if (dataAdapterId == null) {
        throw new NullPointerException("Null dataAdapterId");
      }
      this.dataAdapterId = dataAdapterId;
      return this;
    }
    @Override
    public LookupTableDto build() {
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
      if (this.cacheId == null) {
        missing += " cacheId";
      }
      if (this.dataAdapterId == null) {
        missing += " dataAdapterId";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_LookupTableDto(
          this.id,
          this.title,
          this.description,
          this.name,
          this.cacheId,
          this.dataAdapterId);
    }
  }

}
