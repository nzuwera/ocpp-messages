package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Request;

import java.util.HashMap;
import java.util.Map;


/**
 * ResetRequest
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type"
})
public class Reset extends Request {
    @JsonProperty("type")
    private Reset.Type type;

    @JsonProperty("type")
    public Reset.Type getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Reset.Type type) {
        this.type = type;
    }


    public enum Type {

        HARD("Hard"),
        SOFT("Soft");
        private final static Map<String, Reset.Type> CONSTANTS = new HashMap<String, Reset.Type>();

        static {
            for (Reset.Type c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        Type(String value) {
            this.value = value;
        }

        @JsonCreator
        public static Reset.Type fromValue(String value) {
            Reset.Type constant = CONSTANTS.get(value);
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
