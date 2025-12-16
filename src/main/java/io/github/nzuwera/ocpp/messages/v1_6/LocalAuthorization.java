
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idTag",
    "idTagInfo"
})
@Generated("jsonschema2pojo")
public class LocalAuthorization {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idTag")
    private String idTag;
    @JsonProperty("idTagInfo")
    private IdTagInfo idTagInfo;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idTag")
    public String getIdTag() {
        return idTag;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idTag")
    public void setIdTag(String idTag) {
        this.idTag = idTag;
    }

    @JsonProperty("idTagInfo")
    public IdTagInfo getIdTagInfo() {
        return idTagInfo;
    }

    @JsonProperty("idTagInfo")
    public void setIdTagInfo(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }

}
