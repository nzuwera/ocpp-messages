package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
public class StopTransaction extends Request {

    @JsonProperty("idTag")
    private String idTag;
    @JsonProperty("meterStop")
    private Integer meterStop;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("transactionId")
    private Integer transactionId;
    @JsonProperty("reason")
    private StopTransaction.Reason reason;
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

    @JsonProperty("meterStop")
    public Integer getMeterStop() {
        return meterStop;
    }

    @JsonProperty("meterStop")
    public void setMeterStop(Integer meterStop) {
        this.meterStop = meterStop;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("transactionId")
    public Integer getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("reason")
    public StopTransaction.Reason getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(StopTransaction.Reason reason) {
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
        private final static Map<String, StopTransaction.Reason> CONSTANTS = new HashMap<String, StopTransaction.Reason>();

        static {
            for (StopTransaction.Reason c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Reason(String value) {
            this.value = value;
        }

        @JsonCreator
        public static StopTransaction.Reason fromValue(String value) {
            StopTransaction.Reason constant = CONSTANTS.get(value);
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
