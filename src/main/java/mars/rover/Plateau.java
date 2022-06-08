package mars.rover;

public class Plateau {
    private final int xOrigin = 0;
    private final int yOrigin = 0;
    private final int xCoordinate;
    private final int yCoordinate0;

    public Plateau(int xCoordinate, int yCoordinate0) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate0 = yCoordinate0;
    }

    public boolean isOutOfBoundary(int xCoordinate, int yCoordinate) {
        if (xCoordinate > this.xCoordinate || xCoordinate < 0) {
            return true;
        }
        return (yCoordinate > this.yCoordinate0 || yCoordinate < 0);
    }
}
