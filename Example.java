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