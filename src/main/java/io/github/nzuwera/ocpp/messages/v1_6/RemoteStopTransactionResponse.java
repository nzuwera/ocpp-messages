package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * RemoteStopTransactionResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class RemoteStopTransactionResponse extends Response {
    @JsonProperty("status")
    private RemoteStopTransactionResponse.Status status;

    @JsonProperty("status")
    public RemoteStopTransactionResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(RemoteStopTransactionResponse.Status status) {
        this.status = status;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected");
        private final static Map<String, RemoteStopTransactionResponse.Status> CONSTANTS = new HashMap<String, RemoteStopTransactionResponse.Status>();

        static {
            for (RemoteStopTransactionResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static RemoteStopTransactionResponse.Status fromValue(String value) {
            RemoteStopTransactionResponse.Status constant = CONSTANTS.get(value);
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
