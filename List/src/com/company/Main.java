package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        array_list();
        linked_list();
        list_iterator();
        hassh_set();
    }

    public static void array_list(){
        System.out.println("Example -- Array list");
        // fix array
        int array [] = new int[5];

        /*
        Searching is faster than LinkedList
        holds only actual object

        dynamic array
        */

        ArrayList<Double> list = new ArrayList<Double>(5);
        list.add(12.3);
        list.add(32.1);
        list.add(3.1);
        list.add(12.1);
        list.add(42.1);
        list.add(33.1);

        for (Double x: list){
            System.out.println(x);
        }

        System.out.println("size is  = "+ list.size());
    }

    public static void linked_list(){
        System.out.println("Example -- Linked list");
        /* Insertion is fasted than ArraryList
        * Deletion is fasted than Arraylist
        * holds both data and address of next and pervious node
        * */

        LinkedList<String > name = new LinkedList<String>();

        name.add("asd");
        name.addFirst("123");
        name.addLast("333");
        name.add("asssd");

        for (String x: name){
            System.out.println(x);
        }

    }
    public static void list_iterator(){
        System.out.println("Example -- List Iterator");

        ArrayList<String> names = new ArrayList<String>();
        names.add("Jack");
        names.add("Tom");
        names.add("Adom");
        names.add("Franl");

        ListIterator<String> itr = names.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("\"\"\"\"\"\"\"\"\"\"");
         // reverse order
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }

    public static void hassh_set(){
        // can only contain unit element
        System.out.println("Example -- Hash set");

        HashSet<String> name =new HashSet<String>(5);
        name.add("Tom");
        name.add("Tom");
        name.add("Adom");
        name.add("Adom");

        Iterator<String> x = name.iterator();

        while (x.hasNext()){
            System.out.println(x.next());
        }
    }


}
