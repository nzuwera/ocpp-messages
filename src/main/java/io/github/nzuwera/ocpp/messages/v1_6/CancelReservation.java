package io.github.nzuwera.ocpp.messages.v1_6;

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
public class CancelReservation extends Request {
    @JsonProperty("reservationId")
    private Integer reservationId;

    @JsonProperty("reservationId")
    public Integer getReservationId() {
        return reservationId;
    }

    @JsonProperty("reservationId")
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

}
