/*Develop overloaded methods to calculate area for square, rectangle, triangle, and circle. Read input as given below.
input: 7 2.5 6.1 6 1 2.8
7 - side for calculating square
2.5 6.1 - side1 and side2 for calculating rectangle
6 1 - base and height for calculating triangle
2.8 - radius for calculating circle

output should be displayed as below:
49             // outcome of square
15.25        // outcome of rectangle
3.00          // outcome of triangle
24.62        // outcome of circle*/
import java.util.*;
public class Ol_Area{
    void area(int a){
        int area = a*a;
        System.out.println(area);
    }
    void area (double a, double b){
        double area = a*b;
        System.out.println(area);
    }
    void area(int a, int b){
        double area =((a*b)/2);
        System.out.println(String.format("%.2f",area));
    }
    void area(double a){
        double area =3.14*a*a;
        System.out.println(String.format("%.2f",area));
    }
    public static void main(String args []){
        Ol_Area m=new Ol_Area();
        Scanner in=new Scanner(System.in);
        int side= in.nextInt();
        double side1= in.nextDouble();
        double side2= in.nextDouble();
        int base = in.nextInt();
        int height =in.nextInt();
        double radius =in.nextDouble();
        m.area(side);
        m.area(side1,side2);
        m.area(base,height);
        m.area(radius);
    }
}
//algorithm to develop overloaded methods to calculate area of given polygons.
//=====================================================================================
//STEP-1: START
//STEP-2: INITIALIZE a, b.
//STEP-3: DECLARE the class name with data members and member functions.
//STEP-4: READ the choice from the user.
//STEP-5: Choice=1 then go to the STEP-6.
//STEP-6: The function area() to find area of given polygon with one integer argument.
//STEP-7: STOP.
//====================================================================================== 
