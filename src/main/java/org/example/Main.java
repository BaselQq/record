package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        BigDecimal nr = new BigDecimal("1.23123");
//        System.out.println(nr.setScale(2, RoundingMode.DOWN));
//        System.out.println(nr.setScale(2, RoundingMode.UP));
//        System.out.println(nr.setScale(2, RoundingMode.CEILING));

        Spieces hundeartig = new Spieces("Hundeartig", 150);
        Spieces vogel = new Spieces("Vogel", 50);
        Spieces krokodil = new Spieces("Krokodil", 500);

        Animal animal1 = new Animal(1, "Hund", hundeartig, 4);
        Animal animal2 = new Animal(2, "Ente", vogel, 1);
        Animal animal3 = new Animal(3, "Krokodil", krokodil, 5);
        Animal animal4 = new Animal(3, "Elster", vogel, 6);

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);

        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());
        System.out.println(animal3.hashCode());
        System.out.println(animal4.hashCode());

        Owner owner1 = new Owner("Basel", animal1);
        Owner owner2 = new Owner("Lukas", animal2);
        Owner owner3 = new Owner("Phillimon", animal3);
        Owner owner4 = new Owner("Phillip", animal4);

        System.out.println(owner1);
        System.out.println(owner2);
        System.out.println(owner3);
        System.out.println(owner4);

    }
}