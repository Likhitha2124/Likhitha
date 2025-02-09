@FunctionalInterface
interface A{
    void show(int i);
}

public class Lambdaexpression{
    public static void main(String[] args) {
        A obj = (i)-> System.out.println("in show " + i);
        obj.show(5);
    }}
