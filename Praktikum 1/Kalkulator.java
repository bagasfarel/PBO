import java.util.Scanner;

public class Kalkulator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, hasil = 0;
        String operator;

        System.out.println("angka 1, operator, angka 2");
        angka1 = input.nextInt();
        operator = input.next();
        angka2 = input.nextInt();

        switch(operator){
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "*":
                hasil = angka1 * angka2;
                break;
            case "/":
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operator tidak ada. (+, -, *, /)");
        }

        System.out.println("= " + hasil);
    }
}


