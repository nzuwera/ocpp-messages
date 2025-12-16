package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * ResetResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class ResetResponse extends Response {
    @JsonProperty("status")
    private ResetResponse.Status status;

    @JsonProperty("status")
    public ResetResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(ResetResponse.Status status) {
        this.status = status;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected");
        private final static Map<String, ResetResponse.Status> CONSTANTS = new HashMap<String, ResetResponse.Status>();

        static {
            for (ResetResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ResetResponse.Status fromValue(String value) {
            ResetResponse.Status constant = CONSTANTS.get(value);
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
