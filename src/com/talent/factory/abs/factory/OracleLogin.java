package com.talent.factory.abs.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 实现类
 * @create: 2019-06-03 17:39
 */
public class OracleLogin extends AbstractLogin {

    @Override
    protected Login insert(Login login) {
        System.out.println("向oracle数据库中插入一条登录记录");
        return null;
    }

    @Override
    protected void getLoginById(Integer id) {
        System.out.println("从oracle数据库中获取一条记录 id = " + id);
    }
}
