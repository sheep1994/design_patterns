package com.talent.propotype;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 原型引用类
 * @create: 2019-05-09 10:48
 */
public class PersonalInfo implements Cloneable {

    private String age;

    private String sex;

    @Override
    protected PersonalInfo clone() throws CloneNotSupportedException {
        PersonalInfo personalInfo = null;
        personalInfo = (PersonalInfo) super.clone();
        return personalInfo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
