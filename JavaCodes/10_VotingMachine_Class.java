MyProgram.java:
--------------
/*
This main program is used to demonstrate the Votingmachine 
class showing all the methods of the class using print 
statments to guide the demonstration. This is done by 
showing the start, after voting, and after a clear results.
*/
public class MyProgram
{
    public static void main(String[] args)
    {
        VotingMachine election = new VotingMachine();
        System.out.println("-Starting values-");
        System.out.println("Democrates: "+election.getD());
        System.out.println("Republicans: "+election.getR());
        System.out.println();
        election.voteR();
        election.voteR();
        election.voteR();
        election.voteR();
        election.voteD();
        election.voteD();
        System.out.println("-After voting-");
        System.out.println("Democrates: "+election.getD());
        System.out.println("Republicans: "+election.getR());
        System.out.println();
        election.clear();
        System.out.println("-After clearing");
        System.out.println("Democrates: "+election.getD());
        System.out.println("Republicans: "+election.getR());
    }
}

VotingMachine.java:
------------------
/*
This code is used to represent a basic voting machine that 
resembles the election.
*/
public class VotingMachine
{
    private int Democrate=0;
    private int Republican=0;
    /*
    Constructor to create an object with both sides set Democrates and Republicans.
    @param, none
    @return, none just creates an objects.
    */
    public VotingMachine()
    {
        Democrate=Democrate;
        Republican=Republican;
        
    }
    /*
    Used to add a vote for the Democratic side.
    @param, none
    @return, no returning because its void
    */
    public void voteD()
    {
        Democrate++;
    }
    /*
    Used to add a vote for the Republican side.
    @param, none
    @return, no returning because its void
    */
    public void voteR()
    {
        Republican++;
    }
    /*
    Getter method used to get the tallied up votes for Democratic side
    @param, none
    @return the tallied amount of Democratic votes
    */
    public int getD()
    {
        return Democrate;
    }
    /*
    Getter method used to get the tallied up votes for Republican side
    @param, none
    @return the tallied amount of Republican votes
    */
    public int getR()
    {
        return Republican;
    }
    /*
    Used to reset both sides back to 0's
    @param, none
    @return, no return because void
    */
    public void clear()
    {
        Democrate=0;
        Republican=0;
    }
}

