package com.company;

/**
 * 在价格方法改变之后 可以通过子类的方法完成拓展，即对修改关闭，转而使用扩展
 */

public class offNovelBook extends NovelBook {
    public offNovelBook(String name, double price, String author) {
        super(name, price, author);
    }

    //重写getPrice()方法
    public double getPrice() {
        return super.getPrice() * 0.9;
    }
}
