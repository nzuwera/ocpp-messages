
package io.github.nzuwera.ocpp.messages.v1_6;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nzuwera.ocpp.messages.Response;


/**
 * DataTransferResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "data"
})
@Generated("jsonschema2pojo")
public class DataTransferResponse extends Response {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private DataTransferResponse.Status status;
    @JsonProperty("data")
    private String data;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public DataTransferResponse.Status getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(DataTransferResponse.Status status) {
        this.status = status;
    }

    @JsonProperty("data")
    public String getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    @Generated("jsonschema2pojo")
    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected"),
        UNKNOWN_MESSAGE_ID("UnknownMessageId"),
        UNKNOWN_VENDOR_ID("UnknownVendorId");
        private final String value;
        private final static Map<String, DataTransferResponse.Status> CONSTANTS = new HashMap<String, DataTransferResponse.Status>();

        static {
            for (DataTransferResponse.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static DataTransferResponse.Status fromValue(String value) {
            DataTransferResponse.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
