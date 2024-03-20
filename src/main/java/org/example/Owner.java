package org.example;

import java.util.Objects;

public record Owner(String ownerName, Animal animal) {

    public Owner {
    }

    @Override
    public Animal animal() {
        return animal;
    }

    @Override
    public String ownerName() {
        return ownerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(ownerName, owner.ownerName) && Objects.equals(animal, owner.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerName, animal);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "ownerName='" + ownerName + '\'' +
                ", animal=" + animal +
                '}';
    }
}
