package InheritanceTest;

import Inheritance.Shape.Circle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest {

    private Circle circle;

    @BeforeEach
    void initialize() {
        circle = new Circle(" ", 0.0);
    }
}
