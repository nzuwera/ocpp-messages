package io.github.nzuwera.ocpp.messages.v1_6;

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
public class ReserveNow extends Request {
    @JsonProperty("connectorId")
    private Integer connectorId;
    @JsonProperty("expiryDate")
    private String expiryDate;
    @JsonProperty("idTag")
    private String idTag;
    @JsonProperty("parentIdTag")
    private String parentIdTag;
    @JsonProperty("reservationId")
    private Integer reservationId;

    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    @JsonProperty("expiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    @JsonProperty("expiryDate")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @JsonProperty("idTag")
    public String getIdTag() {
        return idTag;
    }

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

    @JsonProperty("reservationId")
    public Integer getReservationId() {
        return reservationId;
    }

    @JsonProperty("reservationId")
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

}
