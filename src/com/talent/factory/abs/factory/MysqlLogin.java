package com.talent.factory.abs.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 实现类
 * @create: 2019-06-03 17:38
 */
public class MysqlLogin extends AbstractLogin {

    @Override
    protected Login insert(Login login) {
        System.out.println("向mysql数据库中插入一条登录记录");
        return null;
    }

    @Override
    protected void getLoginById(Integer id) {
        System.out.println("从mysql数据库中获取一条记录 id = " + id);
    }
}
