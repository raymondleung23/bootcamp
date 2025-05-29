public class AnimalHelper<T extends Animal> {
  
  private T animal;

  public void getAnimal(T animal) {
    this.animal = animal;
  }

  // In static method, the generic type of parameters is independent, any generic type is independent,
  // not referring to the class T.
  public static<T extends Animal> void walk(T animal) {
    animal.walk(); // polymorphism, 
    // because "extends Animal" ensures object can call Animal methods
  }

  public static void main(String[] args) {
    AnimalHelper<Animal> animalHelper1 = new AnimalHelper<>();
    animalHelper1.setAnimal(new Bird());
    animalHelper1.setAnimal(new Dog("John"));

    AnimalHelper<Dog> animalHelper2 = new AnimalHelper<>();
    animalHelper1.setAnimal(new Dog("Peter"));

    AnimalHelper2 superHelper = new AnimalHelper2();
    superHelper.setAnimal(new Bird());
    superHelper.setAnimal(new Dog("John"));

    AnimalHelper3 superHelper3 = new AnimalHelper3();
    superHelper3.setAnimal(new Dog("Peter"));

    // static generic method
    AnimalHelper.walk(new Bird());

  }

}
