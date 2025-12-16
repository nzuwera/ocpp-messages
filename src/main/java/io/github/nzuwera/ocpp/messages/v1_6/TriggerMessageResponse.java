package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * TriggerMessageResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class TriggerMessageResponse extends Response {
    @JsonProperty("status")
    private TriggerMessageResponse.Status status;

    @JsonProperty("status")
    public TriggerMessageResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(TriggerMessageResponse.Status status) {
        this.status = status;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected"),
        NOT_IMPLEMENTED("NotImplemented");
        private final static Map<String, TriggerMessageResponse.Status> CONSTANTS = new HashMap<String, TriggerMessageResponse.Status>();

        static {
            for (TriggerMessageResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TriggerMessageResponse.Status fromValue(String value) {
            TriggerMessageResponse.Status constant = CONSTANTS.get(value);
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
