package org.graylog2.rest.resources.streams.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;

final class AutoValue_StreamListResponse extends $AutoValue_StreamListResponse {
  AutoValue_StreamListResponse(long total, Collection<StreamResponse> streams) {
    super(total, streams);
  }

  @JsonIgnore
  public final long getTotal() {
    return total();
  }

  @JsonIgnore
  public final Collection<StreamResponse> getStreams() {
    return streams();
  }
}
