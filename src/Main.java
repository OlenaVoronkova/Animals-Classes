public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic", 2);
        Dog myDog = new Dog("Canine", 1, "American Bully");
        Cat myCat = new Cat("Feline", 1, "Sphinx");

        genericAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();

        System.out.println("Generic Animal: " + genericAnimal);
        System.out.println("My Dog: " + myDog);
        System.out.println("My Cat: " + myCat);

        myDog.setAge(2);
        System.out.println("My Dogs new age: " +myDog.getAge());

        myDog.wagTail();
        myCat.purr();

    }
}
