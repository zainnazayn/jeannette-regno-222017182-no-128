class SimpleInterest// class name
{
    public double CalcSI(double principal, double rate, double time)// method
    {
        return principal* rate*time;//  formula used to calculate simple interest
    }
}
public class objects{// main class
    public static void main (String [] args){// main method

        SimpleInterest mySI = new SimpleInterest();// creation of object
        double result = mySI.CalcSI(100000,0.05 ,5);// calculation of  compound interest
        System.out.println("Result: " + result );}// output to be printed
}// end of class
    

