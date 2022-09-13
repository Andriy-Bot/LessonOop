package Animals;

import Objects.Bowl;

public class Animals {

    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected boolean satiety;

    protected int appetite;
    static private int animalCount;

    static {
        animalCount = 0;
    }

    {
        satiety = false;
    }

    public Animals(String name, int maxRunDistance, int maxSwimDistance){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount ++;
    }

    public Animals(String name, int maxRunDistance, int maxSwimDistance, int dispersionPercent, boolean satiety, int appetite) {

        this (name,maxRunDistance,maxSwimDistance);

        this.maxRunDistance *= Math.random() * dispersionPercent / 100 + 1;
        this.maxSwimDistance *= Math.random() * dispersionPercent / 100 + 1;

        this.satiety = satiety;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void info (){
        System.out.print(name + " ");
        if (satiety){
            System.out.println("is satisfied");
        }else {
            System.out.println("is hungry");
        }
    }

    public void run (int distanceToRun){
        if (maxRunDistance >= distanceToRun){
            System.out.println(name + " run");
        }else{
            System.out.println(name + " can't run so much");
        }
    }
    public void swim (int distanceToSwim){
        if (maxSwimDistance >= distanceToSwim) {
            System.out.println(name + " swim");
            return;
        }
        if (maxSwimDistance == 0){
            System.out.println(name + " can't swim");
            return;
        }
        else {
            System.out.println(name + " can't swim so much");
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat (Bowl bowl){
        bowl.decreaseFood(this);
    }




}