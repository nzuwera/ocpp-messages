
package io.github.nzuwera.ocpp.messages.v1_6;

import java.net.URI;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * UpdateFirmwareRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "location",
    "retries",
    "retrieveDate",
    "retryInterval"
})
@Generated("jsonschema2pojo")
public class UpdateFirmwareRequest extends Request {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    private URI location;
    @JsonProperty("retries")
    private Integer retries;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("retrieveDate")
    private String retrieveDate;
    @JsonProperty("retryInterval")
    private Integer retryInterval;

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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("retrieveDate")
    public String getRetrieveDate() {
        return retrieveDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("retrieveDate")
    public void setRetrieveDate(String retrieveDate) {
        this.retrieveDate = retrieveDate;
    }

    @JsonProperty("retryInterval")
    public Integer getRetryInterval() {
        return retryInterval;
    }

    @JsonProperty("retryInterval")
    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

}
