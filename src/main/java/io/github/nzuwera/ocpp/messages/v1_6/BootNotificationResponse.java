
package io.github.nzuwera.ocpp.messages.v1_6;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nzuwera.ocpp.messages.Response;


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
@Generated("jsonschema2pojo")
public class BootNotificationResponse extends Response {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private BootNotificationResponse.Status status;
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
    @JsonProperty("interval")
    private Integer interval;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public BootNotificationResponse.Status getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(BootNotificationResponse.Status status) {
        this.status = status;
    }

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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("interval")
    public Integer getInterval() {
        return interval;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    @Generated("jsonschema2pojo")
    public enum Status {

        ACCEPTED("Accepted"),
        PENDING("Pending"),
        REJECTED("Rejected");
        private final String value;
        private final static Map<String, BootNotificationResponse.Status> CONSTANTS = new HashMap<String, BootNotificationResponse.Status>();

        static {
            for (BootNotificationResponse.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
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

    }

}
