package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Response;


/**
 * GetLocalListVersionResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "listVersion"
})
public class GetLocalListVersionResponse extends Response {
    @JsonProperty("listVersion")
    private Integer listVersion;

    @JsonProperty("listVersion")
    public Integer getListVersion() {
        return listVersion;
    }

    @JsonProperty("listVersion")
    public void setListVersion(Integer listVersion) {
        this.listVersion = listVersion;
    }

}
