
package io.github.nzuwera.ocpp.messages.v1_6;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


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
@Generated("jsonschema2pojo")
public class MeterValuesRequest extends Request {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("connectorId")
    private Integer connectorId;
    @JsonProperty("transactionId")
    private Integer transactionId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meterValue")
    private List<MeterValue> meterValue = new ArrayList<MeterValue>();

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

    @JsonProperty("transactionId")
    public Integer getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meterValue")
    public List<MeterValue> getMeterValue() {
        return meterValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meterValue")
    public void setMeterValue(List<MeterValue> meterValue) {
        this.meterValue = meterValue;
    }

}
