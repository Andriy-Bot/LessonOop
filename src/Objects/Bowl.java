package Objects;

import Animals.Animals;

public class Bowl {

    protected int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void info (){
        System.out.println(food + " food remain");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood (int food){
        setFood(getFood() + food);
        System.out.println(food + " food added");
    }

    public void decreaseFood (Animals animal) {

        if (animal.getAppetite() > food){
            System.out.println("not enough food for " + animal.getName());
        }
        if (animal.getAppetite() <= food){
            setFood(getFood() - animal.getAppetite());
            animal.setSatiety(true);
            System.out.println(animal.getName() + " is satisfied");
        }

    }
}
