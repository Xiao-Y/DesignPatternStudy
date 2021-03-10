package com.xiaoy.github.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyongtao
 * @since 2021-3-10 9:40
 */
public class BookShelf implements Container<Book> {

    private List<Book> books = new ArrayList<>();

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    public int getLength() {
        return books.size();
    }

    public Book getBookByIndex(int index) {
        return books.get(index);
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
