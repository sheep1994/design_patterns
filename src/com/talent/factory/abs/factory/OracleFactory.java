package com.talent.factory.abs.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 工厂实现类
 * @create: 2019-06-03 17:42
 */
public class OracleFactory extends AbstractFactory {

    @Override
    protected <T extends AbstractUser> T createUser() {
        return (T) new OracleUser();
    }

    @Override
    protected <T extends AbstractLogin> T createLogin() {
        return (T) new OracleLogin();
    }
}
