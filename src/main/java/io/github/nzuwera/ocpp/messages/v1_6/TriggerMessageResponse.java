
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
 * TriggerMessageResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status"
})
@Generated("jsonschema2pojo")
public class TriggerMessageResponse extends Response {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private TriggerMessageResponse.Status status;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public TriggerMessageResponse.Status getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(TriggerMessageResponse.Status status) {
        this.status = status;
    }

    @Generated("jsonschema2pojo")
    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected"),
        NOT_IMPLEMENTED("NotImplemented");
        private final String value;
        private final static Map<String, TriggerMessageResponse.Status> CONSTANTS = new HashMap<String, TriggerMessageResponse.Status>();

        static {
            for (TriggerMessageResponse.Status c: values()) {
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
        public static TriggerMessageResponse.Status fromValue(String value) {
            TriggerMessageResponse.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
