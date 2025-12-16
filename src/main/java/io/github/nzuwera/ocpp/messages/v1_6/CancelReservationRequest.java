
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * CancelReservationRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reservationId"
})
@Generated("jsonschema2pojo")
public class CancelReservationRequest extends Request {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reservationId")
    private Integer reservationId;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reservationId")
    public Integer getReservationId() {
        return reservationId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reservationId")
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

}
