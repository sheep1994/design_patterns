package com.talent.factory.abs.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 抽象工厂类
 * @create: 2019-06-03 17:40
 */
public abstract class AbstractFactory {

    /**
     * 创建用户表的实现类对象
     * @param <T>
     * @return
     */
    protected abstract  <T extends AbstractUser> T createUser();

    /**
     * 创建登录记录表的实现类对象
     * @param <T>
     * @return
     */
    protected abstract <T extends AbstractLogin> T createLogin();
}
