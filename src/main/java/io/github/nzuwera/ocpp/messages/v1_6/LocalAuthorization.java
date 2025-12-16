package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "idTag",
        "idTagInfo"
})
public class LocalAuthorization {
    @JsonProperty("idTag")
    private String idTag;
    @JsonProperty("idTagInfo")
    private IdTagInfo idTagInfo;

    @JsonProperty("idTag")
    public String getIdTag() {
        return idTag;
    }

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
