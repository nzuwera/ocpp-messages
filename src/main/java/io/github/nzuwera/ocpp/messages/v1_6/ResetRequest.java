
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
 * ResetRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type"
})
@Generated("jsonschema2pojo")
public class ResetRequest extends Request {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private ResetRequest.Type type;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public ResetRequest.Type getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(ResetRequest.Type type) {
        this.type = type;
    }

    @Generated("jsonschema2pojo")
    public enum Type {

        HARD("Hard"),
        SOFT("Soft");
        private final String value;
        private final static Map<String, ResetRequest.Type> CONSTANTS = new HashMap<String, ResetRequest.Type>();

        static {
            for (ResetRequest.Type c: values()) {
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
        public static ResetRequest.Type fromValue(String value) {
            ResetRequest.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
