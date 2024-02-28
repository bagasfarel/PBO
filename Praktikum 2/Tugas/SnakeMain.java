package Tugas;

public class SnakeMain {
    public static void main(String[] args) {
        Snake snake1 = new Snake();
        snake1.printPosition();
        snake1.moveRight();
        snake1.moveUp();
        snake1.printPosition();

        Snake snake2 = new Snake();
        snake2.printPosition();
        snake2.moveLeft();
        snake2.moveDown();
        snake2.printPosition();
    }
}
