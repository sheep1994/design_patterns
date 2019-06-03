package com.talent.factory.abs.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 实现类
 * @create: 2019-06-03 17:34
 */
public class MysqlUser extends AbstractUser {

    @Override
    protected User insert(User user) {
        System.out.println("向mysql数据库插入一条数据");
        return null;
    }

    @Override
    protected void getUserById(Integer id) {
        System.out.println("获取mysql数据中User表中的一条记录 id = " + id);
    }
}
