package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "startPeriod",
        "limit",
        "numberPhases"
})
public class ChargingSchedulePeriod {
    @JsonProperty("startPeriod")
    private Integer startPeriod;
    @JsonProperty("limit")
    private Double limit;
    @JsonProperty("numberPhases")
    private Integer numberPhases;

    @JsonProperty("startPeriod")
    public Integer getStartPeriod() {
        return startPeriod;
    }

    @JsonProperty("startPeriod")
    public void setStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
    }

    @JsonProperty("limit")
    public Double getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Double limit) {
        this.limit = limit;
    }

    @JsonProperty("numberPhases")
    public Integer getNumberPhases() {
        return numberPhases;
    }

    @JsonProperty("numberPhases")
    public void setNumberPhases(Integer numberPhases) {
        this.numberPhases = numberPhases;
    }

}
