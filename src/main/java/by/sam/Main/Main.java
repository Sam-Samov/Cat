package by.sam.Main;

import by.sam.Main.entity.Kitty;
import by.sam.Main.utils.AnimalUtils;

/*Создать объект класса «Котёнок», используя классы «Животное», «Кошка».
    Методы: 1)выводит на консоль имя
    2)подать голос
    3)прыгать
    4)бегать
    5)кусать
    6)пытаться чепушить шторку*/
public class Main {
    public static void main(String[] args) {
        AnimalUtils animalUtils = new AnimalUtils();
        Kitty kitty1 = new Kitty("Персик", 6.3, "Пробник тигра", "Мяу!", "Рыжий",
                "Среднешёрстный");
        animalUtils.printKitty(kitty1);
        animalUtils.voice(kitty1);
        animalUtils.run(kitty1);
        animalUtils.jump(kitty1);
        animalUtils.bite(kitty1);
        animalUtils.biteCurtains(kitty1);
    }
}
