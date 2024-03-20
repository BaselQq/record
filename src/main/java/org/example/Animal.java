package org.example;

import java.util.Objects;

public record Animal(int ID, String Name, Spieces spieces, int Age) {
    public Animal {
    }

    @Override
    public int ID() {
        return ID;
    }

    @Override
    public String Name() {
        return Name;
    }

    @Override
    public Spieces spieces() {
        return spieces;
    }

    @Override
    public int Age() {
        return Age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return ID == animal.ID && Age == animal.Age && Objects.equals(Name, animal.Name) && Objects.equals(spieces, animal.spieces);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", spieces=" + spieces +
                ", Age=" + Age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, Name, spieces, Age);
    }
}
