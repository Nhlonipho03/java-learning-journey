import java.util.*;

public class binaryNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int num = number;

        if (number == 0) {
            System.out.println("The binary of 0 is 0");
            return;
        }
        String digit = "";
        int rem = 0;
        while (num != 0){
            rem = num % 2;
            digit = rem + digit;
            num /= 2;
        }System.out.print("The binary of " + number + " is " + digit);
    }
}
