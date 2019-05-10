package com.talent.builder;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 产品角色
 * @create: 2019-05-09 20:27
 */
public class Product {

    /**
     * 这个产品中需要操作的属性
     */
    private String partA;

    private String partB;

    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public String getPartA() {
        return partA;
    }

    public String getPartB() {
        return partB;
    }

    public String getPartC() {
        return partC;
    }

    public void show() {
        System.out.println("你好");
    }
}
