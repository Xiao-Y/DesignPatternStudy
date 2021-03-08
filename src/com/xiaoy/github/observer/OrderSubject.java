package com.xiaoy.github.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现主题
 *
 * @author liuyongtao
 * @since 2021-3-5 9:31
 */
public class OrderSubject implements Subject {

    Student student;

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(student.getName() + "===>>> 取消关注了...");
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(student);
        }
    }

    public void setStudent(Student student) {
        this.student = student;
        this.notifyObserver();
    }
}
