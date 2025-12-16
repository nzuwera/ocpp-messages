
package io.github.nzuwera.ocpp.messages.v1_6;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * ChangeAvailabilityRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "connectorId",
    "type"
})
@Generated("jsonschema2pojo")
public class ChangeAvailabilityRequest extends Request {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("connectorId")
    private Integer connectorId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private ChangeAvailabilityRequest.Type type;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public ChangeAvailabilityRequest.Type getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(ChangeAvailabilityRequest.Type type) {
        this.type = type;
    }

    @Generated("jsonschema2pojo")
    public enum Type {

        INOPERATIVE("Inoperative"),
        OPERATIVE("Operative");
        private final String value;
        private final static Map<String, ChangeAvailabilityRequest.Type> CONSTANTS = new HashMap<String, ChangeAvailabilityRequest.Type>();

        static {
            for (ChangeAvailabilityRequest.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static ChangeAvailabilityRequest.Type fromValue(String value) {
            ChangeAvailabilityRequest.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
