package Tugas;

public class Snake {
    int x;
    int y;

    public Snake() {
        x = 0;
        y = 0;
    }

    public void moveLeft() {
        x--; 
    }

    public void moveRight() {
        x++; 
    }

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void printPosition() {
        System.out.println("x: " + x + ", y: " + y);
    }
}
