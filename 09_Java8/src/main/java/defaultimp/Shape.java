package defaultimp;

public interface Shape {

    String getName();

    default String presentation() {
        return getName();
    }
}