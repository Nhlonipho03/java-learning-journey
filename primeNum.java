import java.util.*;

public class primeNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }

        for (int i = 2; i < Math.sqrt(number); i++){
            if (number % i == 0){
                System.out.print(number + " is not a prime number.");
                break;
            }else{
                System.out.print(number + " is a prime number.");
                break;
            }
        }
    }
}
