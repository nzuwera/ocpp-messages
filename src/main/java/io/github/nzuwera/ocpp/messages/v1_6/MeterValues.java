package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;

import java.util.ArrayList;
import java.util.List;


/**
 * MeterValuesRequest
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "connectorId",
        "transactionId",
        "meterValue"
})
public class MeterValues extends Request {
    @JsonProperty("connectorId")
    private Integer connectorId;
    @JsonProperty("transactionId")
    private Integer transactionId;
    @JsonProperty("meterValue")
    private List<MeterValue> meterValue = new ArrayList<MeterValue>();

    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    @JsonProperty("transactionId")
    public Integer getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("meterValue")
    public List<MeterValue> getMeterValue() {
        return meterValue;
    }

    @JsonProperty("meterValue")
    public void setMeterValue(List<MeterValue> meterValue) {
        this.meterValue = meterValue;
    }

}
