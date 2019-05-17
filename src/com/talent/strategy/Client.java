package com.talent.strategy;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 测试类
 * @create: 2019-05-17 15:36
 */
public class Client {

    public static void main(String[] args) {

        Context context = new Context();
        // 网银充值100 需要付多少
        Double money = context.calRecharge(100D,
                RechargeTypeEnum.E_BANK.getCode());
        System.out.println(money);

        // 商户账户充值100 需要付多少
        Double money2 = context.calRecharge(100D,
                RechargeTypeEnum.BUSI_ACCOUNTS.getCode());
        System.out.println(money2);

        // 手机充值100 需要付多少
        Double money3 = context.calRecharge(100D,
                RechargeTypeEnum.MOBILE.getCode());
        System.out.println(money3);

        // 充值卡充值100 需要付多少
        Double money4 = context.calRecharge(100D,
                RechargeTypeEnum.CARD_RECHARGE.getCode());
        System.out.println(money4);
    }
}
