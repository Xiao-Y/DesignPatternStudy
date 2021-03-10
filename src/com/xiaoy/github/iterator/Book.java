package com.xiaoy.github.iterator;

/**
 * @author liuyongtao
 * @since 2021-3-10 9:40
 */
public class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
