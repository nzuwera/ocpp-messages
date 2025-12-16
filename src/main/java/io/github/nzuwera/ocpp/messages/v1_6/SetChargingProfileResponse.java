package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * SetChargingProfileResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class SetChargingProfileResponse extends Response {
    @JsonProperty("status")
    private SetChargingProfileResponse.Status status;

    @JsonProperty("status")
    public SetChargingProfileResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(SetChargingProfileResponse.Status status) {
        this.status = status;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected"),
        NOT_SUPPORTED("NotSupported");
        private final static Map<String, SetChargingProfileResponse.Status> CONSTANTS = new HashMap<String, SetChargingProfileResponse.Status>();

        static {
            for (SetChargingProfileResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static SetChargingProfileResponse.Status fromValue(String value) {
            SetChargingProfileResponse.Status constant = CONSTANTS.get(value);
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
