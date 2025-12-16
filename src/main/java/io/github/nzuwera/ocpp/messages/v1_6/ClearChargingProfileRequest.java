
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
@Generated("jsonschema2pojo")
public class ClearChargingProfileRequest extends Request {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("connectorId")
    private Integer connectorId;
    @JsonProperty("chargingProfilePurpose")
    private ClearChargingProfileRequest.ChargingProfilePurpose chargingProfilePurpose;
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
    public ClearChargingProfileRequest.ChargingProfilePurpose getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }

    @JsonProperty("chargingProfilePurpose")
    public void setChargingProfilePurpose(ClearChargingProfileRequest.ChargingProfilePurpose chargingProfilePurpose) {
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

    @Generated("jsonschema2pojo")
    public enum ChargingProfilePurpose {

        CHARGE_POINT_MAX_PROFILE("ChargePointMaxProfile"),
        TX_DEFAULT_PROFILE("TxDefaultProfile"),
        TX_PROFILE("TxProfile");
        private final String value;
        private final static Map<String, ClearChargingProfileRequest.ChargingProfilePurpose> CONSTANTS = new HashMap<String, ClearChargingProfileRequest.ChargingProfilePurpose>();

        static {
            for (ClearChargingProfileRequest.ChargingProfilePurpose c: values()) {
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
        public static ClearChargingProfileRequest.ChargingProfilePurpose fromValue(String value) {
            ClearChargingProfileRequest.ChargingProfilePurpose constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
