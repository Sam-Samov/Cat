package by.sam.Main.utils;

import by.sam.Main.entity.Cat;
import by.sam.Main.entity.Kitty;

public class AnimalUtils {

    public void printKitty(Kitty kitty) {
        System.out.println("Имя: " + kitty.getName());
        System.out.println("Вес: " + kitty.getWeight() + " кг");
        System.out.println("Порода: " + kitty.getBreed());
        System.out.println("Цвет: " + kitty.getColor());
        System.out.println("Длина шерсти: " + kitty.getCoatLength());
    }

    public void  voice(Cat cat) {
        cat.voice();
    }

    public void jump(Cat cat) {
        cat.jump();
    }

    public void run(Cat cat) {
        cat.run();
    }

    public void bite(Cat cat) {
        cat.bite();
    }

    public void biteCurtains(Kitty kitty) {
        kitty.biteCurtains();
    }
}
