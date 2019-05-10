package com.talent.proxy.dynamic;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 动态代理测试类
 * @create: 2019-05-10 11:27
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        IGamePlayer proxy = (IGamePlayer) new GamePlayerInvocationHandler().start("com.talent.proxy.dynamic.GamePlayer");
        proxy.login("张三", "123456");
        proxy.killBoss();
        proxy.upGrade();

    }
}
