
package org.graylog2.rest.models.system.loggers.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SingleSubsystemSummary extends SingleSubsystemSummary {

  private final String title;
  private final String category;
  private final String description;
  private final String level;
  private final int levelSyslog;

  $AutoValue_SingleSubsystemSummary(
      String title,
      String category,
      String description,
      String level,
      int levelSyslog) {
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    if (category == null) {
      throw new NullPointerException("Null category");
    }
    this.category = category;
    if (description == null) {
      throw new NullPointerException("Null description");
    }
    this.description = description;
    if (level == null) {
      throw new NullPointerException("Null level");
    }
    this.level = level;
    this.levelSyslog = levelSyslog;
  }

  @JsonProperty
  @Override
  public String title() {
    return title;
  }

  @JsonProperty
  @Override
  public String category() {
    return category;
  }

  @JsonProperty
  @Override
  public String description() {
    return description;
  }

  @JsonProperty
  @Override
  public String level() {
    return level;
  }

  @JsonProperty(value = "level_syslog")
  @Override
  public int levelSyslog() {
    return levelSyslog;
  }

  @Override
  public String toString() {
    return "SingleSubsystemSummary{"
        + "title=" + title + ", "
        + "category=" + category + ", "
        + "description=" + description + ", "
        + "level=" + level + ", "
        + "levelSyslog=" + levelSyslog
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SingleSubsystemSummary) {
      SingleSubsystemSummary that = (SingleSubsystemSummary) o;
      return (this.title.equals(that.title()))
           && (this.category.equals(that.category()))
           && (this.description.equals(that.description()))
           && (this.level.equals(that.level()))
           && (this.levelSyslog == that.levelSyslog());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= this.category.hashCode();
    h *= 1000003;
    h ^= this.description.hashCode();
    h *= 1000003;
    h ^= this.level.hashCode();
    h *= 1000003;
    h ^= this.levelSyslog;
    return h;
  }

}
