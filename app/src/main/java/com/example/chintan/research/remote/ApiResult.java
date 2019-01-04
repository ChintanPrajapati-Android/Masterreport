package com.example.chintan.research.remote;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Kintan Patel on 20/05/2017.
 */

public class ApiResult {
    @SerializedName("RESULT")
    public String result;
    @SerializedName("DATA")
    public ArrayList<JsonObject> data;
    @SerializedName("LNGCODE")
    public String lngCode;
    @SerializedName("MSG")
    public String message;
    @SerializedName("LNGMSG")
    public String lngMessage;


    //use in app update block
    @SerializedName("title")
    public String title;
    @SerializedName("updatetext")
    public String updateBtnText;
    @SerializedName("exittext")
    public String exitBtnText;


    public boolean isSuccess() {
        return (result.equalsIgnoreCase(ApiConstant.SUCCESS));
    }
}
