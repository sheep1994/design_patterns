package com.talent.factory;

public enum MessageEnum {

    SMS("SMS"),

    EMAIL("EMAIL"),

    OA("OA");

    private String name;

    MessageEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
