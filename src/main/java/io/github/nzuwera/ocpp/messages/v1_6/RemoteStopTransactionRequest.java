
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * RemoteStopTransactionRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactionId"
})
@Generated("jsonschema2pojo")
public class RemoteStopTransactionRequest extends Request {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionId")
    private Integer transactionId;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionId")
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionId")
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

}
