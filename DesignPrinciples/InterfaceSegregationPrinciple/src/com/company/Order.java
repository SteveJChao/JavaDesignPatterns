package com.company;

public class Order implements IOrderForPortal, IOrderForOtherSys, IOrderForAdmin {
    @Override
    public void updateOrder() {
        System.out.println("updateOrder.");
    }

    @Override
    public void deleteOrder() {
        System.out.println("deleteOrder.");
    }

    @Override
    public void insertOrder() {
        System.out.println("insertOrder.");
    }

    @Override
    public String getOrder() {
        return "return order";
    }

    public static IOrderForPortal getOrder


}
