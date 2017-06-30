
package org.graylog2.plugin.utilities;

import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_FileInfo extends FileInfo {

  private final Object key;
  private final long size;
  private final FileTime modificationTime;
  private final Path path;

  private AutoValue_FileInfo(
      Object key,
      long size,
      FileTime modificationTime,
      Path path) {
    this.key = key;
    this.size = size;
    this.modificationTime = modificationTime;
    this.path = path;
  }

  @Override
  public Object key() {
    return key;
  }

  @Override
  public long size() {
    return size;
  }

  @Override
  public FileTime modificationTime() {
    return modificationTime;
  }

  @Override
  public Path path() {
    return path;
  }

  @Override
  public String toString() {
    return "FileInfo{"
        + "key=" + key + ", "
        + "size=" + size + ", "
        + "modificationTime=" + modificationTime + ", "
        + "path=" + path
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FileInfo) {
      FileInfo that = (FileInfo) o;
      return (this.key.equals(that.key()))
           && (this.size == that.size())
           && (this.modificationTime.equals(that.modificationTime()))
           && (this.path.equals(that.path()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.key.hashCode();
    h *= 1000003;
    h ^= (this.size >>> 32) ^ this.size;
    h *= 1000003;
    h ^= this.modificationTime.hashCode();
    h *= 1000003;
    h ^= this.path.hashCode();
    return h;
  }

  static final class Builder extends FileInfo.Builder {
    private Object key;
    private Long size;
    private FileTime modificationTime;
    private Path path;
    Builder() {
    }
    @Override
    public FileInfo.Builder key(Object key) {
      if (key == null) {
        throw new NullPointerException("Null key");
      }
      this.key = key;
      return this;
    }
    @Override
    public FileInfo.Builder size(long size) {
      this.size = size;
      return this;
    }
    @Override
    public FileInfo.Builder modificationTime(FileTime modificationTime) {
      if (modificationTime == null) {
        throw new NullPointerException("Null modificationTime");
      }
      this.modificationTime = modificationTime;
      return this;
    }
    @Override
    public FileInfo.Builder path(Path path) {
      if (path == null) {
        throw new NullPointerException("Null path");
      }
      this.path = path;
      return this;
    }
    @Override
    public FileInfo build() {
      String missing = "";
      if (this.key == null) {
        missing += " key";
      }
      if (this.size == null) {
        missing += " size";
      }
      if (this.modificationTime == null) {
        missing += " modificationTime";
      }
      if (this.path == null) {
        missing += " path";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_FileInfo(
          this.key,
          this.size,
          this.modificationTime,
          this.path);
    }
  }

}
