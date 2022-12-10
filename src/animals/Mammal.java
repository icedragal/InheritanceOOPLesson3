package animals;

import java.util.Objects;

public abstract class Mammal extends Animal{
    private final String livingEnvironment;
    private final double movementSpeed;

    public Mammal(String name, int age, String livingEnvironment, double movementSpeed) {
        super(name, age);

        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else this.livingEnvironment = "Не указана";

        if (movementSpeed > 0) {
            this.movementSpeed = movementSpeed;
        } else this.movementSpeed = 30;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void walk() {
        System.out.println("Гуляет");
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
                "Среда обитания: " + livingEnvironment +
                ", скорость передвижения: " + movementSpeed + ". ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Double.compare(mammal.movementSpeed, movementSpeed) == 0 && Objects.equals(livingEnvironment, mammal.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeed);
    }
}
