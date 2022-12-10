package animals;

import java.util.Objects;

public class Amphibian extends Animal{
    private final String livingEnvironment;
    protected void hunt(){
        System.out.println("Охотится");
    }

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else this.livingEnvironment = "Не указана";
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public void eat() {
        System.out.println("Ест");
    }

    @Override
    public void move() {
        System.out.println("Ходит");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Среда обитания: " + livingEnvironment + ". ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(livingEnvironment, amphibian.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
