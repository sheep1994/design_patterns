package com.talent.builder;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 具体建造者B
 * @create: 2019-05-09 20:31
 */
public class ConcreteBuilderB extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA1");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB1");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC1");
    }
}
