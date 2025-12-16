
package io.github.nzuwera.ocpp.messages.v1_6;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * DiagnosticsStatusNotificationRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status"
})
@Generated("jsonschema2pojo")
public class DiagnosticsStatusNotificationRequest extends Request {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private DiagnosticsStatusNotificationRequest.Status status;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public DiagnosticsStatusNotificationRequest.Status getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(DiagnosticsStatusNotificationRequest.Status status) {
        this.status = status;
    }

    @Generated("jsonschema2pojo")
    public enum Status {

        IDLE("Idle"),
        UPLOADED("Uploaded"),
        UPLOAD_FAILED("UploadFailed"),
        UPLOADING("Uploading");
        private final String value;
        private final static Map<String, DiagnosticsStatusNotificationRequest.Status> CONSTANTS = new HashMap<String, DiagnosticsStatusNotificationRequest.Status>();

        static {
            for (DiagnosticsStatusNotificationRequest.Status c: values()) {
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
        public static DiagnosticsStatusNotificationRequest.Status fromValue(String value) {
            DiagnosticsStatusNotificationRequest.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
