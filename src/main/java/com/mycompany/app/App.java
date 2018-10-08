package com.mycompany.app;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static boolean search(ArrayList<Integer> arr1, ArrayList<Integer> arr2, Integer a, Integer b){
        if(arr1.size() == 0 || arr2.size() == 0 || arr1 == null || arr2 == null || a == null || b == null)
            return false;
        int aplusb_in_arr1 = 0, aplusb_in_arr2 = 0;
        int aplusb = a+b;
        for(int i: arr1)
            if(i == aplusb)
                aplusb_in_arr1++;
        for(int i: arr2)
            if(i == aplusb)
                aplusb_in_arr2++;
        if(aplusb_in_arr1 == aplusb_in_arr2)
            return true;
        else 
            return false;
    }
}
