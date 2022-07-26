package com.classpath.collection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
public class ArrayListDemo {
    public static void main(String[] args){
        List<Integer> numbers=new ArrayList<>();
      //  LinkedList<Integer> ll = new LinkedList<String>();
        numbers.add(34);
        LinkedList<Integer> ll= new LinkedList<Integer>();
        ll.add(2);
        ll.add(1);
        ll.add(10);
        System.out.println(ll);
        numbers.add(45);
        List<Integer> ages= Arrays.asList(11,22,33);
        List<Integer> ages2=List.of(2,34,4);
        System.out.println(numbers.size());
        System.out.println();
       if(ages.contains(12))
           System.out.println("yes");
       else System.out.println("no");
        System.out.println(numbers.indexOf(45));

    }
}
