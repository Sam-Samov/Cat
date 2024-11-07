package by.sam.Main.entity;

public class Kitty extends Cat {
    String name;
    double weight;
    String breed;
    private String color;
    private String coatLength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return (int) weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCoatLength() {
        return coatLength;
    }

    public void setCoatLength(String coatLength) {
        this.coatLength = coatLength;
    }
}
