package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * StartTransactionRequest
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "connectorId",
        "idTag",
        "meterStart",
        "reservationId",
        "timestamp"
})
public class StartTransaction extends Request {
    @JsonProperty("connectorId")
    private Integer connectorId;
    @JsonProperty("idTag")
    private String idTag;
    @JsonProperty("meterStart")
    private Integer meterStart;
    @JsonProperty("reservationId")
    private Integer reservationId;
    @JsonProperty("timestamp")
    private String timestamp;

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

    @JsonProperty("meterStart")
    public Integer getMeterStart() {
        return meterStart;
    }

    @JsonProperty("meterStart")
    public void setMeterStart(Integer meterStart) {
        this.meterStart = meterStart;
    }

    @JsonProperty("reservationId")
    public Integer getReservationId() {
        return reservationId;
    }

    @JsonProperty("reservationId")
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
