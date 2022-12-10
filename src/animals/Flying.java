package animals;

import java.util.Objects;

public class Flying extends Bird{
    private String typeMovement;
    public Flying(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment);
        setTypeMovement(typeMovement);
    }
    public void fly(){
        System.out.println("Летит");
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        if (typeMovement != null && !typeMovement.isEmpty() && !typeMovement.isBlank()) {
            this.typeMovement = typeMovement;
        } else this.typeMovement = "Не указана";
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
        Flying flying = (Flying) o;
        return Objects.equals(typeMovement, flying.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMovement);
    }
}
