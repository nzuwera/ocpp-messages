package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "timestamp",
        "sampledValue"
})
public class TransactionDatum {
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("sampledValue")
    private List<SampledValue> sampledValue = new ArrayList<SampledValue>();

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("sampledValue")
    public List<SampledValue> getSampledValue() {
        return sampledValue;
    }

    @JsonProperty("sampledValue")
    public void setSampledValue(List<SampledValue> sampledValue) {
        this.sampledValue = sampledValue;
    }

}
