package com.company;

import java.util.ArrayList;

public class BookStore {
    //图书列表
    public ArrayList<IBook> bookList = new ArrayList<IBook>();

    //
    public BookStore() {
        bookList.add(new NovelBook("aaa",15.2, "TTT"));
        bookList.add(new NovelBook("bbb",111.3, "III"));
        bookList.add(new NovelBook("ppp",45.0,"eee"));
    }

    public void showBooks() {
        System.out.println("------------Book List-----------");
        System.out.println("name\t\tprice\t\tauthor");
        for(IBook book:bookList) {
            System.out.println(book.getName()+ "\t\t" + book.getPrice() + "\t\t" + book.getAuthor());
        }
    }

}
