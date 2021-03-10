package com.xiaoy.github.iterator;

/**
 * @author liuyongtao
 * @since 2021-3-10 9:52
 */
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("JAVA"));
        bookShelf.addBook(new Book("C"));
        bookShelf.addBook(new Book("C++"));
        bookShelf.addBook(new Book("线性代数"));
        bookShelf.addBook(new Book("AI"));

        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
