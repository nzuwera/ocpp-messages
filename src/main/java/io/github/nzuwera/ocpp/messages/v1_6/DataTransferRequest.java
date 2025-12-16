
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * DataTransferRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vendorId",
    "messageId",
    "data"
})
@Generated("jsonschema2pojo")
public class DataTransferRequest extends Request {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vendorId")
    private String vendorId;
    @JsonProperty("messageId")
    private String messageId;
    @JsonProperty("data")
    private String data;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vendorId")
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @JsonProperty("data")
    public String getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

}
