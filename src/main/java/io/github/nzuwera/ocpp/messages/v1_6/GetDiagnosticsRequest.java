
package io.github.nzuwera.ocpp.messages.v1_6;

import java.net.URI;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * GetDiagnosticsRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "location",
    "retries",
    "retryInterval",
    "startTime",
    "stopTime"
})
@Generated("jsonschema2pojo")
public class GetDiagnosticsRequest extends Request {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    private URI location;
    @JsonProperty("retries")
    private Integer retries;
    @JsonProperty("retryInterval")
    private Integer retryInterval;
    @JsonProperty("startTime")
    private String startTime;
    @JsonProperty("stopTime")
    private String stopTime;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public URI getLocation() {
        return location;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public void setLocation(URI location) {
        this.location = location;
    }

    @JsonProperty("retries")
    public Integer getRetries() {
        return retries;
    }

    @JsonProperty("retries")
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    @JsonProperty("retryInterval")
    public Integer getRetryInterval() {
        return retryInterval;
    }

    @JsonProperty("retryInterval")
    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("stopTime")
    public String getStopTime() {
        return stopTime;
    }

    @JsonProperty("stopTime")
    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

}
