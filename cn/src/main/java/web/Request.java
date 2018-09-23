package web;

/**
 * HTTP请求实体
 */
public abstract class Request {

    public enum Method {
        GET, POST
    }

    private String host;
    private String url;
    private String[] parameters;
    private byte[] content;

}