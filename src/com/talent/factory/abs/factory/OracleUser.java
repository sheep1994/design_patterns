package com.talent.factory.abs.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 实现类
 * @create: 2019-06-03 17:35
 */
public class OracleUser extends AbstractUser {

    @Override
    protected User insert(User user) {
        System.out.println("向oracle数据库中插入一条数据");
        return null;
    }

    @Override
    protected void getUserById(Integer id) {
        System.out.println("从oracle数据库中获取一条记录 id = " + id);
    }
}
