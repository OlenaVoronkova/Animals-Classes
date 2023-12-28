public class Cat extends Animal {
    private String furColor;

    public Cat(String species, int age, String furColor) {
        super(species, age);
        this.furColor = furColor;
    }

    public void purr() {
        System.out.println("Purring...");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Fur Color: " + furColor;
    }
}
