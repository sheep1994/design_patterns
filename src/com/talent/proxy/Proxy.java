package com.talent.proxy;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 代理对象
 * @create: 2019-05-10 11:10
 */
public class Proxy implements Subject {

    /**
     * 定义真实对象
     */
    private RealSubject realSubject;

    public void preRequest() {
        System.out.println("访问真实主题前的预处理");
    }

    public void postRequest() {
        System.out.println("访问真实主题后的处理");
    }

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }
}
