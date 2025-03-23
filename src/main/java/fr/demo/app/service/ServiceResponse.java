package fr.demo.app.service;

import fr.demo.app.bo.Article;

public class ServiceResponse<T> {
    public String code;
    public String message;
    public T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public static <T> ServiceResponse<T> performResponse(String code, String message, T data) {
        ServiceResponse<T> serviceResponse = new ServiceResponse<T>();
        serviceResponse.code = code;
        serviceResponse.message = message;
        serviceResponse.data = data;

        return serviceResponse;
    }
}