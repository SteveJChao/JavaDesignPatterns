package com.company;

/**
 * 依赖倒置原则
 */

public interface IDriver {
    //共有方法抽象
    public void driver(ICar car);

    //是否需要全部实现
    public void name();

    //是否必须实现
    public abstract void home();

}
