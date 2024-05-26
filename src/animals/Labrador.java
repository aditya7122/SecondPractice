package animals;
public class Labrador implements Animal {
    String name = " doggy";
    int age = 8 ;
    String breed = " labrador";
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


