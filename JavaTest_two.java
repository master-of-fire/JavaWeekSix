import java.util.*;

// Name: Zaid Ahmad
// Date: March 10th
// App name: JavaTest_two.java


public class JavaTest_two {
    public static void main(String[]args) {
    double m;
    double n;
    double SideOne;
    double SideTwo;
    double Hypotenuse;
    double cost;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the longer side of the right triangle: ");
    m = input.nextDouble();
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter the shorter side of the right triangle: ");
    n = input1.nextDouble();
    SideOne = (m*m)-(n*n);
    SideTwo = 2*m*n;
    Hypotenuse = (m*m)+(n*n);
    cost = 2.412*SideOne+3.767*SideTwo+15.758*Hypotenuse;
    System.out.println("The Cost is " cost);
    }
}
