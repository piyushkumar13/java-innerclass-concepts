package com.practice.innerclasses;

import com.practice.App;

/**
 * @author Piyush Kumar
 */
public class SubclassInDifPkg extends App {

    public static void main(String[] args) {
        /* Following line will give compilation error since MyInner access modifier is default which makes it package private. */
//        System.out.println(new SubclassInDifPkg().new MyInner());
    }

}
