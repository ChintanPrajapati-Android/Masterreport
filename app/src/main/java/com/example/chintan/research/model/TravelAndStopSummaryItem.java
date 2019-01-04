package com.example.chintan.research.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by sai on 18/07/2017.
 */

public class TravelAndStopSummaryItem implements Serializable {
    @SerializedName("COMPANY")
    public String COMPANY;
    @SerializedName("VEHICLE_ID")
    public int VEHICLE_ID;
    @SerializedName("VEHICLE_TYPE")
    public String VEHICLE_TYPE;
    @SerializedName("VEHICLE_NUMBER")
    public String VEHICLE_NUMBER;
    @SerializedName("STOPTIME")
    public String STOPTIME;
    @SerializedName("RUNNINGDISTANCE")
    public double RUNNINGDISTANCE;
    @SerializedName("RUNNINGTIME")
    public String RUNNINGTIME;
    @SerializedName("AVGSPEED")
    public String AVGSPEED;
    @SerializedName("MAXSPEED")
    public String MAXSPEED;
    @SerializedName("IDELTIME")
    public String IDELTIME;
    @SerializedName("INACTIVETIME")
    public String INACTIVETIME;
    @SerializedName("ALERT")
    public String ALERT;
    @SerializedName("DATE")
    public String DATE;
    @SerializedName("TOTALSTOP")
    public String TOTALSTOP;
    @SerializedName("SPEEDUNIT")
    public String SPEEDUNIT;

    public String getCOMPANY() {
        return COMPANY;
    }

    public void setCOMPANY(String COMPANY) {
        this.COMPANY = COMPANY;
    }

    public int getVEHICLE_ID() {
        return VEHICLE_ID;
    }

    public void setVEHICLE_ID(int VEHICLE_ID) {
        this.VEHICLE_ID = VEHICLE_ID;
    }

    public String getVEHICLE_TYPE() {
        return VEHICLE_TYPE;
    }

    public void setVEHICLE_TYPE(String VEHICLE_TYPE) {
        this.VEHICLE_TYPE = VEHICLE_TYPE;
    }

    public String getVEHICLE_NUMBER() {
        return VEHICLE_NUMBER;
    }

    public void setVEHICLE_NUMBER(String VEHICLE_NUMBER) {
        this.VEHICLE_NUMBER = VEHICLE_NUMBER;
    }

    public String getSTOPTIME() {
        return STOPTIME;
    }

    public void setSTOPTIME(String STOPTIME) {
        this.STOPTIME = STOPTIME;
    }

    public double getRUNNINGDISTANCE() {
        return RUNNINGDISTANCE;
    }

    public void setRUNNINGDISTANCE(double RUNNINGDISTANCE) {
        this.RUNNINGDISTANCE = RUNNINGDISTANCE;
    }

    public String getRoundRunningDistance() {
        return String.valueOf(Math.round(RUNNINGDISTANCE));
    }

    public String getRUNNINGTIME() {
        return RUNNINGTIME;
    }

    public void setRUNNINGTIME(String RUNNINGTIME) {
        this.RUNNINGTIME = RUNNINGTIME;
    }

    public String getAVGSPEED() {
        return AVGSPEED;
    }

    public void setAVGSPEED(String AVGSPEED) {
        this.AVGSPEED = AVGSPEED;
    }

    public String getMAXSPEED() {
        return MAXSPEED;
    }

    public void setMAXSPEED(String MAXSPEED) {
        this.MAXSPEED = MAXSPEED;
    }

    public String getIDELTIME() {
        return IDELTIME;
    }

    public void setIDELTIME(String IDELTIME) {
        this.IDELTIME = IDELTIME;
    }

    public String getINACTIVETIME() {
        return INACTIVETIME;
    }

    public void setINACTIVETIME(String INACTIVETIME) {
        this.INACTIVETIME = INACTIVETIME;
    }

    public String getALERT() {
        return ALERT;
    }

    public void setALERT(String ALERT) {
        this.ALERT = ALERT;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getTOTALSTOP() {
        return TOTALSTOP;
    }

    public void setTOTALSTOP(String TOTALSTOP) {
        this.TOTALSTOP = TOTALSTOP;
    }

    public String getSPEEDUNIT() {
        return SPEEDUNIT;
    }

    public void setSPEEDUNIT(String SPEEDUNIT) {
        this.SPEEDUNIT = SPEEDUNIT;
    }
}
