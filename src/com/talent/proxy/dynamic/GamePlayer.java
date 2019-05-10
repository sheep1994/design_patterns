package com.talent.proxy.dynamic;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 真实主题实现
 * @create: 2019-05-10 14:06
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer() {}

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        System.out.println("登录名" + username + ", 密码" + password + "以进入游戏" );
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "杀怪了");
    }

    @Override
    public void upGrade() {
        System.out.println(this.name + "升级了");
    }
}
