
import java.util.*;
class Main {
    public static void main(String[] args) {
       
       new ArrayListThread().start();
       new LinkedListThread().start();
       new vectorThread().start();
       new StackThread().start();
    }
}
class ArrayListThread extends Thread
{
    public void run()
    {
         List<Integer> list1 = new ArrayList<>();
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        //  System.out.println("The given list is:"+list1);
System.out.println("Number of elements in the list: "+list1.size());
        //Adding one element
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
//Checking for an element
        System.out.println("Is 566 available in the list:"+list1.contains(566));
        System.out.println("The given list before removing elements is :"+list1);
        list1.remove(2);
        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
    }
}
class LinkedListThread extends Thread
{
    public void run()
    {
        List<Integer> list2 = new LinkedList<>();
        System.out.println("Is list2 empty? "+list2.isEmpty());
        list2.add(35);
        list2.add(23);
        list2.add(67);
        list2.add(82);
        list2.add(56);
        list2.add(49);
        list2.add(49);
        list2.add(49);
        System.out.println("Is list2 empty? "+list2.isEmpty());
        System.out.println("The given list is:"+list2);
        System.out.println("Number of elements in the list: "+list2.size());
    }
}
class vectorThread extends Thread{
    public void run(){
        vector<Integer> list3 = new vector<>();
        System.out.println("Is list3 empty? "+list3.isEmpty());
        list3.add(35);
        list3.add(23);  
        list3.add(67);
        list3.add(82);
        list3.add(56);
        System.out.println("Is list3 empty? "+list3.isEmpty());
        list3.add(69);
        System.out.println("The given list is:"+list3);
        System.out.println(" number of  elemts in the list: "+list3.size());

    }
}
class StackThread extends Thread{
    public void run(){
        Stack<Integer> list4 = new Stack<>();
        System.out.println("Is list4 empty? "+list4.isEmpty());
        list4.add(35);
        list4.add(23);  
        list4.add(67);
        list4.add(82);
        list4.add(56);
        System.out.println("Is list4 empty? "+list4.isEmpty());
        list4.add(69);System.out.println("The given list is:"+list4);
        System.out.println(" number of  elemts in the list: "+list4.size());
    }
}

