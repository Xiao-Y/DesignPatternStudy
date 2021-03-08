package com.xiaoy.github.observer;

/**
 * 测试
 *
 * @author liuyongtao
 * @since 2021-3-5 9:37
 */
public class Main {

    public static void main(String[] args) {

        OrderSubject orderSubject = new OrderSubject();

        OrderObserver orderObserver = new OrderObserver();
        OrderObserver orderObserver2 = new OrderObserver();

        orderSubject.registerObserver(orderObserver);
        orderSubject.registerObserver(orderObserver2);

        Student studentA = new Student("AA", "今天查水表");
        orderSubject.setStudent(studentA);
        orderSubject.removeObserver(orderObserver2);

        Student studentB = new Student("BB", "今天查水表");
        orderSubject.setStudent(studentB);
    }
}
