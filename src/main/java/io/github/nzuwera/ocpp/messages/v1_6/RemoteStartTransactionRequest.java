
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
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
@Generated("jsonschema2pojo")
public class RemoteStartTransactionRequest extends Request {

    @JsonProperty("connectorId")
    private Integer connectorId;
    /**
     * 
     * (Required)
     * 
     */
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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idTag")
    public String getIdTag() {
        return idTag;
    }

    /**
     * 
     * (Required)
     * 
     */
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
