public class ExampleTest {
    public static void main (String[] args){
        Example temp = new Example();
        temp.print1to255();
        temp.printOdds();
        temp.printSums();
        int [] r = {3,2,1,4};
        int [] k = {33,22,1,4};

        temp.iterator(r);
        temp.iterator(k);
        temp.findMax(k);
        temp.findAvg(k);
        temp.arrayOdds();
        int[] avengers = {1,4,41,12,122,44,9,43};
        int thanos = 34;
        temp.GreaterThanY(avengers, thanos);


    }
}