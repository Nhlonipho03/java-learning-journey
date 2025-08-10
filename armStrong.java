import java.util.*;

public class armStrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int num = number;

        String numberStr = Integer.toString(number);
        int length = numberStr.length();
        int squaredNum = 0;

        while(num != 0){
            int digit = num % 10;
            num /= 10;
            squaredNum += (int) Math.pow(digit, length);
        }if(number == squaredNum){
            System.out.print(number + " is an armstrong number.");
        }else{
            System.out.print(number + " is not an armstrong number.");
        }
    }
}
