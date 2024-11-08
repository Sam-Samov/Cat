package by.sam.Main.entity;

public class Kitty extends Cat {
    private String name;
    private String color;
    private String coatLength;

    public Kitty (String name, double weight, String breed, String sound, String color, String coatLength) {
        super(weight, breed, sound);
        this.name = name;
        this.color = color;
        this.coatLength = coatLength;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void biteCurtains() {
        System.out.println(name + " чепушит шторку!");
    }
}
