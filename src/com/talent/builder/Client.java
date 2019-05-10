package com.talent.builder;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 测试类
 * @create: 2019-05-09 20:39
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilderB();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
        System.out.println(product.getPartA());
    }
}
