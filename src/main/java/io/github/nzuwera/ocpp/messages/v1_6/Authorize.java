package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * AuthorizeRequest
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "idTag"
})
public class Authorize extends Request {
    @JsonProperty("idTag")
    private String idTag;

    @JsonProperty("idTag")
    public String getIdTag() {
        return idTag;
    }

    @JsonProperty("idTag")
    public void setIdTag(String idTag) {
        this.idTag = idTag;
    }

}
