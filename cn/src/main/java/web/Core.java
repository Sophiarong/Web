package web;

/**
 * 监听端口,分发访问
 */
public class Core {

    public void listen(int port)
    {
        // 开始监听socket,收到客户端连接后,提取Request交由Dispatcher分发给Handler处理,再将的Response转HTTP报文发会给客户端,然后关闭连接
    }

    public static void main( String[] args )
    {
    }
    
}