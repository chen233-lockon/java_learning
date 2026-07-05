package com.learn.oop.oopprogressYInnerClass.Test05.Test02;

public class TestSocket {
    public static void main(String[] args) {
        Socket s = new Socket(){

            @Override
            public void supply() {
                System.out.println("Socket supply");
            }

            @Override
            public void turnOn() {
                System.out.println("Socket turnOn");
            }

            @Override
            public void turnOff() {
                System.out.println("Socket turnOff");
            }
        };

        show( s);
    }
    public static void show(Socket s){
        s.supply();
        s.turnOn();
        s.turnOff();
    }
}
