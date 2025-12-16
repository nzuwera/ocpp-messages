package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Request;

import java.util.HashMap;
import java.util.Map;


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
public class DiagnosticsStatusNotification extends Request {
    @JsonProperty("status")
    private DiagnosticsStatusNotification.Status status;

    @JsonProperty("status")
    public DiagnosticsStatusNotification.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(DiagnosticsStatusNotification.Status status) {
        this.status = status;
    }


    public enum Status {

        IDLE("Idle"),
        UPLOADED("Uploaded"),
        UPLOAD_FAILED("UploadFailed"),
        UPLOADING("Uploading");
        private final static Map<String, DiagnosticsStatusNotification.Status> CONSTANTS = new HashMap<String, DiagnosticsStatusNotification.Status>();

        static {
            for (DiagnosticsStatusNotification.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static DiagnosticsStatusNotification.Status fromValue(String value) {
            DiagnosticsStatusNotification.Status constant = CONSTANTS.get(value);
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
