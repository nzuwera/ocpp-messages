
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * ReserveNowRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "connectorId",
    "expiryDate",
    "idTag",
    "parentIdTag",
    "reservationId"
})
@Generated("jsonschema2pojo")
public class ReserveNowRequest extends Request {

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
    @JsonProperty("expiryDate")
    private String expiryDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idTag")
    private String idTag;
    @JsonProperty("parentIdTag")
    private String parentIdTag;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reservationId")
    private Integer reservationId;

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
    @JsonProperty("expiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("expiryDate")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
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

    @JsonProperty("parentIdTag")
    public String getParentIdTag() {
        return parentIdTag;
    }

    @JsonProperty("parentIdTag")
    public void setParentIdTag(String parentIdTag) {
        this.parentIdTag = parentIdTag;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reservationId")
    public Integer getReservationId() {
        return reservationId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reservationId")
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

}
