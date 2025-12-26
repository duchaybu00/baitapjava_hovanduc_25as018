package ex63;

public class MovablePoint implements Movable {
    // Instance variables with package access
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    // Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    // Implementation of abstract methods from Movable interface
    @Override
    public void moveUp() {
        y -= ySpeed; // Decreasing y moves the point "up" in most coordinate systems
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}