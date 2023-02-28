package java_projects;
import java.util.Scanner;

public class hw1 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        String n = iScanner.nextLine();
        int N = Integer.parseInt (n);
        iScanner.close();
        double T = 0.5 * N * (N+1);
        int R = (int) T;
        System.out.print("Треугольное число для n = " +N);
        System.out.print(" => " + R);

    }
    






}
