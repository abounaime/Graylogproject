
package org.graylog2.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ExposedConfiguration extends ExposedConfiguration {

  private final int inputBufferProcessors;
  private final int processBufferProcessors;
  private final int outputBufferProcessors;
  private final String processorWaitStrategy;
  private final String inputBufferWaitStrategy;
  private final int inputBufferRingSize;
  private final int ringSize;
  private final String pluginDir;
  private final String nodeIdFile;
  private final boolean allowHighlighting;
  private final boolean allowLeadingWildcardSearches;
  private final long streamProcessingTimeout;
  private final int streamProcessingMaxFaults;
  private final long outputModuleTimeout;
  private final int staleMasterTimeout;
  private final String gcWarningThreshold;

  $AutoValue_ExposedConfiguration(
      int inputBufferProcessors,
      int processBufferProcessors,
      int outputBufferProcessors,
      String processorWaitStrategy,
      String inputBufferWaitStrategy,
      int inputBufferRingSize,
      int ringSize,
      String pluginDir,
      String nodeIdFile,
      boolean allowHighlighting,
      boolean allowLeadingWildcardSearches,
      long streamProcessingTimeout,
      int streamProcessingMaxFaults,
      long outputModuleTimeout,
      int staleMasterTimeout,
      String gcWarningThreshold) {
    this.inputBufferProcessors = inputBufferProcessors;
    this.processBufferProcessors = processBufferProcessors;
    this.outputBufferProcessors = outputBufferProcessors;
    if (processorWaitStrategy == null) {
      throw new NullPointerException("Null processorWaitStrategy");
    }
    this.processorWaitStrategy = processorWaitStrategy;
    if (inputBufferWaitStrategy == null) {
      throw new NullPointerException("Null inputBufferWaitStrategy");
    }
    this.inputBufferWaitStrategy = inputBufferWaitStrategy;
    this.inputBufferRingSize = inputBufferRingSize;
    this.ringSize = ringSize;
    if (pluginDir == null) {
      throw new NullPointerException("Null pluginDir");
    }
    this.pluginDir = pluginDir;
    if (nodeIdFile == null) {
      throw new NullPointerException("Null nodeIdFile");
    }
    this.nodeIdFile = nodeIdFile;
    this.allowHighlighting = allowHighlighting;
    this.allowLeadingWildcardSearches = allowLeadingWildcardSearches;
    this.streamProcessingTimeout = streamProcessingTimeout;
    this.streamProcessingMaxFaults = streamProcessingMaxFaults;
    this.outputModuleTimeout = outputModuleTimeout;
    this.staleMasterTimeout = staleMasterTimeout;
    if (gcWarningThreshold == null) {
      throw new NullPointerException("Null gcWarningThreshold");
    }
    this.gcWarningThreshold = gcWarningThreshold;
  }

  @JsonProperty(value = "inputbuffer_processors")
  @Override
  public int inputBufferProcessors() {
    return inputBufferProcessors;
  }

  @JsonProperty(value = "processbuffer_processors")
  @Override
  public int processBufferProcessors() {
    return processBufferProcessors;
  }

  @JsonProperty(value = "outputbuffer_processors")
  @Override
  public int outputBufferProcessors() {
    return outputBufferProcessors;
  }

  @JsonProperty(value = "processor_wait_strategy")
  @Override
  public String processorWaitStrategy() {
    return processorWaitStrategy;
  }

  @JsonProperty(value = "inputbuffer_wait_strategy")
  @Override
  public String inputBufferWaitStrategy() {
    return inputBufferWaitStrategy;
  }

  @JsonProperty(value = "inputbuffer_ring_size")
  @Override
  public int inputBufferRingSize() {
    return inputBufferRingSize;
  }

  @JsonProperty(value = "ring_size")
  @Override
  public int ringSize() {
    return ringSize;
  }

  @JsonProperty(value = "plugin_dir")
  @Override
  public String pluginDir() {
    return pluginDir;
  }

  @JsonProperty(value = "node_id_file")
  @Override
  public String nodeIdFile() {
    return nodeIdFile;
  }

  @JsonProperty(value = "allow_highlighting")
  @Override
  public boolean allowHighlighting() {
    return allowHighlighting;
  }

  @JsonProperty(value = "allow_leading_wildcard_searches")
  @Override
  public boolean allowLeadingWildcardSearches() {
    return allowLeadingWildcardSearches;
  }

  @JsonProperty(value = "stream_processing_timeout")
  @Override
  public long streamProcessingTimeout() {
    return streamProcessingTimeout;
  }

  @JsonProperty(value = "stream_processing_max_faults")
  @Override
  public int streamProcessingMaxFaults() {
    return streamProcessingMaxFaults;
  }

  @JsonProperty(value = "output_module_timeout")
  @Override
  public long outputModuleTimeout() {
    return outputModuleTimeout;
  }

  @JsonProperty(value = "stale_master_timeout")
  @Override
  public int staleMasterTimeout() {
    return staleMasterTimeout;
  }

  @JsonProperty(value = "gc_warning_threshold")
  @Override
  public String gcWarningThreshold() {
    return gcWarningThreshold;
  }

  @Override
  public String toString() {
    return "ExposedConfiguration{"
        + "inputBufferProcessors=" + inputBufferProcessors + ", "
        + "processBufferProcessors=" + processBufferProcessors + ", "
        + "outputBufferProcessors=" + outputBufferProcessors + ", "
        + "processorWaitStrategy=" + processorWaitStrategy + ", "
        + "inputBufferWaitStrategy=" + inputBufferWaitStrategy + ", "
        + "inputBufferRingSize=" + inputBufferRingSize + ", "
        + "ringSize=" + ringSize + ", "
        + "pluginDir=" + pluginDir + ", "
        + "nodeIdFile=" + nodeIdFile + ", "
        + "allowHighlighting=" + allowHighlighting + ", "
        + "allowLeadingWildcardSearches=" + allowLeadingWildcardSearches + ", "
        + "streamProcessingTimeout=" + streamProcessingTimeout + ", "
        + "streamProcessingMaxFaults=" + streamProcessingMaxFaults + ", "
        + "outputModuleTimeout=" + outputModuleTimeout + ", "
        + "staleMasterTimeout=" + staleMasterTimeout + ", "
        + "gcWarningThreshold=" + gcWarningThreshold
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ExposedConfiguration) {
      ExposedConfiguration that = (ExposedConfiguration) o;
      return (this.inputBufferProcessors == that.inputBufferProcessors())
           && (this.processBufferProcessors == that.processBufferProcessors())
           && (this.outputBufferProcessors == that.outputBufferProcessors())
           && (this.processorWaitStrategy.equals(that.processorWaitStrategy()))
           && (this.inputBufferWaitStrategy.equals(that.inputBufferWaitStrategy()))
           && (this.inputBufferRingSize == that.inputBufferRingSize())
           && (this.ringSize == that.ringSize())
           && (this.pluginDir.equals(that.pluginDir()))
           && (this.nodeIdFile.equals(that.nodeIdFile()))
           && (this.allowHighlighting == that.allowHighlighting())
           && (this.allowLeadingWildcardSearches == that.allowLeadingWildcardSearches())
           && (this.streamProcessingTimeout == that.streamProcessingTimeout())
           && (this.streamProcessingMaxFaults == that.streamProcessingMaxFaults())
           && (this.outputModuleTimeout == that.outputModuleTimeout())
           && (this.staleMasterTimeout == that.staleMasterTimeout())
           && (this.gcWarningThreshold.equals(that.gcWarningThreshold()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.inputBufferProcessors;
    h *= 1000003;
    h ^= this.processBufferProcessors;
    h *= 1000003;
    h ^= this.outputBufferProcessors;
    h *= 1000003;
    h ^= this.processorWaitStrategy.hashCode();
    h *= 1000003;
    h ^= this.inputBufferWaitStrategy.hashCode();
    h *= 1000003;
    h ^= this.inputBufferRingSize;
    h *= 1000003;
    h ^= this.ringSize;
    h *= 1000003;
    h ^= this.pluginDir.hashCode();
    h *= 1000003;
    h ^= this.nodeIdFile.hashCode();
    h *= 1000003;
    h ^= this.allowHighlighting ? 1231 : 1237;
    h *= 1000003;
    h ^= this.allowLeadingWildcardSearches ? 1231 : 1237;
    h *= 1000003;
    h ^= (this.streamProcessingTimeout >>> 32) ^ this.streamProcessingTimeout;
    h *= 1000003;
    h ^= this.streamProcessingMaxFaults;
    h *= 1000003;
    h ^= (this.outputModuleTimeout >>> 32) ^ this.outputModuleTimeout;
    h *= 1000003;
    h ^= this.staleMasterTimeout;
    h *= 1000003;
    h ^= this.gcWarningThreshold.hashCode();
    return h;
  }

}
