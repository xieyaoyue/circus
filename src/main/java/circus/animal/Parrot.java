<<<<<<< HEAD:src/main/java/circus/Parrot.java
package circus;
=======
package circus.animal;
>>>>>>> improved:src/main/java/circus/animal/Parrot.java

public class Parrot extends Bird {
    @Override
    public String speak() {
        return "Polly wants a cracker";
    }

    @Override
    public String toString() {
        return "I'm a parrot";
    }

    @Override
    public int getValue() {
        return 20;
    }
}
