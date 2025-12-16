
package io.github.nzuwera.ocpp.messages.v1_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * StopTransactionRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idTag",
    "meterStop",
    "timestamp",
    "transactionId",
    "reason",
    "transactionData"
})
@Generated("jsonschema2pojo")
public class StopTransactionRequest extends Request {

    @JsonProperty("idTag")
    private String idTag;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meterStop")
    private Integer meterStop;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    private String timestamp;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionId")
    private Integer transactionId;
    @JsonProperty("reason")
    private StopTransactionRequest.Reason reason;
    @JsonProperty("transactionData")
    private List<TransactionDatum> transactionData = new ArrayList<TransactionDatum>();

    @JsonProperty("idTag")
    public String getIdTag() {
        return idTag;
    }

    @JsonProperty("idTag")
    public void setIdTag(String idTag) {
        this.idTag = idTag;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meterStop")
    public Integer getMeterStop() {
        return meterStop;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meterStop")
    public void setMeterStop(Integer meterStop) {
        this.meterStop = meterStop;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionId")
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionId")
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("reason")
    public StopTransactionRequest.Reason getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(StopTransactionRequest.Reason reason) {
        this.reason = reason;
    }

    @JsonProperty("transactionData")
    public List<TransactionDatum> getTransactionData() {
        return transactionData;
    }

    @JsonProperty("transactionData")
    public void setTransactionData(List<TransactionDatum> transactionData) {
        this.transactionData = transactionData;
    }

    @Generated("jsonschema2pojo")
    public enum Reason {

        EMERGENCY_STOP("EmergencyStop"),
        EV_DISCONNECTED("EVDisconnected"),
        HARD_RESET("HardReset"),
        LOCAL("Local"),
        OTHER("Other"),
        POWER_LOSS("PowerLoss"),
        REBOOT("Reboot"),
        REMOTE("Remote"),
        SOFT_RESET("SoftReset"),
        UNLOCK_COMMAND("UnlockCommand"),
        DE_AUTHORIZED("DeAuthorized");
        private final String value;
        private final static Map<String, StopTransactionRequest.Reason> CONSTANTS = new HashMap<String, StopTransactionRequest.Reason>();

        static {
            for (StopTransactionRequest.Reason c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Reason(String value) {
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
        public static StopTransactionRequest.Reason fromValue(String value) {
            StopTransactionRequest.Reason constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
