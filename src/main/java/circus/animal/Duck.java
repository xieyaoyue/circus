<<<<<<< HEAD:src/main/java/circus/Duck.java
package circus;
=======
package circus.animal;
>>>>>>> improved:src/main/java/circus/animal/Duck.java

public class Duck extends Bird {
    @Override
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public String toString() {
        return "I'm a circus.Duck";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }

    @Override
    public int getValue() {
        return 10;
    }
}
