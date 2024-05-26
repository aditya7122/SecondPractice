package animals;

public class Pug implements Animal{
    String name = " jacky";
    int age = 5 ;
    String breed = "pug dog";
    @Override
    public String getName(){
        return  name;
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
