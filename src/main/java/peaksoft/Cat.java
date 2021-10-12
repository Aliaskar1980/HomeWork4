package peaksoft;

public class Cat implements Animal {
    private String breed;
    private String color;


    @Override
    public void animalPlus() {
        System.out.println("Жакшы жактары:  Тазалыкты жакшы корот");
    }

    @Override
    public void animalMinus() {
        System.out.println("Жаман жактары: Тункусун уктатбайт");
    }

    public Cat() {
    }

    public Cat(String breed, String color) {
        this.breed = breed;
        this.color = color;
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
}
