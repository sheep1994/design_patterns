package com.talent.adapter;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 适配器测试类
 * @create: 2019-05-10 15:43
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {

        Adaptee adaptee = new Adaptee();

        Target target = new ObjectAdapter(adaptee);

        target.request();
    }
}
