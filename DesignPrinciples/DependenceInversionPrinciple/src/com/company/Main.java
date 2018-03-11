package com.company;

public class Main {

    public static void main(String[] args) {
	//测试
        //实例化一个Driver对象
        Driver tom = new Driver();

        //声明一个Car
        ICar car;

        //将car实例化为BMW
        car = new BMW();
        tom.driver(car);

        //car更改为Benz
        car = new Benz();
        tom.driver(car);
    }
}
