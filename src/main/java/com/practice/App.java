package com.practice;

/**
 * @author Piyush Kumar
 */
public class App
{

    public void display(){

        System.out.println("Inside App class");
    }
    class MyInner {

        public void display2(){
            System.out.println("Inside MyInner class");
        }

    }
}

class Subclass extends App {

    public static void main(String[] args) {
        MyInner myInner = new Subclass().new MyInner();

        myInner.display2();
    }

}
