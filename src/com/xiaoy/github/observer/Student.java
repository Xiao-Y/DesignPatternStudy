package com.xiaoy.github.observer;

/**
 * @author liuyongtao
 * @since 2021-3-8 8:16
 */
public class Student {

    private String msg;
    private String name;

    public Student(String name, String msg) {
        this.msg = msg;
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
