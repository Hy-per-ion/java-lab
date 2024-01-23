package exp5;

class A
{
    void a()
    {
        System.out.println("A");
    }
}
class B extends A
{
    @Override
    void a()
    {
        System.out.println("B");
    }
}
public class Overriding {
    public static void main(String[] args) {
        A obj = new A();
        obj.a();
        A obj1 = new B();
        obj1.a();
    }
}
