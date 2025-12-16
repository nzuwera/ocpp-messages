package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "duration",
        "startSchedule",
        "chargingRateUnit",
        "chargingSchedulePeriod",
        "minChargingRate"
})
public class ChargingSchedule {

    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("startSchedule")
    private String startSchedule;
    @JsonProperty("chargingRateUnit")
    private ChargingSchedule.ChargingRateUnit chargingRateUnit;
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

    @JsonProperty("chargingRateUnit")
    public ChargingSchedule.ChargingRateUnit getChargingRateUnit() {
        return chargingRateUnit;
    }

    @JsonProperty("chargingRateUnit")
    public void setChargingRateUnit(ChargingSchedule.ChargingRateUnit chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }

    @JsonProperty("chargingSchedulePeriod")
    public List<ChargingSchedulePeriod> getChargingSchedulePeriod() {
        return chargingSchedulePeriod;
    }

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


    public enum ChargingRateUnit {

        A("A"),
        W("W");
        private final static Map<String, ChargingSchedule.ChargingRateUnit> CONSTANTS = new HashMap<String, ChargingSchedule.ChargingRateUnit>();

        static {
            for (ChargingSchedule.ChargingRateUnit c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        ChargingRateUnit(String value) {
            this.value = value;
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
