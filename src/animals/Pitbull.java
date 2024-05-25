package animals;

public class Pitbull implements Animal{

        String name = "Bully";
        int age = 6;
        String breed = "PitBull";

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
