
package io.github.nzuwera.ocpp.messages.v1_6;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "sampledValue"
})
@Generated("jsonschema2pojo")
public class TransactionDatum {

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
    @JsonProperty("sampledValue")
    private List<SampledValue> sampledValue = new ArrayList<SampledValue>();

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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sampledValue")
    public List<SampledValue> getSampledValue() {
        return sampledValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sampledValue")
    public void setSampledValue(List<SampledValue> sampledValue) {
        this.sampledValue = sampledValue;
    }

}
