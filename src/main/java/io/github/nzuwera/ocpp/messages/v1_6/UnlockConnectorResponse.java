package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * UnlockConnectorResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class UnlockConnectorResponse extends Response {
    @JsonProperty("status")
    private UnlockConnectorResponse.Status status;

    @JsonProperty("status")
    public UnlockConnectorResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(UnlockConnectorResponse.Status status) {
        this.status = status;
    }


    public enum Status {

        UNLOCKED("Unlocked"),
        UNLOCK_FAILED("UnlockFailed"),
        NOT_SUPPORTED("NotSupported");
        private final static Map<String, UnlockConnectorResponse.Status> CONSTANTS = new HashMap<String, UnlockConnectorResponse.Status>();

        static {
            for (UnlockConnectorResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static UnlockConnectorResponse.Status fromValue(String value) {
            UnlockConnectorResponse.Status constant = CONSTANTS.get(value);
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
