package com.company;

public class NovelBook implements IBook {

    //书名
    private String name;

    //书的价格
    private double price;

    //书的作者
    private String author;

    public NovelBook(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
