MyProgram.java:
--------------

public class MyProgram 
{
    public static void main(String[] args) 
    {
        Fractions f1 = new Fractions(15, 20);
        Fractions f2 = new Fractions(3, 4);
        Fractions f3 = new Fractions(7, 8);
        Fractions f4 = new Fractions(15, 20);
        System.out.println(f1);
        System.out.println(f1.reciprocal());
        System.out.println(f1.reduce());
        System.out.println(f1.doubleValue());
        System.out.println(f1.multiplies(3));
        System.out.println(f1.divide(f3).reduce());
        
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("Uses the constructor to create 4 Fraction objects: f1(15/20), f2(3/4), f3(7/8), f4(15/20)");
        System.out.println("Fraction f1: " + f1);
        System.out.println("Fraction f2: " + f2);
        System.out.println("Fraction f3: " + f3);
        System.out.println("Fraction f4: " + f4);
        System.out.println("-------------------------------------------------------------");
        
        System.out.println("Uses the equals method to compare two objects and returns a boolean");
        System.out.println("if they are equal returns true, else false");
        System.out.println("Fraction f1 (15/20) = Fraction f2 (3/4): " + f1.equals(f2));
        System.out.println("Fraction f2 (3/4) = Fraction f3 (7/8): " + f2.equals(f3));
        System.out.println("Fraction f1 (15/20) = Fraction f4 (15/20): " + f1.equals(f4));
        System.out.println("-------------------------------------------------------------");
        
        System.out.println("Uses the reciprocal method to take in a fraction object and return the reciprical fraction object");
        System.out.println("Reciprical of 15/20: " + f1.reciprocal());
        System.out.println("Reciprical of 3/4: " + f2.reciprocal());
        System.out.println("Reciprical of 7/8: " + f3.reciprocal());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Reduces the object to its simplest form and returns it");
        System.out.println("15/20 Reduced to simplest form: " + f1.reduce());
        System.out.println("3/4 Reduced to simplest form: " + f2.reduce());
        System.out.println("7/8 Reduced to simplest form: " + f3.reduce());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Takes in a fraction object and returns the decimal format of the fraction");
        System.out.println("Decimal of 15/20: " + f1.doubleValue());
        System.out.println("Decimal of 3/4: " + f2.doubleValue());
        System.out.println("Decimal of 7/8: " + f3.doubleValue());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Takes a Fraction object and multiplies it by an integer");
        System.out.println("15/20 multiplied by 3: " + f1.multiplies(3));
        System.out.println("3/4 multiplied by 8: " + f2.multiplies(8));
        System.out.println("7/8 multiplied by 2: " + f3.multiplies(2));
        System.out.println("15/20 multiplied by 11: " + f4.multiplies(11));
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("Overrides the addition sign, takes in 2 Fraction objects and returns the sum as a Fraction object");
        System.out.println("f1 (15/20) + f2 (3/4) added: " + f1.add(f2));
        System.out.println("f2 (3/4) + f3 (7/8) added: " + f2.add(f3));
        System.out.println("f1 (15/20) + f4 (15/20) added: " + f1.add(f4));
        System.out.println("-------------------------------------------------------------");
       
        System.out.println("Overrides the multiply sign, takes in 2 Fraction objects and returns the product as a Fraction object");
        System.out.println("f1 (15/20) * f2 (3/4) multiplied: " + f1.multiply(f2));
        System.out.println("f2 (3/4) * f3 (7/8) multiplied: " + f2.multiply(f3));
        System.out.println("f1 (15/20) * f4 (15/20) multiplied: " + f1.multiply(f4));
        System.out.println("-------------------------------------------------------------");
        System.out.println("Overrides the subtraction sign, takes in 2 Fraction objects and returns the difference as a Fraction object");
        System.out.println("f1 (15/20) - f2 (3/4) subtracted: " + f1.subtract(f2));
        System.out.println("f2 (3/4) - f3 (7/8) subtracted: " + f2.subtract(f3));
        System.out.println("f1 (15/20) - f4 (15/20) subtracted: " + f1.subtract(f4));
        System.out.println("-------------------------------------------------------------");
        System.out.println("Overrides the division sign, takes in 2 Fraction objects and returns the quotient as a Fraction object");
        System.out.println("f1 (15/20) / f2 (3/4) divided: " + f1.divide(f2));
        System.out.println("f2 (3/4) / f3 (7/8) divided: " + f2.divide(f3));
        System.out.println("f1 (15/20) / f4 (15/20) divided: " + f1.divide(f4));
        System.out.println("-------------------------------------------------------------");
        System.out.println("Multiple Operations");
        System.out.println("");
        System.out.println("Example 1: f1 (15/20) * f2 (3/4) + f3 (7/8) / f4 (15/20) - f1 (15/20), then decimal format");
        
        System.out.println("Answer 1: " + f1.multiply(f2).add(f3.divide(f4)).subtract(f1).doubleValue());
        System.out.println("");
        System.out.println("Example 2: f1 (15/20) + f2 (3/4) + f3 (7/8) + f4 (15/20), then simplified");
        System.out.println("Answer 2: " + f1.add(f2).add(f3).add(f4).reduce());
        System.out.println("");
        System.out.println("Example 3: f1 (15/20) * f2 (3/4) * f3 (7/8) * f4 (15/20), reduced, recipricalled");
        System.out.println("Answer 3: " + f1.multiply(f2).multiply(f3).multiply(f4).reduce().reciprocal());
        
    }
}

Fractions.java:
--------------
/*
This is a fractions class that has methods to do the following 
functions of adding, subtracting, multiplying, dividing, and 
comparing.
*/

import java.util.Scanner;
import java.lang.Math;


public class Fractions
{
    private int numerator;
    private int denominator;
    
    /*
    Class constructor that creates a fraction object
    @param, two ints representing the numerator and denominator
    @return, none just creates
    */
    public Fractions(int theNumerator, int theDenominator) 
    {
        this.numerator = theNumerator;
        this.denominator = theDenominator;
    }
    /*
    Class constructor that creates a fraction object
    @param, one int representing the numerator
    @return, none just creates
    */
    public Fractions(int theNumerator)
    {
        this.numerator = theNumerator;
        this.denominator = 1;
    }
    
    /*
    Gets the decimal version of the fraction
    @param, none
    @return a double value of the fraction
    */
    public double doubleValue() 
    {
        return (numerator*1.0) / (denominator*1.0);
    }
    
    /*
    This is a getter method for the numerator variable
    @param, none
    @returns the numerator
    */
    public int getNumerator() 
    {
        return numerator;
    }
    /*
    This is a getter method for the denominator variable
    @param, none
    @returns the denominator
    */
    public int getDenominator() 
    {
        return denominator;
    }

    /*
    Compares two objects of the Fraction class
    @param two objects
    @return a boolean if they are equal
    */
    public boolean equals(Fractions other) 
    {
        int num1 = this.numerator * other.getDenominator();
        int num2 = this.denominator * other.getNumerator();
        if (num1 == num2)
            return true;
        else
            return false;
    }
    
    /*
    returns a fractions object that is the reciprocal of the object
    @param,none
    @return a fraction object
    */
    public Fractions reciprocal()
    {
        return new Fractions(denominator,numerator);
    }
    /*
    Reduces the fraction object
    @param, none
    @return, the new reduced fraction object
    */
    public Fractions reduce() 
    {
        int gcd = findGCD(numerator, denominator);
        int reducedNumerator = numerator / gcd;
        int reducedDenominator = denominator / gcd;
        return new Fractions(reducedNumerator, reducedDenominator);
    }

    private int findGCD(int a, int b) 
    {
        if (b == 0) 
        {
            return a;
        } else 
        {
            return findGCD(b, a % b);
        }
    }
    
    
    /*
    Takes a fraction and multiplies its numerator by the given number
    @param, an integer to multiply by
    @return, a new fraction object
    */
    public Fractions multiplies(int number) 
    {
        int multNumerator = numerator * number;
        return new Fractions(multNumerator, denominator);
    }
    
    /*
    This method takes in two fraction objects and adds them
    @param two fraction objects
    @return, the objects added as a new fraction object
    */
    public Fractions add(Fractions other) 
    {
        int newNum = other.getDenominator()*this.numerator + this.denominator*other.getNumerator();
        int newDen = this.denominator * other.getDenominator();
        int common = findGCD(newNum,newDen);
        return new Fractions(newNum/common, newDen/common);
    }
    /*
    This method takes in two fraction objects and subtarcts them
    @param two fraction objects
    @return, the objects subtracted as a new fraction object
    */
    public Fractions subtract(Fractions otherFraction) 
    {
        int commonDenominator = this.denominator * otherFraction.denominator;
        int subtractedNumerator = (this.numerator * otherFraction.denominator) - (otherFraction.numerator * this.denominator);
        return new Fractions(subtractedNumerator, commonDenominator);
    }
    /*
    This method takes in two fraction objects and multiplies them
    @param two fraction objects
    @return, the objects multiplied as a new fraction object
    */
    public Fractions multiply(Fractions otherFraction) 
    {
        int multipliedNumerator = this.numerator * otherFraction.numerator;
        int multipliedDenominator = this.denominator * otherFraction.denominator;
        return new Fractions(multipliedNumerator, multipliedDenominator);
    }
    /*
    This method takes in two fraction objects and divides them
    @param two fraction objects
    @return, the objects divided as a new fraction object
    */
    public Fractions divide(Fractions otherFraction) 
    {
        int dividedNumerator = this.numerator * otherFraction.denominator;
        int dividedDenominator = this.denominator * otherFraction.numerator;
        return new Fractions(dividedNumerator, dividedDenominator);
    }

    
    /*
    A toString to print the fraction
    @param, none
    @return, a string formatted to be a fraction
    */
    public String toString() 
    {
        return numerator + "/" + denominator;
    }
}

