package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Request;

import java.util.HashMap;
import java.util.Map;


/**
 * ClearChargingProfileRequest
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "connectorId",
        "chargingProfilePurpose",
        "stackLevel"
})
public class ClearChargingProfile extends Request {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("connectorId")
    private Integer connectorId;
    @JsonProperty("chargingProfilePurpose")
    private ClearChargingProfile.ChargingProfilePurpose chargingProfilePurpose;
    @JsonProperty("stackLevel")
    private Integer stackLevel;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    @JsonProperty("chargingProfilePurpose")
    public ClearChargingProfile.ChargingProfilePurpose getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }

    @JsonProperty("chargingProfilePurpose")
    public void setChargingProfilePurpose(ClearChargingProfile.ChargingProfilePurpose chargingProfilePurpose) {
        this.chargingProfilePurpose = chargingProfilePurpose;
    }

    @JsonProperty("stackLevel")
    public Integer getStackLevel() {
        return stackLevel;
    }

    @JsonProperty("stackLevel")
    public void setStackLevel(Integer stackLevel) {
        this.stackLevel = stackLevel;
    }


    public enum ChargingProfilePurpose {

        CHARGE_POINT_MAX_PROFILE("ChargePointMaxProfile"),
        TX_DEFAULT_PROFILE("TxDefaultProfile"),
        TX_PROFILE("TxProfile");
        private final static Map<String, ClearChargingProfile.ChargingProfilePurpose> CONSTANTS = new HashMap<String, ClearChargingProfile.ChargingProfilePurpose>();

        static {
            for (ClearChargingProfile.ChargingProfilePurpose c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        ChargingProfilePurpose(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ClearChargingProfile.ChargingProfilePurpose fromValue(String value) {
            ClearChargingProfile.ChargingProfilePurpose constant = CONSTANTS.get(value);
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
