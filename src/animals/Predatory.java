package animals;

import java.util.Objects;

public class Predatory extends Mammal{
    private String typeFood;

    public Predatory(String name, int age, String livingEnvironment, double movementSpeed, String typeFood) {
        super(name, age, livingEnvironment, movementSpeed);
        setTypeFood(typeFood);
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood != null && !typeFood.isEmpty() && !typeFood.isBlank()) {
            this.typeFood = typeFood;
        } else this.typeFood = "Не указана";
    }
    public void hunt(){
        System.out.println("Охотится");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Тип пищи: " + typeFood + ". ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predatory predatory = (Predatory) o;
        return Objects.equals(typeFood, predatory.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }
}
