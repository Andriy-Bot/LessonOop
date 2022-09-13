import Animals.*;
import Objects.Bowl;

    public class Main {


        public static void main(String[] args) {

            Animals[] animalsArr = {
                    new Dog("Dog1",50),
                    new Dog("Dog2",50),
                    new Cat("Cat1",50),
                    new Dog("Dog3",50),
                    new Cat("Cat2",50),
                    new Cat("Cat3",50),
                    new Dog("Dog3",50)
            };

            Bowl bowl = new Bowl(55);
            for (int i = 0; i < animalsArr.length; i++) {
                animalsArr[i].eat(bowl);
            }

            for (int i = 0; i < animalsArr.length; i++) {
                animalsArr[i].info();
            }
            bowl.info();
        }
    }


