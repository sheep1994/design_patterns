package com.talent.builder;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 具体建造者A
 * @create: 2019-05-09 20:30
 */
public class ConcreteBuilderA extends Builder {


    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
