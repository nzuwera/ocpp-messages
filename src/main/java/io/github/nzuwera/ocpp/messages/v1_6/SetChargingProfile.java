package io.github.nzuwera.ocpp.messages.v1_6;

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
public class SetChargingProfile extends Request {
    @JsonProperty("connectorId")
    private Integer connectorId;
    @JsonProperty("csChargingProfiles")
    private CsChargingProfiles csChargingProfiles;

    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    @JsonProperty("csChargingProfiles")
    public CsChargingProfiles getCsChargingProfiles() {
        return csChargingProfiles;
    }

    @JsonProperty("csChargingProfiles")
    public void setCsChargingProfiles(CsChargingProfiles csChargingProfiles) {
        this.csChargingProfiles = csChargingProfiles;
    }

}
