package web;

import java.util.Map;

/**
 * HTTP响应实体
 */
public abstract class Response {

    private int statusCode;

    private Map<String, String> headers;

    private byte[] content;

    public abstract void addHeader(String key, String value);

    /**
     * 写入报文正文
     */
    public abstract void write(String data);

    public abstract void write(byte[] data);

    /**
     * 生成HTTP响应报文
     */
    public abstract byte[] stringify();

}