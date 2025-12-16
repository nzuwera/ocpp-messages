package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Request;

import java.util.HashMap;
import java.util.Map;


/**
 * FirmwareStatusNotificationRequest
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class FirmwareStatusNotification extends Request {
    @JsonProperty("status")
    private FirmwareStatusNotification.Status status;

    @JsonProperty("status")
    public FirmwareStatusNotification.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(FirmwareStatusNotification.Status status) {
        this.status = status;
    }


    public enum Status {

        DOWNLOADED("Downloaded"),
        DOWNLOAD_FAILED("DownloadFailed"),
        DOWNLOADING("Downloading"),
        IDLE("Idle"),
        INSTALLATION_FAILED("InstallationFailed"),
        INSTALLING("Installing"),
        INSTALLED("Installed");
        private final static Map<String, FirmwareStatusNotification.Status> CONSTANTS = new HashMap<String, FirmwareStatusNotification.Status>();

        static {
            for (FirmwareStatusNotification.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static FirmwareStatusNotification.Status fromValue(String value) {
            FirmwareStatusNotification.Status constant = CONSTANTS.get(value);
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
