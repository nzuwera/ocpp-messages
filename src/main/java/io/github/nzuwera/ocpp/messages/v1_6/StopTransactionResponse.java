package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Response;


/**
 * StopTransactionResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "idTagInfo"
})
public class StopTransactionResponse extends Response {

    @JsonProperty("idTagInfo")
    private IdTagInfo idTagInfo;

    @JsonProperty("idTagInfo")
    public IdTagInfo getIdTagInfo() {
        return idTagInfo;
    }

    @JsonProperty("idTagInfo")
    public void setIdTagInfo(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }

}
