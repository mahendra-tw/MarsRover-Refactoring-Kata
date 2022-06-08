package mars.rover;

public class MarsRover {

    private static String turnLeft(int x, int y, char direction, String instructions) {
        if (direction == 'N') {
            return move(x, y, 'W', instructions.substring(1, instructions.length()));
        } else if (direction == 'W') {
            return move(x, y, 'S', instructions.substring(1, instructions.length()));
        } else if (direction == 'S') {
            return move(x, y, 'E', instructions.substring(1, instructions.length()));
        }
        return move(x, y, 'N', instructions.substring(1, instructions.length()));
    }

    private static String turnRight(int x, int y, char direction, String instructions) {
        if (direction == 'N') {
            return move(x, y, 'E', instructions.substring(1, instructions.length()));
        } else if (direction == 'W') {
            return move(x, y, 'N', instructions.substring(1, instructions.length()));
        } else if (direction == 'S') {
            return move(x, y, 'W', instructions.substring(1, instructions.length()));
        }
        return move(x, y, 'S', instructions.substring(1, instructions.length()));
    }

    private static String moveOneStep(int x, int y, char direction, String instructions) {
        if (direction == 'N') {
            return move(x, y + 1, 'N', instructions.substring(1, instructions.length()));
        } else if (direction == 'S') {
            return move(x, y - 1, 'S', instructions.substring(1, instructions.length()));
        } else if (direction == 'W') {
            return move(x - 1, y, 'W', instructions.substring(1, instructions.length()));
        }
        return move(x + 1, y, 'E', instructions.substring(1, instructions.length()));
    }

    public static String move(int x, int y, char direction, String instructions) {
        if (!instructions.isEmpty()) {
            char instruction = instructions.charAt(0);
            if (instruction == 'L') {
                return turnLeft(x, y, direction, instructions);
            } else if (instruction == 'R') {
                return turnRight(x, y, direction, instructions);
            } else if (instruction == 'M') {
                return moveOneStep(x, y, direction, instructions);
            }
        }
        return x + " " + y + " " + direction;
    }
}
