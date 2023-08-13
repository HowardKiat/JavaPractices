import java.util.Scanner;

public class Radius {
    public static void main (String[] args) {
        final double radius, length, area, volume;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        radius = input.nextDouble();
        System.out.print("Enter a number for length: ");
        length = input.nextDouble();
        area = (radius * radius * 3.142);
        volume = (area * length);

        
        System.out.println("Cylinder Value: "+ volume );
        input.close();

    }
}
