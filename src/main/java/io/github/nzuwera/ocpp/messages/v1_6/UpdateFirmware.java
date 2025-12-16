package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;

import java.net.URI;


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
public class UpdateFirmware extends Request {
    @JsonProperty("location")
    private URI location;
    @JsonProperty("retries")
    private Integer retries;
    @JsonProperty("retrieveDate")
    private String retrieveDate;
    @JsonProperty("retryInterval")
    private Integer retryInterval;

    @JsonProperty("location")
    public URI getLocation() {
        return location;
    }

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

    @JsonProperty("retrieveDate")
    public String getRetrieveDate() {
        return retrieveDate;
    }

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
