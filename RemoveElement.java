package com.google;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(40);
        list.add(88);
        list.add(62);
        list.add(23);
        list.add(9);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
