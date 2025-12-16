package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * RemoteStartTransactionResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class RemoteStartTransactionResponse extends Response {
    @JsonProperty("status")
    private RemoteStartTransactionResponse.Status status;

    @JsonProperty("status")
    public RemoteStartTransactionResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(RemoteStartTransactionResponse.Status status) {
        this.status = status;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected");
        private final static Map<String, RemoteStartTransactionResponse.Status> CONSTANTS = new HashMap<String, RemoteStartTransactionResponse.Status>();

        static {
            for (RemoteStartTransactionResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static RemoteStartTransactionResponse.Status fromValue(String value) {
            RemoteStartTransactionResponse.Status constant = CONSTANTS.get(value);
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
