package com.talent.proxy;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 代理测试类
 * @create: 2019-05-10 11:03
 */
public class ProxyTest {

    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.Request();
    }
}
