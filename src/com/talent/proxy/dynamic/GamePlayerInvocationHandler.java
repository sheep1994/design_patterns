package com.talent.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 动态代理类，需要实现InvocationHandler接口才能实现动态代理
 * @create: 2019-05-10 14:09
 */
public class GamePlayerInvocationHandler implements InvocationHandler {

    /**
     * 真实对象
     */
    private Object target;

    /**
     * 生成代理对象
     * @return
     */
    public Object start(String className) {
        if (className == null) {
            return null;
        }
        // 真实对象创建
        try {
            Class<?> cls = Class.forName(className);
            target = cls.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if ("login".equalsIgnoreCase(method.getName())) {
            System.out.println("代理登录游戏");
            result = method.invoke(this.target, args);
            return result;
        }
        result = method.invoke(this.target, args);
        return result;
    }
}
