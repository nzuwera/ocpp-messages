
package io.github.nzuwera.ocpp.messages.v1_6;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "expiryDate",
    "parentIdTag",
    "status"
})
@Generated("jsonschema2pojo")
public class IdTagInfo {

    @JsonProperty("expiryDate")
    private String expiryDate;
    @JsonProperty("parentIdTag")
    private String parentIdTag;
    /**
     * 
     * (Required)
     * 
     */
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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public IdTagInfo.Status getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(IdTagInfo.Status status) {
        this.status = status;
    }

    @Generated("jsonschema2pojo")
    public enum Status {

        ACCEPTED("Accepted"),
        BLOCKED("Blocked"),
        EXPIRED("Expired"),
        INVALID("Invalid"),
        CONCURRENT_TX("ConcurrentTx");
        private final String value;
        private final static Map<String, IdTagInfo.Status> CONSTANTS = new HashMap<String, IdTagInfo.Status>();

        static {
            for (IdTagInfo.Status c: values()) {
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
        public static IdTagInfo.Status fromValue(String value) {
            IdTagInfo.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
