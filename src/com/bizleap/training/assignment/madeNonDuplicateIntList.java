package com.bizleap.training.assignment.six;

import java.util.Arrays;


public class madeNonDuplicateIntList {
int singleNumber;
public int getNonDuplicateInt(int[] intList){
    Arrays.sort ( intList );
    for (int i=0;i<intList.length-1;i+=2)
    {
        if (intList[i]!=intList[i+1])
        {
            return singleNumber=intList[i];
        }else if (intList.length%2==0)
        {
            return singleNumber=-1;
        }
    }
    return singleNumber=intList[intList.length-1];
}
public void testGetNonDuplicateInt()
{    int[] intList={1,3,2,2,4,2,3,1,4,5};
    System.out.println (new madeNonDuplicateIntList ().getNonDuplicateInt ( intList  ));

}
public static void main(String[] args) {
        new madeNonDuplicateIntList ().testGetNonDuplicateInt ();
    }
}