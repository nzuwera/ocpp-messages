package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


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
public class DataTransferResponse extends Response {
    @JsonProperty("status")
    private DataTransferResponse.Status status;
    @JsonProperty("data")
    private String data;

    @JsonProperty("status")
    public DataTransferResponse.Status getStatus() {
        return status;
    }

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


    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected"),
        UNKNOWN_MESSAGE_ID("UnknownMessageId"),
        UNKNOWN_VENDOR_ID("UnknownVendorId");
        private final static Map<String, DataTransferResponse.Status> CONSTANTS = new HashMap<String, DataTransferResponse.Status>();

        static {
            for (DataTransferResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
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

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

    }

}
