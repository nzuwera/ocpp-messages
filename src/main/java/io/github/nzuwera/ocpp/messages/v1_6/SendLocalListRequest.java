
package io.github.nzuwera.ocpp.messages.v1_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * SendLocalListRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "listVersion",
    "localAuthorizationList",
    "updateType"
})
@Generated("jsonschema2pojo")
public class SendLocalListRequest extends Request {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("listVersion")
    private Integer listVersion;
    @JsonProperty("localAuthorizationList")
    private List<LocalAuthorization> localAuthorizationList = new ArrayList<LocalAuthorization>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updateType")
    private SendLocalListRequest.UpdateType updateType;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("listVersion")
    public Integer getListVersion() {
        return listVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("listVersion")
    public void setListVersion(Integer listVersion) {
        this.listVersion = listVersion;
    }

    @JsonProperty("localAuthorizationList")
    public List<LocalAuthorization> getLocalAuthorizationList() {
        return localAuthorizationList;
    }

    @JsonProperty("localAuthorizationList")
    public void setLocalAuthorizationList(List<LocalAuthorization> localAuthorizationList) {
        this.localAuthorizationList = localAuthorizationList;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updateType")
    public SendLocalListRequest.UpdateType getUpdateType() {
        return updateType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updateType")
    public void setUpdateType(SendLocalListRequest.UpdateType updateType) {
        this.updateType = updateType;
    }

    @Generated("jsonschema2pojo")
    public enum UpdateType {

        DIFFERENTIAL("Differential"),
        FULL("Full");
        private final String value;
        private final static Map<String, SendLocalListRequest.UpdateType> CONSTANTS = new HashMap<String, SendLocalListRequest.UpdateType>();

        static {
            for (SendLocalListRequest.UpdateType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        UpdateType(String value) {
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
        public static SendLocalListRequest.UpdateType fromValue(String value) {
            SendLocalListRequest.UpdateType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
