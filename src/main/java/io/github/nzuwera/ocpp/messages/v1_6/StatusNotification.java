package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Request;

import java.util.HashMap;
import java.util.Map;


/**
 * StatusNotificationRequest
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "connectorId",
        "errorCode",
        "info",
        "status",
        "timestamp",
        "vendorId",
        "vendorErrorCode"
})
public class StatusNotification extends Request {
    @JsonProperty("connectorId")
    private Integer connectorId;
    @JsonProperty("errorCode")
    private StatusNotification.ErrorCode errorCode;
    @JsonProperty("info")
    private String info;
    @JsonProperty("status")
    private StatusNotification.Status status;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("vendorId")
    private String vendorId;
    @JsonProperty("vendorErrorCode")
    private String vendorErrorCode;

    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    @JsonProperty("errorCode")
    public StatusNotification.ErrorCode getErrorCode() {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public void setErrorCode(StatusNotification.ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("info")
    public String getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(String info) {
        this.info = info;
    }

    @JsonProperty("status")
    public StatusNotification.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(StatusNotification.Status status) {
        this.status = status;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
    }

    @JsonProperty("vendorId")
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @JsonProperty("vendorErrorCode")
    public String getVendorErrorCode() {
        return vendorErrorCode;
    }

    @JsonProperty("vendorErrorCode")
    public void setVendorErrorCode(String vendorErrorCode) {
        this.vendorErrorCode = vendorErrorCode;
    }


    public enum ErrorCode {

        CONNECTOR_LOCK_FAILURE("ConnectorLockFailure"),
        EV_COMMUNICATION_ERROR("EVCommunicationError"),
        GROUND_FAILURE("GroundFailure"),
        HIGH_TEMPERATURE("HighTemperature"),
        INTERNAL_ERROR("InternalError"),
        LOCAL_LIST_CONFLICT("LocalListConflict"),
        NO_ERROR("NoError"),
        OTHER_ERROR("OtherError"),
        OVER_CURRENT_FAILURE("OverCurrentFailure"),
        POWER_METER_FAILURE("PowerMeterFailure"),
        POWER_SWITCH_FAILURE("PowerSwitchFailure"),
        READER_FAILURE("ReaderFailure"),
        RESET_FAILURE("ResetFailure"),
        UNDER_VOLTAGE("UnderVoltage"),
        OVER_VOLTAGE("OverVoltage"),
        WEAK_SIGNAL("WeakSignal");
        private final static Map<String, StatusNotification.ErrorCode> CONSTANTS = new HashMap<String, StatusNotification.ErrorCode>();

        static {
            for (StatusNotification.ErrorCode c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        ErrorCode(String value) {
            this.value = value;
        }

        @JsonCreator
        public static StatusNotification.ErrorCode fromValue(String value) {
            StatusNotification.ErrorCode constant = CONSTANTS.get(value);
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


    public enum Status {

        AVAILABLE("Available"),
        PREPARING("Preparing"),
        CHARGING("Charging"),
        SUSPENDED_EVSE("SuspendedEVSE"),
        SUSPENDED_EV("SuspendedEV"),
        FINISHING("Finishing"),
        RESERVED("Reserved"),
        UNAVAILABLE("Unavailable"),
        FAULTED("Faulted");
        private final static Map<String, StatusNotification.Status> CONSTANTS = new HashMap<String, StatusNotification.Status>();

        static {
            for (StatusNotification.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static StatusNotification.Status fromValue(String value) {
            StatusNotification.Status constant = CONSTANTS.get(value);
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
