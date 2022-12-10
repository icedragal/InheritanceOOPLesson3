package animals;

import java.util.Objects;

public class NonFlying extends Bird{
    private String typeMovement;

    public NonFlying(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment);
        setTypeMovement(typeMovement);
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        if (typeMovement != null && !typeMovement.isEmpty() && !typeMovement.isBlank()) {
            this.typeMovement = typeMovement;
        } else this.typeMovement = "Не указана";
    }

    public void walk() {
        System.out.println("Гуляет");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Тип передвижения: " + typeMovement + ". ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NonFlying nonFlying = (NonFlying) o;
        return Objects.equals(typeMovement, nonFlying.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMovement);
    }
}
