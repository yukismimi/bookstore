package cn.yukismimi.entity;

import cn.yukismimi.other.Response;

public class ResponseData {
    private int code;
    private String result;
    private Object data;

    public ResponseData(){
        this.code = 0;
        result = "failed";
        data = null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
