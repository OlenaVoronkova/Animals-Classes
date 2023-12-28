public class Dog extends Animal {
    private String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }

    public void wagTail() {
        System.out.println("Tail wagging!");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}
