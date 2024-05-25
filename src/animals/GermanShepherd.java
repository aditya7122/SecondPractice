package animals;

public class GermanShepherd implements Animal{

    String name = "Bruno";
    int age = 10;
    String breed = "German Shepherd";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getBreed() {
        return breed;
    }
}
