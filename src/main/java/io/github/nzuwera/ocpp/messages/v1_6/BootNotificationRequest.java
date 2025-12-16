
package io.github.nzuwera.ocpp.messages.v1_6;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.nzuwera.ocpp.messages.Request;


/**
 * BootNotificationRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "chargePointVendor",
    "chargePointModel",
    "chargePointSerialNumber",
    "chargeBoxSerialNumber",
    "firmwareVersion",
    "iccid",
    "imsi",
    "meterType",
    "meterSerialNumber"
})
@Generated("jsonschema2pojo")
public class BootNotificationRequest extends Request {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargePointVendor")
    private String chargePointVendor;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargePointModel")
    private String chargePointModel;
    @JsonProperty("chargePointSerialNumber")
    private String chargePointSerialNumber;
    @JsonProperty("chargeBoxSerialNumber")
    private String chargeBoxSerialNumber;
    @JsonProperty("firmwareVersion")
    private String firmwareVersion;
    @JsonProperty("iccid")
    private String iccid;
    @JsonProperty("imsi")
    private String imsi;
    @JsonProperty("meterType")
    private String meterType;
    @JsonProperty("meterSerialNumber")
    private String meterSerialNumber;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargePointVendor")
    public String getChargePointVendor() {
        return chargePointVendor;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargePointVendor")
    public void setChargePointVendor(String chargePointVendor) {
        this.chargePointVendor = chargePointVendor;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargePointModel")
    public String getChargePointModel() {
        return chargePointModel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargePointModel")
    public void setChargePointModel(String chargePointModel) {
        this.chargePointModel = chargePointModel;
    }

    @JsonProperty("chargePointSerialNumber")
    public String getChargePointSerialNumber() {
        return chargePointSerialNumber;
    }

    @JsonProperty("chargePointSerialNumber")
    public void setChargePointSerialNumber(String chargePointSerialNumber) {
        this.chargePointSerialNumber = chargePointSerialNumber;
    }

    @JsonProperty("chargeBoxSerialNumber")
    public String getChargeBoxSerialNumber() {
        return chargeBoxSerialNumber;
    }

    @JsonProperty("chargeBoxSerialNumber")
    public void setChargeBoxSerialNumber(String chargeBoxSerialNumber) {
        this.chargeBoxSerialNumber = chargeBoxSerialNumber;
    }

    @JsonProperty("firmwareVersion")
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    @JsonProperty("firmwareVersion")
    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    @JsonProperty("iccid")
    public String getIccid() {
        return iccid;
    }

    @JsonProperty("iccid")
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    @JsonProperty("imsi")
    public String getImsi() {
        return imsi;
    }

    @JsonProperty("imsi")
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    @JsonProperty("meterType")
    public String getMeterType() {
        return meterType;
    }

    @JsonProperty("meterType")
    public void setMeterType(String meterType) {
        this.meterType = meterType;
    }

    @JsonProperty("meterSerialNumber")
    public String getMeterSerialNumber() {
        return meterSerialNumber;
    }

    @JsonProperty("meterSerialNumber")
    public void setMeterSerialNumber(String meterSerialNumber) {
        this.meterSerialNumber = meterSerialNumber;
    }

}
