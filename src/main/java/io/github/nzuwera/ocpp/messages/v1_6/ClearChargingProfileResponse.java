package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * ClearChargingProfileResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class ClearChargingProfileResponse extends Response {
    @JsonProperty("status")
    private ClearChargingProfileResponse.Status status;

    @JsonProperty("status")
    public ClearChargingProfileResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(ClearChargingProfileResponse.Status status) {
        this.status = status;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        UNKNOWN("Unknown");
        private final static Map<String, ClearChargingProfileResponse.Status> CONSTANTS = new HashMap<String, ClearChargingProfileResponse.Status>();

        static {
            for (ClearChargingProfileResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ClearChargingProfileResponse.Status fromValue(String value) {
            ClearChargingProfileResponse.Status constant = CONSTANTS.get(value);
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
