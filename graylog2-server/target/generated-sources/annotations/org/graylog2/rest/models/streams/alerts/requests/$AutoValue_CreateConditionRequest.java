
package org.graylog2.rest.models.streams.alerts.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CreateConditionRequest extends CreateConditionRequest {

  private final String type;
  private final String title;
  private final Map<String, Object> parameters;

  $AutoValue_CreateConditionRequest(
      @Nullable String type,
      @Nullable String title,
      Map<String, Object> parameters) {
    this.type = type;
    this.title = title;
    if (parameters == null) {
      throw new NullPointerException("Null parameters");
    }
    this.parameters = parameters;
  }

  @JsonProperty(value = "type")
  @Nullable
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "title")
  @Nullable
  @Override
  public String title() {
    return title;
  }

  @JsonProperty(value = "parameters")
  @Override
  public Map<String, Object> parameters() {
    return parameters;
  }

  @Override
  public String toString() {
    return "CreateConditionRequest{"
        + "type=" + type + ", "
        + "title=" + title + ", "
        + "parameters=" + parameters
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateConditionRequest) {
      CreateConditionRequest that = (CreateConditionRequest) o;
      return ((this.type == null) ? (that.type() == null) : this.type.equals(that.type()))
           && ((this.title == null) ? (that.title() == null) : this.title.equals(that.title()))
           && (this.parameters.equals(that.parameters()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (type == null) ? 0 : this.type.hashCode();
    h *= 1000003;
    h ^= (title == null) ? 0 : this.title.hashCode();
    h *= 1000003;
    h ^= this.parameters.hashCode();
    return h;
  }

  @Override
  public CreateConditionRequest.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends CreateConditionRequest.Builder {
    private String type;
    private String title;
    private Map<String, Object> parameters;
    Builder() {
    }
    private Builder(CreateConditionRequest source) {
      this.type = source.type();
      this.title = source.title();
      this.parameters = source.parameters();
    }
    @Override
    public CreateConditionRequest.Builder setType(@Nullable String type) {
      this.type = type;
      return this;
    }
    @Override
    public CreateConditionRequest.Builder setTitle(@Nullable String title) {
      this.title = title;
      return this;
    }
    @Override
    public CreateConditionRequest.Builder setParameters(Map<String, Object> parameters) {
      if (parameters == null) {
        throw new NullPointerException("Null parameters");
      }
      this.parameters = parameters;
      return this;
    }
    @Override
    public CreateConditionRequest build() {
      String missing = "";
      if (this.parameters == null) {
        missing += " parameters";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_CreateConditionRequest(
          this.type,
          this.title,
          this.parameters);
    }
  }

}
