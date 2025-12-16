package io.github.nzuwera.ocpp.messages.v1_6;

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
public class HeartbeatResponse extends Response {
    @JsonProperty("currentTime")
    private String currentTime;

    @JsonProperty("currentTime")
    public String getCurrentTime() {
        return currentTime;
    }

    @JsonProperty("currentTime")
    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

}
