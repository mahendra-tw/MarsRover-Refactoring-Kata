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
        switch (this.direction) {
            case 'N':
                this.direction = 'W';
                break;
            case 'W':
                this.direction = 'S';
                break;
            case 'S':
                this.direction = 'E';
                break;
            default:
                this.direction = 'N';
        }
    }

    private void turnRoverRight() {
        switch (this.direction) {
            case 'N':
                this.direction = 'E';
                break;
            case 'W':
                this.direction = 'N';
                break;
            case 'S':
                this.direction = 'W';
                break;
            default:
                this.direction = 'S';
        }
    }

    private void moveRover() {
        switch (this.direction) {
            case 'N':
                this.yCoordinate += 1;
                break;
            case 'W':
                this.xCoordinate -= 1;
                break;
            case 'S':
                this.yCoordinate -= 1;
                break;
            default:
                this.xCoordinate += 1;
        }
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
