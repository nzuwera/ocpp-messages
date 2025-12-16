package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * ChangeAvailabilityResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class ChangeAvailabilityResponse extends Response {
    @JsonProperty("status")
    private ChangeAvailabilityResponse.Status status;

    @JsonProperty("status")
    public ChangeAvailabilityResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(ChangeAvailabilityResponse.Status status) {
        this.status = status;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected"),
        SCHEDULED("Scheduled");
        private final static Map<String, ChangeAvailabilityResponse.Status> CONSTANTS = new HashMap<String, ChangeAvailabilityResponse.Status>();

        static {
            for (ChangeAvailabilityResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ChangeAvailabilityResponse.Status fromValue(String value) {
            ChangeAvailabilityResponse.Status constant = CONSTANTS.get(value);
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
