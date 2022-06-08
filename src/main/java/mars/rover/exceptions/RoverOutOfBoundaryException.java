package mars.rover.exceptions;

public class RoverOutOfBoundaryException extends Exception {
    public RoverOutOfBoundaryException(String errorMessage){
        super(errorMessage);
    }
}
