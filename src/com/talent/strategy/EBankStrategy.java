package com.talent.strategy;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 网银充值实现
 * @create: 2019-05-17 15:26
 */
public class EBankStrategy implements Strategy {

    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge * 0.85;
    }
}
