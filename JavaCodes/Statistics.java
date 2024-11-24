/*
This code is used to calculate the mean, median, mode, 
range, and standard deviation of a given list then print 
the results to the user, done with arrays and arrayLists
*/
import java.util.Arrays;
import java.util.ArrayList;
public class MyProgram
{
    public static void main(String[] args)
    {
        //Sets arrays to the test input
        int[] arr = {2,5,9,8,4};
        int[] arr1 = {2,5,6,8,4,7,1,7};
        int[] arr2 = {4,4,4,4,4,4,4};
        int[] arr3 = {12,10,8,8,6,4,4};
        int[] arr4 = {1,3,5,7,9,11,12,10,8,6,4,2,1,2,1};
        
        //Prints them nicely to user
        System.out.println("List: "+Arrays.toString(arr));
        Stats(arr);
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("List: "+Arrays.toString(arr1));
        Stats(arr1);
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("List: "+Arrays.toString(arr2));
        Stats(arr2);
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("List: "+Arrays.toString(arr3));
        Stats(arr3);
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("List: "+Arrays.toString(arr4));
        Stats(arr4);
        

    }
    
    /*
    Method to get the mean of the list
    @param, an integer array
    @return, the mean of the list as a double
    */
    public static double mean(int[] set1)
    {
        double total = 0;
        for(int i = 0;i<set1.length;i++)
        {
            total=total+set1[i];
        }
        total=total/set1.length;
        return total;
    }
    /*
    Method to get the median of the list
    @param, an integer array
    @return, the median of the list as a double
    */
    public static double median(int[] set1)
    {
        Arrays.sort(set1);
        if(set1.length%2==0)
        {
            return(set1[set1.length/2]+set1[set1.length/2-1]);
        }
        else
        {
            return(set1[set1.length/2]);
        }
    }
    /*
    Method to get the mode or modes of the list
    @param, an integer array
    @return, the mode of the list as an integer array to 
    account for multiple
    */
    public static ArrayList<Integer> mode(int[] set1)
    {
        ArrayList<Integer> top = new ArrayList<Integer>();
        int highest=0;
        int endAmount=0;
        int amount=0;
        for(int i = 0;i<set1.length;i++)
        {
            amount=0;
            for(int j = i+1;j<set1.length;j++)
            {
                if(set1[i]==set1[j])
                {
                    amount++;
                }
            }
            if(amount>endAmount)
            {
                top.clear();
                endAmount=amount;
                highest=set1[i];
                top.add(highest);
            }
            else if(amount==endAmount)
            {
                highest=set1[i];
                top.add(highest);
            }
        }
        return(top);
    }
    /*
    Method to get the range of the list
    @param, an integer array
    @return, the range of the list as an int
    */
    public static int range(int[] set1)
    {
        int smallest=9999;
        int biggest=-9999;
        for(int i = 0;i<set1.length;i++)
        {
            if(set1[i]>biggest)
            {
                biggest=set1[i];
            }
            if(set1[i]<smallest)
            {
                smallest=set1[i];
            }
        }
        return(biggest-smallest);
    }
    /*
    Method to get the standard deviation of the list
    @param, an integer array
    @return, the standard deviation of the list as a double
    */
    public static double standardDev(int[] set1)
    {
        double total = 0.0;
        ArrayList<Double> dev =new ArrayList<Double>();
        for(int i = 0;i<set1.length;i++)
        {
            dev.add(Math.pow(set1[i]-mean(set1),2));
        }
        
        for(int i = 0;i<dev.size();i++)
        {
            total=total+dev.get(i);
        }
        total=Math.sqrt(total/(set1.length-1));
        return total;
    }
    
    /*
    A method that calls and prints all the method above
    @param, an integer array
    @return, void, prints all results
    */
    public static void Stats(int[] set1)
    {
        System.out.println("Mean: "+ mean(set1));
        System.out.println("Median: "+ median(set1));
        System.out.println("Mode: "+ mode(set1));
        System.out.println("Range: "+ range(set1));
        System.out.println("StandardDev: "+ standardDev(set1));
    }
    
    
    
}