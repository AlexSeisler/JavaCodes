MyProgram.java:
--------------
import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your can Radius: ");
        double radius=input.nextDouble();
        
        System.out.println("Enter your can Height: ");
        double height=input.nextDouble();
        
        SodaCan can1 = new SodaCan(radius,height);
        System.out.println("Surface Area: "+can1.getSurfaceArea());
        System.out.println("Volume: "+can1.getVolume());
    }
}

SodaCan.java:
------------
/*
This class is called SodaCan and will constructan object with the 
radius and height of a soda can. In the class there are methods to 
calculate and get the surface area and volume of the can.
*/
//imports Math class
import java.lang.Math;
public class SodaCan
{
    //initilizes instance variables
    private double height;
    private double radius;
    
    /*
    Constructer for the SodaCan class
    @param- takes in two parameters a double representing the 
    radius and a double representing the height
    @return- Does not return, creates a SodaCan object
    */
    public SodaCan(double theRadius, double theHeight)
    {
        
        height=theHeight;
        radius=theRadius;
    }

    /*
    Calculates the surface area of the can using 2πrh+2πr2 formula
    @param- takes in no parameters
    @return- returns the calculated surface area as a double
    */
    public double getSurfaceArea()
    {
        double surfaceArea=2*Math.PI*radius*height+2*Math.PI*(Math.pow(radius,2));
        return surfaceArea;
    }
    /*
    Calculates the volume of the can using πr2h formula
    @param- takes in no parameters
    @return- returns the calculated volume as a double
    */
    public double getVolume()
    {
        double Volume=Math.PI*Math.pow(radius,2)*height;
        return Volume;
    }
}

