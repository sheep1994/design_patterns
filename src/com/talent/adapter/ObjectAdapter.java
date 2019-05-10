package com.talent.adapter;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 对象适配器
 * @create: 2019-05-10 15:40
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
