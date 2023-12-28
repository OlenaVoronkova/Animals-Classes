public class Animal {
    private String species;
    private int age;

    public Animal (String species, int age) {
        this.species = species;
        this.age = age;
    }

    public String getSpecies(){
        return species;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Some generic sound");
    }

    @Override
    public String toString() {
        return "Species: " + species + ", Age: " + age;
    }
}

