package com.talent.proxy;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 真实主题
 * @create: 2019-05-10 11:09
 */
public class RealSubject implements Subject {

    @Override
    public void Request() {
        System.out.println("访问真实主题方法");
    }
}
