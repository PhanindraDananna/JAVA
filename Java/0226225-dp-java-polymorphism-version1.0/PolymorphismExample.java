// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound!");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks!");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows!");
    }
}

// Main class
public class PolymorphismExample {
    public static void main(String[] args) {
        // Parent reference, Child object - Runtime Polymorphism
        Animal myAnimal; 
        
        myAnimal = new Dog(); // Dog object
        myAnimal.makeSound(); // Calls Dog's makeSound()

        myAnimal = new Cat(); // Cat object
        myAnimal.makeSound(); // Calls Cat's makeSound()
    }
}
