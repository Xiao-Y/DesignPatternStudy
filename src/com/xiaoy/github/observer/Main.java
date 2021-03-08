package com.xiaoy.github.observer;

/**
 * 测试
 *
 * @author liuyongtao
 * @since 2021-3-5 9:37
 */
public class Main {

    public static void main(String[] args) {

        // 订阅的主题
        OrderSubject orderSubject = new OrderSubject();

        // 观察者
        OrderObserver orderObserver = new OrderObserver();
        OrderObserver orderObserver2 = new OrderObserver();

        // 注册观察者
        orderSubject.registerObserver(orderObserver);
        orderSubject.registerObserver(orderObserver2);

        // 主题发送消息
        Student studentA = new Student("AA", "今天查水表");
        orderSubject.setStudent(studentA);

        // 移除观察者
        orderSubject.removeObserver(orderObserver2);

        // 主题发送消息
        Student studentB = new Student("BB", "今天查水表");
        orderSubject.setStudent(studentB);
    }
}
