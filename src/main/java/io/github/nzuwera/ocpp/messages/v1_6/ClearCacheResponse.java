package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Response;

import java.util.HashMap;
import java.util.Map;


/**
 * ClearCacheResponse
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status"
})
public class ClearCacheResponse extends Response {
    @JsonProperty("status")
    private ClearCacheResponse.Status status;

    @JsonProperty("status")
    public ClearCacheResponse.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(ClearCacheResponse.Status status) {
        this.status = status;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected");
        private final static Map<String, ClearCacheResponse.Status> CONSTANTS = new HashMap<String, ClearCacheResponse.Status>();

        static {
            for (ClearCacheResponse.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ClearCacheResponse.Status fromValue(String value) {
            ClearCacheResponse.Status constant = CONSTANTS.get(value);
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
