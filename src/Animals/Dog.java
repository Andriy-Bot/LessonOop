package Animals;

public class Dog extends Animals {

    static private int animalCount;

    static {
        animalCount = 0;
    }

    public Dog (String name,int dispersionPercent){
        super(name,500,20,dispersionPercent, false,15);
        animalCount++;
    }

    public int getAnimalCount() {
        return animalCount;
    }
}

