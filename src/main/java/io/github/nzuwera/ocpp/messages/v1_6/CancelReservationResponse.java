package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * CancelReservationResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class CancelReservationResponse extends Response {
    @JsonProperty("status")
    private CancelReservationResponse.Status status;

    @JsonProperty("status")
    public CancelReservationResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(CancelReservationResponse.Status status) {
        this.status = status;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected");
        private final static Map<String, CancelReservationResponse.Status> CONSTANTS = new HashMap<String, CancelReservationResponse.Status>();

        static {
            for (CancelReservationResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static CancelReservationResponse.Status fromValue(String value) {
            CancelReservationResponse.Status constant = CONSTANTS.get(value);
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
