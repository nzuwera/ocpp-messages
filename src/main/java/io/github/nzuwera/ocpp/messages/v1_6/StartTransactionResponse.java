package io.github.nzuwera.ocpp.messages.v1_6;

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
public class StartTransactionResponse extends Response {
    @JsonProperty("idTagInfo")
    private IdTagInfo idTagInfo;
    @JsonProperty("transactionId")
    private Integer transactionId;

    @JsonProperty("idTagInfo")
    public IdTagInfo getIdTagInfo() {
        return idTagInfo;
    }

    @JsonProperty("idTagInfo")
    public void setIdTagInfo(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }

    @JsonProperty("transactionId")
    public Integer getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

}
