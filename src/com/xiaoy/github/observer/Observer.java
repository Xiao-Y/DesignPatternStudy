package com.xiaoy.github.observer;

/**
 * 观察者
 *
 * @author liuyongtao
 * @since 2021-3-5 9:27
 */
public interface Observer<T> {

    void update(T t);
}
