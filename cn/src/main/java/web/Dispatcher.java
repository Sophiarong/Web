package web;

public interface Dispatcher {

    /**
     * 注册处理器
     * @param handler
     */
    void registerHandler(Handler handler);

    /**
     * 处理HTTP请求
     * @param req
     * @param rep
     */
    void handle(Request req, Response rep);

}