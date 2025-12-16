package io.github.nzuwera.ocpp.messages.v1_6;

import com.fasterxml.jackson.annotation.*;
import io.github.nzuwera.ocpp.messages.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
public class SendLocalList extends Request {
    @JsonProperty("listVersion")
    private Integer listVersion;
    @JsonProperty("localAuthorizationList")
    private List<LocalAuthorization> localAuthorizationList = new ArrayList<LocalAuthorization>();
    @JsonProperty("updateType")
    private SendLocalList.UpdateType updateType;

    @JsonProperty("listVersion")
    public Integer getListVersion() {
        return listVersion;
    }

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

    @JsonProperty("updateType")
    public SendLocalList.UpdateType getUpdateType() {
        return updateType;
    }

    @JsonProperty("updateType")
    public void setUpdateType(SendLocalList.UpdateType updateType) {
        this.updateType = updateType;
    }


    public enum UpdateType {

        DIFFERENTIAL("Differential"),
        FULL("Full");
        private final static Map<String, SendLocalList.UpdateType> CONSTANTS = new HashMap<String, SendLocalList.UpdateType>();

        static {
            for (SendLocalList.UpdateType c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private final String value;

        UpdateType(String value) {
            this.value = value;
        }

        @JsonCreator
        public static SendLocalList.UpdateType fromValue(String value) {
            SendLocalList.UpdateType constant = CONSTANTS.get(value);
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
