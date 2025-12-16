
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * SetChargingProfileRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "connectorId",
    "csChargingProfiles"
})
@Generated("jsonschema2pojo")
public class SetChargingProfileRequest extends Request {

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
    @JsonProperty("csChargingProfiles")
    private CsChargingProfiles csChargingProfiles;

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
    @JsonProperty("csChargingProfiles")
    public CsChargingProfiles getCsChargingProfiles() {
        return csChargingProfiles;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("csChargingProfiles")
    public void setCsChargingProfiles(CsChargingProfiles csChargingProfiles) {
        this.csChargingProfiles = csChargingProfiles;
    }

}
