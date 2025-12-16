
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
 * SendLocalListResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status"
})
@Generated("jsonschema2pojo")
public class SendLocalListResponse extends Response {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private SendLocalListResponse.Status status;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public SendLocalListResponse.Status getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(SendLocalListResponse.Status status) {
        this.status = status;
    }

    @Generated("jsonschema2pojo")
    public enum Status {

        ACCEPTED("Accepted"),
        FAILED("Failed"),
        NOT_SUPPORTED("NotSupported"),
        VERSION_MISMATCH("VersionMismatch");
        private final String value;
        private final static Map<String, SendLocalListResponse.Status> CONSTANTS = new HashMap<String, SendLocalListResponse.Status>();

        static {
            for (SendLocalListResponse.Status c: values()) {
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
        public static SendLocalListResponse.Status fromValue(String value) {
            SendLocalListResponse.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
