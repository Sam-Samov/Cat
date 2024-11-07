package by.sam.Main;

import by.sam.Main.entity.Kitty;
import by.sam.Main.utils.Actions;

/*Создать объект класса «Котёнок», используя классы «Животное», «Кошка».
    Методы: 1)выводит на консоль имя
    2)подать голос
    3)прыгать
    4)бегать
    5)кусать
    6)пытаться чепушить шторку*/
public class Main {
    public static void main(String[] args) {
        Actions actions = new Actions();
        Kitty kitty1 = new Kitty();
        kitty1.setName("Персик");
        kitty1.setBreed("Пробник тигра");
        kitty1.setWeight(6.3);
        kitty1.setCoatLength("Среднешёрстный");
        kitty1.setColor("Рыжий");
        actions.voice(kitty1);
    }
}
