package pattern.proxy.interface_proxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by wangheng on 16/7/2.
 */
public interface ProxyRule {

    Object getProxyObj(Class interfaceClass,InvocationHandler invocationHandler);
}
