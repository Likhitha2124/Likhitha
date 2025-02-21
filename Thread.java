class A extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("hi");
        }
    }
}
class B extends Thread{
    public void run(){
         for(int i=1;i<100;i++){
            System.out.println("hello");
        }
    }
}
public class Thread{
    public static void main(String[]args){
    A obj1 = new A();
    B obj2 = new B();

    obj1.run();
    obj2.run();

}
}
