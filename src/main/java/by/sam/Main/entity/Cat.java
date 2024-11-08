package by.sam.Main.entity;

public abstract class Cat extends Animal{

    public String breed;
    public String sound;

    public Cat (double weight, String breed, String sound) {
        super(weight);
        this.breed = breed;
        this.sound = sound;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void voice() {
        System.out.println("Подал голос: " + sound);
    }

    public void jump() {
        System.out.println("Прыгнул!");
    }

    public void run() {
        System.out.println("Побежал!");
    }

    public void bite() {
        System.out.println("Укусил!");
    }
}
