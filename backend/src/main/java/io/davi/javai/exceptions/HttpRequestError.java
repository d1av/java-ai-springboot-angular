package io.davi.javai.exceptions;

public class HttpRequestError extends RuntimeException{
    public HttpRequestError(String msg) {
        super(msg);
    }
}
