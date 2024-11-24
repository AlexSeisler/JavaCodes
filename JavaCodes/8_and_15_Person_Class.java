Instructor.java:
---------------
/*
A Instuctor subclass that extends the Person super class
*/
public class Instructor extends Person
{
    private int salary;
    /*
    Constructor for the Instructor class
    @param four parameters, a String for name, and a int for year,an int for height and a int salary
    @return, a Instructor object
    */
    public Instructor(String name, int year,int height, int theSalary)
    {
        super(name,year,height);
        this.salary=theSalary;
    }
    /*
    A toString method to print the Instructor object
    @param, none
    @return, a String of the information from a Instructor object
    */
    public String toString()
    {
        return("Name: "+getName()+"\n"+"Year: "+getYear()+"\n"+"Height: "+getHeight()+"\n"+"Salary: "+this.salary);
    }
}

MyProgram.java:
--------------
import java.util.ArrayList;
public class MyProgram
{
    /*
    This is the main [rogram used to test my Student,Person, Instructor class-subclasses
    @param,none
    @return,Printing
    */
    public static void main(String[] args)
    {
        Person Bela = new Person("Bela", 2005,62);
        
        Person Alex = new Person("Alex", 2006,68);
        
        Student Eric = new Student("Eric",2005,66,"Comp Sci");
        
        Instructor Jed = new Instructor("Jed",1971,42,90000);
        
        ArrayList<Person> list = new ArrayList<Person>();
        
        list.add(Bela);
        list.add(Alex);
        list.add(Eric);
        list.add(Jed);
        
        double total = 0.0;
        
        System.out.println(Alex);
        System.out.println();
        System.out.println(Bela);
        System.out.println();
        System.out.println(Eric);
        System.out.println();
        System.out.println(Jed);
        
        for(int i = 0;i<list.size();i++)
        {
            total=total+list.get(i).getHeight();
        }
        System.out.println();
        System.out.println("Average Height: "+total/list.size());
        
    }
}

Person.java:
-----------
/*
This is a Super class used to create a base person object with a 
name and a year
*/
public class Person 
{
    private String name;
    private int year;
    private int height;
    /*
    Constructor for the Person class
    @param three parameters, a String for name, and a int for year, and an int height
    @return, a Person object
    */
    public Person(String name, int year, int height)
    {
        this.name=name;
        this.year=year;
        this.height=height;
    }
    /*
    Getter method for the instance variable name
    @param,none
    @return, String, the name instance variable
    */
    public String getName()
    {
        return this.name;
    }
    /*
    Getter method for the instance variable year
    @param,none
    @return, String, the year instance variable
    */
    public int getYear()
    {
        return this.year;
    }
    /*
    Getter method for the instance variable height
    @param,none
    @return, String, the height instance variable
    */
    public int getHeight()
    {
        return this.height;
    }
    /*
    A toString method to print the person object
    @param, none
    @return, a String of the information from a person object
    */
    public String toString()
    {
        return("Name: "+this.name+"\n"+"Year: "+this.year+"\n"+"Height: "+this.height);
    }
    
    
    
    
    
    
}

Student.java:
------------
/*
A Student subclass that extends the Person super class
*/
public class Student extends Person
{
    private String major;
    
    /*
    Constructor for the Student subclass
    @param four parameters, a String for name, and a int for year, an int for height and a String for their major
    @return, a Student object
    */
    public Student(String name, int year,int height, String theMajor)
    {
        super(name,year,height);
        this.major=theMajor;
    }
    /*
    A toString method to print the Student object
    @param, none
    @return, a String of the information from a Student object
    */
    public String toString()
    {
        return("Name: "+getName()+"\n"+"Year: "+getYear()+"\n"+"Height: "+getHeight()+"\n"+"Major: "+this.major);
    }
    
    
}

