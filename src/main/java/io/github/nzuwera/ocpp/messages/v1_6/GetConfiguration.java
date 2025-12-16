package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;

import java.util.ArrayList;
import java.util.List;


/**
 * GetConfigurationRequest
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "key"
})
public class GetConfiguration extends Request {

    @JsonProperty("key")
    private List<String> key = new ArrayList<String>();

    @JsonProperty("key")
    public List<String> getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(List<String> key) {
        this.key = key;
    }

}
