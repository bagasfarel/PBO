package Tugas;

public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        dragon1.printStatus();
        dragon1.changeDirection(Dragon.RIGHT);
        dragon1.move(5);
        dragon1.printStatus();

        Dragon dragon2 = new Dragon();
        dragon2.printStatus();
        dragon2.changeDirection(Dragon.UP);
        dragon2.move(3);
        dragon2.printStatus();
    }
}

