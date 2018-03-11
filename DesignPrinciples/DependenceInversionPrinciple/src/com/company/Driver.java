package com.company;

public class Driver implements IDriver {
    @Override
    public void driver(ICar car) {
        car.run();
    }

    @Override
    public void name() {

    }

    @Override
    public void home() {

    }
}
