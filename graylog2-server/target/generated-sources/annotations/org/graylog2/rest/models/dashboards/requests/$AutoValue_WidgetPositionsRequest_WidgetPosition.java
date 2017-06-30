
package org.graylog2.rest.models.dashboards.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_WidgetPositionsRequest_WidgetPosition extends WidgetPositionsRequest.WidgetPosition {

  private final String id;
  private final int col;
  private final int row;
  private final int height;
  private final int width;

  $AutoValue_WidgetPositionsRequest_WidgetPosition(
      String id,
      int col,
      int row,
      int height,
      int width) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    this.col = col;
    this.row = row;
    this.height = height;
    this.width = width;
  }

  @JsonProperty
  @Override
  public String id() {
    return id;
  }

  @JsonProperty
  @Override
  public int col() {
    return col;
  }

  @JsonProperty
  @Override
  public int row() {
    return row;
  }

  @JsonProperty
  @Override
  public int height() {
    return height;
  }

  @JsonProperty
  @Override
  public int width() {
    return width;
  }

  @Override
  public String toString() {
    return "WidgetPosition{"
        + "id=" + id + ", "
        + "col=" + col + ", "
        + "row=" + row + ", "
        + "height=" + height + ", "
        + "width=" + width
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof WidgetPositionsRequest.WidgetPosition) {
      WidgetPositionsRequest.WidgetPosition that = (WidgetPositionsRequest.WidgetPosition) o;
      return (this.id.equals(that.id()))
           && (this.col == that.col())
           && (this.row == that.row())
           && (this.height == that.height())
           && (this.width == that.width());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    h *= 1000003;
    h ^= this.col;
    h *= 1000003;
    h ^= this.row;
    h *= 1000003;
    h ^= this.height;
    h *= 1000003;
    h ^= this.width;
    return h;
  }

}
