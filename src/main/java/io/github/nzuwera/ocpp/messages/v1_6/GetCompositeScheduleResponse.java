
package io.github.nzuwera.ocpp.messages.v1_6;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nzuwera.ocpp.messages.Response;


/**
 * GetCompositeScheduleResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "connectorId",
    "scheduleStart",
    "chargingSchedule"
})
@Generated("jsonschema2pojo")
public class GetCompositeScheduleResponse extends Response {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private GetCompositeScheduleResponse.Status status;
    @JsonProperty("connectorId")
    private Integer connectorId;
    @JsonProperty("scheduleStart")
    private String scheduleStart;
    @JsonProperty("chargingSchedule")
    private ChargingSchedule chargingSchedule;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public GetCompositeScheduleResponse.Status getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(GetCompositeScheduleResponse.Status status) {
        this.status = status;
    }

    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    @JsonProperty("scheduleStart")
    public String getScheduleStart() {
        return scheduleStart;
    }

    @JsonProperty("scheduleStart")
    public void setScheduleStart(String scheduleStart) {
        this.scheduleStart = scheduleStart;
    }

    @JsonProperty("chargingSchedule")
    public ChargingSchedule getChargingSchedule() {
        return chargingSchedule;
    }

    @JsonProperty("chargingSchedule")
    public void setChargingSchedule(ChargingSchedule chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }

    @Generated("jsonschema2pojo")
    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected");
        private final String value;
        private final static Map<String, GetCompositeScheduleResponse.Status> CONSTANTS = new HashMap<String, GetCompositeScheduleResponse.Status>();

        static {
            for (GetCompositeScheduleResponse.Status c: values()) {
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
        public static GetCompositeScheduleResponse.Status fromValue(String value) {
            GetCompositeScheduleResponse.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
