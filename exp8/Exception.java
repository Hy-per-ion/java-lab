package exp8;

import java.util.Scanner;

public class Exception {
    static void func(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        System.out.println("Division result: " + (a / b));
        int[] arr = {1, 2, 3};
        System.out.println("Array element at index " + b + ": " + arr[b]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("Enter the value for 'a': ");
                int a = in.nextInt();

                System.out.print("Enter the value for 'b': ");
                int b = in.nextInt();

                func(a, b);
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of bounds!");
            }
        }
    }
}
