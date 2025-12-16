
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Response;


/**
 * AuthorizeResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idTagInfo"
})
@Generated("jsonschema2pojo")
public class AuthorizeResponse extends Response {

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

}
