<<<<<<< HEAD:src/main/java/Trainer.java
import circus.Animal;
import circus.Bird;
import circus.Duck;
=======
package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
>>>>>>> improved:src/main/java/circus/Trainer.java

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
<<<<<<< HEAD:src/main/java/Trainer.java
        // train(new circus.Parrot());
        Animal a2 = new Animal();
        Bird b2 = new Bird();
=======
        // train(new circus.animal.Parrot());
>>>>>>> improved:src/main/java/circus/Trainer.java
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
