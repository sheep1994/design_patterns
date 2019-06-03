package com.talent.factory.abs.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 测试类
 * @create: 2019-06-03 17:43
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = new OracleFactory();

        AbstractUser user = factory.createUser();
        user.getUserById(1);
    }
}
