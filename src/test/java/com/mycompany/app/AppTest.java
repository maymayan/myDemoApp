package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class AppTest extends TestCase{
    public void testFound() {
      ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(arr1, arr2, 1, 2));
    }

    public void testNotFound() {
      ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 3));
      assertFalse(new App().search(arr1, arr2, 1, 2));
    }

    public void testEmptyArray() {
      ArrayList<Integer> arr1 = new ArrayList<>();
      ArrayList<Integer> arr2 = new ArrayList<>();
      assertFalse(new App().search(arr1, arr2, 1, 2));
    }
    public void testTrue(){
      
      ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(5, 6, 7, 7));
      ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(7, 7, 3, 4));
      assertTrue(new App().search(arr1, arr2, 7, 0));
    }
    public void testNullInteger(){
      ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 3));
      assertFalse(new App().search(arr1, arr2, 1, null));
    }

}    
    