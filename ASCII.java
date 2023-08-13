import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an ASCII Code btween 0 - 128: ");
        num = in.nextInt();
        char character = (char) num;

        System.out.println("The Charcter: " + character);
        in.close();
    }
    
}
