interface A{
    int age=44;
    String area="chittor";


    void show();
    void config();

}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}
public class Interface{
    public static void main(String[]args){
        A obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.area);
       


    }
}