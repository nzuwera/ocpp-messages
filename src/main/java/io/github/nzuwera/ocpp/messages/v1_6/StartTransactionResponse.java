
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Response;


/**
 * StartTransactionResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idTagInfo",
    "transactionId"
})
@Generated("jsonschema2pojo")
public class StartTransactionResponse extends Response {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idTagInfo")
    private IdTagInfo idTagInfo;
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
    @JsonProperty("idTagInfo")
    public IdTagInfo getIdTagInfo() {
        return idTagInfo;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idTagInfo")
    public void setIdTagInfo(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }

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
