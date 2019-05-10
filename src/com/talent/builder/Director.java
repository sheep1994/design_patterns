package com.talent.builder;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 指挥者
 * @create: 2019-05-09 20:31
 */
public class Director {

    private Builder builder;

    /**
     * 构造方法注入
     * @param builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * setter方式注入
     * @param builder
     */
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
