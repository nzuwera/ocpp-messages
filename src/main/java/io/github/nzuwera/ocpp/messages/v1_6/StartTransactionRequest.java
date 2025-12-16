
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
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
@Generated("jsonschema2pojo")
public class StartTransactionRequest extends Request {

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
    @JsonProperty("idTag")
    private String idTag;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meterStart")
    private Integer meterStart;
    @JsonProperty("reservationId")
    private Integer reservationId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    private String timestamp;

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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meterStart")
    public Integer getMeterStart() {
        return meterStart;
    }

    /**
     * 
     * (Required)
     * 
     */
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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
