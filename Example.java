import java.util.*;

public class Example {
    public void print1to255(){
        System.out.println("hi");
    }
    public void printOdds(){
        for (int i = 1; i < 256; i+= 2){
            System.out.println(i);
        }
    }
    public void printSums(){
        int sum = 0;
        for (int i = 0; i <= 255; i++){
            System.out.print("New number is: ");
            System.out.print(i);
            sum += i;
            System.out.print(" sum is: ");
            System.out.println(sum);
        }
    }
    // {1,3,5,7,9,13} arr X
    public void iterator(int[] X){
        for (int i = 0; i < X.length; i++){
            System.out.println(X[i]);
        }
    }
    public int findMax(int[] R){
        int max = R[0];
        for (int i = 1; i < R.length; i++){
            if (R[i] > max){
                max = R[i];
            }
        }
        System.out.println(max);
        return max;
    }
    public int findAvg(int[] R){
        int sum = R[0];
        for (int i = 1; i < R.length; i++){
            sum += R[i];
        }
        int avg = (sum/R.length);
        System.out.println(avg);
        return avg;
    }

    public List<Integer> arrayOdds(){
        List<Integer> list = new ArrayList<Integer>();
        for (Integer i = 1; i <= 255; i+=2){
            list.add(i);
        }
        System.out.println(list);
        return list;
    }

    public int GreaterThanY(int[] L, int Y){
        int count = 0;
        for (int i = 0; i < L.length; i++){
            if (Y < L[i]){
                count++;
            }
        }   
        System.out.println(count);
        return count;
    }

//     Greater Than Y
// Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).

    // Iterating through an array
    // Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.
    
    








    // public int[] sum(int arr[]){
    //     int[] newArr = {};
    //     for (int i = 0; i < arr.length; i++){
    //         System.out.println(arr[i]);
    //         if (arr[i] >= 10){
    //             newArr[i] = i;
    //         }
    //     }
    //     return newArr;
    // }
}
// ● Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)