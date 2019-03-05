package cn.yukismimi.other;

public class Response<T> {

    private final static String SUCCESS_CODE = "200";
    private String status;
    private String message;
    private T data;

    public Response() {
        this.status = SUCCESS_CODE;
        this.message = "SUCCESS";
    }

    public Response(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
}
