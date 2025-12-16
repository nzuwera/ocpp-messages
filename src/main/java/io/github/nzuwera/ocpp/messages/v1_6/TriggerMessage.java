package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Request;

import java.util.HashMap;
import java.util.Map;


/**
 * TriggerMessageRequest
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "requestedMessage",
        "connectorId"
})
public class TriggerMessage extends Request {
    @JsonProperty("requestedMessage")
    private TriggerMessage.RequestedMessage requestedMessage;
    @JsonProperty("connectorId")
    private Integer connectorId;

    @JsonProperty("requestedMessage")
    public TriggerMessage.RequestedMessage getRequestedMessage() {
        return requestedMessage;
    }

    @JsonProperty("requestedMessage")
    public void setRequestedMessage(TriggerMessage.RequestedMessage requestedMessage) {
        this.requestedMessage = requestedMessage;
    }

    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }


    public enum RequestedMessage {

        BOOT_NOTIFICATION("BootNotification"),
        DIAGNOSTICS_STATUS_NOTIFICATION("DiagnosticsStatusNotification"),
        FIRMWARE_STATUS_NOTIFICATION("FirmwareStatusNotification"),
        HEARTBEAT("Heartbeat"),
        METER_VALUES("MeterValues"),
        STATUS_NOTIFICATION("StatusNotification");
        private final static Map<String, TriggerMessage.RequestedMessage> CONSTANTS = new HashMap<String, TriggerMessage.RequestedMessage>();

        static {
            for (TriggerMessage.RequestedMessage c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        RequestedMessage(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TriggerMessage.RequestedMessage fromValue(String value) {
            TriggerMessage.RequestedMessage constant = CONSTANTS.get(value);
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
