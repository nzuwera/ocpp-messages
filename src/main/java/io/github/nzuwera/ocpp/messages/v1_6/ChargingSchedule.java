
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "duration",
    "startSchedule",
    "chargingRateUnit",
    "chargingSchedulePeriod",
    "minChargingRate"
})
@Generated("jsonschema2pojo")
public class ChargingSchedule {

    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("startSchedule")
    private String startSchedule;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingRateUnit")
    private ChargingSchedule.ChargingRateUnit chargingRateUnit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingSchedulePeriod")
    private List<ChargingSchedulePeriod> chargingSchedulePeriod = new ArrayList<ChargingSchedulePeriod>();
    @JsonProperty("minChargingRate")
    private Double minChargingRate;

    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("startSchedule")
    public String getStartSchedule() {
        return startSchedule;
    }

    @JsonProperty("startSchedule")
    public void setStartSchedule(String startSchedule) {
        this.startSchedule = startSchedule;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingRateUnit")
    public ChargingSchedule.ChargingRateUnit getChargingRateUnit() {
        return chargingRateUnit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingRateUnit")
    public void setChargingRateUnit(ChargingSchedule.ChargingRateUnit chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingSchedulePeriod")
    public List<ChargingSchedulePeriod> getChargingSchedulePeriod() {
        return chargingSchedulePeriod;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingSchedulePeriod")
    public void setChargingSchedulePeriod(List<ChargingSchedulePeriod> chargingSchedulePeriod) {
        this.chargingSchedulePeriod = chargingSchedulePeriod;
    }

    @JsonProperty("minChargingRate")
    public Double getMinChargingRate() {
        return minChargingRate;
    }

    @JsonProperty("minChargingRate")
    public void setMinChargingRate(Double minChargingRate) {
        this.minChargingRate = minChargingRate;
    }

    @Generated("jsonschema2pojo")
    public enum ChargingRateUnit {

        A("A"),
        W("W");
        private final String value;
        private final static Map<String, ChargingSchedule.ChargingRateUnit> CONSTANTS = new HashMap<String, ChargingSchedule.ChargingRateUnit>();

        static {
            for (ChargingSchedule.ChargingRateUnit c: values()) {
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
        public static ChargingSchedule.ChargingRateUnit fromValue(String value) {
            ChargingSchedule.ChargingRateUnit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
