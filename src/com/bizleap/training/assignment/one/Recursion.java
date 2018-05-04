package com.bizleap.training.assignment.One;
import java.util.HashMap;
import java.util.Map;

public class Recursion {
   public int result=0;
    public void makeRecursion(int number){
        Map<Integer,Integer> map=new HashMap<>();
           if (number>1) makeRecursion(number - 1);
               result += number;
               map.put(number, result);
               System.out.print(map);
    }


    public static void main(String[] args) {
        new Recursion().makeRecursion(20);
    }
}
