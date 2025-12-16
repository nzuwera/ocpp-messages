
package io.github.nzuwera.ocpp.messages.v1_6;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


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
@Generated("jsonschema2pojo")
public class GetConfigurationRequest extends Request {

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
