import java.util.*;
public class excepttest {
    public static void main (String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        System.out.println(myList);
        // System.out.println(myList.get(1));
        // System.out.println(myList[3]);
        for(int i = 0; i < myList.size(); i++){
            try{
            Integer castedValue = (Integer) myList.get(i);
            System.out.println(castedValue);
            } catch (Exception e){
                System.out.print("caught error at index : " + i + " of value: " + myList.get(i)+ " of type: ");
                System.out.println(e);
            }
        }
    }
}