package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Response;


/**
 * GetDiagnosticsResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "fileName"
})
public class GetDiagnosticsResponse extends Response {

    @JsonProperty("fileName")
    private String fileName;

    @JsonProperty("fileName")
    public String getFileName() {
        return fileName;
    }

    @JsonProperty("fileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
