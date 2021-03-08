package com.xiaoy.github.observer;

/**
 * 主题
 * @author liuyongtao
 * @since 2021-3-5 9:26
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
