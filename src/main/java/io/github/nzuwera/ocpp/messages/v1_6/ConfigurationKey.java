package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "key",
        "readonly",
        "value"
})
public class ConfigurationKey {
    @JsonProperty("key")
    private String key;
    @JsonProperty("readonly")
    private Boolean readonly;
    @JsonProperty("value")
    private String value;

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("readonly")
    public Boolean getReadonly() {
        return readonly;
    }

    @JsonProperty("readonly")
    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

}
