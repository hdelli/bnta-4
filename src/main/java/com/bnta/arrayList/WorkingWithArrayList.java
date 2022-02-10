package com.bnta.arrayList;

import com.bnta.week_two.fri.oop.Person;

import java.util.*;

public class WorkingWithArrayList {
     static class Person {
        String getfoo() {return "bar";}
    }

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Sarina");
        map.put(2,"Aaron");
        map.put(3,"Marcy");
        System.out.println(map);
        String s= map.get(1);
        System.out.println(map.keySet());
        System.out.println(map.get(10)); //though hasnt been assigned it will return nulll


        //store key value pairs



    }

    private static void linkedAndHashSet() {
        LinkedList<String> List= new LinkedList<>();


        HashSet<String> strings = new HashSet<>();
        strings.getClass();
    }

    private static void stack() {
        Stack<String> stack = new Stack<>();
        stack.push("Aalima");
        stack.push("Cristian");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

    /*
        List<Person> people = new ArrayList<>();
        people.add(new Person());
        people.add(new Person());
        people.add(new Person());
        people.add(new Person());

        List<Person> peoples = new Vector<>();
      */







    private static void extracted3() {
        ArrayList<String> list1 = new ArrayList();  //<what datatype do you want your arrayList to have>
        //list.add(1);
        //list.add("2");


    }

    private static void extracted1(ArrayList list) {
        ArrayList list2 = new ArrayList();  //<what datatype do you want your arrayList to have>
        list.add(1);
        list.add("2");
        list.add(new Person());
        list.add(3.14);


        for (Object e : list) {

            //TRY NOT TO THIS ONLY WHEN USING INHERITANCE --- USE <>
            if (e instanceof Person) {
                Person person = (Person) e; //makes e which is an object at the moment into a person
                System.out.println(person.getfoo());
            }
            System.out.println(e);
        }
    }


    private static void extracted() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        System.out.println(list.indexOf(1));
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());

        System.out.println(list.contains(1));  //boolean does it contain index 1;
        list.clear();
        System.out.println(list.isEmpty());  //boolean if it is empty
        System.out.println(list.size());

        list.forEach(e -> {
            System.out.println("e = " + e);  //e- element -> you have access to the e
        });

        for (Object e : list) {  //different way of looping
            System.out.println("e = " + e);


            for (int i = 0; i < list.size(); i++) { //not really used unless you need an index
                System.out.println(list.get(i));

            }

        }

    }
}
