public class BasicJava {
    public static void print1to255(){
        int[] myArray;
        for (int i = 0; i < 256; i++){
            System.out.println(i);
            myArray[i] = i+1;
        }
        return myArray;
    } 
    public static void printOdds(){
        for (int i = 0; i < 256; i+=2) {
            System.out.println(i);
        }
    }
}