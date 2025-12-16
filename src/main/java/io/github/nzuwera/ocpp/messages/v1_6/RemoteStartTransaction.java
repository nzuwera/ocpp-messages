package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * RemoteStartTransactionRequest
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "connectorId",
        "idTag",
        "chargingProfile"
})
public class RemoteStartTransaction extends Request {

    @JsonProperty("connectorId")
    private Integer connectorId;
    @JsonProperty("idTag")
    private String idTag;
    @JsonProperty("chargingProfile")
    private ChargingProfile chargingProfile;

    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    @JsonProperty("idTag")
    public String getIdTag() {
        return idTag;
    }

    @JsonProperty("idTag")
    public void setIdTag(String idTag) {
        this.idTag = idTag;
    }

    @JsonProperty("chargingProfile")
    public ChargingProfile getChargingProfile() {
        return chargingProfile;
    }

    @JsonProperty("chargingProfile")
    public void setChargingProfile(ChargingProfile chargingProfile) {
        this.chargingProfile = chargingProfile;
    }

}
