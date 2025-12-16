
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
@Generated("jsonschema2pojo")
public class StatusNotificationRequest extends Request {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("connectorId")
    private Integer connectorId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("errorCode")
    private StatusNotificationRequest.ErrorCode errorCode;
    @JsonProperty("info")
    private String info;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private StatusNotificationRequest.Status status;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("vendorId")
    private String vendorId;
    @JsonProperty("vendorErrorCode")
    private String vendorErrorCode;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("errorCode")
    public StatusNotificationRequest.ErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("errorCode")
    public void setErrorCode(StatusNotificationRequest.ErrorCode errorCode) {
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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public StatusNotificationRequest.Status getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(StatusNotificationRequest.Status status) {
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

    @Generated("jsonschema2pojo")
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
        private final String value;
        private final static Map<String, StatusNotificationRequest.ErrorCode> CONSTANTS = new HashMap<String, StatusNotificationRequest.ErrorCode>();

        static {
            for (StatusNotificationRequest.ErrorCode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ErrorCode(String value) {
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
        public static StatusNotificationRequest.ErrorCode fromValue(String value) {
            StatusNotificationRequest.ErrorCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("jsonschema2pojo")
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
        private final String value;
        private final static Map<String, StatusNotificationRequest.Status> CONSTANTS = new HashMap<String, StatusNotificationRequest.Status>();

        static {
            for (StatusNotificationRequest.Status c: values()) {
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
        public static StatusNotificationRequest.Status fromValue(String value) {
            StatusNotificationRequest.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
