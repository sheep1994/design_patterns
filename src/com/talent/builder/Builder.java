package com.talent.builder;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 抽象建造者
 * @create: 2019-05-09 20:28
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    /**
     * 返回一个复杂对象结果
     * @return
     */
    public Product getResult() {
        return product;
    }
}
