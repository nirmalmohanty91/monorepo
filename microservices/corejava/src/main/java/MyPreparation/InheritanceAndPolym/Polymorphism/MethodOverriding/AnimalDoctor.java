package MyPreparation.InheritanceAndPolym.Polymorphism.MethodOverriding;

import utils.Utility;

public class AnimalDoctor {

  // method takes an array of any animal subtype
  /**
   * Have very careful look here the Animal[] is receiving dog,bird & cat type array. But if we
   * change this to a List<Animal> and pass List<Dog>/List<Cat>/List<Bird> the compilation will fail
   */
  public void checkAnimals(Animal[] animals) {
    for (Animal a : animals) {
      a.checkup();
    }
  }

  public void addAnimal(Animal[] animals) {
    animals[0] = new Dog(); // Eeek! We just put a Dog
    // in a Cat array!
    System.out.println("length: " + animals.length);
  }

  public static void main(String[] args) {

    // test it
    Dog[] dogs = {new Dog(), new Dog()};
    Cat[] cats = {new Cat(), new Cat(), new Cat()};
    Bird[] birds = {new Bird()};

    AnimalDoctor doc = new AnimalDoctor();

    doc.checkAnimals(dogs); // pass the Dog[]
    doc.checkAnimals(cats); // pass the Cat[]
    doc.checkAnimals(birds); // pass the Bird[]
    // Passing dogs and adding dog in destination method
    doc.addAnimal(dogs);
    // passing cats and adding dog in destination method
    // doc.addAnimal(cats); // This will throw ArrayStoreException an runtime exception
  }
}

abstract class Animal {
  public abstract void checkup();
}

class Dog extends Animal {
  public void checkup() { // implement Dog-specific code
    System.out.println("Dog checkup");
  }
}

class Cat extends Animal {
  public void checkup() { // implement Cat-specific code
    System.out.println("Cat checkup");
  }
}

class Bird extends Animal {
  public void checkup() { // implement Bird-specific code
    System.out.println("Bird checkup");
  }
}
