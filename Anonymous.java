class A{
    public void show(){
        System.out.println("x:in show");
    }
}
public class Anonymous{
    public static void main(String[] args) {
        A obj = new A(){
            public void show()
            {
        System.out.println("x:new  show");
    }
        };
        obj.show();
    }}
