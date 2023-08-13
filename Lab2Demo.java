import java.util.Scanner;
public class Lab2Demo {
    public static void main (String[] args) {
        double feet, meters;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for feet: ");
        feet = input.nextDouble();
        meters = feet * 0.305;
        System.out.println(feet + "Feet equals to Meters: "+ meters );
        input.close();

    }

}
