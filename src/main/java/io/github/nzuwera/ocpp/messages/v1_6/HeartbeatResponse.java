
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Response;


/**
 * HeartbeatResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currentTime"
})
@Generated("jsonschema2pojo")
public class HeartbeatResponse extends Response {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currentTime")
    private String currentTime;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currentTime")
    public String getCurrentTime() {
        return currentTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currentTime")
    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

}
