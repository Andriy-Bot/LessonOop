package Animals;

public class Animals {

    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    static private int animalCount;

    static {
        animalCount = 0;
    }

    public Animals(String name, int maxRunDistance, int maxSwimDistance){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount ++;
    }

    public Animals(String name, int maxRunDistance, int maxSwimDistance, int dispersionPercent) {

        this (name,maxRunDistance,maxSwimDistance);

        this.maxRunDistance *= Math.random() * dispersionPercent / 100 + 1;
        this.maxSwimDistance *= Math.random() * dispersionPercent / 100 + 1;
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




}