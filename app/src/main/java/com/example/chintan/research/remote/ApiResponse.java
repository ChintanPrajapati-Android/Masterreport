package com.example.chintan.research.remote;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sai on 28/07/2017.
 */
public class ApiResponse<T> {
    @Expose
    @SerializedName("RESULT")
    private String result;

    @SerializedName("MSG")
    @Expose
    private String message;

    @SerializedName("DATA")
    @Expose
    private T data;


    @SerializedName("LNGMSG")
    @Expose
    private String lngMessage;
    //use in app update block
    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("updatetext")
    @Expose
    private String updateBtnText;

    @SerializedName("exittext")
    @Expose
    private String exitBtnText;

    @SerializedName("LNGCODE")
    @Expose
    private String lngCode;

    public static <T> ApiResponse<T> getErrorApi() {
        ApiResponse<T> response = new ApiResponse<>();
        response.setResult(ApiConstant.FAIL);
        return response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return getResult().equalsIgnoreCase(ApiConstant.SUCCESS);
    }

    public String getLngMessage() {
        return lngMessage;
    }

    public void setLngMessage(String lngMessage) {
        this.lngMessage = lngMessage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdateBtnText() {
        return updateBtnText;
    }

    public void setUpdateBtnText(String updateBtnText) {
        this.updateBtnText = updateBtnText;
    }

    public String getExitBtnText() {
        return exitBtnText;
    }

    public void setExitBtnText(String exitBtnText) {
        this.exitBtnText = exitBtnText;
    }

    public String getLngCode() {
        return lngCode;
    }

    public void setLngCode(String lngCode) {
        this.lngCode = lngCode;
    }
}