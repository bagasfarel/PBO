package Tugas;

public class Dragon {
    int x, y;
    int direction;

    public static final int UP = 1;
    public static final int RIGHT = 2;
    public static final int DOWN = 3;
    public static final int LEFT = 4;

    public Dragon() {
        x = 0;
        y = 0;
        direction = 0;
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= UP && newDirection <= LEFT) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid");
        }
    }
    public void move(int steps) {
        switch (direction) {
            case 1:
                y += steps;
                break;
            case 2:
                x += steps;
                break;
            case 3:
                y -= steps;
                break;
            case 4:
                x -= steps;
                break;
            default:
                System.out.println("Arah tidak valid");
                break;
        }
    }
    public void printStatus() {
        System.out.println("x: " + x + ", y: " + y);
        switch (direction) {
            case 1:
                System.out.println("Arah: atas");
                break;
            case 2:
                System.out.println("Arah: kanan");
                break;
            case 3:
                System.out.println("Arah: bawah");
                break;
            case 4:
                System.out.println("Arah: kiri");
                break;
            default:
                System.out.println("Arah: tidak valid");
                break;
        }
    }
}

