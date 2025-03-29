package com.mycompany.practicejava;

import java.util.LinkedList;
import java.util.Scanner;

public class PracticeJava {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        
        System.out.println("This is my favorite Manhwa Character\n");
        
        
        list.offer("Jin Mori-Jin");
        list.offer("Sung Jin Woo");
        list.offer("Yoo Gamin");
        list.offer("Daniel Park");
        
        
        
        list.add(2, "Yoo Hobin");
        System.out.println(list);
    }
}
