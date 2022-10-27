import java.util.ArrayList;
import java.util.Random;

public class DemoArrayList {
    public static void main(String[] args) {
        //declaring ArrayList
        // ArrayList is derived from List interface

        ArrayList arrayList = new ArrayList();
        // above declaration will create, array list which can hold elements of type Object


        //now if I want to create arraylist to store Integer object only
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        //add an element into arraylist, by using add method
        integerArrayList.add(10);

        //creating ramdom object
        Random random = new Random();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            integerArrayList.add(random.nextInt(1,10000));
            if(i == 1000){
                break;
            }
        }

        //print list
        System.out.println(integerArrayList);

        // look or get element by index
        System.out.println("integerArrayList.get(500) = " + integerArrayList.get(500));
        System.out.println("No of elements,integerArrayList.size()  = " + integerArrayList.size());

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(integerArrayList.get(i));
        }

        // Create an ArrayList of integer, add 10 integer value into list, print only odd integers

    }
}
