package mars.rover;

import mars.rover.exceptions.RoverOutOfBoundaryException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarsRoverTest {

    @Test
    public void
    acceptance_test_1() throws RoverOutOfBoundaryException {
        Plateau plateau = new Plateau(5, 5);
        MarsRover rover = new MarsRover(1, 2, 'N');
        String newPosition = rover.relocate("LMLMLMLMM", plateau);
        assertEquals("1 3 N", newPosition);
    }
//
    @Test
    public void
    acceptance_test_2() throws RoverOutOfBoundaryException {
        Plateau plateau = new Plateau(5, 5);
        MarsRover rover = new MarsRover(3, 3, 'E');
        String newPosition = rover.relocate("MMRMMRMRRM", plateau);
        assertEquals("5 1 E", newPosition);
    }

    @Test
    void isRoverOutOfBoundary() {
        Plateau plateau = new Plateau(1, 1);
        MarsRover rover = new MarsRover(0, 0, 'E');
        assertThrows(RuntimeException.class, () -> rover.relocate("MM", plateau));
    }
}