package com.talent.strategy;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 手机卡充值
 * @create: 2019-05-17 15:28
 */
public class MobileStrategy implements Strategy {

    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge;
    }
}
