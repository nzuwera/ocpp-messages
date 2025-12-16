package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * BootNotificationResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "currentTime",
        "interval"
})
public class BootNotificationResponse extends Response {
    @JsonProperty("status")
    private BootNotificationResponse.Status status;
    @JsonProperty("currentTime")
    private String currentTime;
    @JsonProperty("interval")
    private Integer interval;

    @JsonProperty("status")
    public BootNotificationResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(BootNotificationResponse.Status status) {
        this.status = status;
    }

    @JsonProperty("currentTime")
    public String getCurrentTime() {
        return currentTime;
    }

    @JsonProperty("currentTime")
    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    @JsonProperty("interval")
    public Integer getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        PENDING("Pending"),
        REJECTED("Rejected");
        private final static Map<String, BootNotificationResponse.Status> CONSTANTS = new HashMap<String, BootNotificationResponse.Status>();

        static {
            for (BootNotificationResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static BootNotificationResponse.Status fromValue(String value) {
            BootNotificationResponse.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

    }

}
