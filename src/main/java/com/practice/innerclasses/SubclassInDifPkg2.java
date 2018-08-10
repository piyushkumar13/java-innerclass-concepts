package com.practice.innerclasses;

import com.practice.AppWithProtectedInner;

/**
 * @author Piyush Kumar
 */
public class SubclassInDifPkg2 extends AppWithProtectedInner {

    class SubclassInDifPkg2MyInner extends MyInner{

    }


    public static void main(String[] args) {

        SubclassInDifPkg2 subclassInDifPkg2 = new SubclassInDifPkg2();

        /* The following line will give compilation error since its a different package and MyInner has the protected access i.e
        * it has to be extended. In java, protected class inside a class is like protected member of the class(here enclosing class i.e AppWithProtectedInner)
        * in different package and protected member can be accessed only inside the subclass which is SubclassInDifPkg2 but this is not enough to access
        * the MyInner class since its not any data member its a class itself, we have to extend MyInner also in this SubclassInDifPkg2 subclass.
        * */
        // subclassInDifPkg2.new MyInner();

        subclassInDifPkg2.new SubclassInDifPkg2MyInner().display2();
    }
}
