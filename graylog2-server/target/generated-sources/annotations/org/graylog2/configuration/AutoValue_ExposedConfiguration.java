package org.graylog2.configuration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_ExposedConfiguration extends $AutoValue_ExposedConfiguration {
  AutoValue_ExposedConfiguration(int inputBufferProcessors, int processBufferProcessors,
      int outputBufferProcessors, String processorWaitStrategy, String inputBufferWaitStrategy,
      int inputBufferRingSize, int ringSize, String pluginDir, String nodeIdFile,
      boolean allowHighlighting, boolean allowLeadingWildcardSearches, long streamProcessingTimeout,
      int streamProcessingMaxFaults, long outputModuleTimeout, int staleMasterTimeout,
      String gcWarningThreshold) {
    super(inputBufferProcessors, processBufferProcessors, outputBufferProcessors, processorWaitStrategy, inputBufferWaitStrategy, inputBufferRingSize, ringSize, pluginDir, nodeIdFile, allowHighlighting, allowLeadingWildcardSearches, streamProcessingTimeout, streamProcessingMaxFaults, outputModuleTimeout, staleMasterTimeout, gcWarningThreshold);
  }

  @JsonIgnore
  public final int getInputBufferProcessors() {
    return inputBufferProcessors();
  }

  @JsonIgnore
  public final int getProcessBufferProcessors() {
    return processBufferProcessors();
  }

  @JsonIgnore
  public final int getOutputBufferProcessors() {
    return outputBufferProcessors();
  }

  @JsonIgnore
  public final String getProcessorWaitStrategy() {
    return processorWaitStrategy();
  }

  @JsonIgnore
  public final String getInputBufferWaitStrategy() {
    return inputBufferWaitStrategy();
  }

  @JsonIgnore
  public final int getInputBufferRingSize() {
    return inputBufferRingSize();
  }

  @JsonIgnore
  public final int getRingSize() {
    return ringSize();
  }

  @JsonIgnore
  public final String getPluginDir() {
    return pluginDir();
  }

  @JsonIgnore
  public final String getNodeIdFile() {
    return nodeIdFile();
  }

  @JsonIgnore
  public final boolean isAllowHighlighting() {
    return allowHighlighting();
  }

  @JsonIgnore
  public final boolean isAllowLeadingWildcardSearches() {
    return allowLeadingWildcardSearches();
  }

  @JsonIgnore
  public final long getStreamProcessingTimeout() {
    return streamProcessingTimeout();
  }

  @JsonIgnore
  public final int getStreamProcessingMaxFaults() {
    return streamProcessingMaxFaults();
  }

  @JsonIgnore
  public final long getOutputModuleTimeout() {
    return outputModuleTimeout();
  }

  @JsonIgnore
  public final int getStaleMasterTimeout() {
    return staleMasterTimeout();
  }

  @JsonIgnore
  public final String getGcWarningThreshold() {
    return gcWarningThreshold();
  }
}
