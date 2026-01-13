class Outer {
    public void myMethod(){
        Demo d=new Demo();
        d.innerMethod();
        System.out.println("Hello From Outer Class.....");
    }

    void Move(){
        System.out.println("hello outer");
    }

    public class  Demo{
        void innerMethod(){
            //System.out.println("Hello From Main class......");
        }
    }

    public void add(int n,int m){
        System.out.println("The add() method with 2 parameters:");
        System.out.println("The Addition of Numbers are: "+(n+m));
    }

    public void add(int n,int m,int a){
        System.out.println("The add() method with 3 parameters:");
        System.out.println("The Addition of Three Numbers are: "+(n+m+a));
    }

}

class OuterSec extends Outer{
    void Move(){
        System.out.println("Hello from Second outer class's Move Method");
    }
}

public class Main {
    public static void main(String[] args) {

        OuterSec o= new OuterSec();
        Outer o2= new Outer();
        Outer o3=new OuterSec();

        System.out.println("\n\nDynamic polymorphism");
        o.myMethod();
        o.Move();
        o2.Move();
        o3.Move();

        System.out.println("\n\nDemonstration of Static Polymorphism:");
        o2.add(15,26);
        o2.add(29,64,26);
    }
}
