package kumar; 
class Animal
{
public void sound()
{
System.out.println("Some sound");
}
}


class Dog extends Animal
{


@Override
public void sound() 
{
System.out.println("Bark");
}


}


class Cat extends Animal
{


@Override
public void sound() 
{
System.out.println("Meow");
}

}
public class InheritanceMock {


public static void main(String[] args) {
Dog d=new Dog();
Cat c= new Cat();

d.sound();
c.sound();


}


}

