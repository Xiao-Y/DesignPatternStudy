package com.xiaoy.github.observer;

/**
 * 观察实现
 *
 * @author liuyongtao
 * @since 2021-3-5 9:35
 */
public class OrderObserver implements Observer<Student> {

    @Override
    public void update(Student student) {
        // 执行具体业务
        System.out.println(student.getName() + "===>>> 执行具体业务:===>>>" + student.getMsg());
    }
}
