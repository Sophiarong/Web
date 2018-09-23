package web;

public interface Handler {

    /**
     * 处理HTTP请求
     * @param req
     * @param rep
     */
    void handle(Request req, Response rep);

}