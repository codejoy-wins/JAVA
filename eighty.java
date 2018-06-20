import java.util.ArrayList;
ArrayList<Object> list = new ArrayList<Object>();
list.add(10);
list.add("Hello");
list.add(new ArrayList<Integer>());
list.add(new Double(12.0)); // adding a Double of value 12.0
        
System.out.println(list); // [10, "Hello", [], 12.0]

int i = 0;
while(i < 7)
{
    System.out.println("foo");
    i++;
}


int[] myArray3 = {4, 8, 8, 5, 9};
int[] myArray;
myArray = new int[5];    // Initialization
myArray[0] = 4;
myArray[1] = 8;
myArray[2] = 8;
myArray[3] = 5;
myArray[4] = 9;
int num = myArray.get(0);
System.out.println("what.", num);