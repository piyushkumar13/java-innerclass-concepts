package com.practice;

/**
 * @author Piyush Kumar
 * 
 * The class which is public should have the same name as the file which is CheckJavaFileNameWithClassName here.
 */
public class CheckJavaFileNameWithClassName {

    public void display() {

        System.out.println("Inside CheckJavaFileNameWithClassName class");
    }


    public static void main(String[] args) {
        CheckJavaFileNameWithClassName test = new CheckJavaFileNameWithClassName();
        test.display();
    }
}


/*
* If you are compiling this whole files using command javac CheckJavaFileNameWithClassName.java which results into two class files i.e CheckJavaFileNameWithClassName.class and
* Extra.class then you should execute following class using java Extra 
* java Extra
* */
class Extra {
    public void display() {
        System.out.println("Inside Extra class");
    }


    public static void main(String[] args) {
        Extra extra = new Extra();
        extra.display();
    }


}

