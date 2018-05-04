package com.bizleap.training.assignment.one;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MadeMapBuilder {
    public void makeResultedMap(int number){
        Map<Integer,Integer> resultedMap=new HashMap<>();
        int result=0;
        for (int i=1;i<=number;i++){
            result+=i;
            resultedMap.put(i,result);

        }
        System.out.println(resultedMap);
    }

    public static void main(String[] args) {
        new MadeMapBuilder().makeResultedMap(20);
    }
}
