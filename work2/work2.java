public class work2 {// class name
    public static void main(String[] args) {// main method
        var classd = new ClassD();// object
        classd.print("welcame");
        classd.sayhello();// call of hello methods
        classd.sayHi();// call of sayhi method
        classd.sayByii();// call of sayByii method
        classd.classDMethod();// call of classDMethod
        System.out.println("Hello my dear");//printed output
    }// end of main method
}// end of class
class ClassA implements InterfaceE {// class A implements interface E
    public void sayhello(){// method1
        System.out.println("Hello, again!");// printed output
    }// end of method
    
    public void print(String message) {
        System.out.println(message);// printed message
    }
}

class ClassB extends ClassA {//  classB extends A

    public void sayHi(){// method 2
        System.out.println("Hi, all of us!");// method2
    }
}

class ClassC extends ClassB implements InterfaceE {// class C extends B

    public void sayByii(){// method 3
        System.out.println("Byi, all of us!");// printed outpu
    }

    public void print(String message) {
        super.print(message);// parent class
    }
}

class ClassD extends ClassC {// class D extends class C
    public void classDMethod(){//metod 5
        System.out.println("In class D.");// printed output
    }
}

interface InterfaceE {// interface E
    void print(String message);//printed method
}
    

