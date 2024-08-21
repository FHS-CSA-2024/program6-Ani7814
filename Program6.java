
import java.util.Scanner;
//Your code here
public class Program6{
    public static void main(String[] args){
        Scanner calc = new Scanner(System.in);
        double radius;
        final double PI = 3.14159;
        
        System.out.println("Enter the radius: ");
        radius = calc.nextDouble();
        double diameter = 2*radius;
        double area = PI*radius*radius;
        double circumference = 2*PI*radius;
        System.out.println("The Radius of the circle = "+Math.round(1000*radius)/1000.0);
        System.out.println("The Diameter of the circle = "+Math.round(1000*diameter)/1000.0);
        System.out.println("The Area of the circle = "+Math.round(1000*area)/1000.0);
        System.out.println("The Curcumference of the circle = "+Math.round(1000*circumference)/1000.0);
    }
}


//Paste console output below:
/*
Enter the radius: 
3.712
The Radius of the circle = 3.712
The Diameter of the circle = 7.424
The Area of the circle = 43.288
The Curcumference of the circle = 23.323
*/
