package com.xiaoy.github.iterator;

/**
 * @author liuyongtao
 * @since 2021-3-10 9:43
 */
public class BookShelfIterator implements Iterator<Book> {

    int index;

    private BookShelf bookShelf;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        return bookShelf.getBookByIndex(index++);
    }
}
