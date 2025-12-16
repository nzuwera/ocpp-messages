package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * SendLocalListResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class SendLocalListResponse extends Response {
    @JsonProperty("status")
    private SendLocalListResponse.Status status;

    @JsonProperty("status")
    public SendLocalListResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(SendLocalListResponse.Status status) {
        this.status = status;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        FAILED("Failed"),
        NOT_SUPPORTED("NotSupported"),
        VERSION_MISMATCH("VersionMismatch");
        private final static Map<String, SendLocalListResponse.Status> CONSTANTS = new HashMap<String, SendLocalListResponse.Status>();

        static {
            for (SendLocalListResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static SendLocalListResponse.Status fromValue(String value) {
            SendLocalListResponse.Status constant = CONSTANTS.get(value);
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
