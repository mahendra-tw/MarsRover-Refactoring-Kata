package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void
    acceptance_test_1() {
        MarsRover rover = new MarsRover(1, 2, 'N');
        String newPosition = rover.relocate("LMLMLMLMM");
        assertEquals("1 3 N", newPosition);
    }

    @Test
    public void
    acceptance_test_2() {
        MarsRover rover = new MarsRover(3, 3, 'E');
        String newPosition = rover.relocate("MMRMMRMRRM");
        assertEquals("5 1 E", newPosition);
    }

}