package Animals;

public class Cat extends Animals {

    static private int animalCount;

    static {
        animalCount = 0;
    }

    public Cat (String name,int dispersionPercent){
        super(name,200,0,dispersionPercent);
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

