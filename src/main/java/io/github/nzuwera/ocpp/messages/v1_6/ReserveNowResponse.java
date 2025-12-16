package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * ReserveNowResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class ReserveNowResponse extends Response {
    @JsonProperty("status")
    private ReserveNowResponse.Status status;

    @JsonProperty("status")
    public ReserveNowResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(ReserveNowResponse.Status status) {
        this.status = status;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        FAULTED("Faulted"),
        OCCUPIED("Occupied"),
        REJECTED("Rejected"),
        UNAVAILABLE("Unavailable");
        private final static Map<String, ReserveNowResponse.Status> CONSTANTS = new HashMap<String, ReserveNowResponse.Status>();

        static {
            for (ReserveNowResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ReserveNowResponse.Status fromValue(String value) {
            ReserveNowResponse.Status constant = CONSTANTS.get(value);
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
