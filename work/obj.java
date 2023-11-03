 class xyz// class name
 {
    public  double calculation(double p,double r,double t,double n){//method
        return p*(Math.pow((1+r/n),n*t));//formula used to calculate compound interest
    }
}
public class obj {// main class
    public static void main(String args[]){// main metods
        xyz myCI = new xyz();// creation of objects
        double result = myCI.calculation( 500000, 0.18, 3, 12);// calculation of compound interest
        System.out.println(" result:" + result); // output
    }// end of main method
}// end of class