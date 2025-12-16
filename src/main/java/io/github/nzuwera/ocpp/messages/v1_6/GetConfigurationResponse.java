package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.ArrayList;
import java.util.List;


/**
 * GetConfigurationResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "configurationKey",
        "unknownKey"
})
public class GetConfigurationResponse extends Response {

    @JsonProperty("configurationKey")
    private List<ConfigurationKey> configurationKey = new ArrayList<ConfigurationKey>();
    @JsonProperty("unknownKey")
    private List<String> unknownKey = new ArrayList<String>();

    @JsonProperty("configurationKey")
    public List<ConfigurationKey> getConfigurationKey() {
        return configurationKey;
    }

    @JsonProperty("configurationKey")
    public void setConfigurationKey(List<ConfigurationKey> configurationKey) {
        this.configurationKey = configurationKey;
    }

    @JsonProperty("unknownKey")
    public List<String> getUnknownKey() {
        return unknownKey;
    }

    @JsonProperty("unknownKey")
    public void setUnknownKey(List<String> unknownKey) {
        this.unknownKey = unknownKey;
    }

}
