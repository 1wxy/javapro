package com.wxy.test;

public class Girl {
    private String name;
    private String sex;
    private String tel;
    private String shuxing;

    public Girl(String name, String sex, String tel, String shuxing) {
        this.name = name;
        this.sex = sex;
        this.tel = tel;
        this.shuxing = shuxing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getShuxing() {
        return shuxing;
    }

    public void setShuxing(String shuxing) {
        this.shuxing = shuxing;
    }
}
