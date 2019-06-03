package com.talent.factory.abs.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 抽象工厂登录类
 * @create: 2019-06-03 17:36
 */
public abstract class AbstractLogin {

    /**
     * 向数据库中插入一条记录
     * @param login
     * @return
     */
    protected abstract Login insert(Login login);

    /**
     * 获取一条记录
     * @param id
     */
    protected abstract void getLoginById(Integer id);
}
