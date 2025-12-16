
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
@Generated("jsonschema2pojo")
public class TriggerMessageRequest extends Request {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestedMessage")
    private TriggerMessageRequest.RequestedMessage requestedMessage;
    @JsonProperty("connectorId")
    private Integer connectorId;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestedMessage")
    public TriggerMessageRequest.RequestedMessage getRequestedMessage() {
        return requestedMessage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestedMessage")
    public void setRequestedMessage(TriggerMessageRequest.RequestedMessage requestedMessage) {
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

    @Generated("jsonschema2pojo")
    public enum RequestedMessage {

        BOOT_NOTIFICATION("BootNotification"),
        DIAGNOSTICS_STATUS_NOTIFICATION("DiagnosticsStatusNotification"),
        FIRMWARE_STATUS_NOTIFICATION("FirmwareStatusNotification"),
        HEARTBEAT("Heartbeat"),
        METER_VALUES("MeterValues"),
        STATUS_NOTIFICATION("StatusNotification");
        private final String value;
        private final static Map<String, TriggerMessageRequest.RequestedMessage> CONSTANTS = new HashMap<String, TriggerMessageRequest.RequestedMessage>();

        static {
            for (TriggerMessageRequest.RequestedMessage c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RequestedMessage(String value) {
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
        public static TriggerMessageRequest.RequestedMessage fromValue(String value) {
            TriggerMessageRequest.RequestedMessage constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
