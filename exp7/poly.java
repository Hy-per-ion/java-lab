package exp7;

class Animal
{
    void sound()
    {
        System.out.println("Animal");
    }
}
class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Bark");
    }
    void bite()
    {
        System.out.println("Bite");
    }
}
class Cat extends Animal

{
    @Override
    void sound() {
        System.out.println("Meow");
    }
    void scratch()
    {
        System.out.println("Scratch");
    }
}
public class poly
{
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        d.sound();
        c.sound();
        ((Dog)d).bite();
        ((Cat)c).scratch();
    }
}
