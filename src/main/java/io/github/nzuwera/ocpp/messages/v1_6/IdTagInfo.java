package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "expiryDate",
        "parentIdTag",
        "status"
})
public class IdTagInfo {

    @JsonProperty("expiryDate")
    private String expiryDate;
    @JsonProperty("parentIdTag")
    private String parentIdTag;
    @JsonProperty("status")
    private IdTagInfo.Status status;

    @JsonProperty("expiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    @JsonProperty("expiryDate")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @JsonProperty("parentIdTag")
    public String getParentIdTag() {
        return parentIdTag;
    }

    @JsonProperty("parentIdTag")
    public void setParentIdTag(String parentIdTag) {
        this.parentIdTag = parentIdTag;
    }

    @JsonProperty("status")
    public IdTagInfo.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(IdTagInfo.Status status) {
        this.status = status;
    }


    public enum Status {

        ACCEPTED("Accepted"),
        BLOCKED("Blocked"),
        EXPIRED("Expired"),
        INVALID("Invalid"),
        CONCURRENT_TX("ConcurrentTx");
        private final static Map<String, IdTagInfo.Status> CONSTANTS = new HashMap<String, IdTagInfo.Status>();

        static {
            for (IdTagInfo.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Status(String value) {
            this.value = value;
        }

        @JsonCreator
        public static IdTagInfo.Status fromValue(String value) {
            IdTagInfo.Status constant = CONSTANTS.get(value);
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
