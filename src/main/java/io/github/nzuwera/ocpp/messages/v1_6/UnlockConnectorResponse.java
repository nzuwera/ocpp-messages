
package io.github.nzuwera.ocpp.messages.v1_6;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nzuwera.ocpp.messages.Response;


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
@Generated("jsonschema2pojo")
public class UnlockConnectorResponse extends Response {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private UnlockConnectorResponse.Status status;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public UnlockConnectorResponse.Status getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(UnlockConnectorResponse.Status status) {
        this.status = status;
    }

    @Generated("jsonschema2pojo")
    public enum Status {

        UNLOCKED("Unlocked"),
        UNLOCK_FAILED("UnlockFailed"),
        NOT_SUPPORTED("NotSupported");
        private final String value;
        private final static Map<String, UnlockConnectorResponse.Status> CONSTANTS = new HashMap<String, UnlockConnectorResponse.Status>();

        static {
            for (UnlockConnectorResponse.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
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

    }

}
