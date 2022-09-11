import Animals.*;

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


            for (int i = 0; i < animalsArr.length; i++) {
                animalsArr[i].run(200);
                animalsArr[i].swim(15);
            }

            System.out.println("test for Git Hub");

        }
    }


