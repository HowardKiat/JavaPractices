import java.util.Scanner;

public class Integer {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 1000: ");
        int num =input.nextInt();
        int sum =0, lastdigit;
        while(num>0){
            lastdigit = num % 10;
            sum += lastdigit;
            num = num / 10;

        }
        System.out.println("The sum of all digits is: " + sum);
        input.close();
    }
    
}
