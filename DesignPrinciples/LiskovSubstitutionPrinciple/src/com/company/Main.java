package com.company;

/**
 * 测试类
 */
public class Main {

    public static void main(String[] args) {
	    //声明基类对象
        Animal animal;
        //使用积累对象指向子类
        animal = new Horse();
        animal.move();

        animal = new Bird();
        animal.move();
    }
}
