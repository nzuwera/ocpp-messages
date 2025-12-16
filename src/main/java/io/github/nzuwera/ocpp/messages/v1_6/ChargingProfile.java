
package io.github.nzuwera.ocpp.messages.v1_6;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "chargingProfileId",
    "transactionId",
    "stackLevel",
    "chargingProfilePurpose",
    "chargingProfileKind",
    "recurrencyKind",
    "validFrom",
    "validTo",
    "chargingSchedule"
})
@Generated("jsonschema2pojo")
public class ChargingProfile {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingProfileId")
    private Integer chargingProfileId;
    @JsonProperty("transactionId")
    private Integer transactionId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stackLevel")
    private Integer stackLevel;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingProfilePurpose")
    private ChargingProfile.ChargingProfilePurpose chargingProfilePurpose;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingProfileKind")
    private ChargingProfile.ChargingProfileKind chargingProfileKind;
    @JsonProperty("recurrencyKind")
    private ChargingProfile.RecurrencyKind recurrencyKind;
    @JsonProperty("validFrom")
    private String validFrom;
    @JsonProperty("validTo")
    private String validTo;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingSchedule")
    private ChargingSchedule chargingSchedule;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingProfileId")
    public Integer getChargingProfileId() {
        return chargingProfileId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingProfileId")
    public void setChargingProfileId(Integer chargingProfileId) {
        this.chargingProfileId = chargingProfileId;
    }

    @JsonProperty("transactionId")
    public Integer getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stackLevel")
    public Integer getStackLevel() {
        return stackLevel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stackLevel")
    public void setStackLevel(Integer stackLevel) {
        this.stackLevel = stackLevel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingProfilePurpose")
    public ChargingProfile.ChargingProfilePurpose getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingProfilePurpose")
    public void setChargingProfilePurpose(ChargingProfile.ChargingProfilePurpose chargingProfilePurpose) {
        this.chargingProfilePurpose = chargingProfilePurpose;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingProfileKind")
    public ChargingProfile.ChargingProfileKind getChargingProfileKind() {
        return chargingProfileKind;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingProfileKind")
    public void setChargingProfileKind(ChargingProfile.ChargingProfileKind chargingProfileKind) {
        this.chargingProfileKind = chargingProfileKind;
    }

    @JsonProperty("recurrencyKind")
    public ChargingProfile.RecurrencyKind getRecurrencyKind() {
        return recurrencyKind;
    }

    @JsonProperty("recurrencyKind")
    public void setRecurrencyKind(ChargingProfile.RecurrencyKind recurrencyKind) {
        this.recurrencyKind = recurrencyKind;
    }

    @JsonProperty("validFrom")
    public String getValidFrom() {
        return validFrom;
    }

    @JsonProperty("validFrom")
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    @JsonProperty("validTo")
    public String getValidTo() {
        return validTo;
    }

    @JsonProperty("validTo")
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingSchedule")
    public ChargingSchedule getChargingSchedule() {
        return chargingSchedule;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingSchedule")
    public void setChargingSchedule(ChargingSchedule chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }

    @Generated("jsonschema2pojo")
    public enum ChargingProfileKind {

        ABSOLUTE("Absolute"),
        RECURRING("Recurring"),
        RELATIVE("Relative");
        private final String value;
        private final static Map<String, ChargingProfile.ChargingProfileKind> CONSTANTS = new HashMap<String, ChargingProfile.ChargingProfileKind>();

        static {
            for (ChargingProfile.ChargingProfileKind c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ChargingProfileKind(String value) {
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
        public static ChargingProfile.ChargingProfileKind fromValue(String value) {
            ChargingProfile.ChargingProfileKind constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("jsonschema2pojo")
    public enum ChargingProfilePurpose {

        CHARGE_POINT_MAX_PROFILE("ChargePointMaxProfile"),
        TX_DEFAULT_PROFILE("TxDefaultProfile"),
        TX_PROFILE("TxProfile");
        private final String value;
        private final static Map<String, ChargingProfile.ChargingProfilePurpose> CONSTANTS = new HashMap<String, ChargingProfile.ChargingProfilePurpose>();

        static {
            for (ChargingProfile.ChargingProfilePurpose c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ChargingProfilePurpose(String value) {
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
        public static ChargingProfile.ChargingProfilePurpose fromValue(String value) {
            ChargingProfile.ChargingProfilePurpose constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("jsonschema2pojo")
    public enum RecurrencyKind {

        DAILY("Daily"),
        WEEKLY("Weekly");
        private final String value;
        private final static Map<String, ChargingProfile.RecurrencyKind> CONSTANTS = new HashMap<String, ChargingProfile.RecurrencyKind>();

        static {
            for (ChargingProfile.RecurrencyKind c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RecurrencyKind(String value) {
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
        public static ChargingProfile.RecurrencyKind fromValue(String value) {
            ChargingProfile.RecurrencyKind constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
