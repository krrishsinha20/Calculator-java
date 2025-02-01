// UserInput.java
import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public double getNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    public double[] getArray() {
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }
}
