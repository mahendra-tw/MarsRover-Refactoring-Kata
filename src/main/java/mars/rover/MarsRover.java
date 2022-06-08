package mars.rover;

import java.util.stream.IntStream;

public class MarsRover {

    private int xCoordinate;
    private int yCoordinate;
    private char direction;

    public MarsRover(int xCoordinate, int yCoordinate, char direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    private void turnRoverLeft() {
        if (this.direction == 'N') {
            this.direction = 'W';
        } else if (direction == 'W') {
            this.direction = 'S';
        } else if (direction == 'S') {
            this.direction = 'E';
        } else this.direction = 'N';
    }

    private void turnRoverRight() {
        if (direction == 'N') {
            this.direction = 'E';
        } else if (direction == 'W') {
            this.direction = 'N';
        } else if (direction == 'S') {
            this.direction = 'W';
        } else this.direction = 'S';
    }

    private void moveRover() {
        if (direction == 'N') {
            this.yCoordinate += 1;
        } else if (direction == 'S') {
            this.yCoordinate -= 1;
        } else if (direction == 'W') {
            this.xCoordinate -= 1;
        } else this.xCoordinate += 1;
    }

    public String relocate(String instructions) {
        IntStream.range(0, instructions.length()).forEach(iterator -> {
            char instruction = instructions.charAt(iterator);
            if (instruction == 'L') {
                turnRoverLeft();
            } else if (instruction == 'R') {
                turnRoverRight();
            } else {
                moveRover();
            }
        });
        return this.xCoordinate + " " + this.yCoordinate + " " + this.direction;
    }
}
