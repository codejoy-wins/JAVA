// I still don't get how to shuffle an array in Java
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

    public int randomNumber(){
        double num;
        num = Math.floor(Math.random()*10);
        int num2 = (int) num;
        System.out.println(num2);
        return num2;
    }

    public double QbRatio(int tds, int picks){
        double brady = tds/picks;
        double crazy;
        System.out.println(brady);
        System.out.format("%.2f", brady);
        System.out.println("x");
        crazy = 3/2;
        System.out.println(crazy);
        return brady;
    }


    public double printDecimal(){
        double cray = 3/2;
        System.out.println(3.2);
        System.out.println(cray);
        return 3.5;
    }

    public List<Integer> shuffler(int[] shuff){
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        for (int i = 0; i < shuff.length; i++){
            newarr.add(shuff[i]);
        }
        System.out.println("Hi the new array is" + newarr);
        Collections.shuffle(newarr);
        System.out.println(newarr);
        return newarr;
    }
    
    // public List<Integer> dumbList(int[] duh){
    //     List<Integer> list = new ArrayList<Integer>();
    //     for (Integer i = 1; i < duh.length; i++){
    //         if (duh[i] >10 ){
    //             list.add(duh[i]);
    //         }
    //     }
    //     System.out.println(list);
    //     return list;
    // }
}