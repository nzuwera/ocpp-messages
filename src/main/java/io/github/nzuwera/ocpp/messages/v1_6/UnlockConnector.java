package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * UnlockConnectorRequest
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "connectorId"
})
public class UnlockConnector extends Request {
    @JsonProperty("connectorId")
    private Integer connectorId;

    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

}
