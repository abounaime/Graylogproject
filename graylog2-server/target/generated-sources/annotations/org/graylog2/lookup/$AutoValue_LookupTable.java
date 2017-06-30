
package org.graylog2.lookup;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.graylog2.plugin.lookup.LookupCache;
import org.graylog2.plugin.lookup.LookupDataAdapter;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_LookupTable extends LookupTable {

  private final String id;
  private final String title;
  private final String description;
  private final String name;
  private final LookupCache cache;
  private final LookupDataAdapter dataAdapter;

  $AutoValue_LookupTable(
      @Nullable String id,
      String title,
      String description,
      String name,
      LookupCache cache,
      LookupDataAdapter dataAdapter) {
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
    if (cache == null) {
      throw new NullPointerException("Null cache");
    }
    this.cache = cache;
    if (dataAdapter == null) {
      throw new NullPointerException("Null dataAdapter");
    }
    this.dataAdapter = dataAdapter;
  }

  @Nullable
  @Override
  public String id() {
    return id;
  }

  @Override
  public String title() {
    return title;
  }

  @Override
  public String description() {
    return description;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public LookupCache cache() {
    return cache;
  }

  @Override
  public LookupDataAdapter dataAdapter() {
    return dataAdapter;
  }

  @Override
  public String toString() {
    return "LookupTable{"
        + "id=" + id + ", "
        + "title=" + title + ", "
        + "description=" + description + ", "
        + "name=" + name + ", "
        + "cache=" + cache + ", "
        + "dataAdapter=" + dataAdapter
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LookupTable) {
      LookupTable that = (LookupTable) o;
      return ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && (this.title.equals(that.title()))
           && (this.description.equals(that.description()))
           && (this.name.equals(that.name()))
           && (this.cache.equals(that.cache()))
           && (this.dataAdapter.equals(that.dataAdapter()));
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
    h ^= this.cache.hashCode();
    h *= 1000003;
    h ^= this.dataAdapter.hashCode();
    return h;
  }

  static final class Builder extends LookupTable.Builder {
    private String id;
    private String title;
    private String description;
    private String name;
    private LookupCache cache;
    private LookupDataAdapter dataAdapter;
    Builder() {
    }
    @Override
    public LookupTable.Builder id(@Nullable String id) {
      this.id = id;
      return this;
    }
    @Override
    public LookupTable.Builder title(String title) {
      if (title == null) {
        throw new NullPointerException("Null title");
      }
      this.title = title;
      return this;
    }
    @Override
    public LookupTable.Builder description(String description) {
      if (description == null) {
        throw new NullPointerException("Null description");
      }
      this.description = description;
      return this;
    }
    @Override
    public LookupTable.Builder name(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public LookupTable.Builder cache(LookupCache cache) {
      if (cache == null) {
        throw new NullPointerException("Null cache");
      }
      this.cache = cache;
      return this;
    }
    @Override
    public LookupTable.Builder dataAdapter(LookupDataAdapter dataAdapter) {
      if (dataAdapter == null) {
        throw new NullPointerException("Null dataAdapter");
      }
      this.dataAdapter = dataAdapter;
      return this;
    }
    @Override
    public LookupTable build() {
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
      if (this.cache == null) {
        missing += " cache";
      }
      if (this.dataAdapter == null) {
        missing += " dataAdapter";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_LookupTable(
          this.id,
          this.title,
          this.description,
          this.name,
          this.cache,
          this.dataAdapter);
    }
  }

}
