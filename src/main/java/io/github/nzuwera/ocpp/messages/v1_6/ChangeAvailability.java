package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Request;

import java.util.HashMap;
import java.util.Map;


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
public class ChangeAvailability extends Request {
    @JsonProperty("connectorId")
    private Integer connectorId;
    @JsonProperty("type")
    private ChangeAvailability.Type type;

    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    @JsonProperty("type")
    public ChangeAvailability.Type getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(ChangeAvailability.Type type) {
        this.type = type;
    }


    public enum Type {

        INOPERATIVE("Inoperative"),
        OPERATIVE("Operative");
        private final static Map<String, ChangeAvailability.Type> CONSTANTS = new HashMap<String, ChangeAvailability.Type>();

        static {
            for (ChangeAvailability.Type c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Type(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ChangeAvailability.Type fromValue(String value) {
            ChangeAvailability.Type constant = CONSTANTS.get(value);
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
