package com.practice;

/**
 * @author Piyush Kumar
 */
public class AppWithProtectedInner {

    public void display() {

        System.out.println("Inside AppWithProtectedInner class");
    }

    protected class MyInner {

        public void display2() {
            System.out.println("Inside MyInner class");
        }

    }

    public static void main(String[] args) {
        MyInner myInner = new AppWithProtectedInner().new MyInner();
        myInner.display2();
    }
}

class Subclass2 {

    public static void main(String[] args) {
        // Since it is the seperate class hence I have to use the fully qualified class name for MyInner class which is
        // AppWithProtectedInner.MyInner
        AppWithProtectedInner.MyInner myInner = new AppWithProtectedInner().new MyInner();
        myInner.display2();
    }
}

class Subclass3 extends AppWithProtectedInner {

    public static void main(String[] args) {
        // Since I am extending the Subclass3 with the AppWithProtectedInner class hence I dont need the fully qualified class
        // name for MyInner class.
        MyInner myInner = new Subclass3().new MyInner();
        myInner.display2();
    }
}
