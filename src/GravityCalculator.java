import java.sql.SQLOutput;

public class GravityCalculator {
    public static void main(String[] args){
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        double Half = 0.5;
        // What is the output of the modified program?
        System.out.println(" Acceleration of an Object is " + gravity * fallingTime * Half + "m");
    }
}
