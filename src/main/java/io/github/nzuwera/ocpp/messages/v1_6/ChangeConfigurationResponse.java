package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * ChangeConfigurationResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class ChangeConfigurationResponse extends Response {
    @JsonProperty("status")
    private ChangeConfigurationResponse.Status status;

    @JsonProperty("status")
    public ChangeConfigurationResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(ChangeConfigurationResponse.Status status) {
        this.status = status;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected"),
        REBOOT_REQUIRED("RebootRequired"),
        NOT_SUPPORTED("NotSupported");
        private final static Map<String, ChangeConfigurationResponse.Status> CONSTANTS = new HashMap<String, ChangeConfigurationResponse.Status>();

        static {
            for (ChangeConfigurationResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ChangeConfigurationResponse.Status fromValue(String value) {
            ChangeConfigurationResponse.Status constant = CONSTANTS.get(value);
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
