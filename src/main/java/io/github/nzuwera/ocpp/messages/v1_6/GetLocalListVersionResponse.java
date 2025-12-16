
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
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
@Generated("jsonschema2pojo")
public class GetLocalListVersionResponse extends Response {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("listVersion")
    private Integer listVersion;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("listVersion")
    public Integer getListVersion() {
        return listVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("listVersion")
    public void setListVersion(Integer listVersion) {
        this.listVersion = listVersion;
    }

}
