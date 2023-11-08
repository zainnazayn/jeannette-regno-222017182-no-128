public class zz{// class name
    public static void main(String args[]) {// main method
        A myobj=new A();// creation of object
        myobj.show();// call of method 1
        myobj.display();// call of method 2
        myobj.calculate();// call of method 3
        myobj.mult();// call of method 4
        myobj.interfacetest();// call of method 5
        
    }
}

class D{
    int a=11;// integer variable a with value 11
    int b=20;// integer variable b with value 20
    
    public void mult(){// method 1
        int result=a*b;// calculation of product
        System.out.println(result);// printed output

    }
}
class C extends D{// class C extends D
    public static void display(){// method 2
        System.out.println("this is class B");// printed output
    }
}
class B extends C{// classB extends C
    public static void calculate(){// method 3
        int c=5;// integer variable c with value 5
        int d=20;// integer variable d with value 20
        int result=d-c;// calculation of difference
        System.out.println(result);// printed output
    }
}

    interface E {// enterface
   void interfacetest();// method 5
} 

class A extends B implements E{// enterface
    public  void show() {// method 6
        System.out.println(a+b);// calculation of summation
        
    }
    
    public void interfacetest(){// method
    
    System.out.println("This is Interface's method");// printed output
}
}
