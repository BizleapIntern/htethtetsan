package com.bizleap.training.assignment.five;

import java.util.ArrayList;
import java.util.List;

public class Impl implements madeStringList {
    List<String> stringList=new ArrayList<String>();

    public List generateList(int n){
        for (int i=1;i<=n;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                stringList.add("Bizleap");
            } else if (i % 3 == 0) {
                stringList.add("Biz");
            } else if (i % 5 == 0) {
                stringList.add("Leap");
            }
        }
        return stringList;
    }

    public void testGenerateList() {
        stringList=new Impl ().generateList ( 10 );
        System.out.println("The Strings of list are... :" + stringList);
    }

    public static void main(String[] args) {
        new Impl ().testGenerateList ();
    }
}



