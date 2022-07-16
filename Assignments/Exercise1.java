//Function overriding means when the Dog class contains the method which is already present
// in the Animal class. Hence, the Dog class overrides the method of the Animal class.
// In overriding : Animal and Dog classes both contain the same function
// with a different definition.

class Animal{
    String colour;
    public void eat(){
        System.out.println("This is an Animal");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eats dog-food as well as human-food");
        System.out.println("Dog's color is " + this.colour);
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.colour = "black";
        d1.eat();
    }
}
