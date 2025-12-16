
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
 * GetCompositeScheduleRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "connectorId",
    "duration",
    "chargingRateUnit"
})
@Generated("jsonschema2pojo")
public class GetCompositeScheduleRequest extends Request {

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
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("chargingRateUnit")
    private GetCompositeScheduleRequest.ChargingRateUnit chargingRateUnit;

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
    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("chargingRateUnit")
    public GetCompositeScheduleRequest.ChargingRateUnit getChargingRateUnit() {
        return chargingRateUnit;
    }

    @JsonProperty("chargingRateUnit")
    public void setChargingRateUnit(GetCompositeScheduleRequest.ChargingRateUnit chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }

    @Generated("jsonschema2pojo")
    public enum ChargingRateUnit {

        A("A"),
        W("W");
        private final String value;
        private final static Map<String, GetCompositeScheduleRequest.ChargingRateUnit> CONSTANTS = new HashMap<String, GetCompositeScheduleRequest.ChargingRateUnit>();

        static {
            for (GetCompositeScheduleRequest.ChargingRateUnit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ChargingRateUnit(String value) {
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
        public static GetCompositeScheduleRequest.ChargingRateUnit fromValue(String value) {
            GetCompositeScheduleRequest.ChargingRateUnit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
