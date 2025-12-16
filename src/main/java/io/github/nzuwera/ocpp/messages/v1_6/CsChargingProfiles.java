package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

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
public class CsChargingProfiles {
    @JsonProperty("chargingProfileId")
    private Integer chargingProfileId;
    @JsonProperty("transactionId")
    private Integer transactionId;
    @JsonProperty("stackLevel")
    private Integer stackLevel;
    @JsonProperty("chargingProfilePurpose")
    private CsChargingProfiles.ChargingProfilePurpose chargingProfilePurpose;
    @JsonProperty("chargingProfileKind")
    private CsChargingProfiles.ChargingProfileKind chargingProfileKind;
    @JsonProperty("recurrencyKind")
    private CsChargingProfiles.RecurrencyKind recurrencyKind;
    @JsonProperty("validFrom")
    private String validFrom;
    @JsonProperty("validTo")
    private String validTo;
    @JsonProperty("chargingSchedule")
    private ChargingSchedule chargingSchedule;

    @JsonProperty("chargingProfileId")
    public Integer getChargingProfileId() {
        return chargingProfileId;
    }

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

    @JsonProperty("stackLevel")
    public Integer getStackLevel() {
        return stackLevel;
    }

    @JsonProperty("stackLevel")
    public void setStackLevel(Integer stackLevel) {
        this.stackLevel = stackLevel;
    }

    @JsonProperty("chargingProfilePurpose")
    public CsChargingProfiles.ChargingProfilePurpose getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }

    @JsonProperty("chargingProfilePurpose")
    public void setChargingProfilePurpose(CsChargingProfiles.ChargingProfilePurpose chargingProfilePurpose) {
        this.chargingProfilePurpose = chargingProfilePurpose;
    }

    @JsonProperty("chargingProfileKind")
    public CsChargingProfiles.ChargingProfileKind getChargingProfileKind() {
        return chargingProfileKind;
    }

    @JsonProperty("chargingProfileKind")
    public void setChargingProfileKind(CsChargingProfiles.ChargingProfileKind chargingProfileKind) {
        this.chargingProfileKind = chargingProfileKind;
    }

    @JsonProperty("recurrencyKind")
    public CsChargingProfiles.RecurrencyKind getRecurrencyKind() {
        return recurrencyKind;
    }

    @JsonProperty("recurrencyKind")
    public void setRecurrencyKind(CsChargingProfiles.RecurrencyKind recurrencyKind) {
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

    @JsonProperty("chargingSchedule")
    public ChargingSchedule getChargingSchedule() {
        return chargingSchedule;
    }

    @JsonProperty("chargingSchedule")
    public void setChargingSchedule(ChargingSchedule chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }


    public enum ChargingProfileKind {

        ABSOLUTE("Absolute"),
        RECURRING("Recurring"),
        RELATIVE("Relative");
        private final static Map<String, CsChargingProfiles.ChargingProfileKind> CONSTANTS = new HashMap<String, CsChargingProfiles.ChargingProfileKind>();

        static {
            for (CsChargingProfiles.ChargingProfileKind c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        ChargingProfileKind(String value) {
            this.value = value;
        }

        @JsonCreator
        public static CsChargingProfiles.ChargingProfileKind fromValue(String value) {
            CsChargingProfiles.ChargingProfileKind constant = CONSTANTS.get(value);
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


    public enum ChargingProfilePurpose {

        CHARGE_POINT_MAX_PROFILE("ChargePointMaxProfile"),
        TX_DEFAULT_PROFILE("TxDefaultProfile"),
        TX_PROFILE("TxProfile");
        private final static Map<String, CsChargingProfiles.ChargingProfilePurpose> CONSTANTS = new HashMap<String, CsChargingProfiles.ChargingProfilePurpose>();

        static {
            for (CsChargingProfiles.ChargingProfilePurpose c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        ChargingProfilePurpose(String value) {
            this.value = value;
        }

        @JsonCreator
        public static CsChargingProfiles.ChargingProfilePurpose fromValue(String value) {
            CsChargingProfiles.ChargingProfilePurpose constant = CONSTANTS.get(value);
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


    public enum RecurrencyKind {

        DAILY("Daily"),
        WEEKLY("Weekly");
        private final static Map<String, CsChargingProfiles.RecurrencyKind> CONSTANTS = new HashMap<String, CsChargingProfiles.RecurrencyKind>();

        static {
            for (CsChargingProfiles.RecurrencyKind c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        RecurrencyKind(String value) {
            this.value = value;
        }

        @JsonCreator
        public static CsChargingProfiles.RecurrencyKind fromValue(String value) {
            CsChargingProfiles.RecurrencyKind constant = CONSTANTS.get(value);
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
