package com.talent.strategy;

import sun.security.x509.AVA;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 充值类型枚举类
 * @create: 2019-05-17 15:08
 */
public enum RechargeTypeEnum {

    /**
     * 网银充值
     */
    E_BANK(1, "网银"),

    /**
     * 商户账号充值
     */
    BUSI_ACCOUNTS(2, "商户账号"),

    /**
     * 手机卡充值
     */
    MOBILE(3,"手机卡充值"),

    /**
     * 充值卡充值
     */
    CARD_RECHARGE(4,"充值卡");

    private Integer code;

    private String description;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    RechargeTypeEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public static RechargeTypeEnum valueOf(Integer value) {
        if (value == null) {
            return null;
        }
        for (RechargeTypeEnum typeEnum : RechargeTypeEnum.values()) {
            if (typeEnum.code.equals(value)) {
                return typeEnum;
            }
        }
        return null;
    }
}
