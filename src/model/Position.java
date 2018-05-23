package model;

// Represents a particular spot on a 3x3 game board
public class Position {
    private boolean isFilled;
    private Shape occupyingShape;


    public Position() {
        isFilled = false;
        occupyingShape = null;
    }

    public void setFilled() {
        isFilled = true;
    }

    public boolean getFilledStatus() {
        return isFilled;
    }

    public void setShape(Shape occupyingShape) {
        this.occupyingShape = occupyingShape;
    }

    public Shape getOccupyingShape() {
        return occupyingShape;
    }

    public void clearPosition() {
        occupyingShape = null;
    }


}
