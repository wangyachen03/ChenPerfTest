package com.chen.xia.entity;

public class User {
    private int id;
    private String loginname;
    private String passwd;
    private String sex;
    private int age;

    public User() {
    }

    public User(int id, String loginname, String passwd, String sex, int age) {
        this.id = id;
        this.loginname = loginname;
        this.passwd = passwd;
        this.sex = sex;
        this.age = age;
    }

    public User(String loginname, String passwd, String sex, int age) {
        this.loginname = loginname;
        this.passwd = passwd;
        this.sex = sex;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", passwd='" + passwd + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}