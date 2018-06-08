import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double sumsquares = (legA * legA) + (legB * legB); // a^2 + b^2 = c^2
        double hypot = Math.sqrt(sumsquares);   // square root of c^2 = c
        return hypot;
    }
}