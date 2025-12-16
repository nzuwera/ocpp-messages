
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startPeriod",
    "limit",
    "numberPhases"
})
@Generated("jsonschema2pojo")
public class ChargingSchedulePeriod {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startPeriod")
    private Integer startPeriod;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limit")
    private Double limit;
    @JsonProperty("numberPhases")
    private Integer numberPhases;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startPeriod")
    public Integer getStartPeriod() {
        return startPeriod;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startPeriod")
    public void setStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limit")
    public Double getLimit() {
        return limit;
    }

    /**
     * 
     * (Required)
     * 
     */
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
