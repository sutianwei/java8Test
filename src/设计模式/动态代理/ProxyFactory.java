package 设计模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){


        // load :指定当前目前对象使用的类加载器，获取加载器的方法固定
        // interfaces ：目标对象实现的接口方法，使用泛型确认类型
        // invocationHandler : 事件处理，执行目标对象的方法时，会触发事情的处理器方法，
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk d代理开始------");
                //反射机制调用目标对象
                Object invoke = method.invoke(target, args);

                return invoke;
            }
        });
    }
}
