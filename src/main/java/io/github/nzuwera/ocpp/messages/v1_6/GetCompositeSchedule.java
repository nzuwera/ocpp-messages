package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Request;

import java.util.HashMap;
import java.util.Map;


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
public class GetCompositeSchedule extends Request {
    @JsonProperty("connectorId")
    private Integer connectorId;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("chargingRateUnit")
    private GetCompositeSchedule.ChargingRateUnit chargingRateUnit;

    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("chargingRateUnit")
    public GetCompositeSchedule.ChargingRateUnit getChargingRateUnit() {
        return chargingRateUnit;
    }

    @JsonProperty("chargingRateUnit")
    public void setChargingRateUnit(GetCompositeSchedule.ChargingRateUnit chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }


    public enum ChargingRateUnit {

        A("A"),
        W("W");
        private final static Map<String, GetCompositeSchedule.ChargingRateUnit> CONSTANTS = new HashMap<String, GetCompositeSchedule.ChargingRateUnit>();

        static {
            for (GetCompositeSchedule.ChargingRateUnit c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        ChargingRateUnit(String value) {
            this.value = value;
        }

        @JsonCreator
        public static GetCompositeSchedule.ChargingRateUnit fromValue(String value) {
            GetCompositeSchedule.ChargingRateUnit constant = CONSTANTS.get(value);
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
