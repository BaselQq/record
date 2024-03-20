package org.example;

import java.util.Objects;

public record Spieces(String name, double foodInGram) {

    public Spieces {
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double foodInGram() {
        return foodInGram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spieces spieces = (Spieces) o;
        return Double.compare(foodInGram, spieces.foodInGram) == 0 && Objects.equals(name, spieces.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, foodInGram);
    }

    @Override
    public String toString() {
        return "Spieces{" +
                "name='" + name + '\'' +
                ", foodInGram=" + foodInGram +
                '}';
    }
}
